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
  void writeReadCode(JavaCodeGenerator.MethodScope methodScope, boolean subtyping, String fieldName, TextOutput out) {
  }

  @Override
  void writeArrayReadCode(JavaCodeGenerator.MethodScope scope,
                          boolean subtyping,
                          boolean nullable,
                          String fieldName, TextOutput out) {
    out.append("read").append("IntStringPairs").append('(');
    addReaderParameter(subtyping, out);
    out.append(')');
  }
}
