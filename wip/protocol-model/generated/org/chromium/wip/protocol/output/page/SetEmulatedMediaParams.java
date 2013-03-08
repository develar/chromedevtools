// Generated source
package org.chromium.wip.protocol.output.page;

/**
 * Emulates the given media for CSS media queries.
 */
public final class SetEmulatedMediaParams extends org.jetbrains.wip.WipRequest {
  /**
   * @param media Media type to emulate. Empty string disables the override.
   */
  public SetEmulatedMediaParams(String media) {
    put("media", media);
  }
  @Override
  public String getMethodName() {
    return "Page.setEmulatedMedia";
  }
}