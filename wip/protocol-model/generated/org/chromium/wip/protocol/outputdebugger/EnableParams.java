// Generated source.
// Generator: org.chromium.wip.protocolParser.Generator
package org.chromium.wip.protocol.outputdebugger;

/**
Enables debugger for the given page. Clients should not assume that the debugging has been enabled until the result for this command is received.
 */
public class EnableParams extends org.jetbrains.wip.protocol.WipParams {
  public EnableParams() {
  }

  public static final String METHOD_NAME = org.chromium.sdk.internal.wip.protocol.BasicConstants.Domain.DEBUGGER + ".enable";

  @Override protected String getRequestName() {
    return METHOD_NAME;
  }

}
