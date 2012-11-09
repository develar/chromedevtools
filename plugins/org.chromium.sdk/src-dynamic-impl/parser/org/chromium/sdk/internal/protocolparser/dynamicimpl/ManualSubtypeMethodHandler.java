package org.chromium.sdk.internal.protocolparser.dynamicimpl;

import org.chromium.sdk.internal.protocolparser.JsonProtocolParseException;

import java.lang.reflect.Method;

class ManualSubtypeMethodHandler extends LazyCachedMethodHandlerBase {
  private final SlowParser<?> parser;

  ManualSubtypeMethodHandler(VolatileFieldBinding fieldInf, SlowParser<?> parser) {
    super(fieldInf);
    this.parser = parser;
  }

  @Override
  protected Object parse(ObjectData objectData) throws JsonProtocolParseException {
    return parser.parseValue(objectData.getUnderlyingObject(), objectData);
  }

  @Override
  protected Object finishRawValue(Object raw) {
    FieldLoadedFinisher valueFinisher = parser.getValueFinisher();
    Object res = raw;
    if (valueFinisher != null) {
       res = valueFinisher.getValueForUser(res);
    }
    return res;
  }

  ObjectData getSubtypeData(ObjectData objectData) throws JsonProtocolParseException {
    return (ObjectData) handleRaw(objectData);
  }

  @Override
  protected void writeReturnTypeJava(JavaCodeGenerator.ClassScope scope, Method m) {
    JsonTypeParser<?> jsonTypeParser = parser.asJsonTypeParser();
    if (jsonTypeParser == null) {
      Util.writeJavaTypeName(m.getGenericReturnType(), scope.getOutput());
    }
    else {
      scope.append(scope.getTypeImplReference(jsonTypeParser.getType().get()));
    }
  }

  @Override
  protected void writeReadCode(JavaCodeGenerator.MethodScope scope) {
    parser.writeReadCode(scope, scope.getOutput());
  }
}
