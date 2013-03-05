// Generated source.
// Generator: org.chromium.wip.protocolParser.Generator
package org.chromium.wip.protocol.output.console;

/**
 * Clears console messages collected in the browser.
 */
public class ClearMessagesParams extends org.jetbrains.wip.protocol.WipParams {

  public static final String METHOD_NAME = org.jetbrains.wip.protocol.BasicConstants.Domain.CONSOLE + ".clearMessages";

  @Override
  public String getCommand() {
    return METHOD_NAME;
  }

}