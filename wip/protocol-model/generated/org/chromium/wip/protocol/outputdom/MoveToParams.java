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
  public MoveToParams(long nodeId, long targetNodeId, long insertBeforeNodeIdOpt) {
    //this.put("nodeId", nodeId);
    //this.put("targetNodeId", targetNodeId);
    //this.put("insertBeforeNodeId", insertBeforeNodeIdOpt);
  }

  public static final String METHOD_NAME = org.jetbrains.wip.protocol.BasicConstants.Domain.DOM + ".moveTo";

  @Override protected String getRequestName() {
    return METHOD_NAME;
  }

  @Override public org.chromium.wip.protocol.inputdom.MoveToData parseResponse(org.jetbrains.wip.protocol.WipCommandResponse.Data data, org.chromium.wip.protocol.input.GeneratedWipProtocolReader parser) throws java.io.IOException {
    return parser.parseDOMMoveToData(data.getUnderlyingObject());
  }

}
