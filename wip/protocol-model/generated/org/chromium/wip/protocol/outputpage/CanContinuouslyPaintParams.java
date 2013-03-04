// Generated source.
// Generator: org.chromium.wip.protocolParser.Generator
package org.chromium.wip.protocol.outputpage;

/**
Tells if backend supports continuous painting
 */
public class CanContinuouslyPaintParams extends org.jetbrains.wip.protocol.WipParamsWithResponse<org.chromium.wip.protocol.inputpage.CanContinuouslyPaintData> {
  public CanContinuouslyPaintParams() {
  }

  public static final String METHOD_NAME = org.chromium.sdk.internal.wip.protocol.BasicConstants.Domain.PAGE + ".canContinuouslyPaint";

  @Override protected String getRequestName() {
    return METHOD_NAME;
  }

  @Override public org.chromium.wip.protocol.inputpage.CanContinuouslyPaintData parseResponse(org.jetbrains.wip.protocol.WipCommandResponse.Data data, org.jetbrains.wip.protocol.WipGeneratedParserRoot parser) {
    return parser.parsePageCanContinuouslyPaintData(data.getUnderlyingObject());
  }

}
