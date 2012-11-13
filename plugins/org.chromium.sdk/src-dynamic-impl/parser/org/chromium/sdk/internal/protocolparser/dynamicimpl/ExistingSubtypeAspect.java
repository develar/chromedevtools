package org.chromium.sdk.internal.protocolparser.dynamicimpl;

import java.util.List;

class ExistingSubtypeAspect extends TypeHandler.SubtypeAspect {
  private SubtypeCaster subtypeCaster;
  private final RefToType<?> jsonSuperClass;

  /** Set of conditions that check whether this type conforms as subtype. */
  private final List<FieldCondition> fieldConditions;

  ExistingSubtypeAspect(RefToType<?> jsonSuperClass, List<FieldCondition> fieldConditions) {
    this.jsonSuperClass = jsonSuperClass;
    this.fieldConditions = fieldConditions;
  }

  public void setSubtypeCaster(SubtypeCaster subtypeCaster) {
    this.subtypeCaster = subtypeCaster;
  }

  @Override
  boolean isRoot() {
    return false;
  }

  @Override
  void writeGetSuperMethodJava(TextOutput out) {
    out.newLine().append("@Override").newLine().append("public ").append(jsonSuperClass.get().getTypeClass().getCanonicalName() ).append(" getSuper()").openBlock();
    out.append("return ").append(Util.BASE_VALUE_PREFIX).semi().closeBlock();
  }

  @Override
  void writeSuperFieldJava(TextOutput out) {
    out.newLine().append("private final ").append(jsonSuperClass.get().getTypeClass().getCanonicalName()).append(' ').append(Util.BASE_VALUE_PREFIX).semi().newLine();
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
  void writeParseMethod(String className, ClassScope scope, TextOutput out) {
    out.newLine().append("public static ").append(className).space().append("parse").append("(JsonReader ").append(Util.READER_NAME).append(')').append(Util.THROWS_CLAUSE).openBlock();
    out.append("return ");
    jsonSuperClass.get().writeInstantiateCode(scope, out);
    out.append('(').append(Util.READER_NAME).append(')').append('.');
    subtypeCaster.writeJava(out);
    out.semi().closeBlock();
    out.newLine();
  }

  @Override
  public void writeInstantiateCode(String className, TextOutput out) {
    out.append(className).append(".parse");
  }

  @Override
  void writeHelperMethodsJava(ClassScope scope, TextOutput out) {
    if (fieldConditions.isEmpty()) {
      return;
    }

    out.newLine().newLine().append("public static boolean checkSubtypeConditions(").append(jsonSuperClass.get().getTypeClass().getCanonicalName()).append(" message)").openBlock();
    for (FieldCondition condition : fieldConditions) {
      condition.conditionLogic.writeCheck(scope, out, "message." + condition.getPropertyName() + "()");
    }
    out.closeBlock();
    out.newLine();
  }
}
