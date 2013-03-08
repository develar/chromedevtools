// Generated source
package org.chromium.wip.protocol.output.dom;

/**
 * Resolves JavaScript node object for given node id.
 */
public final class ResolveNodeParams extends org.jetbrains.wip.WipRequestWithResponse<org.chromium.wip.protocol.input.dom.ResolveNodeData> {
  /**
   * @param nodeId Id of the node to resolve.
   */
  public ResolveNodeParams(int nodeId) {
    put("nodeId", nodeId);
  }

  /**
   * @param v Symbolic group name that can be used to release multiple objects.
   */
  public ResolveNodeParams objectGroup(String v) {
    if (v != null) {
      put("objectGroup", v);
    }
    return this;
  }
  @Override
  public String getMethodName() {
    return "DOM.resolveNode";
  }

  @Override
  public org.chromium.wip.protocol.input.dom.ResolveNodeData parseResponse(org.jetbrains.wip.protocol.WipCommandResponse.Data data, org.chromium.wip.protocol.input.GeneratedWipProtocolReader parser) throws java.io.IOException {
    return parser.parseDOMResolveNodeData(data.getDeferredReader());
  }
}