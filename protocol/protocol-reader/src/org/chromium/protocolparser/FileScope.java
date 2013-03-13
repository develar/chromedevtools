package org.chromium.protocolparser;

public interface FileScope extends GlobalScope {
  TextOutput getOutput();
  /**
   * @return new {@link org.chromium.protocolparser.ClassScope} that extends {@link FileScope} and shares the out
   *     with this {@link FileScope}
   */
  ClassScopeImpl newClassScope();
}
