// Generated source
package org.chromium.wip.protocol.output.dom;

/**
 * Resolves JavaScript node object for given node id.
 */
public final class ResolveNode extends org.jetbrains.wip.protocol.WipRequest implements org.jetbrains.jsonProtocol.RequestWithResponse<org.chromium.wip.protocol.input.dom.ResolveNodeData, org.chromium.wip.protocol.input.ProtocolReponseReader> {
  /**
   * @param nodeId Id of the node to resolve.
   */
  public ResolveNode(int nodeId) {
    writeInt("nodeId", nodeId);
  }

  /**
   * @param v Symbolic group name that can be used to release multiple objects.
   */
  public ResolveNode objectGroup(String v) {
    if (v != null) {
      writeString("objectGroup", v);
    }
    return this;
  }
  @Override
  public String getMethodName() {
    return "DOM.resolveNode";
  }

  @Override
  public org.chromium.wip.protocol.input.dom.ResolveNodeData readResponse(org.jetbrains.jsonProtocol.JsonObjectBased data, org.chromium.wip.protocol.input.ProtocolReponseReader reader) {
    return reader.parseDOMResolveNodeData(data.getDeferredReader());
  }
}