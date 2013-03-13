// Generated source
package org.jetbrains.wip.protocol.dom;

/**
 * Executes <code>querySelector</code> on a given node.
 */
public final class QuerySelector extends org.jetbrains.wip.protocol.WipRequest implements org.jetbrains.jsonProtocol.RequestWithResponse<org.jetbrains.wip.protocol.dom.QuerySelectorResult, org.jetbrains.wip.protocol.ProtocolReponseReader> {
  /**
   * @param nodeId Id of the node to query upon.
   * @param selector Selector string.
   */
  public QuerySelector(int nodeId, String selector) {
    writeInt("nodeId", nodeId);
    writeString("selector", selector);
  }
  @Override
  public String getMethodName() {
    return "DOM.querySelector";
  }

  @Override
  public QuerySelectorResult readResult(com.google.gson.stream.JsonReaderEx jsonReader, org.jetbrains.wip.protocol.ProtocolReponseReader reader) {
    return reader.readDOMQuerySelectorResult(jsonReader);
  }
}