// Generated source
package org.chromium.wip.protocol.output.dom;

/**
 * Returns node's HTML markup.
 */
public final class GetOuterHTML extends org.jetbrains.wip.protocol.WipRequest implements org.jetbrains.jsonProtocol.RequestWithResponse<org.chromium.wip.protocol.input.dom.GetOuterHTMLData, org.chromium.wip.protocol.input.ProtocolReponseReader> {
  /**
   * @param nodeId Id of the node to get markup for.
   */
  public GetOuterHTML(int nodeId) {
    writeInt("nodeId", nodeId);
  }
  @Override
  public String getMethodName() {
    return "DOM.getOuterHTML";
  }

  @Override
  public org.chromium.wip.protocol.input.dom.GetOuterHTMLData readResponse(org.jetbrains.jsonProtocol.JsonObjectBased data, org.chromium.wip.protocol.input.ProtocolReponseReader reader) {
    return reader.readDOMGetOuterHTMLData(data.getDeferredReader());
  }
}