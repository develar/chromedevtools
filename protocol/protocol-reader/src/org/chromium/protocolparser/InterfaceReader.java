package org.chromium.protocolparser;

import com.google.gson.stream.JsonReaderEx;
import gnu.trove.THashSet;
import org.chromium.protocolReader.JsonOptionalField;
import org.chromium.protocolReader.JsonSubtype;
import org.chromium.protocolReader.JsonType;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.jsonProtocol.StringIntPair;

import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.*;

class InterfaceReader {
  private static final PrimitiveValueReader LONG_PARSER = new PrimitiveValueReader("long");

  private static final PrimitiveValueReader INTEGER_PARSER = new PrimitiveValueReader("int");
  private static final PrimitiveValueReader BOOLEAN_PARSER = new PrimitiveValueReader("boolean");
  private static final PrimitiveValueReader FLOAT_PARSER = new PrimitiveValueReader("float");

  private static final PrimitiveValueReader NUMBER_PARSER = new PrimitiveValueReader("double");
  private static final PrimitiveValueReader NULLABLE_NUMBER_PARSER = new PrimitiveValueReader("double", true);

  private static final PrimitiveValueReader STRING_PARSER = new PrimitiveValueReader("String");
  private static final PrimitiveValueReader NULLABLE_STRING_PARSER = new PrimitiveValueReader("String", true);

  private static final RawValueReader JSON_PARSER = new RawValueReader(false);
  private static final RawValueReader NULLABLE_JSON_PARSER = new RawValueReader(true);

  private static final MapReader MAP_PARSER = new MapReader(false);
  private static final MapReader NULLABLE_MAP_PARSER = new MapReader(true);

  private static final StringIntPairValueReader STRING_INT_PAIR_PARSER = new StringIntPairValueReader();

  static ValueReader VOID_PARSER = new ValueReader(true) {
    @Override
    public void appendFinishedValueTypeName(TextOutput out) {
      out.append("void");
    }

    @Override
    void writeReadCode(ClassScope scope, boolean subtyping, String fieldName, TextOutput out) {
      out.append("null");
    }

    @Override
    void writeArrayReadCode(ClassScope scope, boolean subtyping, boolean nullable, String fieldName, TextOutput out) {
      throw new UnsupportedOperationException();
    }
  };
  private final Map<Class<?>, TypeHandler<?>> typeToTypeHandler;
  private final boolean strictMode;

  private final boolean isStatic;

  final List<TypeRef<?>> refs = new ArrayList<TypeRef<?>>();
  final List<SubtypeCaster> subtypeCasters = new ArrayList<SubtypeCaster>();

  InterfaceReader(Class[] protocolInterfaces, boolean isStatic, boolean strictMode) {
    this.isStatic = isStatic;
    this.strictMode = strictMode;

    typeToTypeHandler = new LinkedHashMap<Class<?>, TypeHandler<?>>(protocolInterfaces.length);
    for (Class typeClass : protocolInterfaces) {
      if (!typeClass.isInterface()) {
        continue;
      }

      if (typeToTypeHandler.containsKey(typeClass)) {
        throw new IllegalArgumentException("Protocol interface duplicated " + typeClass.getName());
      }
      typeToTypeHandler.put(typeClass, null);
    }
  }

  private InterfaceReader(Map<Class<?>, TypeHandler<?>> typeToTypeHandler, boolean isStatic, boolean strictMode) {
    this.isStatic = isStatic;
    this.strictMode = strictMode;
    this.typeToTypeHandler = typeToTypeHandler;
  }

  public static TypeHandler createHandler(Map<Class<?>, TypeHandler<?>> typeToTypeHandler, Class<?> aClass) {
    InterfaceReader reader = new InterfaceReader(typeToTypeHandler, true, false);
    reader.processed.addAll(typeToTypeHandler.keySet());
    reader.go(new Class[]{aClass});
    return typeToTypeHandler.get(aClass);
  }

  Map<Class<?>, TypeHandler<?>> go() {
    return go(typeToTypeHandler.keySet().toArray(new Class[typeToTypeHandler.size()]));
  }

  private Map<Class<?>, TypeHandler<?>> go(Class<?>[] classes) {
    for (Class<?> typeClass : classes) {
      createIfNotExists(typeClass);
    }

    // Resolve cross-references.
    for (TypeRef<?> ref : refs) {
      TypeHandler<?> type = typeToTypeHandler.get(ref.typeClass);
      if (type == null) {
        throw new RuntimeException();
      }
      ref.set(type);
    }

    // Set subtype casters.
    for (SubtypeCaster subtypeCaster : subtypeCasters) {
      subtypeCaster.getSubtypeHandler().getSubtypeSupport().setSubtypeCaster(subtypeCaster);
    }

    if (strictMode) {
      for (TypeHandler<?> type : typeToTypeHandler.values()) {
        type.buildClosedNameSet();
      }
    }

    return typeToTypeHandler;
  }

  private final Set<Class<?>> processed = new THashSet<Class<?>>();

  private void createIfNotExists(Class<?> typeClass) {
    if (processed.contains(typeClass)) {
      return;
    }

    processed.add(typeClass);

    typeToTypeHandler.put(typeClass, null);

    if (typeClass != Map.class) {
      for (Class<?> aClass : typeClass.getDeclaredClasses()) {
        if (aClass.isInterface()) {
          createIfNotExists(aClass);
        }
      }
    }

    TypeHandler typeHandler = createTypeHandler(typeClass);
    for (TypeRef<?> ref : refs) {
      if (ref.typeClass == typeClass) {
        assert ref.get() == null;
        ref.set(typeHandler);
        break;
      }
    }
    typeToTypeHandler.put(typeClass, typeHandler);
  }

  private <T> TypeHandler<T> createTypeHandler(Class<T> typeClass) {
    if (!typeClass.isInterface()) {
      throw new JsonProtocolModelParseException("Json model type should be interface: " + typeClass.getName());
    }

    FieldProcessor<T> fields = new FieldProcessor<T>(this, typeClass);
    fields.go();

    Map<Method, MethodHandler> methodHandlerMap = fields.getMethodHandlerMap();
    for (Method method : methodHandlerMap.keySet()) {
      Class<?> returnType = method.getReturnType();
      if (returnType != typeClass && returnType.getAnnotation(JsonType.class) != null) {
        createIfNotExists(returnType);
      }
    }

    if (!isStatic) {
      methodHandlerMap.putAll(BaseHandlersLibrary.INSTANCE.getAllHandlers());
    }

    DynamicParserImpl.EagerFieldParserImpl eagerFieldParser = new DynamicParserImpl.EagerFieldParserImpl(fields.getOnDemandHandlers());
    return new TypeHandler<T>(typeClass, getSuperclassRef(typeClass),
                              fields.getVolatileFields(), methodHandlerMap,
                              fields.getFieldLoaders(),
                              eagerFieldParser,
                              fields.lazyRead);
  }

  ValueReader getFieldTypeParser(Type type, boolean declaredNullable, boolean isSubtyping, @Nullable Method method)
    throws JsonProtocolModelParseException {
    if (type instanceof Class) {
      Class<?> typeClass = (Class<?>)type;
      if (type == Long.TYPE) {
        nullableIsNotSupported(declaredNullable);
        return LONG_PARSER;
      }
      else if (type == Integer.TYPE) {
        nullableIsNotSupported(declaredNullable);
        return INTEGER_PARSER;
      }
      else if (type == Boolean.TYPE) {
        nullableIsNotSupported(declaredNullable);
        return BOOLEAN_PARSER;
      }
      else if (type == Float.TYPE) {
        nullableIsNotSupported(declaredNullable);
        return FLOAT_PARSER;
      }
      else if (type == Number.class || type == Double.TYPE) {
        return declaredNullable ? NULLABLE_NUMBER_PARSER : NUMBER_PARSER;
      }
      else if (type == Void.TYPE) {
        nullableIsNotSupported(declaredNullable);
        return VOID_PARSER;
      }
      else if (type == String.class) {
        return declaredNullable ? NULLABLE_STRING_PARSER : STRING_PARSER;
      }
      else if (type == JsonReaderEx.class) {
        return declaredNullable ? NULLABLE_JSON_PARSER : JSON_PARSER;
      }
      else if (type == Map.class) {
        return declaredNullable ? NULLABLE_MAP_PARSER : MAP_PARSER;
      }
      else if (type == StringIntPair.class) {
        return STRING_INT_PAIR_PARSER;
      }
      else if (typeClass.isArray()) {
        return new ArrayReader(getFieldTypeParser(typeClass.getComponentType(), false, false, null), false,
                               isComplexNullable(declaredNullable, method));
      }
      else if (typeClass.isEnum()) {
        @SuppressWarnings("unchecked")
        Class<RetentionPolicy> enumTypeClass = (Class<RetentionPolicy>)typeClass;
        return EnumReader.create(enumTypeClass, declaredNullable);
      }
      TypeRef<?> ref = getTypeRef(typeClass);
      if (ref != null) {
        return createJsonParser(ref, declaredNullable, isSubtyping);
      }
      throw new JsonProtocolModelParseException("Method return type " + type + " (simple class) not supported");
    }
    else if (type instanceof ParameterizedType) {
      ParameterizedType parameterizedType = (ParameterizedType)type;
      if (parameterizedType.getRawType() == List.class) {
        Type argumentType = parameterizedType.getActualTypeArguments()[0];
        if (argumentType instanceof WildcardType) {
          WildcardType wildcard = (WildcardType)argumentType;
          if (wildcard.getLowerBounds().length == 0 && wildcard.getUpperBounds().length == 1) {
            argumentType = wildcard.getUpperBounds()[0];
          }
        }
        return new ArrayReader(getFieldTypeParser(argumentType, false, false, null), true, isComplexNullable(declaredNullable, method));
      }
      else {
        throw new JsonProtocolModelParseException("Method return type " + type + " (generic) not supported");
      }
    }
    else {
      throw new JsonProtocolModelParseException("Method return type " + type + " not supported");
    }
  }

  private static boolean isComplexNullable(boolean declaredNullable, Method method) {
    return declaredNullable || (method != null && method.getAnnotation(JsonOptionalField.class) != null);
  }

  private static void nullableIsNotSupported(boolean declaredNullable)
    throws JsonProtocolModelParseException {
    if (declaredNullable) {
      throw new JsonProtocolModelParseException("The type cannot be declared nullable");
    }
  }

  private static <T> ObjectValueReader<T> createJsonParser(TypeRef<T> type, boolean isNullable, boolean isSubtyping) {
    return new ObjectValueReader<T>(type, isNullable, isSubtyping);
  }

  <T> TypeRef<T> getTypeRef(Class<T> typeClass) {
    if (typeClass.getAnnotation(JsonType.class) != null) {
      TypeRef<T> result = new TypeRef<T>(typeClass);
      refs.add(result);
      return result;
    }
    return null;
  }

  private TypeRef<?> getSuperclassRef(Class<?> typeClass) {
    TypeRef<?> result = null;
    for (Type interfaceGeneric : typeClass.getGenericInterfaces()) {
      if (!(interfaceGeneric instanceof ParameterizedType)) {
        continue;
      }
      ParameterizedType parameterizedType = (ParameterizedType)interfaceGeneric;
      if (parameterizedType.getRawType() != JsonSubtype.class) {
        continue;
      }
      Type param = parameterizedType.getActualTypeArguments()[0];
      if (!(param instanceof Class)) {
        throw new JsonProtocolModelParseException("Unexpected type of superclass " + param);
      }
      Class<?> paramClass = (Class<?>)param;
      if (result != null) {
        throw new JsonProtocolModelParseException("Already has superclass " +
                                                  result.getTypeClass().getName());
      }
      result = getTypeRef(paramClass);
      if (result == null) {
        throw new JsonProtocolModelParseException("Unknown base class " + paramClass.getName());
      }
    }
    return result;
  }
}