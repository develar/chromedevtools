// Generated source.
// Generator: org.chromium.wip.protocolParser.Generator
package org.chromium.wip.protocol.output.page;

/**
 * Requests that backend shows paint rectangles
 */
public class SetShowPaintRectsParams extends org.jetbrains.wip.protocol.WipParams {
  /**
   * @param result True for showing paint rectangles
   */
  public SetShowPaintRectsParams(boolean result) {
    put("result", result);
  }
  public static final String METHOD_NAME = org.jetbrains.wip.protocol.BasicConstants.Domain.PAGE + ".setShowPaintRects";

  @Override
  public String getCommand() {
    return METHOD_NAME;
  }

}