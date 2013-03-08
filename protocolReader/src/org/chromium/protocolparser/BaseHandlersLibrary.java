// Copyright (c) 2009 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

package org.chromium.protocolparser;

import org.jetbrains.jsonProtocol.JsonObjectBased;
import org.chromium.protocolReader.JsonSubtype;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/**
 * Contains dynamic proxy method handlers for several well-known methods.
 */
class BaseHandlersLibrary {
  public static BaseHandlersLibrary INSTANCE;

  public Map<Method, ? extends MethodHandler> getAllHandlers() {
    return methodToHandler;
  }

  private final Map<Method, MethodHandler> methodToHandler;

  private BaseHandlersLibrary(Method[] objectMethods) throws NoSuchMethodException {
    methodToHandler = new HashMap<Method, MethodHandler>();
    for (Method m : objectMethods) {
      methodToHandler.put(m, new SelfCallMethodHandler(m));
    }
    fill(methodToHandler, new GetJsonObjectMethodHandler(), new GetSuperMethodHandler());
  }

  private static void fill(Map<Method, MethodHandler> map, MethodHandlerBase ... handlers) {
    for (MethodHandlerBase handler : handlers) {
      map.put(handler.getMethod(), handler);
    }
  }

  static abstract class MethodHandlerBase extends MethodHandler {
    private final Method method;
    MethodHandlerBase(Method method) {
      this.method = method;
    }
    Method getMethod() {
      return method;
    }
  }

  private static class SelfCallMethodHandler extends NativeMethodHandler {
    SelfCallMethodHandler(Method method) {
      super(method);
    }
  }

  private static class GetJsonObjectMethodHandler extends NativeMethodHandler {
    GetJsonObjectMethodHandler() throws NoSuchMethodException {
      super(JsonObjectBased.class.getMethod("getDeferredReader"));
    }
  }

  private static class GetSuperMethodHandler extends NativeMethodHandler {
    GetSuperMethodHandler() throws NoSuchMethodException {
      super(JsonSubtype.class.getMethod("getSuper"));
    }
  }

  static final Method[] OBJECT_METHODS;
  static {
    try {
      OBJECT_METHODS = new Method[] {
          Object.class.getMethod("equals", Object.class),
          Object.class.getMethod("hashCode"),
          Object.class.getMethod("toString")
      };
    } catch (NoSuchMethodException e) {
      throw new RuntimeException(e);
    }
  }

  static {
    try {
      INSTANCE = new BaseHandlersLibrary(OBJECT_METHODS);
    } catch (NoSuchMethodException e) {
      throw new RuntimeException(e);
    }
  }
}
