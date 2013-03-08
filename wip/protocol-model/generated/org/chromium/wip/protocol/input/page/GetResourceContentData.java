// Generated source
package org.chromium.wip.protocol.input.page;

/**
 * Returns content of the given resource.
 */
@org.chromium.protocolReader.JsonType
public interface GetResourceContentData {
  /**
   * Resource content.
   */
  String content();
  /**
   * True, if content was served as base64.
   */
  boolean base64Encoded();

}