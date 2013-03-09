// Generated source
package org.chromium.wip.protocol.output.dom;

/**
 * Executes <code>querySelector</code> on a given node.
 */
public final class QuerySelector extends org.jetbrains.wip.protocol.WipRequestWithResponse<org.chromium.wip.protocol.input.dom.QuerySelectorData> {
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
  public org.chromium.wip.protocol.input.dom.QuerySelectorData parseResponse(org.jetbrains.wip.protocol.WipCommandResponse.Data data, org.chromium.wip.protocol.input.GeneratedWipProtocolReader parser) throws java.io.IOException {
    return parser.parseDOMQuerySelectorData(data.getDeferredReader());
  }
}