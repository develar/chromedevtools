// Generated source
package org.jetbrains.wip.protocol.dom;

/**
 * Moves node into the new container, places it before the given anchor.
 */
public final class MoveTo extends org.jetbrains.wip.protocol.WipRequest implements org.jetbrains.jsonProtocol.RequestWithResponse<org.jetbrains.wip.protocol.dom.MoveToResult, org.jetbrains.wip.protocol.ProtocolReponseReader> {
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
  public MoveToResult readResult(com.google.gson.stream.JsonReaderEx jsonReader, org.jetbrains.wip.protocol.ProtocolReponseReader reader) {
    return reader.readDOMMoveToResult(jsonReader);
  }
}