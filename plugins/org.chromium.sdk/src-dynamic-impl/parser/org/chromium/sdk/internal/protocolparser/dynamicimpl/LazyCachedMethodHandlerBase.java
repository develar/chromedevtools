package org.chromium.sdk.internal.protocolparser.dynamicimpl;

import java.lang.reflect.Method;
import java.util.Collections;

/**
 * Basic implementation of the method that parses value on demand and store it for
 * a future use.
 */
abstract class LazyCachedMethodHandlerBase extends MethodHandler {
  private final VolatileFieldBinding fieldBinding;

  LazyCachedMethodHandlerBase(VolatileFieldBinding fieldBinding) {
    this.fieldBinding = fieldBinding;
  }

  protected VolatileFieldBinding getFieldBinding() {
    return fieldBinding;
  }

  protected abstract void writeReturnTypeJava(ClassScope scope, Method m, TextOutput out);

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
      out.append("try").openBlock();
      {
        getFieldBinding().writeGetExpression(out);
        out.append(" = ");
        writeReadCode(scope);
        out.semi();
      }
      out.closeBlock();
      out.newLine().append("catch (IOException e)").openBlock();
      out.append("throw new JsonParseException(e);").closeBlock();

      out.newLine().append(Util.PENDING_INPUT_READER_NAME).append(" = null;");
    }
    out.closeBlock();

    out.newLine().append("return ");
    getFieldBinding().writeGetExpression(out);
    out.semi();

    out.closeBlock();
  }

  protected abstract void writeReadCode(JavaCodeGenerator.MethodScope scope);
}
