// Generated source.
// Generator: org.chromium.wip.protocolParser.Generator
package org.chromium.wip.protocol.output.console;

/**
 * Disables console domain, prevents further console messages from being reported to the client.
 */
public class DisableParams extends org.jetbrains.wip.protocol.WipParams {

  public static final String METHOD_NAME = org.jetbrains.wip.protocol.BasicConstants.Domain.CONSOLE + ".disable";

  @Override
  public String getCommand() {
    return METHOD_NAME;
  }

}