// Generated source
package org.chromium.wip.protocol.output.dom;

/**
 * Returns node's HTML markup.
 */
public final class GetOuterHTML extends org.jetbrains.wip.protocol.WipRequestWithResponse<org.chromium.wip.protocol.input.dom.GetOuterHTMLData> {
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
  public org.chromium.wip.protocol.input.dom.GetOuterHTMLData parseResponse(org.jetbrains.wip.protocol.WipCommandResponse.Data data, org.chromium.wip.protocol.input.GeneratedWipProtocolReader parser) throws java.io.IOException {
    return parser.parseDOMGetOuterHTMLData(data.getDeferredReader());
  }
}