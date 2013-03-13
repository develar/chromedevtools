// Generated source
package org.chromium.wip.protocol.page;

/**
 * Information about the Frame hierarchy along with their cached resources.
 */
@org.chromium.protocolReader.JsonType
public interface FrameResourceTreeValue {
  /**
   * Frame information for this tree item.
   */
  org.chromium.wip.protocol.page.FrameValue frame();
  /**
   * Child frames.
   */
  @org.chromium.protocolReader.JsonOptionalField
  java.util.List<org.chromium.wip.protocol.page.FrameResourceTreeValue> childFrames();
  /**
   * Information about frame resources.
   */
  java.util.List<Resources> resources();

  @org.chromium.protocolReader.JsonType
  public interface Resources {
    /**
     * Resource URL.
     */
    String url();
    /**
     * Type of this resource.
     */
    org.chromium.wip.protocol.page.ResourceType type();
    /**
     * Resource mimeType as determined by the browser.
     */
    String mimeType();
    /**
     * True if the resource failed to load.
     */
    @org.chromium.protocolReader.JsonOptionalField
    boolean failed();
    /**
     * True if the resource was canceled during loading.
     */
    @org.chromium.protocolReader.JsonOptionalField
    boolean canceled();

  }
}