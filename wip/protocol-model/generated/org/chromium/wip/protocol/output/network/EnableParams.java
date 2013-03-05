// Generated source.
// Generator: org.chromium.wip.protocolParser.Generator
package org.chromium.wip.protocol.output.network;

/**
Enables network tracking, network events will now be delivered to the client.
 */
public class EnableParams extends org.jetbrains.wip.protocol.WipParams {
  public EnableParams() {
  }

  public static final String METHOD_NAME = org.jetbrains.wip.protocol.BasicConstants.Domain.NETWORK + ".enable";

  @Override protected String getRequestName() {
    return METHOD_NAME;
  }

}
