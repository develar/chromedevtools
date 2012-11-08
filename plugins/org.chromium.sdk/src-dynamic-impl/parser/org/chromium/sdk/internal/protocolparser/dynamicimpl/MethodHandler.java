// Copyright (c) 2009 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

package org.chromium.sdk.internal.protocolparser.dynamicimpl;

import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.Iterator;

import org.chromium.sdk.internal.protocolparser.dynamicimpl.JavaCodeGenerator.ClassScope;

/**
 * An abstract method handler for {@link JsonInvocationHandler}.
 */
abstract class MethodHandler {
  abstract Object handle(ObjectData objectData, Object[] args) throws Throwable;

  abstract void writeMethodImplementationJava(ClassScope classScope, Method m, TextOutput out);

  protected static void appendMethodSignatureJava(Method m, Iterable<String> paramNames, TextOutput out) {
    out.append(m.getName()).append('(');
    boolean firstArg = true;
    Iterator<String> namesIt = paramNames.iterator();
    for (Type arg : m.getGenericParameterTypes()) {
      if (firstArg) {
        firstArg = false;
      }
      else {
        out.comma();
      }
      Util.writeJavaTypeName(arg, out);
      out.append(' ').append(namesIt.next());
    }
    out.append(')');
  }

  protected static void writeMethodDeclarationJava(ClassScope scope, Method m, Iterable<String> paramNames) {
    TextOutput out = scope.getOutput();
    out.append("@Override").newLine().append("public ");
    Util.writeJavaTypeName(m.getGenericReturnType(), scope.getOutput());
    out.append(' ');
    appendMethodSignatureJava(m, paramNames, scope.getOutput());
  }
}
