// Generated source
package org.jetbrains.wip.protocol.page;

/**
 * Searches for given string in frame / resource tree structure.
 */
@org.chromium.protocolReader.JsonType
public interface SearchInResourcesResult {
  /**
   * List of search results.
   */
  java.util.List<org.jetbrains.wip.protocol.page.SearchResultValue> result();

}