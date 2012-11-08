// Copyright (c) 2009 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

package org.chromium.sdk.internal.protocolparser.dynamicimpl;

import org.chromium.sdk.internal.protocolparser.EnumValueCondition;
import org.chromium.sdk.internal.protocolparser.JsonProtocolModelParseException;
import org.chromium.sdk.internal.protocolparser.JsonProtocolParseException;
import org.chromium.sdk.internal.protocolparser.dynamicimpl.JavaCodeGenerator.MethodScope;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class EnumParser<T extends Enum<T>> extends QuickParser<T> {
  public static <T extends Enum<T>> EnumParser<T> create(Class<T> enumTypeClass,
      boolean isNullable) throws JsonProtocolModelParseException {
    return new EnumParser<T>(enumTypeClass, isNullable);
  }

  private final Method methodValueOf;
  private final Class<T> enumClass;

  private EnumParser(Class<T> enumClass, boolean nullable)
      throws JsonProtocolModelParseException {
    super(nullable);
    this.enumClass = enumClass;

    try {
      methodValueOf = enumClass.getMethod("valueOf", String.class);
    } catch (NoSuchMethodException e) {
      throw new JsonProtocolModelParseException(
          "Failed to find valueOf method for parsing strings", e);
    }
  }

  @Override
  public T parseValueQuick(Object value) throws JsonProtocolParseException {
    if (isNullable() && value == null) {
      return null;
    }
    if (!(value instanceof String)) {
      throw new JsonProtocolParseException("String value expected");
    }
    String stringValue = (String) value;
    stringValue = EnumValueCondition.decorateEnumConstantName(stringValue);
    T result;
    try {
      result = enumClass.cast(methodValueOf.invoke(null, stringValue));
    } catch (IllegalArgumentException e) {
      throw new JsonProtocolParseException("Failed to parse enum constant " + stringValue, e);
    } catch (IllegalAccessException e) {
      throw new JsonProtocolParseException("Failed to call valueOf method", e);
    } catch (InvocationTargetException e) {
      throw new JsonProtocolParseException("Failed to call valueOf method", e);
    }
    if (result == null) {
      throw new JsonProtocolParseException("Failed to parse value " + value + " as enum");
    }
    return result;
  }

  @Override
  public void appendFinishedValueTypeNameJava(TextOutput out) {
    out.append(enumClass.getCanonicalName());
  }

  @Override
  void writeParseQuickCode(MethodScope scope, String valueRef,
      String resultRef) {

    for (Object constant : enumClass.getEnumConstants()) {
      String name = constant.toString();
      if (!name.toUpperCase().equals(name)) {
        throw new RuntimeException();
      }
    }

    if (isNullable()) {
      scope.startLine("if (" + valueRef + " == null) {\n");
      scope.startLine("  return null;\n");
      scope.startLine("}\n");
    }
    scope.startLine("if (" + valueRef + " instanceof String == false) {\n");
    scope.startLine("  throw new " + Util.BASE_PACKAGE +
        ".JsonProtocolParseException(\"String value expected\");\n");
    scope.startLine("}\n");
    scope.startLine("String stringValue = (String) " + valueRef + ";\n");
    scope.startLine("stringValue = stringValue.toUpperCase();\n");
    scope.startLine(enumClass.getCanonicalName() + " " + resultRef + " = " +
        enumClass.getCanonicalName() + ".valueOf(");
    scope.append("stringValue);\n");
  }

  @Override
  void writeReadCode(String fieldName, MethodScope methodScope, TextOutput out) {
  }
}
