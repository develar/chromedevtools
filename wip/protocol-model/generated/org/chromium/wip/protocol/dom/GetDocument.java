// Generated source
package org.chromium.wip.protocol.dom;

/**
 * Returns the root DOM node to the caller.
 */
public final class GetDocument extends org.jetbrains.wip.protocol.WipRequest implements org.jetbrains.jsonProtocol.RequestWithResponse<org.chromium.wip.protocol.dom.GetDocumentResult, org.chromium.wip.protocol.ProtocolReponseReader> {

  @Override
  public String getMethodName() {
    return "DOM.getDocument";
  }

  @Override
  public GetDocumentResult readResult(com.google.gson.stream.JsonReaderEx jsonReader, org.chromium.wip.protocol.ProtocolReponseReader reader) {
    return reader.readDOMGetDocumentResult(jsonReader);
  }
}