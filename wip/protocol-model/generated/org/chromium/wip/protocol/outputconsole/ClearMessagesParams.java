// Generated source.
// Generator: org.chromium.wip.protocolParser.Generator
package org.chromium.wip.protocol.outputconsole;

/**
Clears console messages collected in the browser.
 */
public class ClearMessagesParams extends org.chromium.sdk.internal.wip.protocol.output.WipParams {
  public ClearMessagesParams() {
  }

  public static final String METHOD_NAME = org.chromium.sdk.internal.wip.protocol.BasicConstants.Domain.CONSOLE + ".clearMessages";

  @Override protected String getRequestName() {
    return METHOD_NAME;
  }

}
