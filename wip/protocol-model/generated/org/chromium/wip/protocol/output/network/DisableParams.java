// Generated source
package org.chromium.wip.protocol.output.network;

/**
 * Disables network tracking, prevents network events from being sent to the client.
 */
public class DisableParams extends org.jetbrains.wip.protocol.WipParams {

  public static final String METHOD_NAME = org.jetbrains.wip.protocol.BasicConstants.Domain.NETWORK + ".disable";

  @Override
  public String getCommand() {
    return METHOD_NAME;
  }
}