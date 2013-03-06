// Generated source
package org.chromium.wip.protocol.output.debugger;

/**
 * Defines pause on exceptions state. Can be set to stop on all exceptions, uncaught exceptions or no exceptions. Initial pause on exceptions state is <code>none</code>.
 */
public class SetPauseOnExceptionsParams extends org.jetbrains.wip.protocol.WipParams {
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
  public static final String METHOD_NAME = org.jetbrains.wip.protocol.BasicConstants.Domain.DEBUGGER + ".setPauseOnExceptions";

  @Override
  public String getCommand() {
    return METHOD_NAME;
  }
}