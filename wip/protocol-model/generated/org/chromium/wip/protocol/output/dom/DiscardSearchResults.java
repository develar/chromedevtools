// Generated source
package org.chromium.wip.protocol.output.dom;

/**
 * Discards search results from the session with the given id. <code>getSearchResults</code> should no longer be called for that search.
 */
public final class DiscardSearchResults extends org.jetbrains.wip.protocol.WipRequest {
  /**
   * @param searchId Unique search session identifier.
   */
  public DiscardSearchResults(String searchId) {
    writeString("searchId", searchId);
  }
  @Override
  public String getMethodName() {
    return "DOM.discardSearchResults";
  }
}