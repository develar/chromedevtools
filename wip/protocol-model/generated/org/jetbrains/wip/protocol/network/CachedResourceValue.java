// Generated source
package org.jetbrains.wip.protocol.network;

/**
 * Information about the cached resource.
 */
@org.chromium.protocolReader.JsonType
public interface CachedResourceValue {
  /**
   * Resource URL. This is the url of the original network request.
   */
  String url();
  /**
   * Type of this resource.
   */
  org.jetbrains.wip.protocol.page.ResourceType type();
  /**
   * Cached response data.
   */
  @org.chromium.protocolReader.JsonOptionalField
  org.jetbrains.wip.protocol.network.ResponseValue response();
  /**
   * Cached response body size.
   */
  double bodySize();

}