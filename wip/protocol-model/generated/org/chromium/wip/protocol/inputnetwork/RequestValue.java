// Generated source.
// Generator: org.chromium.wip.protocolParser.Generator
package org.chromium.wip.protocol.inputnetwork;

/**
 HTTP request data.
 */
@org.chromium.sdk.internal.protocolparser.JsonType
public interface RequestValue {
  /**
   Request URL.
   */
  String url();

  /**
   HTTP request method.
   */
  String method();

  /**
   HTTP request headers.
   */
  org.chromium.wip.protocol.inputnetwork.HeadersValue headers();

  /**
   HTTP POST request data.
   */
  @org.chromium.sdk.internal.protocolparser.JsonOptionalField
  String postData();

}