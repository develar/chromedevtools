// Generated source
package org.jetbrains.v8.protocol;

/**
 * Creates a new break point
 */
public final class Setbreakpoint extends org.jetbrains.v8.protocol.V8Request implements org.jetbrains.jsonProtocol.RequestWithResponse<org.jetbrains.v8.protocol.SetbreakpointResult, org.jetbrains.v8.protocol.ProtocolReponseReader> {
  public Setbreakpoint(String type, String target, int line) {
    writeString("type", type);
    writeString("target", target);
    writeInt("line", line);
  }

  public Setbreakpoint column(int v) {
    if (v != -1) {
      writeInt("column", v);
    }
    return this;
  }

  public Setbreakpoint enabled(boolean v) {
    if (!v) {
      writeBoolean("enabled", v);
    }
    return this;
  }

  public Setbreakpoint condition(String v) {
    if (v != null) {
      writeString("condition", v);
    }
    return this;
  }

  public Setbreakpoint ignoreCount(int v) {
    if (v > 0) {
      writeInt("ignoreCount", v);
    }
    return this;
  }
  @Override
  public String getMethodName() {
    return "setbreakpoint";
  }

  @Override
  public SetbreakpointResult readResult(com.google.gson.stream.JsonReaderEx jsonReader, org.jetbrains.v8.protocol.ProtocolReponseReader reader) {
    return reader.readSetbreakpointResult(jsonReader);
  }
}