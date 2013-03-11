// Copyright (c) 2011 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

package org.chromium.protocolparser;

import gnu.trove.TObjectProcedure;

import java.util.Collection;

/**
 * A set of interfaces and classes used to generate Java code of parser implementation.
 */
public interface JavaCodeGenerator {
  GlobalScope newGlobalScope(Collection<TypeHandler<?>> typeHandlers, Collection<GeneratedCodeMap> basePackages);

  interface GlobalScope {
    String getTypeImplReference(TypeHandler<?> typeHandler);

    String requireFactoryGenerationAndGetName(TypeHandler<?> typeHandler);

    String getTypeImplShortName(TypeHandler<?> typeHandler);

    /**
     * @return new {@link FileScope} that extends {@link GlobalScope} and shares the out
     *         with this {@link GlobalScope}
     */
    FileScope newFileScope(StringBuilder output);

    void forEachTypeFactory(TObjectProcedure<TypeHandler> procedure);
  }

  class Impl implements JavaCodeGenerator {
    @Override
    public GlobalScope newGlobalScope(Collection<TypeHandler<?>> typeHandlers, Collection<GeneratedCodeMap> basePackages) {
      return new GlobalScopeImpl(typeHandlers, basePackages);
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

  class MethodScope extends ClassScopeImpl {
    public MethodScope(ClassScopeImpl classScopeImpl) {
      super(classScopeImpl);
    }
  }
}