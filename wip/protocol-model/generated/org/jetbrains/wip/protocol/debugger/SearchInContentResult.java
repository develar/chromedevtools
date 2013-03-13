// Generated source
package org.jetbrains.wip.protocol.debugger;

/**
 * Searches for given string in script content.
 */
@org.chromium.protocolReader.JsonType
public interface SearchInContentResult {
  /**
   * List of search matches.
   */
  java.util.List<org.jetbrains.wip.protocol.page.SearchMatchValue> result();

}