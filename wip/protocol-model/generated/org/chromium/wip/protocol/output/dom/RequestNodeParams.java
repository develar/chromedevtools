// Generated source
package org.chromium.wip.protocol.output.dom;

/**
 * Requests that the node is sent to the caller given the JavaScript node object reference. All nodes that form the path from the node to the root are also sent to the client as a series of <code>setChildNodes</code> notifications.
 */
public class RequestNodeParams extends org.jetbrains.wip.protocol.WipParamsWithResponse<org.chromium.wip.protocol.input.dom.RequestNodeData> {
  /**
   * @param objectId JavaScript object id to convert into node.
   */
  public RequestNodeParams(String objectId) {
    put("objectId", objectId);
  }
  public static final String METHOD_NAME = org.jetbrains.wip.protocol.BasicConstants.Domain.DOM + ".requestNode";

  @Override
  public String getCommand() {
    return METHOD_NAME;
  }

  @Override
  public org.chromium.wip.protocol.input.dom.RequestNodeData parseResponse(org.jetbrains.wip.protocol.WipCommandResponse.Data data, org.chromium.wip.protocol.input.GeneratedWipProtocolReader parser) throws java.io.IOException {
    return parser.parseDOMRequestNodeData(data.getDeferredReader());
  }
}