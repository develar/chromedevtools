package org.chromium.sdk.internal.protocolparser.dynamicimpl;

import java.lang.reflect.Method;

class ManualSubtypeMethodHandler extends LazyCachedMethodHandlerBase {
  private final ValueParser parser;

  ManualSubtypeMethodHandler(VolatileFieldBinding fieldInf, ValueParser parser) {
    super(fieldInf);
    this.parser = parser;
  }

  @Override
  protected void writeReturnTypeJava(ClassScope scope, Method m, TextOutput out) {
    ObjectValueParser objectValueParser = parser.asJsonTypeParser();
    if (objectValueParser == null) {
      Util.writeJavaTypeName(m.getGenericReturnType(), out);
    }
    else {
      out.append(scope.getTypeImplReference(objectValueParser.getType().get()));
    }
  }

  @Override
  protected void writeReadCode(JavaCodeGenerator.MethodScope scope) {
    parser.writeReadCode(scope, true, scope.getOutput());
  }
}
