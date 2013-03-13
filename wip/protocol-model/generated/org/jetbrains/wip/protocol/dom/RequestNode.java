// Generated source
package org.jetbrains.wip.protocol.dom;

/**
 * Requests that the node is sent to the caller given the JavaScript node object reference. All nodes that form the path from the node to the root are also sent to the client as a series of <code>setChildNodes</code> notifications.
 */
public final class RequestNode extends org.jetbrains.wip.protocol.WipRequest implements org.jetbrains.jsonProtocol.RequestWithResponse<org.jetbrains.wip.protocol.dom.RequestNodeResult, org.jetbrains.wip.protocol.ProtocolReponseReader> {
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
  public RequestNodeResult readResult(com.google.gson.stream.JsonReaderEx jsonReader, org.jetbrains.wip.protocol.ProtocolReponseReader reader) {
    return reader.readDOMRequestNodeResult(jsonReader);
  }
}