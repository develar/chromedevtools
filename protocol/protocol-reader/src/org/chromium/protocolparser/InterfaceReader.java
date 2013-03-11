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
  private static final PrimitiveValueParser LONG_PARSER = new PrimitiveValueParser("long");

  private static final PrimitiveValueParser INTEGER_PARSER = new PrimitiveValueParser("int");
  private static final PrimitiveValueParser BOOLEAN_PARSER = new PrimitiveValueParser("boolean");
  private static final PrimitiveValueParser FLOAT_PARSER = new PrimitiveValueParser("float");

  private static final PrimitiveValueParser NUMBER_PARSER = new PrimitiveValueParser("double");
  private static final PrimitiveValueParser NULLABLE_NUMBER_PARSER = new PrimitiveValueParser("double", true);

  private static final PrimitiveValueParser STRING_PARSER = new PrimitiveValueParser("String");
  private static final PrimitiveValueParser NULLABLE_STRING_PARSER = new PrimitiveValueParser("String", true);

  private static final SimpleParserPair<Object> OBJECT_PARSER = SimpleParserPair.create(Object.class);
  private static final SimpleParserPair<JsonReaderEx> JSON_PARSER = SimpleParserPair.create(JsonReaderEx.class);
  private static final MapParser MAP_PARSER = new MapParser(false);
  private static final MapParser NULLABLE_MAP_PARSER = new MapParser(true);

  private static final StringIntPairValueParser STRING_INT_PAIR_PARSER = new StringIntPairValueParser();

  static ValueParser VOID_PARSER = new ValueParser(true) {
    @Override
    public void appendFinishedValueTypeName(TextOutput out) {
      out.append("void");
    }

    @Override
    void writeReadCode(JavaCodeGenerator.MethodScope methodScope, boolean subtyping, String fieldName, TextOutput out) {
      out.append("null");
    }

    @Override
    void writeArrayReadCode(JavaCodeGenerator.MethodScope scope,
                            boolean subtyping,
                            boolean nullable,
                            String fieldName, TextOutput out) {
      throw new UnsupportedOperationException();
    }
  };
  private final Map<Class<?>, TypeHandler<?>> typeToTypeHandler;
  private final boolean strictMode;

  private final boolean isStatic;

  final List<RefImpl<?>> refs = new ArrayList<RefImpl<?>>();
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

  static class SimpleParserPair<T> {
    static <T> SimpleParserPair<T> create(Class<T> fieldType) {
      return new SimpleParserPair<T>(fieldType);
    }

    private final SimpleCastValueParser<T> nullable;
    private final SimpleCastValueParser<T> notNullable;

    private SimpleParserPair(Class<T> fieldType) {
      nullable = new SimpleCastValueParser<T>(fieldType, true);
      notNullable = new SimpleCastValueParser<T>(fieldType, false);
    }

    ValueParser get(boolean declaredNullable) {
      return declaredNullable ? nullable : notNullable;
    }
  }

  Map<Class<?>, TypeHandler<?>> go() {
    return go(typeToTypeHandler.keySet().toArray(new Class[typeToTypeHandler.size()]));
  }

  private Map<Class<?>, TypeHandler<?>> go(Class<?>[] classes) {
    for (Class<?> typeClass : classes) {
      createIfNotExists(typeClass);
    }

    // Resolve cross-references.
    for (RefImpl<?> ref : refs) {
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

    for (Class<?> aClass : typeClass.getDeclaredClasses()) {
      if (aClass.isInterface()) {
        createIfNotExists(aClass);
      }
    }

    TypeHandler typeHandler = createTypeHandler(typeClass);
    for (RefImpl<?> ref : refs) {
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

    TypeHandler.EagerFieldParser eagerFieldParser = new DynamicParserImpl.EagerFieldParserImpl(fields.getOnDemandHandlers());
    return new TypeHandler<T>(typeClass, getSuperclassRef(typeClass),
                              fields.getVolatileFields(), methodHandlerMap,
                              fields.getFieldLoaders(),
                              eagerFieldParser, fields.getAlgCasesData(),
                              fields.lazyRead);
  }

  ValueParser getFieldTypeParser(Type type, boolean declaredNullable, boolean isSubtyping, @Nullable Method method)
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
      else if (type == Object.class) {
        return OBJECT_PARSER.get(declaredNullable);
      }
      else if (type == JsonReaderEx.class) {
        return JSON_PARSER.get(declaredNullable);
      }
      else if (type == Map.class) {
        return declaredNullable ? NULLABLE_MAP_PARSER : MAP_PARSER;
      }
      else if (type == StringIntPair.class) {
        return STRING_INT_PAIR_PARSER;
      }
      else if (typeClass.isArray()) {
        return new ArrayParser(getFieldTypeParser(typeClass.getComponentType(), false, false, null), false,
                               isComplexNullable(declaredNullable, method));
      }
      else if (typeClass.isEnum()) {
        @SuppressWarnings("unchecked")
        Class<RetentionPolicy> enumTypeClass = (Class<RetentionPolicy>)typeClass;
        return EnumParser.create(enumTypeClass, declaredNullable);
      }
      RefImpl<?> ref = getTypeRef(typeClass);
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
        return new ArrayParser(getFieldTypeParser(argumentType, false, false, null), true, isComplexNullable(declaredNullable, method));
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

  private static <T> ObjectValueParser<T> createJsonParser(RefImpl<T> type, boolean isNullable, boolean isSubtyping) {
    return new ObjectValueParser<T>(type, isNullable, isSubtyping);
  }

  <T> RefImpl<T> getTypeRef(Class<T> typeClass) {
    if (typeClass.getAnnotation(JsonType.class) != null) {
      RefImpl<T> result = new RefImpl<T>(typeClass);
      refs.add(result);
      return result;
    }
    return null;
  }

  private RefImpl<?> getSuperclassRef(Class<?> typeClass) {
    RefImpl<?> result = null;
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