package org.chromium.protocolparser;

import java.lang.reflect.Method;

public abstract class NativeMethodHandler extends BaseHandlersLibrary.MethodHandlerBase {
  public NativeMethodHandler(Method method) {
    super(method);
  }

  @Override
  void writeMethodImplementationJava(ClassScope classScope, Method m, TextOutput out) {
  }
}
