// Generated source.
// Generator: org.chromium.wip.protocolParser.Generator
package org.chromium.wip.protocol.outputdom;

/**
Highlights DOM node with given id or with the given JavaScript object wrapper. Either nodeId or objectId must be specified.
 */
public class HighlightNodeParams extends org.jetbrains.wip.protocol.WipParams {
  /**
   @param highlightConfig A descriptor for the highlight appearance.
   @param nodeIdOpt Identifier of the node to highlight.
   @param objectIdOpt JavaScript object id of the node to be highlighted.
   */
  public HighlightNodeParams(org.chromium.wip.protocol.outputdom.HighlightConfigParam highlightConfig, Long/*See org.chromium.wip.protocol.commondom.NodeIdTypedef*/ nodeIdOpt, String/*See org.chromium.wip.protocol.commonruntime.RemoteObjectIdTypedef*/ objectIdOpt) {
    this.put("highlightConfig", highlightConfig);
    if (nodeIdOpt != null) {
      this.put("nodeId", nodeIdOpt);
    }
    if (objectIdOpt != null) {
      this.put("objectId", objectIdOpt);
    }
  }

  public static final String METHOD_NAME = org.chromium.sdk.internal.wip.protocol.BasicConstants.Domain.DOM + ".highlightNode";

  @Override protected String getRequestName() {
    return METHOD_NAME;
  }

}
