// Generated source.
// Generator: org.chromium.wip.protocolParser.Generator
package org.chromium.wip.protocol.input.debugger;

/**
 * Searches for given string in script content.
 */
@org.chromium.protocolReader.JsonType
public interface SearchInContentData {
  /**
   * List of search matches.
   */
  java.util.List<org.chromium.wip.protocol.input.page.SearchMatchValue> result();

}