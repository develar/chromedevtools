package org.chromium.protocolparser;

class FileScope extends GlobalScopeImpl {
  private final TextOutput out;

  FileScope(GlobalScopeImpl globalScopeImpl, StringBuilder stringBuilder) {
    super(globalScopeImpl);
    out = new TextOutput(stringBuilder);
  }

  FileScope(FileScope fileScopeImpl) {
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
