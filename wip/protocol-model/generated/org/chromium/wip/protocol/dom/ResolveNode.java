// Generated source
package org.chromium.wip.protocol.dom;

/**
 * Resolves JavaScript node object for given node id.
 */
public final class ResolveNode extends org.jetbrains.wip.protocol.WipRequest implements org.jetbrains.jsonProtocol.RequestWithResponse<org.chromium.wip.protocol.dom.ResolveNodeResult, org.chromium.wip.protocol.ProtocolReponseReader> {
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
  public ResolveNodeResult readResult(com.google.gson.stream.JsonReaderEx jsonReader, org.chromium.wip.protocol.ProtocolReponseReader reader) {
    return reader.readDOMResolveNodeResult(jsonReader);
  }
}