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
    ObjectValueParser<?> objectValueParser = parser.asJsonTypeParser();
    if (objectValueParser == null) {
      Util.writeJavaTypeName(m.getGenericReturnType(), scope.getOutput());
    }
    else {
      scope.append(scope.getTypeImplReference(objectValueParser.getType().get()));
    }
  }

  @Override
  protected void writeReadCode(JavaCodeGenerator.MethodScope scope) {
    parser.writeReadCode(scope, true, scope.getOutput());
  }
}
