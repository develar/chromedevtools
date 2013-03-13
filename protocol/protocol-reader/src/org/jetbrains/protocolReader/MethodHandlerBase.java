package org.jetbrains.protocolReader;

import java.lang.reflect.Method;

abstract class MethodHandlerBase extends MethodHandler {
  private final Method method;

  MethodHandlerBase(Method method) {
    this.method = method;
  }

  Method getMethod() {
    return method;
  }
}
