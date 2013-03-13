package org.chromium.protocolparser;

class AbsentSubtypeAspect extends SubtypeAspect {
  @Override
  boolean isRoot() {
    return true;
  }

  @Override
  void writeGetSuperMethodJava(TextOutput out) {
  }

  @Override
  void writeSuperFieldJava(TextOutput out) {
  }

  @Override
  void writeSuperConstructorParamJava(TextOutput out) {
  }

  @Override
  void writeSuperConstructorInitialization(TextOutput out) {
  }

  @Override
  void writeParseMethod(String className, ClassScopeImpl scope, TextOutput out) {
  }

  @Override
  public void writeInstantiateCode(String className, TextOutput out) {
    out.append("new ").append(className);
  }
}
