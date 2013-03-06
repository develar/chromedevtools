package org.chromium.protocolparser;

import java.lang.reflect.Method;
import java.util.Collections;

/**
 * Basic implementation of the method that parses value on demand and store it for
 * a future use.
 */
class LazyCachedMethodHandler extends MethodHandler {
  private final ValueParser parser;
  private final VolatileFieldBinding fieldBinding;

  LazyCachedMethodHandler(ValueParser parser, VolatileFieldBinding fieldBinding) {
    this.parser = parser;
    this.fieldBinding = fieldBinding;
  }

  protected VolatileFieldBinding getFieldBinding() {
    return fieldBinding;
  }

  protected void writeReadCode(JavaCodeGenerator.MethodScope scope) {
    parser.writeReadCode(scope, true, scope.getOutput());
  }

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
  void writeMethodImplementationJava(ClassScope classScope, Method m, TextOutput out) {
    out.append("@Override").newLine().append("public ");
    writeReturnTypeJava(classScope, m, out);
    out.append(' ');
    appendMethodSignatureJava(m, Collections.<String>emptyList(), out);

    JavaCodeGenerator.MethodScope scope = classScope.newMethodScope();
    out.openBlock();
    out.append("if (");
    getFieldBinding().writeGetExpression(out);
    out.append(" == null)").openBlock();
    {
      if (parser.isThrowsIOException()) {
        out.append("try").openBlock();
      }
      {
        getFieldBinding().writeGetExpression(out);
        out.append(" = ");
        writeReadCode(scope);
        out.semi();
      }
      if (parser.isThrowsIOException()) {
        out.closeBlock();
        out.newLine().append("catch (IOException e)").openBlock();
        out.append("throw new com.google.gson.JsonParseException(e);").closeBlock();
      }
      out.newLine().append(Util.PENDING_INPUT_READER_NAME).append(" = null;");
    }
    out.closeBlock();

    out.newLine().append("return ");
    getFieldBinding().writeGetExpression(out);
    out.semi();

    out.closeBlock();
  }
}
