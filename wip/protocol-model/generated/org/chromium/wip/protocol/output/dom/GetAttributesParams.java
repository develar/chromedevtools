// Generated source.
// Generator: org.chromium.wip.protocolParser.Generator
package org.chromium.wip.protocol.output.dom;

/**
Returns attributes for the specified node.
 */
public class GetAttributesParams extends org.jetbrains.wip.protocol.WipParamsWithResponse<org.chromium.wip.protocol.input.dom.GetAttributesData> {
  /**
   @param nodeId Id of the node to retrieve attibutes for.
   */
  public GetAttributesParams(long nodeId) {
    //this.put("nodeId", nodeId);
  }

  public static final String METHOD_NAME = org.jetbrains.wip.protocol.BasicConstants.Domain.DOM + ".getAttributes";

  @Override protected String getRequestName() {
    return METHOD_NAME;
  }

  @Override public org.chromium.wip.protocol.input.dom.GetAttributesData parseResponse(org.jetbrains.wip.protocol.WipCommandResponse.Data data, org.chromium.wip.protocol.input.GeneratedWipProtocolReader parser) throws java.io.IOException {
    return parser.parseDOMGetAttributesData(data.getUnderlyingObject());
  }

}
