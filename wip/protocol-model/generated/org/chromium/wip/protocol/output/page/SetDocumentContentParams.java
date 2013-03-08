// Generated source
package org.chromium.wip.protocol.output.page;

/**
 * Sets given markup as the document's HTML.
 */
public final class SetDocumentContentParams extends org.jetbrains.wip.WipRequest {
  /**
   * @param frameId Frame id to set HTML for.
   * @param html HTML content to set.
   */
  public SetDocumentContentParams(String frameId, String html) {
    put("frameId", frameId);
    put("html", html);
  }
  @Override
  public String getMethodName() {
    return "Page.setDocumentContent";
  }
}