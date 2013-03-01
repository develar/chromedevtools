package org.chromium.sdk.internal.protocolparser.dynamicimpl;

public interface ClassScope extends JavaCodeGenerator.FileScope {
  ClassScope getRootClassScope();

  /**
   * @return new {@link ClassScope} that has different out as {@link ClassScope},
   *     but shares the out with this as {@link org.chromium.sdk.internal.protocolparser.dynamicimpl.JavaCodeGenerator.FileScope}
   */
  @Override
  ClassScope newClassScope();

  /**
   * @return new {@link org.chromium.sdk.internal.protocolparser.dynamicimpl.JavaCodeGenerator.MethodScope} that extends {@link ClassScope} and shares the out
   *     with this {@link ClassScope}.
   */
  JavaCodeGenerator.MethodScope newMethodScope();

  /**
   * Writes Java code of all added members.
   */
  void writeClassMembers();
}
