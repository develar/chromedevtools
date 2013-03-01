// Generated source.
// Generator: org.chromium.wip.protocolParser.Generator
package org.chromium.wip.protocol.inputdom;

/**
 Searches for a given string in the DOM tree. Use <code>getSearchResults</code> to access search results or <code>cancelSearch</code> to end this search session.
 */
@org.chromium.sdk.internal.protocolparser.JsonType
public interface PerformSearchData {
  /**
   Unique search session identifier.
   */
  String searchId();

  /**
   Number of search results.
   */
  long resultCount();

}
