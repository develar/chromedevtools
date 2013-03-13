// Generated source
package org.jetbrains.wip.protocol.debugger;

/**
 * Continues execution until specific location is reached.
 */
public final class ContinueToLocation extends org.jetbrains.wip.protocol.WipRequest {
  /**
   * @param location Location to continue to.
   */
  public ContinueToLocation(org.jetbrains.wip.protocol.debugger.Location location) {
    writeMessage("location", location);
  }
  @Override
  public String getMethodName() {
    return "Debugger.continueToLocation";
  }
}