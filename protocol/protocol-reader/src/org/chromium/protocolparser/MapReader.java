package org.chromium.protocolparser;

public class MapReader extends ValueReader {
  MapReader(boolean nullable) {
    super(nullable);
  }

  @Override
  public void appendFinishedValueTypeName(TextOutput out) {
    out.append("java.util.Map");
  }

  @Override
  void writeReadCode(ClassScopeImpl scope, boolean subtyping, String fieldName, TextOutput out) {
    beginReadCall("Map", subtyping, out, fieldName);
    out.append(')');
  }

  @Override
  void writeArrayReadCode(ClassScopeImpl scope,
                          boolean subtyping,
                          boolean nullable,
                          String fieldName, TextOutput out) {
    throw new UnsupportedOperationException();
  }
}
