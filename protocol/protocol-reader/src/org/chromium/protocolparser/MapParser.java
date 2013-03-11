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
  void writeReadCode(JavaCodeGenerator.MethodScope methodScope, boolean subtyping, String fieldName, TextOutput out) {
    beginReadCall("Map", subtyping, out, fieldName);
    out.append(')');
  }

  @Override
  void writeArrayReadCode(JavaCodeGenerator.MethodScope scope,
                          boolean subtyping,
                          boolean nullable,
                          String fieldName, TextOutput out) {
    throw new UnsupportedOperationException();
  }
}