// Generated source
package org.chromium.wip.protocol.output.debugger;

/**
 * Continues execution until specific location is reached.
 */
public final class ContinueToLocationParams extends org.jetbrains.wip.WipRequest {
  /**
   * @param location Location to continue to.
   */
  public ContinueToLocationParams(org.chromium.wip.protocol.output.debugger.LocationParam location) {
    put("location", location);
  }
  @Override
  public String getMethodName() {
    return "Debugger.continueToLocation";
  }
}