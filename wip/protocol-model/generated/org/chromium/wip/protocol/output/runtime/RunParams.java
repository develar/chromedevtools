// Generated source.
// Generator: org.chromium.wip.protocolParser.Generator
package org.chromium.wip.protocol.output.runtime;

/**
 * Tells inspected instance(worker or page) that it can run in case it was started paused.
 */
public class RunParams extends org.jetbrains.wip.protocol.WipParams {

  public static final String METHOD_NAME = org.jetbrains.wip.protocol.BasicConstants.Domain.RUNTIME + ".run";

  @Override
  public String getCommand() {
    return METHOD_NAME;
  }

}