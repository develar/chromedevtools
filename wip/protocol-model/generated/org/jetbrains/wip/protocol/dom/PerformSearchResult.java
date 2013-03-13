// Generated source
package org.jetbrains.wip.protocol.dom;

/**
 * Searches for a given string in the DOM tree. Use <code>getSearchResults</code> to access search results or <code>cancelSearch</code> to end this search session.
 */
@org.chromium.protocolReader.JsonType
public interface PerformSearchResult {
  /**
   * Unique search session identifier.
   */
  String searchId();
  /**
   * Number of search results.
   */
  int resultCount();

}