package org.chromium.sdk.internal.protocolparser.dynamicimpl;

import org.chromium.sdk.internal.protocolparser.JsonProtocolParseException;

public class StringIntPairValueParser extends QuickParser<Object> {
  StringIntPairValueParser() {
    super(false);
  }

  @Override
  public Object parseValueQuick(Object value) throws JsonProtocolParseException {
    return null;
  }

  @Override
  void writeParseQuickCode(JavaCodeGenerator.MethodScope scope, String valueRef, String resultRef) {
  }

  @Override
  void appendFinishedValueTypeNameJava(TextOutput out) {
    out.append("StringIntPair");
  }

  @Override
  void writeReadCode(JavaCodeGenerator.MethodScope methodScope, TextOutput out) {
  }

  @Override
  void writeArrayReadCode(JavaCodeGenerator.MethodScope scope, TextOutput out) {
    out.append("read").append("IntStringPairs").append('(').append(Util.READER_NAME);
    out.append(')');
  }
}
