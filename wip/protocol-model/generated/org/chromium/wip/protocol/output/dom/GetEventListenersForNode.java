// Generated source
package org.chromium.wip.protocol.output.dom;

/**
 * Returns event listeners relevant to the node.
 */
public final class GetEventListenersForNode extends org.jetbrains.wip.protocol.WipRequest implements org.jetbrains.jsonProtocol.RequestWithResponse<org.chromium.wip.protocol.input.dom.GetEventListenersForNodeData, org.chromium.wip.protocol.input.ProtocolReponseReader> {
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
  public org.chromium.wip.protocol.input.dom.GetEventListenersForNodeData readResponse(org.jetbrains.jsonProtocol.JsonObjectBased data, org.chromium.wip.protocol.input.ProtocolReponseReader reader) {
    return reader.parseDOMGetEventListenersForNodeData(data.getDeferredReader());
  }
}