// Generated source.
// Generator: org.chromium.wip.protocolParser.Generator
package org.chromium.wip.protocol.input.network;

/**
 Information about the cached resource.
 */
@org.chromium.protocolParser.JsonType
public interface CachedResourceValue {
  /**
   Resource URL. This is the url of the original network request.
   */
  String url();

  /**
   Type of this resource.
   */
  org.chromium.wip.protocol.input.page.ResourceTypeEnum type();

  /**
   Cached response data.
   */
  @org.chromium.protocolParser.JsonOptionalField
  org.chromium.wip.protocol.input.network.ResponseValue response();

  /**
   Cached response body size.
   */
  Number bodySize();

}
