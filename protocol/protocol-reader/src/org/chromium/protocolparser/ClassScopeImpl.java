package org.chromium.protocolparser;

public class ClassScopeImpl extends FileScopeImpl implements FileScope {
  private final ClassScopeImpl parentClass;

  public ClassScopeImpl(FileScopeImpl fileScopeImpl, ClassScopeImpl parentClass) {
    super(fileScopeImpl);
    this.parentClass = parentClass;
  }

  public ClassScopeImpl getRootClassScope() {
    if (parentClass == null) {
      return this;
    } else {
      return parentClass.getRootClassScope();
    }
  }

  public void writeClassMembers() {
  }

  @Override
  protected ClassScopeImpl asClassScopeImpl() {
    return this;
  }
}
