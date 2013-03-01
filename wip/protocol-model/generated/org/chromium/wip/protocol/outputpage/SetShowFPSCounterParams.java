// Generated source.
// Generator: org.chromium.wip.protocolParser.Generator
package org.chromium.wip.protocol.outputpage;

/**
Requests that backend shows the FPS counter
 */
public class SetShowFPSCounterParams extends org.chromium.sdk.internal.wip.protocol.output.WipParams {
  /**
   @param show True for showing the FPS counter
   */
  public SetShowFPSCounterParams(boolean show) {
    this.put("show", show);
  }

  public static final String METHOD_NAME = org.chromium.sdk.internal.wip.protocol.BasicConstants.Domain.PAGE + ".setShowFPSCounter";

  @Override protected String getRequestName() {
    return METHOD_NAME;
  }

}
