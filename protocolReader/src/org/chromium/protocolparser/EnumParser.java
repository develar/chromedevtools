// Copyright (c) 2009 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

package org.chromium.protocolparser;

class EnumParser<T extends Enum<T>> extends ValueParser {
  public static <T extends Enum<T>> EnumParser<T> create(Class<T> enumTypeClass, boolean isNullable) {
    return new EnumParser<T>(enumTypeClass, isNullable);
  }

  private final Class<T> enumClass;

  private EnumParser(Class<T> enumClass, boolean nullable) {
    super(nullable);
    this.enumClass = enumClass;
  }

  @Override
  public void appendFinishedValueTypeName(TextOutput out) {
    out.append(enumClass.getCanonicalName());
  }

  @Override
  void writeReadCode(JavaCodeGenerator.MethodScope methodScope, boolean deferredReading, TextOutput out) {
    beginReadCall("Enum", deferredReading, out);
    out.comma().append(enumClass.getCanonicalName()).append(".class").append(')');
  }

  @Override
  void writeArrayReadCode(JavaCodeGenerator.MethodScope scope, boolean subtyping, TextOutput out) {
    throw new UnsupportedOperationException();
  }
}
