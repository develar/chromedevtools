// Generated source.
// Generator: org.chromium.wip.protocolParser.Generator
package org.chromium.wip.protocol.outputdom;

/**
Highlights owner element of the frame with given id.
 */
public class HighlightFrameParams extends org.jetbrains.wip.protocol.WipParams {
  /**
   @param frameId Identifier of the frame to highlight.
   @param contentColorOpt The content box highlight fill color (default: transparent).
   @param contentOutlineColorOpt The content box highlight outline color (default: transparent).
   */
  public HighlightFrameParams(String/*See org.chromium.wip.protocol.commonnetwork.FrameIdTypedef*/ frameId, org.chromium.wip.protocol.outputdom.RGBAParam contentColorOpt, org.chromium.wip.protocol.outputdom.RGBAParam contentOutlineColorOpt) {
    this.put("frameId", frameId);
    if (contentColorOpt != null) {
      this.put("contentColor", contentColorOpt);
    }
    if (contentOutlineColorOpt != null) {
      this.put("contentOutlineColor", contentOutlineColorOpt);
    }
  }

  public static final String METHOD_NAME = org.chromium.sdk.internal.wip.protocol.BasicConstants.Domain.DOM + ".highlightFrame";

  @Override protected String getRequestName() {
    return METHOD_NAME;
  }

}
