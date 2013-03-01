// Generated source.
// Generator: org.chromium.wip.protocolParser.Generator
package org.chromium.wip.protocol.outputdom;

/**
Configuration data for the highlighting of page elements.
 */
public class HighlightConfigParam extends org.json.simple.JSONObject {
  /**
   @param showInfoOpt Whether the node info tooltip should be shown (default: false).
   @param contentColorOpt The content box highlight fill color (default: transparent).
   @param paddingColorOpt The padding highlight fill color (default: transparent).
   @param borderColorOpt The border highlight fill color (default: transparent).
   @param marginColorOpt The margin highlight fill color (default: transparent).
   */
  public HighlightConfigParam(Boolean showInfoOpt, org.chromium.wip.protocol.outputdom.RGBAParam contentColorOpt, org.chromium.wip.protocol.outputdom.RGBAParam paddingColorOpt, org.chromium.wip.protocol.outputdom.RGBAParam borderColorOpt, org.chromium.wip.protocol.outputdom.RGBAParam marginColorOpt) {
    if (showInfoOpt != null) {
      this.put("showInfo", showInfoOpt);
    }
    if (contentColorOpt != null) {
      this.put("contentColor", contentColorOpt);
    }
    if (paddingColorOpt != null) {
      this.put("paddingColor", paddingColorOpt);
    }
    if (borderColorOpt != null) {
      this.put("borderColor", borderColorOpt);
    }
    if (marginColorOpt != null) {
      this.put("marginColor", marginColorOpt);
    }
  }

}
