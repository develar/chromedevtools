// Generated source.
// Generator: org.chromium.wip.protocolParser.Generator
package org.chromium.wip.protocol.inputnetwork;

/**
 Information about the cached resource.
 */
@org.chromium.sdk.internal.protocolparser.JsonType
public interface CachedResourceValue {
  /**
   Resource URL. This is the url of the original network request.
   */
  String url();

  /**
   Type of this resource.
   */
  org.chromium.wip.protocol.inputpage.ResourceTypeEnum type();

  /**
   Cached response data.
   */
  @org.chromium.sdk.internal.protocolparser.JsonOptionalField
  org.chromium.wip.protocol.inputnetwork.ResponseValue response();

  /**
   Cached response body size.
   */
  Number bodySize();

}
