// Generated source
package org.chromium.wip.protocol.input.dom;

/**
 * Searches for a given string in the DOM tree. Use <code>getSearchResults</code> to access search results or <code>cancelSearch</code> to end this search session.
 */
@org.chromium.protocolParser.JsonType
public interface PerformSearchData {
  /**
   * Unique search session identifier.
   */
  String searchId();
  /**
   * Number of search results.
   */
  int resultCount();

}