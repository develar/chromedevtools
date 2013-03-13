// Generated source
package org.jetbrains.wip.protocol.network;

/**
 * HTTP request data.
 */
@org.chromium.protocolReader.JsonType
public interface RequestValue {
  /**
   * Request URL.
   */
  String url();
  /**
   * HTTP request method.
   */
  String method();
  /**
   * HTTP request headers.
   */
  org.jetbrains.wip.protocol.network.HeadersValue headers();
  /**
   * HTTP POST request data.
   */
  @org.chromium.protocolReader.JsonOptionalField
  String postData();

}