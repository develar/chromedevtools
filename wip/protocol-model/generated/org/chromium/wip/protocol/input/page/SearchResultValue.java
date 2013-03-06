// Generated source.
// Generator: org.chromium.wip.protocolParser.Generator
package org.chromium.wip.protocol.input.page;

/**
 * Search result for resource.
 */
@org.chromium.protocolParser.JsonType
public interface SearchResultValue {
  /**
   * Resource URL.
   */
  String url();
  /**
   * Resource frame id.
   */
  String frameId();
  /**
   * Number of matches in the resource content.
   */
  double matchesCount();

}