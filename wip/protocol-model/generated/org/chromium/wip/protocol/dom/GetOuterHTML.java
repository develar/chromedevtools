// Generated source
package org.chromium.wip.protocol.dom;

/**
 * Returns node's HTML markup.
 */
public final class GetOuterHTML extends org.jetbrains.wip.protocol.WipRequest implements org.jetbrains.jsonProtocol.RequestWithResponse<org.chromium.wip.protocol.dom.GetOuterHTMLResult, org.chromium.wip.protocol.ProtocolReponseReader> {
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
  public GetOuterHTMLResult readResult(com.google.gson.stream.JsonReaderEx jsonReader, org.chromium.wip.protocol.ProtocolReponseReader reader) {
    return reader.readDOMGetOuterHTMLResult(jsonReader);
  }
}