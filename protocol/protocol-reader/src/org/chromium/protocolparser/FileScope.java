package org.chromium.protocolparser;

class FileScope extends GlobalScope {
  private final TextOutput out;

  FileScope(GlobalScope globalScope, StringBuilder stringBuilder) {
    super(globalScope);
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
