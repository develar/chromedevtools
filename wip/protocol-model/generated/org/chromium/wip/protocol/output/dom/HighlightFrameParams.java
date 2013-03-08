// Generated source
package org.chromium.wip.protocol.output.dom;

/**
 * Highlights owner element of the frame with given id.
 */
public final class HighlightFrameParams extends org.jetbrains.wip.WipRequest {
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
  @Override
  public String getMethodName() {
    return "DOM.highlightFrame";
  }
}