// Generated source
package org.jetbrains.wip.protocol.page;

/**
 * Returns content of the given resource.
 */
@org.chromium.protocolReader.JsonType
public interface GetResourceContentResult {
  /**
   * Resource content.
   */
  String content();
  /**
   * True, if content was served as base64.
   */
  boolean base64Encoded();

}