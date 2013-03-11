// Generated source
package org.chromium.wip.protocol.output.dom;

/**
 * Returns attributes for the specified node.
 */
public final class GetAttributes extends org.jetbrains.wip.protocol.WipRequest implements org.jetbrains.jsonProtocol.RequestWithResponse<org.chromium.wip.protocol.input.dom.GetAttributesData, org.chromium.wip.protocol.input.ProtocolReponseReader> {
  /**
   * @param nodeId Id of the node to retrieve attibutes for.
   */
  public GetAttributes(int nodeId) {
    writeInt("nodeId", nodeId);
  }
  @Override
  public String getMethodName() {
    return "DOM.getAttributes";
  }

  @Override
  public org.chromium.wip.protocol.input.dom.GetAttributesData readResponse(org.jetbrains.jsonProtocol.JsonObjectBased data, org.chromium.wip.protocol.input.ProtocolReponseReader reader) {
    return reader.parseDOMGetAttributesData(data.getDeferredReader());
  }
}