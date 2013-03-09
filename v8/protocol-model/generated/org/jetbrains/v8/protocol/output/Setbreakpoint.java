// Generated source
package org.jetbrains.v8.protocol.output;

/**
 * Creates a new break point
 */
public final class Setbreakpoint extends org.jetbrains.v8.protocol.V8Request {
  public Setbreakpoint(String type, int line) {
    put("type", type);
    put("line", line);
  }

  public Setbreakpoint column(int v) {
    if (v != -1) {
      put("column", v);
    }
    return this;
  }

  public Setbreakpoint enabled(boolean v) {
    put("enabled", v);
    return this;
  }

  public Setbreakpoint condition(String v) {
    if (v != null) {
      put("condition", v);
    }
    return this;
  }

  public Setbreakpoint ignoreCount(int v) {
    put("ignoreCount", v);
    return this;
  }
  @Override
  public String getMethodName() {
    return "setbreakpoint";
  }
}