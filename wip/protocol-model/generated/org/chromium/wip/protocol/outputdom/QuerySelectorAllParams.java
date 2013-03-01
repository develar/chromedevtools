// Generated source.
// Generator: org.chromium.wip.protocolParser.Generator
package org.chromium.wip.protocol.outputdom;

/**
Executes <code>querySelectorAll</code> on a given node.
 */
public class QuerySelectorAllParams extends org.chromium.sdk.internal.wip.protocol.output.WipParamsWithResponse<org.chromium.wip.protocol.inputdom.QuerySelectorAllData> {
  /**
   @param nodeId Id of the node to query upon.
   @param selector Selector string.
   */
  public QuerySelectorAllParams(long/*See org.chromium.wip.protocol.commondom.NodeIdTypedef*/ nodeId, String selector) {
    this.put("nodeId", nodeId);
    this.put("selector", selector);
  }

  public static final String METHOD_NAME = org.chromium.sdk.internal.wip.protocol.BasicConstants.Domain.DOM + ".querySelectorAll";

  @Override protected String getRequestName() {
    return METHOD_NAME;
  }

  @Override public org.chromium.wip.protocol.inputdom.QuerySelectorAllData parseResponse(org.chromium.sdk.internal.wip.protocol.input.WipCommandResponse.Data data, org.chromium.sdk.internal.wip.protocol.input.WipGeneratedParserRoot parser) throws org.chromium.sdk.internal.protocolparser.JsonProtocolParseException {
    return parser.parseDOMQuerySelectorAllData(data.getUnderlyingObject());
  }

}
