// Copyright (c) 2009 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

package org.chromium.sdk.internal.protocolparser.dynamicimpl;

import org.chromium.sdk.internal.protocolparser.dynamicimpl.JavaCodeGenerator.FileScope;
import org.chromium.sdk.internal.protocolparser.dynamicimpl.JavaCodeGenerator.MethodScope;

/**
 * A parser that accepts value of JSON field and outputs value in another form (e.g. string
 * is converted to enum constant) to serve field getters in JsonType interfaces.
 * <p>
 * First the input value should be processed by method
 * that returns intermediate value (that may be stored in {@link ObjectData#getFieldArray()} array).
 * Then the output value may be obtained via value post-processor, available
 * from {@link #getValueFinisher()} (which is null in most cases, but not always).
 * <p>The parser's name "slow" reads "may be slow". It means that parser may do heavy operations.
 * Alternatively parser may be (optionally) castable to {@link QuickParser}
 * via {@link #asQuickParser()} method.
 */
abstract class ValueParser<T> {
  private final boolean nullable;

  protected ValueParser(boolean nullable) {
    this.nullable = nullable;
  }

  abstract FieldLoadedFinisher getValueFinisher();
  abstract ObjectValueParser<?> asJsonTypeParser();

  QuickParser<T> asQuickParser() {
    return null;
  }

  abstract void appendFinishedValueTypeNameJava(TextOutput out);

  void appendInternalValueTypeNameJava(FileScope scope) {
    appendFinishedValueTypeNameJava(scope.getOutput());
  }

  abstract void writeReadCode(MethodScope methodScope, boolean subtyping, TextOutput out);

  public boolean isNullable() {
    return nullable;
  }

  abstract void writeArrayReadCode(MethodScope scope, boolean subtyping, TextOutput out);

  protected static void addReaderParameter(boolean subtyping, TextOutput out) {
    if (subtyping) {
      out.append("new JsonReader(").append(Util.PENDING_INPUT_READER_NAME).append(")");
    }
    else {
      out.append(Util.READER_NAME);
    }
  }
}
