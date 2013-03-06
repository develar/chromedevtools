// Generated source
package org.chromium.wip.protocol.output.page;

/**
 * Tells if backend supports continuous painting
 */
public class CanContinuouslyPaintParams extends org.jetbrains.wip.protocol.WipParamsWithResponse<org.chromium.wip.protocol.input.page.CanContinuouslyPaintData> {

  public static final String METHOD_NAME = org.jetbrains.wip.protocol.BasicConstants.Domain.PAGE + ".canContinuouslyPaint";

  @Override
  public String getCommand() {
    return METHOD_NAME;
  }

  @Override
  public org.chromium.wip.protocol.input.page.CanContinuouslyPaintData parseResponse(org.jetbrains.wip.protocol.WipCommandResponse.Data data, org.chromium.wip.protocol.input.GeneratedWipProtocolReader parser) throws java.io.IOException {
    return parser.parsePageCanContinuouslyPaintData(data.getUnderlyingObject());
  }
}