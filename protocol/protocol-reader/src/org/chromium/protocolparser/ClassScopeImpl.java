package org.chromium.protocolparser;

public class ClassScopeImpl extends FileScopeImpl implements ClassScope {
  private final ClassScope parentClass;

  public ClassScopeImpl(FileScopeImpl fileScopeImpl, ClassScope parentClass) {
    super(fileScopeImpl);
    this.parentClass = parentClass;
  }

  @Override
  public ClassScope getRootClassScope() {
    if (parentClass == null) {
      return this;
    } else {
      return parentClass.getRootClassScope();
    }
  }

  @Override
  public void writeClassMembers() {
  }

  @Override
  protected ClassScopeImpl asClassScopeImpl() {
    return this;
  }
}
