// Generated source.
// Generator: org.chromium.wip.protocolParser.Generator
package org.chromium.wip.protocol.inputnetwork;

/**
 Returns content served for the given request.
 */
@org.chromium.sdk.internal.protocolparser.JsonType
public interface GetResponseBodyData {
  /**
   Response body.
   */
  String body();

  /**
   True, if content was sent as base64.
   */
  boolean base64Encoded();

}
