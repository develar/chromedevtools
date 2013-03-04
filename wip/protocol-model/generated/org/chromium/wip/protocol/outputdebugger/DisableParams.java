// Generated source.
// Generator: org.chromium.wip.protocolParser.Generator
package org.chromium.wip.protocol.outputdebugger;

/**
Disables debugger for given page.
 */
public class DisableParams extends org.jetbrains.wip.protocol.WipParams {
  public DisableParams() {
  }

  public static final String METHOD_NAME = org.chromium.sdk.internal.wip.protocol.BasicConstants.Domain.DEBUGGER + ".disable";

  @Override protected String getRequestName() {
    return METHOD_NAME;
  }

}
