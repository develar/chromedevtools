// Generated source
package org.jetbrains.wip.protocol.page;

/**
 * Searches for given string in resource content.
 */
@org.chromium.protocolReader.JsonType
public interface SearchInResourceResult {
  /**
   * List of search matches.
   */
  java.util.List<org.jetbrains.wip.protocol.page.SearchMatchValue> result();

}