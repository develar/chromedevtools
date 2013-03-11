// Generated source
package org.chromium.wip.protocol.input.network;

/**
 * Fired when data chunk was received over the network.
 */
@org.chromium.protocolReader.JsonType
public interface DataReceivedEventData {
  /**
   * Request identifier.
   */
  String requestId();
  /**
   * Timestamp.
   */
  double timestamp();
  /**
   * Data chunk length.
   */
  int dataLength();
  /**
   * Actual bytes received (might be less than dataLength for compressed encodings).
   */
  int encodedDataLength();

  public static final org.jetbrains.wip.protocol.WipEventType<org.chromium.wip.protocol.input.network.DataReceivedEventData> TYPE
  	= new org.jetbrains.wip.protocol.WipEventType<org.chromium.wip.protocol.input.network.DataReceivedEventData>("NetworkdataReceived", org.chromium.wip.protocol.input.network.DataReceivedEventData.class) {
    @Override
    public org.chromium.wip.protocol.input.network.DataReceivedEventData parse(org.chromium.wip.protocol.input.ProtocolReponseReader parser, com.google.gson.stream.JsonReaderEx reader) {
      return parser.parseNetworkDataReceivedEventData(reader);
    }
  };
}