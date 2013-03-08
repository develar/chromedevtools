// Generated source
package org.chromium.wip.protocol.input.page;

/**
 * Information about the Frame on the page.
 */
@org.chromium.protocolReader.JsonType
public interface FrameValue {
  /**
   * Frame unique identifier.
   */
  String id();
  /**
   * Parent frame identifier.
   */
  @org.chromium.protocolReader.JsonOptionalField
  String parentId();
  /**
   * Identifier of the loader associated with this frame.
   */
  String loaderId();
  /**
   * Frame's name as specified in the tag.
   */
  @org.chromium.protocolReader.JsonOptionalField
  String name();
  /**
   * Frame document's URL.
   */
  String url();
  /**
   * Frame document's security origin.
   */
  String securityOrigin();
  /**
   * Frame document's mimeType as determined by the browser.
   */
  String mimeType();

}