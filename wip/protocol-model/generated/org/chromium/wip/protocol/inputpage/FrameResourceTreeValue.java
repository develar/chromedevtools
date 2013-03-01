// Generated source.
// Generator: org.chromium.wip.protocolParser.Generator
package org.chromium.wip.protocol.inputpage;

/**
 Information about the Frame hierarchy along with their cached resources.
 */
@org.chromium.sdk.internal.protocolparser.JsonType
public interface FrameResourceTreeValue {
  /**
   Frame information for this tree item.
   */
  org.chromium.wip.protocol.inputpage.FrameValue frame();

  /**
   Child frames.
   */
  @org.chromium.sdk.internal.protocolparser.JsonOptionalField
  java.util.List<org.chromium.wip.protocol.inputpage.FrameResourceTreeValue> childFrames();

  /**
   Information about frame resources.
   */
  java.util.List<Resources> resources();

  @org.chromium.sdk.internal.protocolparser.JsonType
  public interface Resources {
    /**
     Resource URL.
     */
    String url();

    /**
     Type of this resource.
     */
    org.chromium.wip.protocol.inputpage.ResourceTypeEnum type();

    /**
     Resource mimeType as determined by the browser.
     */
    String mimeType();

    /**
     True if the resource failed to load.
     */
    @org.chromium.sdk.internal.protocolparser.JsonOptionalField
    Boolean failed();

    /**
     True if the resource was canceled during loading.
     */
    @org.chromium.sdk.internal.protocolparser.JsonOptionalField
    Boolean canceled();

  }
}
