// Generated source.
// Generator: org.chromium.wip.protocolParser.Generator
package org.chromium.wip.protocol.output.dom;

/**
Highlights owner element of the frame with given id.
 */
public class HighlightFrameParams extends org.jetbrains.wip.protocol.WipParams {
  /**
   * @param frameId Identifier of the frame to highlight.
   */
  public HighlightFrameParams(String frameId) {
    put("frameId", frameId);
  }

  /**
   * @param v The content box highlight fill color (default: transparent).
   */
  public HighlightFrameParams contentColor(org.chromium.wip.protocol.output.dom.RGBAParam v) {
    put("contentColor", v);
    return this;
  }

  /**
   * @param v The content box highlight outline color (default: transparent).
   */
  public HighlightFrameParams contentOutlineColor(org.chromium.wip.protocol.output.dom.RGBAParam v) {
    put("contentOutlineColor", v);
    return this;
  }
  public static final String METHOD_NAME = org.jetbrains.wip.protocol.BasicConstants.Domain.DOM + ".highlightFrame";

  @Override
  public String getCommand() {
    return METHOD_NAME;
  }

}