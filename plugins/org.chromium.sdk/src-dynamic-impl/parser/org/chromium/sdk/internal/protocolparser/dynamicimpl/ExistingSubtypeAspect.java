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
    out.newLine().newLine().append("public static boolean checkSubtypeConditions(").append(jsonSuperClass.get().getTypeClass().getCanonicalName()).append(" message)").append(Util.THROWS_CLAUSE).openBlock();
    JavaCodeGenerator.MethodScope methodScope = classScope.newMethodScope();
    for (FieldCondition condition : fieldConditions) {
      condition.writeCheck(methodScope, "message." + condition.getPropertyName() + "()", null, "conditionRes");
    }
    out.closeBlock();
    out.newLine();
  }
}
