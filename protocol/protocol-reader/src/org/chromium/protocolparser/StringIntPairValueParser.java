package org.chromium.protocolparser;

public class StringIntPairValueParser extends ValueParser {
  StringIntPairValueParser() {
    super(false);
  }

  @Override
  void appendFinishedValueTypeName(TextOutput out) {
    out.append("StringIntPair");
  }

  @Override
  void writeReadCode(ClassScope scope, boolean subtyping, String fieldName, TextOutput out) {
  }

  @Override
  void writeArrayReadCode(ClassScope scope,
                          boolean subtyping,
                          boolean nullable,
                          String fieldName, TextOutput out) {
    out.append("read").append("IntStringPairs").append('(');
    addReaderParameter(subtyping, out);
    out.append(')');
  }
}
