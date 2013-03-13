package org.chromium.protocolparser;

public class StringIntPairValueReader extends ValueReader {
  StringIntPairValueReader() {
    super(false);
  }

  @Override
  void appendFinishedValueTypeName(TextOutput out) {
    out.append("StringIntPair");
  }

  @Override
  void writeReadCode(ClassScopeImpl scope, boolean subtyping, String fieldName, TextOutput out) {
  }

  @Override
  void writeArrayReadCode(ClassScopeImpl scope,
                          boolean subtyping,
                          boolean nullable,
                          String fieldName, TextOutput out) {
    out.append("read").append("IntStringPairs").append('(');
    addReaderParameter(subtyping, out);
    out.append(')');
  }
}
