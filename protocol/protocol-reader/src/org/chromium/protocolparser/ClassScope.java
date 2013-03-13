package org.chromium.protocolparser;

public class ClassScope extends FileScopeImpl implements GlobalScope {
  private final ClassScope parentClass;

  public ClassScope(FileScopeImpl fileScopeImpl, ClassScope parentClass) {
    super(fileScopeImpl);
    this.parentClass = parentClass;
  }

  public ClassScope getRootClassScope() {
    if (parentClass == null) {
      return this;
    } else {
      return parentClass.getRootClassScope();
    }
  }

  public void writeClassMembers() {
  }

  @Override
  protected ClassScope asClassScopeImpl() {
    return this;
  }
}
