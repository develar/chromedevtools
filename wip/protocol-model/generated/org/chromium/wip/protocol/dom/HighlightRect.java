// Generated source
package org.chromium.wip.protocol.dom;

/**
 * Highlights given rectangle. Coordinates are absolute with respect to the main frame viewport.
 */
public final class HighlightRect extends org.jetbrains.wip.protocol.WipRequest {
  /**
   * @param x X coordinate
   * @param y Y coordinate
   * @param width Rectangle width
   * @param height Rectangle height
   */
  public HighlightRect(int x, int y, int width, int height) {
    writeInt("x", x);
    writeInt("y", y);
    writeInt("width", width);
    writeInt("height", height);
  }

  /**
   * @param v The highlight fill color (default: transparent).
   */
  public HighlightRect color(org.chromium.wip.protocol.dom.RGBA v) {
    writeMessage("color", v);
    return this;
  }

  /**
   * @param v The highlight outline color (default: transparent).
   */
  public HighlightRect outlineColor(org.chromium.wip.protocol.dom.RGBA v) {
    writeMessage("outlineColor", v);
    return this;
  }
  @Override
  public String getMethodName() {
    return "DOM.highlightRect";
  }
}