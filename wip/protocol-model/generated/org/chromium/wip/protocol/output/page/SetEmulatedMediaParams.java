// Generated source
package org.chromium.wip.protocol.output.page;

/**
 * Emulates the given media for CSS media queries.
 */
public class SetEmulatedMediaParams extends org.jetbrains.wip.protocol.WipParams {
  /**
   * @param media Media type to emulate. Empty string disables the override.
   */
  public SetEmulatedMediaParams(String media) {
    put("media", media);
  }
  public static final String METHOD_NAME = org.jetbrains.wip.protocol.BasicConstants.Domain.PAGE + ".setEmulatedMedia";

  @Override
  public String getCommand() {
    return METHOD_NAME;
  }
}