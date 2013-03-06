// Generated source
package org.chromium.wip.protocol.output.dom;

/**
 * Returns event listeners relevant to the node.
 */
public class GetEventListenersForNodeParams extends org.jetbrains.wip.protocol.WipParamsWithResponse<org.chromium.wip.protocol.input.dom.GetEventListenersForNodeData> {
  /**
   * @param nodeId Id of the node to get listeners for.
   */
  public GetEventListenersForNodeParams(long nodeId) {
    put("nodeId", nodeId);
  }

  /**
   * @param v Symbolic group name for handler value. Handler value is not returned without this parameter specified.
   */
  public GetEventListenersForNodeParams objectGroup(String v) {
    put("objectGroup", v);
    return this;
  }
  public static final String METHOD_NAME = org.jetbrains.wip.protocol.BasicConstants.Domain.DOM + ".getEventListenersForNode";

  @Override
  public String getCommand() {
    return METHOD_NAME;
  }

  @Override
  public org.chromium.wip.protocol.input.dom.GetEventListenersForNodeData parseResponse(org.jetbrains.wip.protocol.WipCommandResponse.Data data, org.chromium.wip.protocol.input.GeneratedWipProtocolReader parser) throws java.io.IOException {
    return parser.parseDOMGetEventListenersForNodeData(data.getUnderlyingObject());
  }
}