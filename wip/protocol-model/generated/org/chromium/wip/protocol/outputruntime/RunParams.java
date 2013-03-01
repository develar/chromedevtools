// Generated source.
// Generator: org.chromium.wip.protocolParser.Generator
package org.chromium.wip.protocol.outputruntime;

/**
Tells inspected instance(worker or page) that it can run in case it was started paused.
 */
public class RunParams extends org.chromium.sdk.internal.wip.protocol.output.WipParams {
  public RunParams() {
  }

  public static final String METHOD_NAME = org.chromium.sdk.internal.wip.protocol.BasicConstants.Domain.RUNTIME + ".run";

  @Override protected String getRequestName() {
    return METHOD_NAME;
  }

}
