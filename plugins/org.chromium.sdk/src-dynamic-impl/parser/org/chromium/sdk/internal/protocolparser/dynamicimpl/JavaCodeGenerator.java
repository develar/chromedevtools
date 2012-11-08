// Copyright (c) 2011 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

package org.chromium.sdk.internal.protocolparser.dynamicimpl;

import gnu.trove.TObjectObjectProcedure;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * A set of interfaces and classes used to generate Java code of parser implementation.
 */
public interface JavaCodeGenerator {

  GlobalScope newGlobalScope(Collection<TypeHandler<?>> typeHandlers,
      Collection<GeneratedCodeMap> basePackages);

  interface GlobalScope {
    String getTypeImplReference(TypeHandler<?> typeHandler);
    String getTypeFactoryReference(TypeHandler<?> typeHandler);
    String getTypeImplShortName(TypeHandler<?> typeHandler);

    /**
     * @return new {@link FileScope} that extends {@link GlobalScope} and shares the out
     *     with this {@link GlobalScope}
     */
    FileScope newFileScope(StringBuilder output);

    void forEachTypeFactory(TObjectObjectProcedure<String, String> procedure);
  }

  interface FileScope extends GlobalScope {
    TextOutput getOutput();
    StringBuilder getStringBuilder();

    FileScope startLine(String line);
    FileScope append(String line);
    FileScope append(char c);

    void indentIn();
    void indentOut();

    /**
     * @return new {@link ClassScope} that extends {@link FileScope} and shares the out
     *     with this {@link FileScope}
     */
    ClassScope newClassScope();
  }

  interface ClassScope extends FileScope {
    ClassScope getRootClassScope();

    /**
     * @return new {@link ClassScope} that has different out as {@link ClassScope},
     *     but shares the out with this as {@link FileScope}
     */
    @Override
    ClassScope newClassScope();

    /**
     * Adds a member to the class. The member is identified by the key. Member Java code
     * is generated later. If the member with a particular key
     * has already been added, method return data instance if returned the previous time.
     *
     * @return user-defined field element data
     */
    <T extends ElementData> T addMember(Object key, ElementFactory<T> factory);

    /**
     * @return new {@link MethodScope} that extends {@link ClassScope} and shares the out
     *     with this {@link ClassScope}.
     */
    MethodScope newMethodScope();

    /**
     * Writes Java code of all added members.
     */
    void writeClassMembers();
  }

  interface MethodScope extends ClassScope {
    /**
     * @return a name unique to this scope with the provided prefix
     */
    String newMethodScopedName(String prefix);
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
      public StringBuilder getStringBuilder() {
        return out2.builder;
      }

      @Override
      public TextOutput getOutput() {
        return out;
      }

      @Override
      public FileScope startLine(String line) {
        out2.startLine(line);
        return this;
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
      public void indentIn() {
        out2.indentIn();
      }

      @Override
      public void indentOut() {
        out2.indentOut();
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
        private int indent = 0;

        Out2(StringBuilder builder) {
          this.builder = builder;
        }

        void startLine(String line) {
          for (int i = 0; i < indent; i++) {
            builder.append(' ');
          }
          builder.append(line);
        }

        void append(String line) {
          builder.append(line);
        }

        void append(char line) {
          builder.append(line);
        }

        void indentIn() {
          indent += 2;
        }

        void indentOut() {
          indent -= 2;
        }
      }
    }

    private static class ClassScopeImpl extends FileScopeImpl implements ClassScope {
      private final State state;
      private final ClassScope parentClass;

      ClassScopeImpl(FileScopeImpl fileScopeImpl, ClassScope parentClass) {
        super(fileScopeImpl);
        state = new State();
        this.parentClass = parentClass;
      }

      ClassScopeImpl(ClassScopeImpl classScopeImpl) {
        super(classScopeImpl);
        state = classScopeImpl.state;
        parentClass = classScopeImpl.parentClass;
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
      public <T extends ElementData> T addMember(Object key,
          ElementFactory<T> factory) {
        return state.addMember(key, factory);
      }

      @Override
      public void writeClassMembers() {
        state.writeClassElements(this);
      }

      @Override
      public MethodScope newMethodScope() {
        return new MethodScopeImpl(this);
      }

      @Override
      protected ClassScopeImpl asClassScopeImpl() {
        return this;
      }

      private static class State {
        private final Map<Object, ElementData> key2ElementData =
            new HashMap<Object, JavaCodeGenerator.ElementData>(2);
        private int nextCode = 0;

        <T extends ElementData> T addMember(Object key, ElementFactory<T> factory) {
          List<Object> extendedKey = Arrays.asList(key, factory);
          ElementData rawData = key2ElementData.get(extendedKey);
          T data = (T) rawData;
          if (data == null) {
            data = factory.create(nextCode++);
            key2ElementData.put(extendedKey, data);
          }
          return data;
        }

        void writeClassElements(ClassScope classScope) {
          for (ElementData data : key2ElementData.values()) {
            data.generateCode(classScope);
          }
          key2ElementData.clear();
        }
      }
    }

    private static class MethodScopeImpl extends ClassScopeImpl implements MethodScope {
      private final State state;

      public MethodScopeImpl(ClassScopeImpl classScopeImpl) {
        super(classScopeImpl);
        state = new State();
      }

      @Override
      public String newMethodScopedName(String prefix) {
        return state.newMethodScopedName(prefix);
      }

      private static class State {
        private int nextId = 0;

        String newMethodScopedName(String prefix) {
          return prefix + nextId++;
        }
      }
    }
  }
}
