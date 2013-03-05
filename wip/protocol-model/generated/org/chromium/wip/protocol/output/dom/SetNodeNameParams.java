// Generated source.
// Generator: org.chromium.wip.protocolParser.Generator
package org.chromium.wip.protocol.output.dom;

/**
Sets node name for a node with given id.
 */
public class SetNodeNameParams extends org.jetbrains.wip.protocol.WipParamsWithResponse<org.chromium.wip.protocol.input.dom.SetNodeNameData> {
  /**
   * @param nodeId Id of the node to set name for.
   * @param name New node's name.
   */
  public SetNodeNameParams(long nodeId, String name) {
    put("nodeId", nodeId);
    put("name", name);
  }
  public static final String METHOD_NAME = org.jetbrains.wip.protocol.BasicConstants.Domain.DOM + ".setNodeName";

  @Override
  public String getCommand() {
    return METHOD_NAME;
  }

  @Override
  public org.chromium.wip.protocol.input.dom.SetNodeNameData parseResponse(org.jetbrains.wip.protocol.WipCommandResponse.Data data, org.chromium.wip.protocol.input.GeneratedWipProtocolReader parser) throws java.io.IOException {
    return parser.parseDOMSetNodeNameData(data.getUnderlyingObject());
  }

}