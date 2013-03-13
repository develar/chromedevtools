package org.chromium.protocolparser;

import gnu.trove.TObjectProcedure;

public class Impl {
  interface GlobalScope {
    String getTypeImplReference(TypeHandler<?> typeHandler);

    String requireFactoryGenerationAndGetName(TypeHandler<?> typeHandler);

    String getTypeImplShortName(TypeHandler<?> typeHandler);

    FileScope newFileScope(StringBuilder output);

    void forEachTypeFactory(TObjectProcedure<TypeHandler> procedure);
  }

  static class FileScopeImpl extends GlobalScopeImpl implements FileScope {
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
    public ClassScope newClassScope() {
      return new ClassScopeImpl(this, asClassScopeImpl());
    }

    protected ClassScopeImpl asClassScopeImpl() {
      return null;
    }
  }
}
