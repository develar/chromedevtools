// Generated source
package org.chromium.wip.protocol.output.dom;

/**
 * Searches for a given string in the DOM tree. Use <code>getSearchResults</code> to access search results or <code>cancelSearch</code> to end this search session.
 */
public final class PerformSearch extends org.jetbrains.wip.protocol.WipRequestWithResponse<org.chromium.wip.protocol.input.dom.PerformSearchData> {
  /**
   * @param query Plain text or query selector or XPath search query.
   */
  public PerformSearch(String query) {
    put("query", query);
  }
  @Override
  public String getMethodName() {
    return "DOM.performSearch";
  }

  @Override
  public org.chromium.wip.protocol.input.dom.PerformSearchData parseResponse(org.jetbrains.wip.protocol.WipCommandResponse.Data data, org.chromium.wip.protocol.input.GeneratedWipProtocolReader parser) throws java.io.IOException {
    return parser.parseDOMPerformSearchData(data.getDeferredReader());
  }
}