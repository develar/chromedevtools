// Generated source
package org.chromium.wip.protocol.output.dom;

/**
 * Highlights given rectangle. Coordinates are absolute with respect to the main frame viewport.
 */
public class HighlightRectParams extends org.jetbrains.wip.protocol.WipRequest {
  /**
   * @param x X coordinate
   * @param y Y coordinate
   * @param width Rectangle width
   * @param height Rectangle height
   */
  public HighlightRectParams(int x, int y, int width, int height) {
    put("x", x);
    put("y", y);
    put("width", width);
    put("height", height);
  }

  /**
   * @param v The highlight fill color (default: transparent).
   */
  public HighlightRectParams color(org.chromium.wip.protocol.output.dom.RGBAParam v) {
    put("color", v);
    return this;
  }

  /**
   * @param v The highlight outline color (default: transparent).
   */
  public HighlightRectParams outlineColor(org.chromium.wip.protocol.output.dom.RGBAParam v) {
    put("outlineColor", v);
    return this;
  }
  @Override
  public String getMethodName() {
    return "DOM.highlightRect";
  }
}