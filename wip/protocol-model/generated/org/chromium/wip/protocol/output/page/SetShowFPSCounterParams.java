// Generated source.
// Generator: org.chromium.wip.protocolParser.Generator
package org.chromium.wip.protocol.output.page;

/**
Requests that backend shows the FPS counter
 */
public class SetShowFPSCounterParams extends org.jetbrains.wip.protocol.WipParams {
  /**
   * @param show True for showing the FPS counter
   */
  public SetShowFPSCounterParams(boolean show) {
    put("show", show);
  }
  public static final String METHOD_NAME = org.jetbrains.wip.protocol.BasicConstants.Domain.PAGE + ".setShowFPSCounter";

  @Override
  public String getCommand() {
    return METHOD_NAME;
  }

}