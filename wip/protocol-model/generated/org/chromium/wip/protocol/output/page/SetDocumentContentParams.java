// Generated source
package org.chromium.wip.protocol.output.page;

/**
 * Sets given markup as the document's HTML.
 */
public class SetDocumentContentParams extends org.jetbrains.wip.protocol.WipParams {
  /**
   * @param frameId Frame id to set HTML for.
   * @param html HTML content to set.
   */
  public SetDocumentContentParams(String frameId, String html) {
    put("frameId", frameId);
    put("html", html);
  }
  public static final String METHOD_NAME = org.jetbrains.wip.protocol.BasicConstants.Domain.PAGE + ".setDocumentContent";

  @Override
  public String getCommand() {
    return METHOD_NAME;
  }
}