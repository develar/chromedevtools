// Generated source.
// Generator: org.chromium.wip.protocolParser.Generator
package org.chromium.wip.protocol.outputdom;

/**
Moves node into the new container, places it before the given anchor.
 */
public class MoveToParams extends org.jetbrains.wip.protocol.WipParamsWithResponse<org.chromium.wip.protocol.inputdom.MoveToData> {
  /**
   @param nodeId Id of the node to drop.
   @param targetNodeId Id of the element to drop into.
   @param insertBeforeNodeIdOpt Drop node before given one.
   */
  public MoveToParams(long/*See org.chromium.wip.protocol.commondom.NodeIdTypedef*/ nodeId, long/*See org.chromium.wip.protocol.commondom.NodeIdTypedef*/ targetNodeId, Long/*See org.chromium.wip.protocol.commondom.NodeIdTypedef*/ insertBeforeNodeIdOpt) {
    this.put("nodeId", nodeId);
    this.put("targetNodeId", targetNodeId);
    if (insertBeforeNodeIdOpt != null) {
      this.put("insertBeforeNodeId", insertBeforeNodeIdOpt);
    }
  }

  public static final String METHOD_NAME = org.chromium.sdk.internal.wip.protocol.BasicConstants.Domain.DOM + ".moveTo";

  @Override protected String getRequestName() {
    return METHOD_NAME;
  }

  @Override public org.chromium.wip.protocol.inputdom.MoveToData parseResponse(org.jetbrains.wip.protocol.WipCommandResponse.Data data, org.jetbrains.wip.protocol.WipGeneratedParserRoot parser) {
    return parser.parseDOMMoveToData(data.getUnderlyingObject());
  }

}
