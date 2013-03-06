// Generated source
package org.chromium.wip.protocol.output.debugger;

/**
 * Continues execution until specific location is reached.
 */
public class ContinueToLocationParams extends org.jetbrains.wip.protocol.WipParams {
  /**
   * @param location Location to continue to.
   */
  public ContinueToLocationParams(org.chromium.wip.protocol.output.debugger.LocationParam location) {
    put("location", location);
  }
  public static final String METHOD_NAME = org.jetbrains.wip.protocol.BasicConstants.Domain.DEBUGGER + ".continueToLocation";

  @Override
  public String getCommand() {
    return METHOD_NAME;
  }
}