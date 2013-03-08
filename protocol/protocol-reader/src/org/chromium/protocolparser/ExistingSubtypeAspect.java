package org.chromium.protocolparser;

class ExistingSubtypeAspect extends SubtypeAspect {
  private SubtypeCaster subtypeCaster;
  private final RefToType<?> jsonSuperClass;

  ExistingSubtypeAspect(RefToType<?> jsonSuperClass) {
    this.jsonSuperClass = jsonSuperClass;
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
}
