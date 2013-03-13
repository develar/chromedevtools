// Generated source
package org.jetbrains.wip.protocol.dom;

/**
 * Executes <code>querySelectorAll</code> on a given node.
 */
public final class QuerySelectorAll extends org.jetbrains.wip.protocol.WipRequest implements org.jetbrains.jsonProtocol.RequestWithResponse<org.jetbrains.wip.protocol.dom.QuerySelectorAllResult, org.jetbrains.wip.protocol.ProtocolReponseReader> {
  /**
   * @param nodeId Id of the node to query upon.
   * @param selector Selector string.
   */
  public QuerySelectorAll(int nodeId, String selector) {
    writeInt("nodeId", nodeId);
    writeString("selector", selector);
  }
  @Override
  public String getMethodName() {
    return "DOM.querySelectorAll";
  }

  @Override
  public QuerySelectorAllResult readResult(com.google.gson.stream.JsonReaderEx jsonReader, org.jetbrains.wip.protocol.ProtocolReponseReader reader) {
    return reader.readDOMQuerySelectorAllResult(jsonReader);
  }
}