package org.chromium.protocolparser;

public interface ClassScope extends FileScope {
  ClassScope getRootClassScope();

  /**
   * @return new {@link ClassScope} that has different out as {@link ClassScope},
   *     but shares the out with this as {@link FileScope}
   */
  @Override
  ClassScope newClassScope();

  /**
   * Writes Java code of all added members.
   */
  void writeClassMembers();
}
