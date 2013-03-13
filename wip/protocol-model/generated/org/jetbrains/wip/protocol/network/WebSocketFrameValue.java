// Generated source
package org.jetbrains.wip.protocol.network;

/**
 * WebSocket frame data.
 */
@org.chromium.protocolReader.JsonType
public interface WebSocketFrameValue {
  /**
   * WebSocket frame opcode.
   */
  double opcode();
  /**
   * WebSocke frame mask.
   */
  boolean mask();
  /**
   * WebSocke frame payload data.
   */
  String payloadData();

}