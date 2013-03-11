// Generated source
package org.chromium.wip.protocol.output.dom;

/**
 * Searches for a given string in the DOM tree. Use <code>getSearchResults</code> to access search results or <code>cancelSearch</code> to end this search session.
 */
public final class PerformSearch extends org.jetbrains.wip.protocol.WipRequest implements org.jetbrains.jsonProtocol.RequestWithResponse<org.chromium.wip.protocol.input.dom.PerformSearchData, org.chromium.wip.protocol.input.ProtocolReponseReader> {
  /**
   * @param query Plain text or query selector or XPath search query.
   */
  public PerformSearch(String query) {
    writeString("query", query);
  }
  @Override
  public String getMethodName() {
    return "DOM.performSearch";
  }

  @Override
  public org.chromium.wip.protocol.input.dom.PerformSearchData readResponse(org.jetbrains.jsonProtocol.JsonObjectBased data, org.chromium.wip.protocol.input.ProtocolReponseReader reader) {
    return reader.parseDOMPerformSearchData(data.getDeferredReader());
  }
}