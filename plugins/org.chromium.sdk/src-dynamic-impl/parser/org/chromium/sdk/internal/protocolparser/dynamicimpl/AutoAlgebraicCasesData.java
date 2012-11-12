package org.chromium.sdk.internal.protocolparser.dynamicimpl;

class AutoAlgebraicCasesData extends AlgebraicCasesData {
  int variantCodeFieldPos = -1;
  int variantValueFieldPos = -1;
  boolean hasDefaultCase;

  @Override
  void writeConstructorCodeJava(JavaCodeGenerator.MethodScope methodScope, TextOutput out) {
    boolean isFirst = true;
    String operator = "if";
    for (int i = 0; i < getSubtypes().size(); i++) {
      TypeHandler<?> nextSubtype = getSubtypes().get(i).get();
      out.newLine().append(operator).append(" (").append(methodScope.getTypeImplReference(nextSubtype)).append(
        ".checkSubtypeConditions(underlying))").openBlock();
      {
        out.append(getAutoAlgFieldNameJava(i)).append(" = new ").append(methodScope.getTypeImplReference(nextSubtype)).append('(').append(Util.READER_NAME).comma().append("this").append(')').append(';');
        for (int j = 0; j < getSubtypes().size(); j++) {
          if (j != i) {
            out.newLine().append(getAutoAlgFieldNameJava(j)).append(" = null;");
          }
        }
      }
      out.closeBlock();

      if (isFirst) {
        isFirst = false;
        operator = "else if";
      }
    }

    if (!hasDefaultCase) {
      out.newLine().append("else").openBlock();
      out.append("throw new IOException(\"Not a single case matches\");");
      out.closeBlock();
    }
  }

  @Override
  void writeFiledsJava(JavaCodeGenerator.ClassScope classScope) {
    for (int i = 0; i < getSubtypes().size(); i++) {
      TypeHandler<?> nextSubtype = getSubtypes().get(i).get();
      classScope.startLine("private final " + classScope.getTypeImplReference(nextSubtype) +
                           " " + getAutoAlgFieldNameJava(i) + ";\n");
    }
  }

  static String getAutoAlgFieldNameJava(int code) {
    return "auto_alg_" + code;
  }
}
