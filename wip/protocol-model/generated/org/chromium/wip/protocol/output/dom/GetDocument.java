// Generated source
package org.chromium.wip.protocol.output.dom;

/**
 * Returns the root DOM node to the caller.
 */
public final class GetDocument extends org.jetbrains.wip.protocol.WipRequest implements org.jetbrains.jsonProtocol.RequestWithResponse<org.chromium.wip.protocol.input.dom.GetDocumentData, org.chromium.wip.protocol.input.ProtocolReponseReader> {

  @Override
  public String getMethodName() {
    return "DOM.getDocument";
  }

  @Override
  public org.chromium.wip.protocol.input.dom.GetDocumentData readResponse(org.jetbrains.jsonProtocol.JsonObjectBased data, org.chromium.wip.protocol.input.ProtocolReponseReader reader) {
    return reader.parseDOMGetDocumentData(data.getDeferredReader());
  }
}