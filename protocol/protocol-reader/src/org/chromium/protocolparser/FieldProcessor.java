package org.chromium.protocolparser;

import org.chromium.protocolReader.*;

import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class FieldProcessor<T> {
  private final Class<T> typeClass;

  private static MethodHandler RETURN_NULL_METHOD_HANDLER = new MethodHandler() {
    @Override
    void writeMethodImplementationJava(ClassScope scope, Method m, TextOutput out) {
      writeMethodDeclarationJava(out, m);
      out.openBlock();
      out.closeBlock();
    }
  };

  private final List<FieldLoader> fieldLoaders = new ArrayList<FieldLoader>(2);
  private final List<DynamicParserImpl.LazyHandler> onDemandHandlers = new ArrayList<DynamicParserImpl.LazyHandler>();
  private final Map<Method, MethodHandler> methodHandlerMap = new HashMap<Method, MethodHandler>();
  private final DynamicParserImpl.FieldMap fieldMap = new DynamicParserImpl.FieldMap();
  private AlgebraicCasesData manualAlgCasesData;
  private AutoAlgebraicCasesData autoAlgCasesData;
  private List<VolatileFieldBinding> volatileFields = new ArrayList<VolatileFieldBinding>(2);
  boolean lazyRead;
  private boolean useManualAlgCasesData = true;
  private InterfaceReader reader;

  FieldProcessor(InterfaceReader reader, Class<T> typeClass) throws JsonProtocolModelParseException {
    this.typeClass = typeClass;
    if (typeClass.getAnnotation(JsonType.class) == null) {
      throw new JsonProtocolModelParseException("Not a json model type: " + typeClass);
    }
    this.reader = reader;
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
        throw new JsonProtocolModelParseException("Override annotation only works with field getter methods");
      }

      if (useManualAlgCasesData) {
        if (manualAlgCasesData == null) {
          manualAlgCasesData = new AlgebraicCasesData();
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
      methodHandler = processFieldGetterMethod(m, overrideFieldAnnotation != null, fieldName);
    }
    methodHandlerMap.put(m, methodHandler);
  }

  private MethodHandler processFieldGetterMethod(Method m, boolean hasOverrideFieldAnnotation, String fieldName) throws JsonProtocolModelParseException {
    Type genericReturnType = m.getGenericReturnType();
    ValueParser fieldTypeParser = reader.getFieldTypeParser(genericReturnType, m.getAnnotation(JsonNullable.class) != null, false, m);
    if (hasOverrideFieldAnnotation) {
      fieldMap.overridenNames.add(fieldName);
    }
    else {
      fieldMap.localNames.add(fieldName);
    }
    if (fieldTypeParser != InterfaceReader.VOID_PARSER) {
      fieldLoaders.add(new FieldLoader(fieldName, fieldTypeParser));
    }
    return new PreparsedFieldMethodHandler(fieldTypeParser == InterfaceReader.VOID_PARSER ? null : fieldName);
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
      RefToType<?> ref = reader.getTypeRef(methodType);
      if (ref == null) {
        throw new JsonProtocolModelParseException("Unknown return type in " + m);
      }
      final int algCode = autoAlgCasesData.subtypes.size();
      autoAlgCasesData.subtypes.add(ref);
      reader.subtypeCasters.add(new SubtypeCaster(ref) {
        @Override
        void writeJava(TextOutput out) {
          out.append(AutoAlgebraicCasesData.getAutoAlgFieldNameJava(algCode));
        }
      });
      return new AutoSubtypeMethodHandler(algCode);
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

  private MethodHandler processManualSubtypeMethod(final Method m, JsonSubtypeCasting jsonSubtypeCaseAnn) throws JsonProtocolModelParseException {
    ValueParser fieldTypeParser = reader.getFieldTypeParser(m.getGenericReturnType(), false, !jsonSubtypeCaseAnn.reinterpret(), null);
    VolatileFieldBinding fieldInfo = allocateVolatileField(fieldTypeParser, true);
    LazyCachedMethodHandler handler = new LazyCachedMethodHandler(fieldTypeParser, fieldInfo);
    ObjectValueParser<?> parserAsObjectValueParser = fieldTypeParser.asJsonTypeParser();
    if (parserAsObjectValueParser != null && parserAsObjectValueParser.isSubtyping()) {
      SubtypeCaster subtypeCaster = new SubtypeCaster(parserAsObjectValueParser.getType()) {
        @Override
        void writeJava(TextOutput out) {
          out.append(m.getName()).append("()");
        }
      };
      manualAlgCasesData.subtypes.add(parserAsObjectValueParser.getType());
      reader.subtypeCasters.add(subtypeCaster);
    }
    return handler;
  }

  List<VolatileFieldBinding> getVolatileFields() {
    return volatileFields;
  }

  AlgebraicCasesData getAlgCasesData() {
    return useManualAlgCasesData ? manualAlgCasesData : autoAlgCasesData;
  }

  List<FieldLoader> getFieldLoaders() {
    return fieldLoaders;
  }

  List<DynamicParserImpl.LazyHandler> getOnDemandHandlers() {
    return onDemandHandlers;
  }

  Map<Method, MethodHandler> getMethodHandlerMap() {
    return methodHandlerMap;
  }

  private VolatileFieldBinding allocateVolatileField(final ValueParser fieldTypeParser, boolean internalType) {
    int position = volatileFields.size();
    FieldTypeInfo fieldTypeInfo;
    if (internalType) {
      fieldTypeInfo = new FieldTypeInfo() {
        @Override
        public void appendValueTypeNameJava(FileScope scope, TextOutput out) {
          fieldTypeParser.appendInternalValueTypeName(scope, out);
        }
      };
    }
    else {
      fieldTypeInfo = new FieldTypeInfo() {
        @Override
        public void appendValueTypeNameJava(FileScope scope, TextOutput out) {
          fieldTypeParser.appendFinishedValueTypeName(out);
        }
      };
    }
    VolatileFieldBinding binding = new VolatileFieldBinding(position, fieldTypeInfo);
    volatileFields.add(binding);
    return binding;
  }

  private static String checkAndGetJsonFieldName(Method m) throws JsonProtocolModelParseException {
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
