// Generated source
package org.jetbrains.wip.protocol.dom;

/**
 * Returns the root DOM node to the caller.
 */
public final class GetDocument extends org.jetbrains.wip.protocol.WipRequest implements org.jetbrains.jsonProtocol.RequestWithResponse<org.jetbrains.wip.protocol.dom.GetDocumentResult, org.jetbrains.wip.protocol.ProtocolReponseReader> {

  @Override
  public String getMethodName() {
    return "DOM.getDocument";
  }

  @Override
  public GetDocumentResult readResult(com.google.gson.stream.JsonReaderEx jsonReader, org.jetbrains.wip.protocol.ProtocolReponseReader reader) {
    return reader.readDOMGetDocumentResult(jsonReader);
  }
}