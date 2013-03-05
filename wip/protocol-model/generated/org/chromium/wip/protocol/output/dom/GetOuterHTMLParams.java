// Generated source.
// Generator: org.chromium.wip.protocolParser.Generator
package org.chromium.wip.protocol.output.dom;

/**
 * Returns node's HTML markup.
 */
public class GetOuterHTMLParams extends org.jetbrains.wip.protocol.WipParamsWithResponse<org.chromium.wip.protocol.input.dom.GetOuterHTMLData> {
  /**
   * @param nodeId Id of the node to get markup for.
   */
  public GetOuterHTMLParams(long nodeId) {
    put("nodeId", nodeId);
  }
  public static final String METHOD_NAME = org.jetbrains.wip.protocol.BasicConstants.Domain.DOM + ".getOuterHTML";

  @Override
  public String getCommand() {
    return METHOD_NAME;
  }

  @Override
  public org.chromium.wip.protocol.input.dom.GetOuterHTMLData parseResponse(org.jetbrains.wip.protocol.WipCommandResponse.Data data, org.chromium.wip.protocol.input.GeneratedWipProtocolReader parser) throws java.io.IOException {
    return parser.parseDOMGetOuterHTMLData(data.getUnderlyingObject());
  }

}