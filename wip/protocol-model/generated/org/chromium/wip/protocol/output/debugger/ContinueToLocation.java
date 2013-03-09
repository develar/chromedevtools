// Generated source
package org.chromium.wip.protocol.output.debugger;

/**
 * Continues execution until specific location is reached.
 */
public final class ContinueToLocation extends org.jetbrains.wip.protocol.WipRequest {
  /**
   * @param location Location to continue to.
   */
  public ContinueToLocation(org.chromium.wip.protocol.output.debugger.Location location) {
    put("location", location);
  }
  @Override
  public String getMethodName() {
    return "Debugger.continueToLocation";
  }
}