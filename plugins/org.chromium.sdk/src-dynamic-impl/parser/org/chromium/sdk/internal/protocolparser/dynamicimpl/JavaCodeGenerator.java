// Copyright (c) 2011 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

package org.chromium.sdk.internal.protocolparser.dynamicimpl;

import gnu.trove.TObjectProcedure;

import java.util.Collection;

/**
 * A set of interfaces and classes used to generate Java code of parser implementation.
 */
public interface JavaCodeGenerator {

  GlobalScope newGlobalScope(Collection<TypeHandler<?>> typeHandlers,
      Collection<GeneratedCodeMap> basePackages);

  interface GlobalScope {
    String getTypeImplReference(TypeHandler<?> typeHandler);
    String requireFactoryGenerationAndGetName(TypeHandler<?> typeHandler);
    String getTypeImplShortName(TypeHandler<?> typeHandler);

    /**
     * @return new {@link FileScope} that extends {@link GlobalScope} and shares the out
     *     with this {@link GlobalScope}
     */
    FileScope newFileScope(StringBuilder output);

    void forEachTypeFactory(TObjectProcedure<TypeHandler> procedure);
  }

  interface FileScope extends GlobalScope {
    TextOutput getOutput();

    FileScope append(String line);
    FileScope append(char c);

    /**
     * @return new {@link ClassScope} that extends {@link FileScope} and shares the out
     *     with this {@link FileScope}
     */
    ClassScope newClassScope();
  }

  interface MethodScope extends ClassScope {
  }

  interface ElementData {
    void generateCode(ClassScope classScope);
  }

  interface ElementFactory<T extends ElementData> {
    T create(int code);
  }

  class Impl implements JavaCodeGenerator {
    @Override
    public GlobalScope newGlobalScope(Collection<TypeHandler<?>> typeHandlers,
        Collection<GeneratedCodeMap> basePackages) {
      return new GlobalScopeImpl(typeHandlers, basePackages);
    }

    static class FileScopeImpl extends GlobalScopeImpl implements FileScope {
      private final TextOutput out;
      private final Out2 out2;

      FileScopeImpl(GlobalScopeImpl globalScopeImpl, StringBuilder stringBuilder) {
        super(globalScopeImpl);
        out = new TextOutput(stringBuilder);
        out2 = new Out2(stringBuilder);
      }

      FileScopeImpl(FileScopeImpl fileScopeImpl) {
        super(fileScopeImpl);
        out = fileScopeImpl.out;
        out2 = fileScopeImpl.out2;
      }

      @Override
      public TextOutput getOutput() {
        return out;
      }

      @Override
      public FileScope append(String line) {
        out2.append(line);
        return this;
      }

      @Override
      public FileScope append(char line) {
        out2.append(line);
        return this;
      }

      @Override
      public ClassScope newClassScope() {
        return new ClassScopeImpl(this, asClassScopeImpl());
      }

      protected ClassScopeImpl asClassScopeImpl() {
        return null;
      }

      private static class Out2 {
        private final StringBuilder builder;

        Out2(StringBuilder builder) {
          this.builder = builder;
        }

        void append(String line) {
          builder.append(line);
        }

        void append(char line) {
          builder.append(line);
        }
      }
    }

    static class MethodScopeImpl extends ClassScopeImpl implements MethodScope {
      public MethodScopeImpl(ClassScopeImpl classScopeImpl) {
        super(classScopeImpl);
      }
    }
  }
}