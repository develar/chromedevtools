// Generated source.
// Generator: org.chromium.wip.protocolParser.Generator
package org.chromium.wip.protocol.outputpage;

/**
Requests that backend shows paint rectangles
 */
public class SetShowPaintRectsParams extends org.chromium.sdk.internal.wip.protocol.output.WipParams {
  /**
   @param result True for showing paint rectangles
   */
  public SetShowPaintRectsParams(boolean result) {
    this.put("result", result);
  }

  public static final String METHOD_NAME = org.chromium.sdk.internal.wip.protocol.BasicConstants.Domain.PAGE + ".setShowPaintRects";

  @Override protected String getRequestName() {
    return METHOD_NAME;
  }

}
