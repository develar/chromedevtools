// Generated source
package org.chromium.wip.protocol.page;

/**
 * Emulates the given media for CSS media queries.
 */
public final class SetEmulatedMedia extends org.jetbrains.wip.protocol.WipRequest {
  /**
   * @param media Media type to emulate. Empty string disables the override.
   */
  public SetEmulatedMedia(String media) {
    writeString("media", media);
  }
  @Override
  public String getMethodName() {
    return "Page.setEmulatedMedia";
  }
}