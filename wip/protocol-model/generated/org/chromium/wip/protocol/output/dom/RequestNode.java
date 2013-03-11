// Generated source
package org.chromium.wip.protocol.output.dom;

/**
 * Requests that the node is sent to the caller given the JavaScript node object reference. All nodes that form the path from the node to the root are also sent to the client as a series of <code>setChildNodes</code> notifications.
 */
public final class RequestNode extends org.jetbrains.wip.protocol.WipRequest implements org.jetbrains.jsonProtocol.RequestWithResponse<org.chromium.wip.protocol.input.dom.RequestNodeData, org.chromium.wip.protocol.input.ProtocolReponseReader> {
  /**
   * @param objectId JavaScript object id to convert into node.
   */
  public RequestNode(String objectId) {
    writeString("objectId", objectId);
  }
  @Override
  public String getMethodName() {
    return "DOM.requestNode";
  }

  @Override
  public org.chromium.wip.protocol.input.dom.RequestNodeData readResponse(org.jetbrains.jsonProtocol.JsonObjectBased data, org.chromium.wip.protocol.input.ProtocolReponseReader reader) {
    return reader.parseDOMRequestNodeData(data.getDeferredReader());
  }
}