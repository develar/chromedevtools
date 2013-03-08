// Generated source.
// Generator: org.chromium.wip.protocolParser.Generator
package org.chromium.wip.protocol.input.network;

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
  org.chromium.wip.protocol.input.network.HeadersValue headers();
  /**
   * HTTP POST request data.
   */
  @org.chromium.protocolReader.JsonOptionalField
  String postData();

}