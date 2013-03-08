// Generated source.
// Generator: org.chromium.wip.protocolParser.Generator
package org.chromium.wip.protocol.input.network;

/**
 * HTTP response data.
 */
@org.chromium.protocolReader.JsonType
public interface ResponseValue {
  /**
   * Response URL. This URL can be different from CachedResource.url in case of redirect.
   */
  String url();
  /**
   * HTTP response status code.
   */
  double status();
  /**
   * HTTP response status text.
   */
  String statusText();
  /**
   * HTTP response headers.
   */
  org.chromium.wip.protocol.input.network.HeadersValue headers();
  /**
   * HTTP response headers text.
   */
  @org.chromium.protocolReader.JsonOptionalField
  String headersText();
  /**
   * Resource mimeType as determined by the browser.
   */
  String mimeType();
  /**
   * Refined HTTP request headers that were actually transmitted over the network.
   */
  @org.chromium.protocolReader.JsonOptionalField
  org.chromium.wip.protocol.input.network.HeadersValue requestHeaders();
  /**
   * HTTP request headers text.
   */
  @org.chromium.protocolReader.JsonOptionalField
  String requestHeadersText();
  /**
   * Specifies whether physical connection was actually reused for this request.
   */
  boolean connectionReused();
  /**
   * Physical connection id that was actually used for this request.
   */
  double connectionId();
  /**
   * Specifies that the request was served from the disk cache.
   */
  @org.chromium.protocolReader.JsonOptionalField
  boolean fromDiskCache();
  /**
   * Timing information for the given request.
   */
  @org.chromium.protocolReader.JsonOptionalField
  org.chromium.wip.protocol.input.network.ResourceTimingValue timing();

}