// Generated source
package org.chromium.wip.protocol.output.dom;

/**
 * Configuration data for the highlighting of page elements.
 */
public final class HighlightConfig extends org.jetbrains.jsonProtocol.OutMessage {


  /**
   * @param v Whether the node info tooltip should be shown (default: false).
   */
  public HighlightConfig showInfo(boolean v) {
    writeBoolean("showInfo", v);
    return this;
  }

  /**
   * @param v The content box highlight fill color (default: transparent).
   */
  public HighlightConfig contentColor(org.chromium.wip.protocol.output.dom.RGBA v) {
    writeMessage("contentColor", v);
    return this;
  }

  /**
   * @param v The padding highlight fill color (default: transparent).
   */
  public HighlightConfig paddingColor(org.chromium.wip.protocol.output.dom.RGBA v) {
    writeMessage("paddingColor", v);
    return this;
  }

  /**
   * @param v The border highlight fill color (default: transparent).
   */
  public HighlightConfig borderColor(org.chromium.wip.protocol.output.dom.RGBA v) {
    writeMessage("borderColor", v);
    return this;
  }

  /**
   * @param v The margin highlight fill color (default: transparent).
   */
  public HighlightConfig marginColor(org.chromium.wip.protocol.output.dom.RGBA v) {
    writeMessage("marginColor", v);
    return this;
  }
}