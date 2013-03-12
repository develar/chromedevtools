// Generated source
package org.chromium.wip.protocol.network;

/**
 * Timing information for the request.
 */
@org.chromium.protocolReader.JsonType
public interface ResourceTimingValue {
  /**
   * Timing's requestTime is a baseline in seconds, while the other numbers are ticks in milliseconds relatively to this requestTime.
   */
  double requestTime();
  /**
   * Started resolving proxy.
   */
  double proxyStart();
  /**
   * Finished resolving proxy.
   */
  double proxyEnd();
  /**
   * Started DNS address resolve.
   */
  double dnsStart();
  /**
   * Finished DNS address resolve.
   */
  double dnsEnd();
  /**
   * Started connecting to the remote host.
   */
  double connectStart();
  /**
   * Connected to the remote host.
   */
  double connectEnd();
  /**
   * Started SSL handshake.
   */
  double sslStart();
  /**
   * Finished SSL handshake.
   */
  double sslEnd();
  /**
   * Started sending request.
   */
  double sendStart();
  /**
   * Finished sending request.
   */
  double sendEnd();
  /**
   * Finished receiving response headers.
   */
  double receiveHeadersEnd();

}