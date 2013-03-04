// Generated source.
// Generator: org.chromium.wip.protocolParser.Generator
package org.chromium.wip.protocol.outputpage;

/**
Requests that backend enables continuous painting
 */
public class SetContinuousPaintingEnabledParams extends org.jetbrains.wip.protocol.WipParams {
  /**
   @param enabled True for enabling cointinuous painting
   */
  public SetContinuousPaintingEnabledParams(boolean enabled) {
    this.put("enabled", enabled);
  }

  public static final String METHOD_NAME = org.chromium.sdk.internal.wip.protocol.BasicConstants.Domain.PAGE + ".setContinuousPaintingEnabled";

  @Override protected String getRequestName() {
    return METHOD_NAME;
  }

}
