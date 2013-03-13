package org.chromium.protocolparser;

class FileScopeImpl extends GlobalScopeImpl implements FileScope {
  private final TextOutput out;

  FileScopeImpl(GlobalScopeImpl globalScopeImpl, StringBuilder stringBuilder) {
    super(globalScopeImpl);
    out = new TextOutput(stringBuilder);
  }

  FileScopeImpl(FileScopeImpl fileScopeImpl) {
    super(fileScopeImpl);
    out = fileScopeImpl.out;
  }

  @Override
  public TextOutput getOutput() {
    return out;
  }

  @Override
  public ClassScopeImpl newClassScope() {
    return new ClassScopeImpl(this, asClassScopeImpl());
  }

  protected ClassScopeImpl asClassScopeImpl() {
    return null;
  }
}
