// Copyright (c) 2009 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

package org.chromium.sdk.internal.protocolparser.dynamicimpl;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import com.google.gson.stream.JsonReader;
import org.chromium.sdk.internal.protocolparser.AnyObjectBased;
import org.chromium.sdk.internal.protocolparser.JsonObjectBased;
import org.chromium.sdk.internal.protocolparser.JsonSubtype;
import org.chromium.sdk.internal.protocolparser.dynamicimpl.JavaCodeGenerator.ClassScope;

/**
 * Contains dynamic proxy method handlers for several well-known methods.
 */
class BaseHandlersLibrary {
  public static BaseHandlersLibrary INSTANCE;

  public Map<Method, ? extends MethodHandler> getAllHandlers() {
    return methodToHandler;
  }

  /**
   * Generates Java implementation of standard methods of JSON type class (if needed):
   * {@link JsonObjectBased#getUnderlyingObject()},
   * {@link AnyObjectBased#getUnderlyingObject()} and {@link JsonSubtype#getSuper()}
   */
  public static void writeBaseMethodsJava(ClassScope scope, TypeHandler<?> typeHandler) {
    Class<?> typeClass = typeHandler.getTypeClass();

    // Generated getUnderlyingObject method if it's in interface.
    writeGetUnderlyingObject: {
      Method method;
      try {
        method = typeClass.getMethod("getUnderlyingObject");
      } catch (SecurityException e) {
        throw new RuntimeException(e);
      } catch (NoSuchMethodException e) {
        // Method not found, skip.
        break writeGetUnderlyingObject;
      }

      MethodHandler.writeMethodDeclarationJava(scope, method, Collections.<String>emptyList());
      scope.startLine("{\n");
      scope.startLine("  return underlying;\n");
      scope.startLine("}\n");
    }

    typeHandler.getSubtypeSupport().writeGetSuperMethodJava(scope);
  }

  private final Map<Method, MethodHandler> methodToHandler;

  private BaseHandlersLibrary(Method[] objectMethods) throws NoSuchMethodException {
    methodToHandler = new HashMap<Method, MethodHandler>();
    for (Method m : objectMethods) {
      methodToHandler.put(m, new SelfCallMethodHanlder(m));
    }
    fill(methodToHandler, new GetJsonObjectMethodHaldler(), new GetAnyObjectMethodHaldler(), new GetSuperMethodHaldler());
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

  private static class SelfCallMethodHanlder extends NativeMethodHandler {
    SelfCallMethodHanlder(Method method) {
      super(method);
    }

    @Override
    Object handle(ObjectData objectData, Object[] args)
        throws IllegalAccessException, InvocationTargetException {
      return getMethod().invoke(objectData, args);
    }
  }

  private static class GetJsonObjectMethodHaldler extends NativeMethodHandler {
    GetJsonObjectMethodHaldler() throws NoSuchMethodException {
      super(JsonObjectBased.class.getMethod("getUnderlyingObject"));
    }

    @Override
    JsonReader handle(ObjectData objectData, Object[] args) {
      return (JsonReader) objectData.getUnderlyingObject();
    }
  }

  private static class GetAnyObjectMethodHaldler extends NativeMethodHandler {
    GetAnyObjectMethodHaldler() throws NoSuchMethodException {
      super(AnyObjectBased.class.getMethod("getUnderlyingObject"));
    }

    @Override
    Object handle(ObjectData objectData, Object[] args) {
      return objectData.getUnderlyingObject();
    }
  }

  private static class GetSuperMethodHaldler extends NativeMethodHandler {
    GetSuperMethodHaldler() throws NoSuchMethodException {
      super(JsonSubtype.class.getMethod("getSuper"));
    }

    @Override
    Object handle(ObjectData objectData, Object[] args) {
      return objectData.getSuperObjectData().getProxy();
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
