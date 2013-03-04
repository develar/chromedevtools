// Generated source.
// Generator: org.chromium.wip.protocolParser.Generator
package org.chromium.wip.protocol.inputnetwork;

/**
 HTTP response data.
 */
@org.chromium.protocolParser.JsonType
public interface ResponseValue {
  /**
   Response URL. This URL can be different from CachedResource.url in case of redirect.
   */
  String url();

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

  /**
   HTTP response headers text.
   */
  @org.chromium.protocolParser.JsonOptionalField
  String headersText();

  /**
   Resource mimeType as determined by the browser.
   */
  String mimeType();

  /**
   Refined HTTP request headers that were actually transmitted over the network.
   */
  @org.chromium.protocolParser.JsonOptionalField
  org.chromium.wip.protocol.inputnetwork.HeadersValue requestHeaders();

  /**
   HTTP request headers text.
   */
  @org.chromium.protocolParser.JsonOptionalField
  String requestHeadersText();

  /**
   Specifies whether physical connection was actually reused for this request.
   */
  boolean connectionReused();

  /**
   Physical connection id that was actually used for this request.
   */
  Number connectionId();

  /**
   Specifies that the request was served from the disk cache.
   */
  @org.chromium.protocolParser.JsonOptionalField
  Boolean fromDiskCache();

  /**
   Timing information for the given request.
   */
  @org.chromium.protocolParser.JsonOptionalField
  org.chromium.wip.protocol.inputnetwork.ResourceTimingValue timing();

}
