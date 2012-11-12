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
   * Adds a member to the class. The member is identified by the key. Member Java code
   * is generated later. If the member with a particular key
   * has already been added, method return data instance if returned the previous time.
   *
   * @return user-defined field element data
   */
  <T extends JavaCodeGenerator.ElementData> T addMember(Object key, JavaCodeGenerator.ElementFactory<T> factory);

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
