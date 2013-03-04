// Generated source.
// Generator: org.chromium.wip.protocolParser.Generator
package org.chromium.wip.protocol.inputnetwork;

/**
 Timing information for the request.
 */
@org.chromium.protocolParser.JsonType
public interface ResourceTimingValue {
  /**
   Timing's requestTime is a baseline in seconds, while the other numbers are ticks in milliseconds relatively to this requestTime.
   */
  Number requestTime();

  /**
   Started resolving proxy.
   */
  Number proxyStart();

  /**
   Finished resolving proxy.
   */
  Number proxyEnd();

  /**
   Started DNS address resolve.
   */
  Number dnsStart();

  /**
   Finished DNS address resolve.
   */
  Number dnsEnd();

  /**
   Started connecting to the remote host.
   */
  Number connectStart();

  /**
   Connected to the remote host.
   */
  Number connectEnd();

  /**
   Started SSL handshake.
   */
  Number sslStart();

  /**
   Finished SSL handshake.
   */
  Number sslEnd();

  /**
   Started sending request.
   */
  Number sendStart();

  /**
   Finished sending request.
   */
  Number sendEnd();

  /**
   Finished receiving response headers.
   */
  Number receiveHeadersEnd();

}
