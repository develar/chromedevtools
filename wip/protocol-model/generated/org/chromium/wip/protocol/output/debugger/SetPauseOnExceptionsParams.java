// Generated source
package org.chromium.wip.protocol.output.debugger;

/**
 * Defines pause on exceptions state. Can be set to stop on all exceptions, uncaught exceptions or no exceptions. Initial pause on exceptions state is <code>none</code>.
 */
public class SetPauseOnExceptionsParams extends org.jetbrains.wip.protocol.WipRequest {
  /**
   * @param state Pause on exceptions mode.
   */
  public SetPauseOnExceptionsParams(State state) {
    put("state", state);
  }

  /**
   * Pause on exceptions mode.
   */
  public enum State {
    NONE("none"), UNCAUGHT("uncaught"), ALL("all");

    private final String protocolValue;

    State(String protocolValue) {
      this.protocolValue = protocolValue;
    }

    public String toString() {
      return protocolValue;
    }
  }
  @Override
  public String getMethodName() {
    return "Debugger.setPauseOnExceptions";
  }
}