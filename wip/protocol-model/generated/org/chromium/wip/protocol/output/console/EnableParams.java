// Generated source
package org.chromium.wip.protocol.output.console;

/**
 * Enables console domain, sends the messages collected so far to the client by means of the <code>messageAdded</code> notification.
 */
public class EnableParams extends org.jetbrains.wip.protocol.WipParams {

  public static final String METHOD_NAME = org.jetbrains.wip.protocol.BasicConstants.Domain.CONSOLE + ".enable";

  @Override
  public String getCommand() {
    return METHOD_NAME;
  }
}