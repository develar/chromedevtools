// Generated source
package org.jetbrains.wip.protocol.dom;

/**
 * Returns attributes for the specified node.
 */
public final class GetAttributes extends org.jetbrains.wip.protocol.WipRequest implements org.jetbrains.jsonProtocol.RequestWithResponse<org.jetbrains.wip.protocol.dom.GetAttributesResult, org.jetbrains.wip.protocol.ProtocolReponseReader> {
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
  public GetAttributesResult readResult(com.google.gson.stream.JsonReaderEx jsonReader, org.jetbrains.wip.protocol.ProtocolReponseReader reader) {
    return reader.readDOMGetAttributesResult(jsonReader);
  }
}