// Generated source.
// Generator: org.chromium.wip.protocolParser.Generator
package org.chromium.wip.protocol.outputnetwork;

/**
Disables network tracking, prevents network events from being sent to the client.
 */
public class DisableParams extends org.chromium.sdk.internal.wip.protocol.output.WipParams {
  public DisableParams() {
  }

  public static final String METHOD_NAME = org.chromium.sdk.internal.wip.protocol.BasicConstants.Domain.NETWORK + ".disable";

  @Override protected String getRequestName() {
    return METHOD_NAME;
  }

}
