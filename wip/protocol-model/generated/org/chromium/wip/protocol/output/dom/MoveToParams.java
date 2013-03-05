// Generated source.
// Generator: org.chromium.wip.protocolParser.Generator
package org.chromium.wip.protocol.output.dom;

/**
Moves node into the new container, places it before the given anchor.
 */
public class MoveToParams extends org.jetbrains.wip.protocol.WipParamsWithResponse<org.chromium.wip.protocol.input.dom.MoveToData> {
  /**
   * @param nodeId Id of the node to drop.
   * @param targetNodeId Id of the element to drop into.
   */
  public MoveToParams(long nodeId, long targetNodeId) {
    put("nodeId", nodeId);
    put("targetNodeId", targetNodeId);
  }

  /**
   * @param v Drop node before given one.
   */
  public MoveToParams insertBeforeNodeId(long v) {
    put("insertBeforeNodeId", v);
    return this;
  }
  public static final String METHOD_NAME = org.jetbrains.wip.protocol.BasicConstants.Domain.DOM + ".moveTo";

  @Override
  public String getCommand() {
    return METHOD_NAME;
  }

  @Override
  public org.chromium.wip.protocol.input.dom.MoveToData parseResponse(org.jetbrains.wip.protocol.WipCommandResponse.Data data, org.chromium.wip.protocol.input.GeneratedWipProtocolReader parser) throws java.io.IOException {
    return parser.parseDOMMoveToData(data.getUnderlyingObject());
  }

}