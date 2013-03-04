// Generated source.
// Generator: org.chromium.wip.protocolParser.Generator
package org.chromium.wip.protocol.outputdom;

/**
Returns node's HTML markup.
 */
public class GetOuterHTMLParams extends org.jetbrains.wip.protocol.WipParamsWithResponse<org.chromium.wip.protocol.inputdom.GetOuterHTMLData> {
  /**
   @param nodeId Id of the node to get markup for.
   */
  public GetOuterHTMLParams(long nodeId) {
    //this.put("nodeId", nodeId);
  }

  public static final String METHOD_NAME = org.jetbrains.wip.protocol.BasicConstants.Domain.DOM + ".getOuterHTML";

  @Override protected String getRequestName() {
    return METHOD_NAME;
  }

  @Override public org.chromium.wip.protocol.inputdom.GetOuterHTMLData parseResponse(org.jetbrains.wip.protocol.WipCommandResponse.Data data, org.chromium.wip.protocol.input.WipGeneratedParserRoot parser) {
    return parser.parseDOMGetOuterHTMLData(data.getUnderlyingObject());
  }

}
