// Generated source.
// Generator: org.chromium.wip.protocolParser.Generator
package org.chromium.wip.protocol.input.network;

/**
 WebSocket frame data.
 */
@org.chromium.protocolParser.JsonType
public interface WebSocketFrameValue {
  /**
   WebSocket frame opcode.
   */
  double opcode();

  /**
   WebSocke frame mask.
   */
  boolean mask();

  /**
   WebSocke frame payload data.
   */
  String payloadData();

}
