// Generated source
package org.chromium.wip.protocol.output.dom;

/**
 * Requests that the node is sent to the caller given the JavaScript node object reference. All nodes that form the path from the node to the root are also sent to the client as a series of <code>setChildNodes</code> notifications.
 */
public final class RequestNode extends org.jetbrains.wip.protocol.WipRequestWithResponse<org.chromium.wip.protocol.input.dom.RequestNodeData> {
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
  public org.chromium.wip.protocol.input.dom.RequestNodeData parseResponse(org.jetbrains.wip.protocol.WipCommandResponse.Data data, org.chromium.wip.protocol.input.GeneratedWipProtocolReader parser) throws java.io.IOException {
    return parser.parseDOMRequestNodeData(data.getDeferredReader());
  }
}