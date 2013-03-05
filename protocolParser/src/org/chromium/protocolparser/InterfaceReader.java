package org.chromium.protocolparser;

import com.google.gson.stream.JsonReader;
import gnu.trove.THashSet;
import org.chromium.protocolParser.*;
import org.jetbrains.jsonProtocol.*;

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
  private static final SimpleParserPair<JsonReader> JSON_PARSER = SimpleParserPair.create(JsonReader.class);
  private static final MapParser MAP_PARSER = new MapParser(false);
  private static final MapParser NULLABLE_MAP_PARSER = new MapParser(true);

  private static final StringIntPairValueParser STRING_INT_PAIR_PARSER = new StringIntPairValueParser();

  private static ValueParser VOID_PARSER = new ValueParser(true) {
    @Override
    public void appendFinishedValueTypeName(TextOutput out) {
      out.append("void");
    }

    @Override
    void writeReadCode(JavaCodeGenerator.MethodScope methodScope, boolean subtyping, TextOutput out) {
      out.append("null");
    }

    @Override
    void writeArrayReadCode(JavaCodeGenerator.MethodScope scope, boolean subtyping, TextOutput out) {
      throw new UnsupportedOperationException();
    }
  };

  private static MethodHandler RETURN_NULL_METHOD_HANDLER = new MethodHandler() {
    @Override
    void writeMethodImplementationJava(ClassScope scope, Method m, TextOutput out) {
      writeMethodDeclarationJava(out, m);
      out.openBlock();
      out.closeBlock();
    }
  };

  private final Map<Class<?>, TypeHandler<?>> typeTotypeHandler;
  private final boolean strictMode;

  private final boolean isStatic;

  final List<RefImpl<?>> refs = new ArrayList<RefImpl<?>>();
  final List<SubtypeCaster> subtypeCasters = new ArrayList<SubtypeCaster>();

  InterfaceReader(Class[] protocolInterfaces, boolean isStatic, boolean strictMode) {
    this.isStatic = isStatic;
    this.strictMode = strictMode;

    typeTotypeHandler = new LinkedHashMap<Class<?>, TypeHandler<?>>(protocolInterfaces.length);
    for (Class typeClass : protocolInterfaces) {
      if (!typeClass.isInterface()) {
        continue;
      }

      if (typeTotypeHandler.containsKey(typeClass)) {
        throw new IllegalArgumentException("Protocol interface duplicated " + typeClass.getName());
      }
      typeTotypeHandler.put(typeClass, null);
    }
  }

  private InterfaceReader(Map<Class<?>, TypeHandler<?>> typeTotypeHandler, boolean isStatic, boolean strictMode) {
    this.isStatic = isStatic;
    this.strictMode = strictMode;
    this.typeTotypeHandler = typeTotypeHandler;
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
    return go(typeTotypeHandler.keySet().toArray(new Class[typeTotypeHandler.size()]));
  }

  private Map<Class<?>, TypeHandler<?>> go(Class<?>[] classes) {
    for (Class<?> typeClass : classes) {
      createIfNotExists(typeClass);
    }

    // Resolve cross-references.
    for (RefImpl<?> ref : refs) {
      TypeHandler<?> type = typeTotypeHandler.get(ref.typeClass);
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
      for (TypeHandler<?> type : typeTotypeHandler.values()) {
        type.buildClosedNameSet();
      }
    }

    return typeTotypeHandler;
  }

  private final Set<Class<?>> processed = new THashSet<Class<?>>();

  private void createIfNotExists(Class<?> typeClass) {
    if (processed.contains(typeClass)) {
      return;
    }

    processed.add(typeClass);

    typeTotypeHandler.put(typeClass, null);

    for (Class<?> aClass : typeClass.getDeclaredClasses()) {
      if (aClass.isInterface()) {
        createIfNotExists(aClass);
      }
    }

    TypeHandler typeHandler = createTypeHandler(typeClass);
    boolean found = false;
    for (RefImpl<?> ref : refs) {
      if (ref.typeClass == typeClass) {
        assert ref.get() == null;
        ref.set(typeHandler);
        found = true;
        break;
      }
    }
    typeTotypeHandler.put(typeClass, typeHandler);
  }

  private <T> TypeHandler<T> createTypeHandler(Class<T> typeClass) {
    if (!typeClass.isInterface()) {
      throw new JsonProtocolModelParseException("Json model type should be interface: " + typeClass.getName());
    }

    FieldProcessor<T> fields = new FieldProcessor<T>(typeClass);
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

    TypeHandler.EagerFieldParser eagerFieldParser = new DynamicParserImpl.EagerFieldParserImpl(fields.getOnDemandHanlers());
    boolean lazyRead = fields.lazyRead || JsonObjectBased.class.isAssignableFrom(typeClass);
    return new TypeHandler<T>(typeClass, getSuperclassRef(typeClass),
                              fields.getVolatileFields(), methodHandlerMap,
                              fields.getFieldLoaders(),
                              eagerFieldParser, fields.getAlgCasesData(),
                              lazyRead);
  }

  private ValueParser getFieldTypeParser(Type type, boolean declaredNullable, boolean isSubtyping)
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
      else if (type == Number.class) {
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
      else if (type == JsonReader.class) {
        return JSON_PARSER.get(declaredNullable);
      }
      else if (type == Map.class) {
        return declaredNullable ? NULLABLE_MAP_PARSER : MAP_PARSER;
      }
      else if (type == StringIntPair.class) {
        return STRING_INT_PAIR_PARSER;
      }
      else if (typeClass.isArray()) {
        return createArrayParser(getFieldTypeParser(typeClass.getComponentType(), false, false), false, declaredNullable);
      }
      else if (typeClass.isEnum()) {
        @SuppressWarnings("unchecked")
        Class<RetentionPolicy> enumTypeClass = (Class<RetentionPolicy>)typeClass;
        return EnumParser.create(enumTypeClass, declaredNullable);
      }
      else if (typeTotypeHandler.containsKey(typeClass)) {
      }
      RefToType<?> ref = getTypeRef(typeClass);
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
        return createArrayParser(getFieldTypeParser(argumentType, false, false), true, declaredNullable);
      }
      else {
        throw new JsonProtocolModelParseException("Method return type " + type + " (generic) not supported");
      }
    }
    else {
      throw new JsonProtocolModelParseException("Method return type " + type + " not supported");
    }
  }

  private static void nullableIsNotSupported(boolean declaredNullable)
    throws JsonProtocolModelParseException {
    if (declaredNullable) {
      throw new JsonProtocolModelParseException("The type cannot be declared nullable");
    }
  }

  private static <T> ObjectValueParser<T> createJsonParser(RefToType<T> type, boolean isNullable, boolean isSubtyping) {
    return new ObjectValueParser<T>(type, isNullable, isSubtyping);
  }

  private static ArrayParser createArrayParser(ValueParser componentParser, boolean isList, boolean isNullable) {
    return new ArrayParser(componentParser, isList, isNullable);
  }

  private <T> RefToType<T> getTypeRef(Class<T> typeClass) {
    if (typeClass.getAnnotation(JsonType.class) != null) {
      RefImpl<T> result = new RefImpl<T>(typeClass);
      refs.add(result);
      return result;
    }
    //for (DynamicParserImpl<?> baseParser : basePackages) {
    //  @SuppressWarnings("unchecked")
    //  TypeHandler<T> typeHandler = (TypeHandler<T>)baseParser.typeToTypeHandler.get(typeClass);
    //  if (typeHandler != null) {
    //    return new DynamicParserImpl.RefImpl<T>(typeClass, typeHandler);
    //  }
    //}
    return null;
  }

  private RefToType<?> getSuperclassRef(Class<?> typeClass)
    throws JsonProtocolModelParseException {
    RefToType<?> result = null;
    for (Type interfc : typeClass.getGenericInterfaces()) {
      if (!(interfc instanceof ParameterizedType)) {
        continue;
      }
      ParameterizedType parameterizedType = (ParameterizedType)interfc;
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

  private class FieldProcessor<T> {
    private final Class<T> typeClass;

    private final JsonType jsonTypeAnnotation;
    private final List<FieldLoader> fieldLoaders = new ArrayList<FieldLoader>(2);
    private final List<DynamicParserImpl.LazyHandler> onDemandHanlers = new ArrayList<DynamicParserImpl.LazyHandler>();
    private final Map<Method, MethodHandler> methodHandlerMap = new HashMap<Method, MethodHandler>();
    private final DynamicParserImpl.FieldMap fieldMap = new DynamicParserImpl.FieldMap();
    private ManualAlgebraicCasesData manualAlgCasesData;
    private AutoAlgebraicCasesData autoAlgCasesData;
    private List<VolatileFieldBinding> volatileFields = new ArrayList<VolatileFieldBinding>(2);
    private boolean lazyRead;
    private boolean useManualAlgCasesData = true;

    FieldProcessor(Class<T> typeClass) throws JsonProtocolModelParseException {
      this.typeClass = typeClass;
      jsonTypeAnnotation = typeClass.getAnnotation(JsonType.class);
      if (jsonTypeAnnotation == null) {
        throw new JsonProtocolModelParseException("Not a json model type: " + typeClass);
      }
    }

    void go() throws JsonProtocolModelParseException {
      Method[] methods = typeClass.getDeclaredMethods();
      for (Method m : methods) {
        try {
          processMethod(m);
        }
        catch (JsonProtocolModelParseException e) {
          throw new JsonProtocolModelParseException("Problem with method " + m, e);
        }
      }
    }

    private void processMethod(Method m) {
      if (m.getParameterTypes().length != 0) {
        throw new JsonProtocolModelParseException("No parameters expected in " + m);
      }
      JsonOverrideField overrideFieldAnnotation = m.getAnnotation(JsonOverrideField.class);
      String fieldName = checkAndGetJsonFieldName(m);
      MethodHandler methodHandler;

      JsonSubtypeCasting jsonSubtypeCaseAnnotation = m.getAnnotation(JsonSubtypeCasting.class);
      if (jsonSubtypeCaseAnnotation != null) {
        if (overrideFieldAnnotation != null) {
          throw new JsonProtocolModelParseException(
            "Override annotation only works with field getter methods");
        }

        if (useManualAlgCasesData) {
          if (manualAlgCasesData == null) {
            manualAlgCasesData = new ManualAlgebraicCasesData();
          }
          methodHandler = processManualSubtypeMethod(m, jsonSubtypeCaseAnnotation);
          lazyRead = true;
        }
        else {
          if (autoAlgCasesData == null) {
            autoAlgCasesData = new AutoAlgebraicCasesData();
          }
          if (jsonSubtypeCaseAnnotation.reinterpret()) {
            throw new JsonProtocolModelParseException("Option 'reinterpret' is only available with 'subtypes chosen manually'");
          }
          methodHandler = processAutomaticSubtypeMethod(m);
        }
      }
      else {
        methodHandler = processFieldGetterMethod(m, overrideFieldAnnotation, fieldName);
      }
      methodHandlerMap.put(m, methodHandler);
    }

    private MethodHandler processFieldGetterMethod(Method m,
                                                   JsonOverrideField overrideFieldAnn,
                                                   String fieldName) throws JsonProtocolModelParseException {
      ValueParser fieldTypeParser = getFieldTypeParser(m.getGenericReturnType(), m.getAnnotation(JsonNullable.class) != null, false);
      if (overrideFieldAnn == null) {
        fieldMap.localNames.add(fieldName);
      }
      else {
        fieldMap.overridenNames.add(fieldName);
      }
      return createEagerLoadGetterHandler(fieldName, fieldTypeParser);
    }

    private MethodHandler createEagerLoadGetterHandler(String fieldName, ValueParser fieldTypeParser) {
      if (fieldTypeParser != VOID_PARSER) {
        fieldLoaders.add(new FieldLoader(fieldName, fieldTypeParser));
      }
      return new PreparsedFieldMethodHandler(fieldTypeParser == VOID_PARSER ? null : fieldName);
    }

    private MethodHandler processAutomaticSubtypeMethod(Method m) throws JsonProtocolModelParseException {
      if (m.getReturnType() == Void.TYPE) {
        if (autoAlgCasesData.hasDefaultCase) {
          throw new JsonProtocolModelParseException("Duplicate default case method: " + m);
        }
        autoAlgCasesData.hasDefaultCase = true;
        return RETURN_NULL_METHOD_HANDLER;
      }
      else {
        Class<?> methodType = m.getReturnType();
        RefToType<?> ref = getTypeRef(methodType);
        if (ref == null) {
          throw new JsonProtocolModelParseException("Unknown return type in " + m);
        }
        final int algCode = autoAlgCasesData.subtypes.size();
        autoAlgCasesData.subtypes.add(ref);
        subtypeCasters.add(new SubtypeCaster(ref) {
          @Override
          void writeJava(TextOutput out) {
            out.append(AutoAlgebraicCasesData.getAutoAlgFieldNameJava(algCode));
          }
        });
        return new AutoSubtypeMethodHandler(algCode);
      }
    }

    private MethodHandler processManualSubtypeMethod(final Method m, JsonSubtypeCasting jsonSubtypeCaseAnn)
      throws JsonProtocolModelParseException {
      ValueParser fieldTypeParser = getFieldTypeParser(m.getGenericReturnType(), false, !jsonSubtypeCaseAnn.reinterpret());
      VolatileFieldBinding fieldInfo = allocateVolatileField(fieldTypeParser, true);
      final LazyCachedMethodHandler handler = new LazyCachedMethodHandler(fieldTypeParser, fieldInfo);
      ObjectValueParser<?> parserAsObjectValueParser = fieldTypeParser.asJsonTypeParser();
      if (parserAsObjectValueParser != null && parserAsObjectValueParser.isSubtyping()) {
        SubtypeCaster subtypeCaster = new SubtypeCaster(parserAsObjectValueParser.getType()) {
          @Override
          void writeJava(TextOutput out) {
            out.append(m.getName()).append("()");
          }
        };
        manualAlgCasesData.subtypes.add(parserAsObjectValueParser.getType());
        subtypeCasters.add(subtypeCaster);
      }

      return handler;
    }

    List<VolatileFieldBinding> getVolatileFields() {
      return volatileFields;
    }

    private AlgebraicCasesData getAlgCasesData() {
      return useManualAlgCasesData ? manualAlgCasesData : autoAlgCasesData;
    }

    List<FieldLoader> getFieldLoaders() {
      return fieldLoaders;
    }

    List<DynamicParserImpl.LazyHandler> getOnDemandHanlers() {
      return onDemandHanlers;
    }

    Map<Method, MethodHandler> getMethodHandlerMap() {
      return methodHandlerMap;
    }

    private VolatileFieldBinding allocateVolatileField(final ValueParser fieldTypeParser,
                                                                         boolean internalType) {
      int position = volatileFields.size();
      FieldTypeInfo fieldTypeInfo;
      if (internalType) {
        fieldTypeInfo = new FieldTypeInfo() {
          @Override
          public void appendValueTypeNameJava(JavaCodeGenerator.FileScope scope) {
            fieldTypeParser.appendInternalValueTypeName(scope);
          }
        };
      }
      else {
        fieldTypeInfo = new FieldTypeInfo() {
          @Override
          public void appendValueTypeNameJava(JavaCodeGenerator.FileScope scope) {
            fieldTypeParser.appendFinishedValueTypeName(scope.getOutput());
          }
        };
      }
      VolatileFieldBinding binding = new VolatileFieldBinding(position, fieldTypeInfo);
      volatileFields.add(binding);
      return binding;
    }

    private String checkAndGetJsonFieldName(Method m) throws JsonProtocolModelParseException {
      if (m.getParameterTypes().length != 0) {
        throw new JsonProtocolModelParseException("Must have 0 parameters");
      }
      JsonField fieldAnn = m.getAnnotation(JsonField.class);
      if (fieldAnn != null) {
        String jsonLiteralName = fieldAnn.jsonLiteralName();
        if (!jsonLiteralName.isEmpty()) {
          return jsonLiteralName;
        }
      }
      return m.getName();
    }
  }

  private static class AutoSubtypeMethodHandler extends MethodHandler {
    private final int code;

    AutoSubtypeMethodHandler(int code) {
      this.code = code;
    }

    @Override
    void writeMethodImplementationJava(ClassScope scope, Method m, TextOutput out) {
      writeMethodDeclarationJava(out, m);
      out.openBlock();
      out.append("return ").append(AutoAlgebraicCasesData.getAutoAlgFieldNameJava(code)).semi();
      out.closeBlock();
    }
  }

  private static class ManualAlgebraicCasesData extends AlgebraicCasesData {
    @Override
    void writeConstructorCodeJava(JavaCodeGenerator.MethodScope methodScope, TextOutput out) {
    }

    @Override
    void writeFields(ClassScope classScope) {
    }
  }
}