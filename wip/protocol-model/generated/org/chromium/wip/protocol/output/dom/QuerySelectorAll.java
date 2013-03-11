// Generated source
package org.chromium.wip.protocol.output.dom;

/**
 * Executes <code>querySelectorAll</code> on a given node.
 */
public final class QuerySelectorAll extends org.jetbrains.wip.protocol.WipRequest implements org.jetbrains.jsonProtocol.RequestWithResponse<org.chromium.wip.protocol.input.dom.QuerySelectorAllData, org.chromium.wip.protocol.input.ProtocolReponseReader> {
  /**
   * @param nodeId Id of the node to query upon.
   * @param selector Selector string.
   */
  public QuerySelectorAll(int nodeId, String selector) {
    writeInt("nodeId", nodeId);
    writeString("selector", selector);
  }
  @Override
  public String getMethodName() {
    return "DOM.querySelectorAll";
  }

  @Override
  public org.chromium.wip.protocol.input.dom.QuerySelectorAllData readResponse(org.jetbrains.jsonProtocol.JsonObjectBased data, org.chromium.wip.protocol.input.ProtocolReponseReader reader) {
    return reader.readDOMQuerySelectorAllData(data.getDeferredReader());
  }
}