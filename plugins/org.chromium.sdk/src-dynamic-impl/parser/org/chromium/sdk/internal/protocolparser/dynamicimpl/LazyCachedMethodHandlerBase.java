package org.chromium.sdk.internal.protocolparser.dynamicimpl;

import java.lang.reflect.Method;
import java.lang.reflect.Type;
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

  protected abstract void writeReturnTypeJava(ClassScope scope, Method m);

  @Override
  void writeMethodImplementationJava(ClassScope classScope, Method m, TextOutput out) {
    out.append("@Override").newLine().append("public ");
    writeReturnTypeJava(classScope, m);
    out.append(' ');
    appendMethodSignatureJava(m, Collections.<String>emptyList(), out);
    {
      Type[] exceptions = m.getGenericExceptionTypes();
      if (exceptions.length > 0) {
        classScope.append(" throws ");
        for (int i = 0; i < exceptions.length; i++) {
          if (i != 0) {
            classScope.append(", ");
          }
          Util.writeJavaTypeName(exceptions[i], out);
        }
      }
    }

    JavaCodeGenerator.MethodScope scope = classScope.newMethodScope();
    out.openBlock();

    writeReturnTypeJava(classScope, m);
    out.append(" result = ");
    getFieldBinding().writeGetExpressionJava(out);
    out.append(';').newLine();

    out.append("if (result != null)").openBlock();
    out.append("return result;").closeBlock();

    out.newLine();
    getFieldBinding().writeGetExpressionJava(out);
    out.append(" = ");
    writeReadCode(scope);
    out.append(';');
    out.newLine().append(Util.PENDING_INPUT_READER_NAME).append(" = null;");
    out.newLine().append("return ");
    getFieldBinding().writeGetExpressionJava(out);
    out.append(';');

    out.closeBlock();
  }

  protected abstract void writeReadCode(JavaCodeGenerator.MethodScope scope);
}
