// Generated source
package org.chromium.wip.protocol.output.dom;

/**
 * Highlights DOM node with given id or with the given JavaScript object wrapper. Either nodeId or objectId must be specified.
 */
public final class HighlightNode extends org.jetbrains.wip.protocol.WipRequest {
  /**
   * @param highlightConfig A descriptor for the highlight appearance.
   */
  public HighlightNode(org.chromium.wip.protocol.output.dom.HighlightConfig highlightConfig) {
    writeMessage("highlightConfig", highlightConfig);
  }

  /**
   * @param v Identifier of the node to highlight.
   */
  public HighlightNode nodeId(int v) {
    writeInt("nodeId", v);
    return this;
  }

  /**
   * @param v JavaScript object id of the node to be highlighted.
   */
  public HighlightNode objectId(String v) {
    if (v != null) {
      writeString("objectId", v);
    }
    return this;
  }
  @Override
  public String getMethodName() {
    return "DOM.highlightNode";
  }
}