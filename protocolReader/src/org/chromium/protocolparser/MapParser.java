package org.chromium.protocolparser;

public class MapParser extends ValueParser {
  MapParser(boolean nullable) {
    super(nullable);
  }

  @Override
  public void appendFinishedValueTypeName(TextOutput out) {
    out.append("java.util.Map");
  }

  @Override
  void writeReadCode(JavaCodeGenerator.MethodScope methodScope, boolean deferredReading, TextOutput out) {
    beginReadCall("Map", deferredReading, out);
    out.append(')');
  }

  @Override
  void writeArrayReadCode(JavaCodeGenerator.MethodScope scope, boolean subtyping, TextOutput out, boolean nullable) {
    throw new UnsupportedOperationException();
  }
}
