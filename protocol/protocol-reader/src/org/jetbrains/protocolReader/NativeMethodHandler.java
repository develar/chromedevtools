package org.jetbrains.protocolReader;

import java.lang.reflect.Method;

public abstract class NativeMethodHandler extends MethodHandlerBase {
  public NativeMethodHandler(Method method) {
    super(method);
  }

  @Override
  void writeMethodImplementationJava(ClassScope classScope, Method m, TextOutput out) {
  }
}
