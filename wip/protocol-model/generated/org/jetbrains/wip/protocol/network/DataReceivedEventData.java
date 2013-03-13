// Generated source
package org.jetbrains.wip.protocol.network;

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

  org.jetbrains.wip.protocol.WipEventType<org.jetbrains.wip.protocol.network.DataReceivedEventData> TYPE
  	= new org.jetbrains.wip.protocol.WipEventType<org.jetbrains.wip.protocol.network.DataReceivedEventData>("NetworkdataReceived", org.jetbrains.wip.protocol.network.DataReceivedEventData.class) {
    @Override
    public org.jetbrains.wip.protocol.network.DataReceivedEventData read(org.jetbrains.wip.protocol.ProtocolReponseReader protocolReader, com.google.gson.stream.JsonReaderEx reader) {
      return protocolReader.readNetworkDataReceivedEventData(reader);
    }
  };
}