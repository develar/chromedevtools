// Generated source
package org.chromium.wip.protocol.output.dom;

/**
 * Resolves JavaScript node object for given node id.
 */
public class ResolveNodeParams extends org.jetbrains.wip.protocol.WipParamsWithResponse<org.chromium.wip.protocol.input.dom.ResolveNodeData> {
  /**
   * @param nodeId Id of the node to resolve.
   */
  public ResolveNodeParams(long nodeId) {
    put("nodeId", nodeId);
  }

  /**
   * @param v Symbolic group name that can be used to release multiple objects.
   */
  public ResolveNodeParams objectGroup(String v) {
    put("objectGroup", v);
    return this;
  }
  public static final String METHOD_NAME = org.jetbrains.wip.protocol.BasicConstants.Domain.DOM + ".resolveNode";

  @Override
  public String getCommand() {
    return METHOD_NAME;
  }

  @Override
  public org.chromium.wip.protocol.input.dom.ResolveNodeData parseResponse(org.jetbrains.wip.protocol.WipCommandResponse.Data data, org.chromium.wip.protocol.input.GeneratedWipProtocolReader parser) throws java.io.IOException {
    return parser.parseDOMResolveNodeData(data.getUnderlyingObject());
  }
}