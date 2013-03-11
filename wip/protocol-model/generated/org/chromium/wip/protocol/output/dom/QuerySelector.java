// Generated source
package org.chromium.wip.protocol.output.dom;

/**
 * Executes <code>querySelector</code> on a given node.
 */
public final class QuerySelector extends org.jetbrains.wip.protocol.WipRequest implements org.jetbrains.jsonProtocol.RequestWithResponse<org.chromium.wip.protocol.input.dom.QuerySelectorData, org.chromium.wip.protocol.input.ProtocolReponseReader> {
  /**
   * @param nodeId Id of the node to query upon.
   * @param selector Selector string.
   */
  public QuerySelector(int nodeId, String selector) {
    writeInt("nodeId", nodeId);
    writeString("selector", selector);
  }
  @Override
  public String getMethodName() {
    return "DOM.querySelector";
  }

  @Override
  public org.chromium.wip.protocol.input.dom.QuerySelectorData readResponse(org.jetbrains.jsonProtocol.JsonObjectBased data, org.chromium.wip.protocol.input.ProtocolReponseReader reader) {
    return reader.parseDOMQuerySelectorData(data.getDeferredReader());
  }
}