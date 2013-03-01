// Generated source.
// Generator: org.chromium.wip.protocolParser.Generator
package org.chromium.wip.protocol.inputnetwork;

/**
 WebSocket response data.
 */
@org.chromium.sdk.internal.protocolparser.JsonType
public interface WebSocketResponseValue {
  /**
   HTTP response status code.
   */
  Number status();

  /**
   HTTP response status text.
   */
  String statusText();

  /**
   HTTP response headers.
   */
  org.chromium.wip.protocol.inputnetwork.HeadersValue headers();

}
