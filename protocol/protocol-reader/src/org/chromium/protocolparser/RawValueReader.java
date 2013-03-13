package org.chromium.protocolparser;

import com.google.gson.stream.JsonReaderEx;

class RawValueReader extends ValueReader {
  RawValueReader(boolean nullable) {
    super(nullable);
  }

  @Override
  void writeReadCode(ClassScopeImpl scope, boolean subtyping, String fieldName, TextOutput out) {
    addReaderParameter(subtyping, out);
    out.append(".subReader();").newLine();
    addReaderParameter(subtyping, out);
    out.append(".skipValue()");
  }

  @Override
  public void appendFinishedValueTypeName(TextOutput out) {
    out.append(JsonReaderEx.class.getCanonicalName());
  }

  @Override
  void writeArrayReadCode(ClassScopeImpl scope,
                          boolean subtyping,
                          boolean nullable,
                          String fieldName, TextOutput out) {
    throw new UnsupportedOperationException();
  }
}
