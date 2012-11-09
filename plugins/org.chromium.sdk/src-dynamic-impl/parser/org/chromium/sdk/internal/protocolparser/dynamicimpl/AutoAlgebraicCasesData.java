package org.chromium.sdk.internal.protocolparser.dynamicimpl;

import java.util.ArrayList;
import java.util.List;

class AutoAlgebraicCasesData extends AlgebraicCasesData {
  int variantCodeFieldPos = -1;
  int variantValueFieldPos = -1;
  boolean hasDefaultCase = false;
  final List<RefToType<?>> subtypes = new ArrayList<RefToType<?>>();

  @Override
  List<RefToType<?>> getSubtypes() {
    return subtypes;
  }

  @Override
  void writeConstructorCodeJava(JavaCodeGenerator.MethodScope methodScope) {
    methodScope.startLine("int code = -1;\n");
    for (int i = 0; i < getSubtypes().size(); i++) {
      TypeHandler<?> nextSubtype = getSubtypes().get(i).get();
      methodScope.startLine("if (" + methodScope.getTypeImplReference(nextSubtype) +
                            ".checkSubtypeConditions(underlying)) {\n");
      methodScope.startLine("  if (code == -1) {\n");
      methodScope.startLine("    code = " + i + ";\n");
      methodScope.startLine("  } else {\n");
      methodScope.startLine("    throw new " + Util.BASE_PACKAGE +
                            ".JsonProtocolParseException(\"More than one case match\");\n");
      methodScope.startLine("  }\n");
      methodScope.startLine("}\n");
    }
    if (!hasDefaultCase) {
      methodScope.startLine("if (code == -1) {\n");
      methodScope.startLine("  throw new " + Util.BASE_PACKAGE +
                            ".JsonProtocolParseException(\"Not a single case matches\");\n");
      methodScope.startLine("}\n");
    }
    for (int i = 0; i < getSubtypes().size(); i++) {
      TypeHandler<?> nextSubtype = getSubtypes().get(i).get();
      methodScope.startLine(getAutoAlgFieldNameJava(i) + " = (code == " + i + ") ? new " +
                            methodScope.getTypeImplReference(nextSubtype) + "(underlying, this) : null;\n");
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
    return "auto_alg_field_" + code;
  }
}
