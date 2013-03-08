// Generated source
package org.chromium.wip.protocol.output.dom;

/**
 * Returns the root DOM node to the caller.
 */
public final class GetDocumentParams extends org.jetbrains.wip.WipRequestWithResponse<org.chromium.wip.protocol.input.dom.GetDocumentData> {

  @Override
  public String getMethodName() {
    return "DOM.getDocument";
  }

  @Override
  public org.chromium.wip.protocol.input.dom.GetDocumentData parseResponse(org.jetbrains.wip.protocol.WipCommandResponse.Data data, org.chromium.wip.protocol.input.GeneratedWipProtocolReader parser) throws java.io.IOException {
    return parser.parseDOMGetDocumentData(data.getDeferredReader());
  }
}