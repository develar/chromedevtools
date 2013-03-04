// Generated source.
// Generator: org.chromium.wip.protocolParser.Generator
package org.chromium.wip.protocol.inputnetwork;

import org.chromium.protocolparser.JsonProtocolParseException;
import org.chromium.protocolparser.JsonType;
import org.jetrbrains.wip.protocol.WipEventType;

/**
 Fired when WebSocket is closed.
 */
@JsonType
public interface WebSocketClosedEventData {
  /**
   Request identifier.
   */
  String/*See org.chromium.wip.protocol.commonnetwork.RequestIdTypedef*/ requestId();

  /**
   Timestamp.
   */
  Number/*See org.chromium.wip.protocol.commonnetwork.TimestampTypedef*/ timestamp();

  public static final WipEventType<WebSocketClosedEventData> TYPE
      = new WipEventType<WebSocketClosedEventData>("NetworkwebSocketClosed", org.chromium.wip.protocol.inputnetwork.WebSocketClosedEventData.class) {
    @Override public org.chromium.wip.protocol.inputnetwork.WebSocketClosedEventData parse(org.chromium.wip.protocol.input.WipGeneratedParserRoot parser, org.json.simple.JSONObject obj) throws
                                                                                                                                                                                          JsonProtocolParseException {
      return parser.parseNetworkWebSocketClosedEventData(obj);
    }
  };
}
