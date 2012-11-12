package org.chromium.sdk.internal.protocolparser.dynamicimpl;

public class StringIntPairValueParser extends ValueParser {
  StringIntPairValueParser() {
    super(false);
  }

  @Override
  void appendFinishedValueTypeNameJava(TextOutput out) {
    out.append("StringIntPair");
  }

  @Override
  void writeReadCode(JavaCodeGenerator.MethodScope methodScope, boolean subtyping, TextOutput out) {
  }

  @Override
  void writeArrayReadCode(JavaCodeGenerator.MethodScope scope, boolean subtyping, TextOutput out) {
    out.append("read").append("IntStringPairs").append('(');
    addReaderParameter(subtyping, out);
    out.append(')');
  }
}
