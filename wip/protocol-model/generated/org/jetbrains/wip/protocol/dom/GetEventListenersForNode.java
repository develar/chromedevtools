// Generated source
package org.jetbrains.wip.protocol.dom;

/**
 * Returns event listeners relevant to the node.
 */
public final class GetEventListenersForNode extends org.jetbrains.wip.protocol.WipRequest implements org.jetbrains.jsonProtocol.RequestWithResponse<org.jetbrains.wip.protocol.dom.GetEventListenersForNodeResult, org.jetbrains.wip.protocol.ProtocolReponseReader> {
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
  public GetEventListenersForNodeResult readResult(com.google.gson.stream.JsonReaderEx jsonReader, org.jetbrains.wip.protocol.ProtocolReponseReader reader) {
    return reader.readDOMGetEventListenersForNodeResult(jsonReader);
  }
}