package org.chromium.sdk.internal.protocolparser.dynamicimpl;

import java.util.List;

class ExistingSubtypeAspect extends TypeHandler.SubtypeAspect {
  private final RefToType<?> jsonSuperClass;

  /** Set of conditions that check whether this type conforms as subtype. */
  private final List<FieldCondition> fieldConditions;

  ExistingSubtypeAspect(RefToType<?> jsonSuperClass, List<FieldCondition> fieldConditions) {
    this.jsonSuperClass = jsonSuperClass;
    this.fieldConditions = fieldConditions;
  }

  @Override
  boolean isRoot() {
    return false;
  }

  @Override
  void writeGetSuperMethodJava(TextOutput out) {
    out.newLine().append("@Override").newLine().append("public ").append(jsonSuperClass.get().getTypeClass().getCanonicalName() ).append(" getSuper()").openBlock();
    out.append("return ").append(Util.BASE_VALUE_PREFIX).append(';').closeBlock();
  }

  @Override
  void writeSuperFieldJava(TextOutput out) {
    out.newLine().append("private final ").append(jsonSuperClass.get().getTypeClass().getCanonicalName()).append(' ').append(Util.BASE_VALUE_PREFIX).append(';').newLine();
  }

  @Override
  void writeSuperConstructorParamJava(TextOutput out) {
    out.comma().append(jsonSuperClass.get().getTypeClass().getCanonicalName()).append(' ').append(Util.BASE_VALUE_PREFIX);
  }

  @Override
  void writeSuperConstructorInitialization(TextOutput out) {
    out.append("this.").append(Util.BASE_VALUE_PREFIX).append(" = ").append(Util.BASE_VALUE_PREFIX).append(';').newLine().newLine();
  }

  @Override
  void writeHelperMethodsJava(JavaCodeGenerator.ClassScope classScope, TextOutput out) {
    out.newLine().append("public static boolean checkSubtypeConditions(org.json.simple.JSONObject input)").append(Util.THROWS_CLAUSE).openBlock();
    JavaCodeGenerator.MethodScope methodScope = classScope.newMethodScope();
    for (FieldCondition condition : fieldConditions) {
      String name = condition.getPropertyName();
      methodScope.startLine("{\n");
      methodScope.startLine("  Object value = input.get(\"" + name + "\");\n");
      methodScope.startLine("  boolean hasValue;\n");
      methodScope.startLine("  if (value == null) {\n");
      methodScope.startLine("    hasValue = input.containsKey(\"" + name + "\");\n");
      methodScope.startLine("  } else {\n");
      methodScope.startLine("    hasValue = true;\n");
      methodScope.startLine("  }\n");
      condition.writeCheckJava(methodScope, "value", "hasValue", "conditionRes");
      methodScope.startLine("  if (!conditionRes) {\n");
      methodScope.startLine("    return false;\n");
      methodScope.startLine("  }\n");
      methodScope.startLine("}\n");
    }
    methodScope.startLine("return true;\n");
    methodScope.indentOut();
    methodScope.startLine("}\n");
  }
}
