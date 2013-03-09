// Generated source
package org.chromium.wip.protocol.output.dom;

/**
 * Returns event listeners relevant to the node.
 */
public final class GetEventListenersForNode extends org.jetbrains.wip.protocol.WipRequestWithResponse<org.chromium.wip.protocol.input.dom.GetEventListenersForNodeData> {
  /**
   * @param nodeId Id of the node to get listeners for.
   */
  public GetEventListenersForNode(int nodeId) {
    writeInt("nodeId", nodeId);
  }

  /**
   * @param v Symbolic group name for handler value. Handler value is not returned without this parameter specified.
   */
  public GetEventListenersForNode objectGroup(String v) {
    if (v != null) {
      writeString("objectGroup", v);
    }
    return this;
  }
  @Override
  public String getMethodName() {
    return "DOM.getEventListenersForNode";
  }

  @Override
  public org.chromium.wip.protocol.input.dom.GetEventListenersForNodeData parseResponse(org.jetbrains.wip.protocol.WipCommandResponse.Data data, org.chromium.wip.protocol.input.GeneratedWipProtocolReader parser) throws java.io.IOException {
    return parser.parseDOMGetEventListenersForNodeData(data.getDeferredReader());
  }
}