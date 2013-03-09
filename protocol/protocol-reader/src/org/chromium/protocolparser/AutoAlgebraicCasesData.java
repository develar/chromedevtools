package org.chromium.protocolparser;

class AutoAlgebraicCasesData extends AlgebraicCasesData {
  boolean hasDefaultCase;

  @Override
  void writeConstructorCodeJava(JavaCodeGenerator.MethodScope methodScope, TextOutput out) {
    boolean isFirst = true;
    out.newLine().append("else").openBlock(false);
    if (hasDefaultCase) {
      nullifyOther(out, -1);
    }
    else {
      out.newLine().append("throw new IOException(\"Not a single case matches\");");
    }
    out.closeBlock();
  }

  private void nullifyOther(TextOutput out, int exclude) {
  }

  @Override
  void writeFields(ClassScope classScope) {
    TextOutput out = classScope.getOutput();
    out.newLine();
  }

  static String getAutoAlgFieldNameJava(int code) {
    return "conditional" + code;
  }
}
