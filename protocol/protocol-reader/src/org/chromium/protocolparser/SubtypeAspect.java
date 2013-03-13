package org.chromium.protocolparser;

/**
 * Encapsulate subtype aspects of the type.
 */
abstract class SubtypeAspect {
  abstract boolean isRoot();
  abstract void writeSuperFieldJava(TextOutput out);
  abstract void writeSuperConstructorParamJava(TextOutput out);
  abstract void writeSuperConstructorInitialization(TextOutput out);

  abstract void writeParseMethod(String className, ClassScopeImpl scope, TextOutput out);

  public abstract void writeInstantiateCode(String className, TextOutput out);

  abstract void writeGetSuperMethodJava(TextOutput out);

  public void setSubtypeCaster(SubtypeCaster subtypeCaster) {
  }
}