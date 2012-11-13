package org.chromium.sdk.internal.protocolparser.dynamicimpl;

class AutoAlgebraicCasesData extends AlgebraicCasesData {
  boolean hasDefaultCase;

  @Override
  void writeConstructorCodeJava(JavaCodeGenerator.MethodScope methodScope, TextOutput out) {
    boolean isFirst = true;
    String operator = "if";
    for (int i = 0; i < getSubtypes().size(); i++) {
      TypeHandler<?> nextSubtype = getSubtypes().get(i).get();
      out.newLine().append(operator).append(" (").append(methodScope.getTypeImplReference(nextSubtype));
      out.append(".checkSubtypeConditions(this))").openBlock();
      {
        out.append(getAutoAlgFieldNameJava(i)).append(" = new ").append(methodScope.getTypeImplReference(nextSubtype)).append('(').append(Util.READER_NAME).comma().append("this").append(')').semi();
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
  void writeFields(ClassScope classScope) {
    TextOutput out = classScope.getOutput();
    out.newLine();
    for (int i = 0; i < getSubtypes().size(); i++) {
      TypeHandler<?> nextSubtype = getSubtypes().get(i).get();
      out.append("private final ").append(classScope.getTypeImplReference(nextSubtype)).space().append(getAutoAlgFieldNameJava(i)).semi().newLine();
    }
  }

  static String getAutoAlgFieldNameJava(int code) {
    return "conditional" + code;
  }
}
