package org.chromium.sdk.internal.protocolparser.dynamicimpl;

import gnu.trove.THashMap;
import gnu.trove.TObjectProcedure;

import java.util.Arrays;
import java.util.List;

public class ClassScopeImpl extends JavaCodeGenerator.Impl.FileScopeImpl implements ClassScope {
  private final State state;
  private final ClassScope parentClass;

  public ClassScopeImpl(JavaCodeGenerator.Impl.FileScopeImpl fileScopeImpl, ClassScope parentClass) {
    super(fileScopeImpl);
    state = new State();
    this.parentClass = parentClass;
  }

  public ClassScopeImpl(ClassScopeImpl classScopeImpl) {
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
  public <T extends JavaCodeGenerator.ElementData> T addMember(Object key, JavaCodeGenerator.ElementFactory<T> factory) {
    return state.addMember(key, factory);
  }

  @Override
  public void writeClassMembers() {
    state.writeClassElements(this);
  }

  @Override
  public JavaCodeGenerator.MethodScope newMethodScope() {
    return new JavaCodeGenerator.Impl.MethodScopeImpl(this);
  }

  @Override
  protected ClassScopeImpl asClassScopeImpl() {
    return this;
  }

  private static class State {
    private final THashMap<Object, JavaCodeGenerator.ElementData> keyToElementData = new THashMap<Object, JavaCodeGenerator.ElementData>(2);
    private int nextCode;

    <T extends JavaCodeGenerator.ElementData> T addMember(Object key, JavaCodeGenerator.ElementFactory<T> factory) {
      List<Object> extendedKey = Arrays.asList(key, factory);
      @SuppressWarnings("unchecked")
      T data = (T)keyToElementData.get(extendedKey);
      if (data == null) {
        data = factory.create(nextCode++);
        keyToElementData.put(extendedKey, data);
      }
      return data;
    }

    void writeClassElements(final ClassScope classScope) {
      keyToElementData.forEachValue(new TObjectProcedure<JavaCodeGenerator.ElementData>() {
        @Override
        public boolean execute(JavaCodeGenerator.ElementData data) {
          data.generateCode(classScope);
          return true;
        }
      });
      keyToElementData.clear();
    }
  }
}
