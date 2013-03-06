// Generated source
package org.chromium.wip.protocol.output.dom;

/**
 * Executes <code>querySelector</code> on a given node.
 */
public class QuerySelectorParams extends org.jetbrains.wip.protocol.WipParamsWithResponse<org.chromium.wip.protocol.input.dom.QuerySelectorData> {
  /**
   * @param nodeId Id of the node to query upon.
   * @param selector Selector string.
   */
  public QuerySelectorParams(long nodeId, String selector) {
    put("nodeId", nodeId);
    put("selector", selector);
  }
  public static final String METHOD_NAME = org.jetbrains.wip.protocol.BasicConstants.Domain.DOM + ".querySelector";

  @Override
  public String getCommand() {
    return METHOD_NAME;
  }

  @Override
  public org.chromium.wip.protocol.input.dom.QuerySelectorData parseResponse(org.jetbrains.wip.protocol.WipCommandResponse.Data data, org.chromium.wip.protocol.input.GeneratedWipProtocolReader parser) throws java.io.IOException {
    return parser.parseDOMQuerySelectorData(data.getUnderlyingObject());
  }
}