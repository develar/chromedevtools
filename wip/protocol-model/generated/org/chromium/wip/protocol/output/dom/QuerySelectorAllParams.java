// Generated source
package org.chromium.wip.protocol.output.dom;

/**
 * Executes <code>querySelectorAll</code> on a given node.
 */
public class QuerySelectorAllParams extends org.jetbrains.wip.protocol.WipRequestWithResponse<org.chromium.wip.protocol.input.dom.QuerySelectorAllData> {
  /**
   * @param nodeId Id of the node to query upon.
   * @param selector Selector string.
   */
  public QuerySelectorAllParams(int nodeId, String selector) {
    put("nodeId", nodeId);
    put("selector", selector);
  }
  @Override
  public String getMethodName() {
    return "DOM.querySelectorAll";
  }

  @Override
  public org.chromium.wip.protocol.input.dom.QuerySelectorAllData parseResponse(org.jetbrains.wip.protocol.WipCommandResponse.Data data, org.chromium.wip.protocol.input.GeneratedWipProtocolReader parser) throws java.io.IOException {
    return parser.parseDOMQuerySelectorAllData(data.getDeferredReader());
  }
}