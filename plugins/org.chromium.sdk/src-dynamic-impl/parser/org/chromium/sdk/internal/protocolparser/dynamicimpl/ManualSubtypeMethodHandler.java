package org.chromium.sdk.internal.protocolparser.dynamicimpl;

import java.lang.reflect.Method;

class ManualSubtypeMethodHandler extends LazyCachedMethodHandlerBase {
  private final ValueParser<?> parser;

  ManualSubtypeMethodHandler(VolatileFieldBinding fieldInf, ValueParser<?> parser) {
    super(fieldInf);
    this.parser = parser;
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
