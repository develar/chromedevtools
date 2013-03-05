// Generated source.
// Generator: org.chromium.wip.protocolParser.Generator
package org.chromium.wip.protocol.output.dom;

/**
 * Configuration data for the highlighting of page elements.
 */
public class HighlightConfigParam extends org.jetbrains.jsonProtocol.OutMessage {


  /**
   * @param v Whether the node info tooltip should be shown (default: false).
   */
  public HighlightConfigParam showInfo(boolean v) {
    put("showInfo", v);
    return this;
  }

  /**
   * @param v The content box highlight fill color (default: transparent).
   */
  public HighlightConfigParam contentColor(org.chromium.wip.protocol.output.dom.RGBAParam v) {
    put("contentColor", v);
    return this;
  }

  /**
   * @param v The padding highlight fill color (default: transparent).
   */
  public HighlightConfigParam paddingColor(org.chromium.wip.protocol.output.dom.RGBAParam v) {
    put("paddingColor", v);
    return this;
  }

  /**
   * @param v The border highlight fill color (default: transparent).
   */
  public HighlightConfigParam borderColor(org.chromium.wip.protocol.output.dom.RGBAParam v) {
    put("borderColor", v);
    return this;
  }

  /**
   * @param v The margin highlight fill color (default: transparent).
   */
  public HighlightConfigParam marginColor(org.chromium.wip.protocol.output.dom.RGBAParam v) {
    put("marginColor", v);
    return this;
  }
}