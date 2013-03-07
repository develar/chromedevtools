// Generated source
package org.chromium.wip.protocol.output.dom;

/**
 * Returns attributes for the specified node.
 */
public class GetAttributesParams extends org.jetbrains.wip.protocol.WipRequestWithResponse<org.chromium.wip.protocol.input.dom.GetAttributesData> {
  /**
   * @param nodeId Id of the node to retrieve attibutes for.
   */
  public GetAttributesParams(int nodeId) {
    put("nodeId", nodeId);
  }
  @Override
  public String getMethodName() {
    return "DOM.getAttributes";
  }

  @Override
  public org.chromium.wip.protocol.input.dom.GetAttributesData parseResponse(org.jetbrains.wip.protocol.WipCommandResponse.Data data, org.chromium.wip.protocol.input.GeneratedWipProtocolReader parser) throws java.io.IOException {
    return parser.parseDOMGetAttributesData(data.getDeferredReader());
  }
}