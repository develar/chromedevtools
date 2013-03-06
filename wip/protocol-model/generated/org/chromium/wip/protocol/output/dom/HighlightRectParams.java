// Generated source
package org.chromium.wip.protocol.output.dom;

/**
 * Highlights given rectangle. Coordinates are absolute with respect to the main frame viewport.
 */
public class HighlightRectParams extends org.jetbrains.wip.protocol.WipParams {
  /**
   * @param x X coordinate
   * @param y Y coordinate
   * @param width Rectangle width
   * @param height Rectangle height
   */
  public HighlightRectParams(long x, long y, long width, long height) {
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
  public static final String METHOD_NAME = org.jetbrains.wip.protocol.BasicConstants.Domain.DOM + ".highlightRect";

  @Override
  public String getCommand() {
    return METHOD_NAME;
  }
}