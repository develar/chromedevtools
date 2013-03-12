// Generated source
package org.chromium.wip.protocol.network;

/**
 * Returns content served for the given request.
 */
@org.chromium.protocolReader.JsonType
public interface GetResponseBodyResult {
  /**
   * Response body.
   */
  String body();
  /**
   * True, if content was sent as base64.
   */
  boolean base64Encoded();

}