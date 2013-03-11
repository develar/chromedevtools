// Copyright (c) 2011 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

package org.chromium.protocolparser;

import com.google.gson.stream.JsonReaderEx;
import org.chromium.protocolReader.JsonParseMethod;
import org.chromium.protocolReader.JsonParserRoot;

import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.*;

/**
 * Dynamic implementation of user 'root' interface to parser.
 * @param <R> 'root' interface type
 * @see org.chromium.protocolReader.JsonParserRoot
 */
class ParserRootImpl<R> {
  private final Class<R> rootClass;
  private final InvocationHandlerImpl invocationHandler;
  private final R instance;

  ParserRootImpl(Class<R> rootClass, Map<Class<?>, TypeHandler<?>> typeToTypeHandler) {
    this.rootClass = rootClass;
    ParseInterfaceSession session = new ParseInterfaceSession(typeToTypeHandler);
    session.run(rootClass);
    invocationHandler = session.createInvocationHandler();
    instance = null;
  }

  R getInstance() {
    return instance;
  }

  private static class ParseInterfaceSession {
    private final Map<Class<?>, TypeHandler<?>> typeToTypeHandler;
    private final Set<Class<?>> visitedInterfaces = new HashSet<Class<?>>(1);
    private final Map<Method, MethodDelegate> methodMap = new HashMap<Method, MethodDelegate>();

    ParseInterfaceSession(Map<Class<?>, TypeHandler<?>> typeToTypeHandler) {
      this.typeToTypeHandler = typeToTypeHandler;
    }

    void run(Class<?> clazz) {
      parseInterfaceRecursive(clazz);
    }

    private void parseInterfaceRecursive(Class<?> clazz) throws JsonProtocolModelParseException {
      if (visitedInterfaces.contains(clazz)) {
        return;
      }
      visitedInterfaces.add(clazz);
      if (!clazz.isInterface()) {
        throw new JsonProtocolModelParseException(
            "Parser root type must be an interface: " + clazz);
      }
      JsonParserRoot jsonParserRoot = clazz.getAnnotation(JsonParserRoot.class);
      if (jsonParserRoot == null) {
        throw new JsonProtocolModelParseException(
            JsonParserRoot.class.getCanonicalName() + " annotation is expected in " + clazz);
      }
      for (Method m : clazz.getMethods()) {
        JsonParseMethod jsonParseMethod = m.getAnnotation(JsonParseMethod.class);
        if (jsonParseMethod == null) {
          throw new JsonProtocolModelParseException(
              JsonParseMethod.class.getCanonicalName() + " annotation is expected in " + clazz);
        }

        Class<?>[] exceptionTypes = m.getExceptionTypes();
        if (exceptionTypes.length > 1) {
          throw new JsonProtocolModelParseException("Too many exception declared in " + m);
        }

        Type returnType = m.getGenericReturnType();
        //noinspection SuspiciousMethodCalls
        TypeHandler<?> typeHandler = typeToTypeHandler.get(returnType);
        if (typeHandler == null) {
          typeHandler = InterfaceReader.createHandler(typeToTypeHandler, m.getReturnType());
          if (typeHandler == null) {
            throw new JsonProtocolModelParseException("Unknown return type in " + m);
          }
        }

        Type[] arguments = m.getGenericParameterTypes();
        if (arguments.length != 1) {
          throw new JsonProtocolModelParseException("Exactly one argument is expected in " + m);
        }
        Type argument = arguments[0];
        MethodDelegate delegate;
        if (argument == JsonReaderEx.class) {
          delegate = new ParseDelegate(typeHandler);
        }
        else if (argument == Object.class) {
          delegate = new ParseDelegate(typeHandler);
        }
        else {
          throw new JsonProtocolModelParseException("Unrecognized argument type in " + m);
        }
        methodMap.put(m, delegate);
      }

      for (Type baseType : clazz.getGenericInterfaces()) {
        if (!(baseType instanceof Class)) {
          throw new JsonProtocolModelParseException("Base interface must be class in " + clazz);
        }
        Class<?> baseClass = (Class<?>) baseType;
        parseInterfaceRecursive(baseClass);
      }
    }

    InvocationHandlerImpl createInvocationHandler() {
      return new InvocationHandlerImpl(methodMap);
    }
  }

  private static class InvocationHandlerImpl {
    private final Map<Method, MethodDelegate> map;

    InvocationHandlerImpl(Map<Method, MethodDelegate> map) {
      this.map = map;
    }

    public void writeStaticMethodJava(ClassScope scope) {
      TextOutput out = scope.getOutput();
      for (Map.Entry<Method, MethodDelegate> en : map.entrySet()) {
        out.newLine();
        en.getValue().writeStaticMethodJava(scope, en.getKey(), out);
        out.newLine();
      }
    }
  }

  private static abstract class MethodDelegate {
    abstract void writeStaticMethodJava(ClassScope scope, Method key, TextOutput out);
  }

  private static class ParseDelegate extends MethodDelegate {
    private final TypeHandler<?> typeHandler;

    ParseDelegate(TypeHandler<?> typeHandler) {
      this.typeHandler = typeHandler;
    }

    @Override
    void writeStaticMethodJava(ClassScope scope, Method method, TextOutput out) {
      MethodHandler.writeMethodDeclarationJava(out, method, STATIC_METHOD_PARAM_NAME_LIST);
      out.openBlock();
      out.append("return ");
      typeHandler.writeInstantiateCode(scope, out);
      out.append("(").append(STATIC_METHOD_PARAM_NAME).append(");");
      out.closeBlock();
    }

    private static final String STATIC_METHOD_PARAM_NAME = "reader";

    private static final List<String> STATIC_METHOD_PARAM_NAME_LIST =
        Collections.singletonList(STATIC_METHOD_PARAM_NAME);
  }

  public Class<R> getType() {
    return rootClass;
  }

  public void writeStaticMethodJava(ClassScope rootClassScope) {
    invocationHandler.writeStaticMethodJava(rootClassScope);
  }
}
