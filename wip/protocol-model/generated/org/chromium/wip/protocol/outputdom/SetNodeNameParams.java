// Generated source.
// Generator: org.chromium.wip.protocolParser.Generator
package org.chromium.wip.protocol.outputdom;

/**
Sets node name for a node with given id.
 */
public class SetNodeNameParams extends org.jetbrains.wip.protocol.WipParamsWithResponse<org.chromium.wip.protocol.inputdom.SetNodeNameData> {
  /**
   @param nodeId Id of the node to set name for.
   @param name New node's name.
   */
  public SetNodeNameParams(long/*See org.chromium.wip.protocol.commondom.NodeIdTypedef*/ nodeId, String name) {
    this.put("nodeId", nodeId);
    this.put("name", name);
  }

  public static final String METHOD_NAME = org.chromium.sdk.internal.wip.protocol.BasicConstants.Domain.DOM + ".setNodeName";

  @Override protected String getRequestName() {
    return METHOD_NAME;
  }

  @Override public org.chromium.wip.protocol.inputdom.SetNodeNameData parseResponse(org.jetbrains.wip.protocol.WipCommandResponse.Data data, org.jetbrains.wip.protocol.WipGeneratedParserRoot parser) {
    return parser.parseDOMSetNodeNameData(data.getUnderlyingObject());
  }

}
