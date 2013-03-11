// Generated source
package org.chromium.wip.protocol.output.dom;

/**
 * Moves node into the new container, places it before the given anchor.
 */
public final class MoveTo extends org.jetbrains.wip.protocol.WipRequest implements org.jetbrains.jsonProtocol.RequestWithResponse<org.chromium.wip.protocol.input.dom.MoveToData, org.chromium.wip.protocol.input.ProtocolReponseReader> {
  /**
   * @param nodeId Id of the node to drop.
   * @param targetNodeId Id of the element to drop into.
   */
  public MoveTo(int nodeId, int targetNodeId) {
    writeInt("nodeId", nodeId);
    writeInt("targetNodeId", targetNodeId);
  }

  /**
   * @param v Drop node before given one.
   */
  public MoveTo insertBeforeNodeId(int v) {
    writeInt("insertBeforeNodeId", v);
    return this;
  }
  @Override
  public String getMethodName() {
    return "DOM.moveTo";
  }

  @Override
  public org.chromium.wip.protocol.input.dom.MoveToData readResponse(org.jetbrains.jsonProtocol.JsonObjectBased data, org.chromium.wip.protocol.input.ProtocolReponseReader reader) {
    return reader.parseDOMMoveToData(data.getDeferredReader());
  }
}