package org.jetbrains.protocolReader;

import org.chromium.protocolReader.*;

import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.*;

class FieldProcessor<T> {
  private final Class<T> typeClass;

  private final List<FieldLoader> fieldLoaders = new ArrayList<FieldLoader>(2);
  private final LinkedHashMap<Method, MethodHandler> methodHandlerMap = new LinkedHashMap<>();
  private final DynamicParserImpl.FieldMap fieldMap = new DynamicParserImpl.FieldMap();
  private List<VolatileFieldBinding> volatileFields = new ArrayList<VolatileFieldBinding>(2);
  boolean lazyRead;
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
      methodHandler = processManualSubtypeMethod(m, jsonSubtypeCaseAnnotation);
      lazyRead = true;
    }
    else {
      methodHandler = processFieldGetterMethod(m, overrideFieldAnnotation != null, fieldName);
    }
    methodHandlerMap.put(m, methodHandler);
  }

  private MethodHandler processFieldGetterMethod(Method m, boolean hasOverrideFieldAnnotation, String fieldName) throws JsonProtocolModelParseException {
    Type genericReturnType = m.getGenericReturnType();
    ValueReader fieldTypeParser = reader.getFieldTypeParser(genericReturnType, m.getAnnotation(JsonNullable.class) != null, false, m);
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

  private MethodHandler processManualSubtypeMethod(final Method m, JsonSubtypeCasting jsonSubtypeCaseAnn) throws JsonProtocolModelParseException {
    ValueReader fieldTypeParser = reader.getFieldTypeParser(m.getGenericReturnType(), false, !jsonSubtypeCaseAnn.reinterpret(), null);
    VolatileFieldBinding fieldInfo = allocateVolatileField(fieldTypeParser, true);
    LazyCachedMethodHandler handler = new LazyCachedMethodHandler(fieldTypeParser, fieldInfo);
    ObjectValueReader<?> parserAsObjectValueParser = fieldTypeParser.asJsonTypeParser();
    if (parserAsObjectValueParser != null && parserAsObjectValueParser.isSubtyping()) {
      SubtypeCaster subtypeCaster = new SubtypeCaster(parserAsObjectValueParser.getType()) {
        @Override
        void writeJava(TextOutput out) {
          out.append(m.getName()).append("()");
        }
      };
      reader.subtypeCasters.add(subtypeCaster);
    }
    return handler;
  }

  List<VolatileFieldBinding> getVolatileFields() {
    return volatileFields;
  }

  List<FieldLoader> getFieldLoaders() {
    return fieldLoaders;
  }

  Map<Method, MethodHandler> getMethodHandlerMap() {
    return methodHandlerMap;
  }

  private VolatileFieldBinding allocateVolatileField(final ValueReader fieldTypeParser, boolean internalType) {
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
