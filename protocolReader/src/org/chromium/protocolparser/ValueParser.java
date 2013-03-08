// Copyright (c) 2009 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

package org.chromium.protocolparser;

import org.chromium.protocolparser.JavaCodeGenerator.FileScope;
import org.chromium.protocolparser.JavaCodeGenerator.MethodScope;

/**
 * A parser that accepts value of JSON field and outputs value in another form (e.g. string
 * is converted to enum constant) to serve field getters in JsonType interfaces.
 * <p>
 * First the input value should be processed by method
 * that returns intermediate value (that may be stored in {@_link ObjectData#getFieldArray()} array).
 * <p>The parser's name "slow" reads "may be slow". It means that parser may do heavy operations.
 */
abstract class ValueParser {
  private final boolean nullable;

  protected ValueParser(boolean nullable) {
    this.nullable = nullable;
  }

  public ObjectValueParser asJsonTypeParser() {
    return null;
  }

  abstract void appendFinishedValueTypeName(TextOutput out);

  void appendInternalValueTypeName(FileScope scope) {
    appendFinishedValueTypeName(scope.getOutput());
  }

  abstract void writeReadCode(MethodScope methodScope, boolean deferredReading, TextOutput out);

  public boolean isNullable() {
    return nullable;
  }

  abstract void writeArrayReadCode(MethodScope scope, boolean subtyping, TextOutput out);

  protected void beginReadCall(String readPostfix, boolean subtyping, TextOutput out) {
    out.append("read");
    if (isNullable()) {
      out.append("Nullable");
    }
    out.append(readPostfix).append('(');
    addReaderParameter(subtyping, out);
    if (!isNullable()) {
      out.comma().append(subtyping ? "null" : "name");
    }
  }

  protected static void addReaderParameter(boolean subtyping, TextOutput out) {
    if (subtyping) {
      out.append(Util.PENDING_INPUT_READER_NAME);
    }
    else {
      out.append(Util.READER_NAME);
    }
  }

  public boolean isThrowsIOException() {
    return true;
  }
}
