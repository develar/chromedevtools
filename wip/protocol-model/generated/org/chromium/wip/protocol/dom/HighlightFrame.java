// Generated source
package org.chromium.wip.protocol.dom;

/**
 * Highlights owner element of the frame with given id.
 */
public final class HighlightFrame extends org.jetbrains.wip.protocol.WipRequest {
  /**
   * @param frameId Identifier of the frame to highlight.
   */
  public HighlightFrame(String frameId) {
    writeString("frameId", frameId);
  }

  /**
   * @param v The content box highlight fill color (default: transparent).
   */
  public HighlightFrame contentColor(org.chromium.wip.protocol.dom.RGBA v) {
    writeMessage("contentColor", v);
    return this;
  }

  /**
   * @param v The content box highlight outline color (default: transparent).
   */
  public HighlightFrame contentOutlineColor(org.chromium.wip.protocol.dom.RGBA v) {
    writeMessage("contentOutlineColor", v);
    return this;
  }
  @Override
  public String getMethodName() {
    return "DOM.highlightFrame";
  }
}