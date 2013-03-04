// Generated source.
// Generator: org.chromium.wip.protocolParser.Generator
package org.chromium.wip.protocol.outputconsole;

/**
Disables console domain, prevents further console messages from being reported to the client.
 */
public class DisableParams extends org.jetbrains.wip.protocol.WipParams {
  public DisableParams() {
  }

  public static final String METHOD_NAME = org.chromium.sdk.internal.wip.protocol.BasicConstants.Domain.CONSOLE + ".disable";

  @Override protected String getRequestName() {
    return METHOD_NAME;
  }

}
