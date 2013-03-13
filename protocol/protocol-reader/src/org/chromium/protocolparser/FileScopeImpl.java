package org.chromium.protocolparser;

class FileScopeImpl extends GlobalScopeImpl implements GlobalScope {
  private final TextOutput out;

  FileScopeImpl(GlobalScopeImpl globalScopeImpl, StringBuilder stringBuilder) {
    super(globalScopeImpl);
    out = new TextOutput(stringBuilder);
  }

  FileScopeImpl(FileScopeImpl fileScopeImpl) {
    super(fileScopeImpl);
    out = fileScopeImpl.out;
  }

  public TextOutput getOutput() {
    return out;
  }

  public ClassScope newClassScope() {
    return new ClassScope(this, asClassScopeImpl());
  }

  protected ClassScope asClassScopeImpl() {
    return null;
  }
}
