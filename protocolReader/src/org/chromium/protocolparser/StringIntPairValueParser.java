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
  void writeReadCode(JavaCodeGenerator.MethodScope methodScope, boolean deferredReading, TextOutput out) {
  }

  @Override
  void writeArrayReadCode(JavaCodeGenerator.MethodScope scope, boolean subtyping, TextOutput out, boolean nullable) {
    out.append("read").append("IntStringPairs").append('(');
    addReaderParameter(subtyping, out);
    out.append(')');
  }
}
