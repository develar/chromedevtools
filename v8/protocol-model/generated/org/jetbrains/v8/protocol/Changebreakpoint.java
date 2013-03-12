// Generated source
package org.jetbrains.v8.protocol;

/**
 * Changes the status of a break point
 */
public final class Changebreakpoint extends org.jetbrains.v8.protocol.V8Request {
  public Changebreakpoint(int breakpoint) {
    writeInt("breakpoint", breakpoint);
  }

  public Changebreakpoint enabled(boolean v) {
    if (!v) {
      writeBoolean("enabled", v);
    }
    return this;
  }

  public Changebreakpoint condition(String v) {
    if (v != null) {
      writeString("condition", v);
    }
    return this;
  }

  public Changebreakpoint ignoreCount(int v) {
    if (v > 0) {
      writeInt("ignoreCount", v);
    }
    return this;
  }
  @Override
  public String getMethodName() {
    return "changebreakpoint";
  }
}