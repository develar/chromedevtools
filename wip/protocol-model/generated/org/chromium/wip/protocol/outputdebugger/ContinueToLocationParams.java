// Generated source.
// Generator: org.chromium.wip.protocolParser.Generator
package org.chromium.wip.protocol.outputdebugger;

/**
Continues execution until specific location is reached.
 */
public class ContinueToLocationParams extends org.jetbrains.wip.protocol.WipParams {
  /**
   @param location Location to continue to.
   */
  public ContinueToLocationParams(org.chromium.wip.protocol.outputdebugger.LocationParam location) {
    this.put("location", location);
  }

  public static final String METHOD_NAME = org.chromium.sdk.internal.wip.protocol.BasicConstants.Domain.DEBUGGER + ".continueToLocation";

  @Override protected String getRequestName() {
    return METHOD_NAME;
  }

}
