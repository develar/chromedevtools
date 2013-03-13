// Generated source
package org.jetbrains.wip.protocol.page;

/**
 * Search result for resource.
 */
@org.chromium.protocolReader.JsonType
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