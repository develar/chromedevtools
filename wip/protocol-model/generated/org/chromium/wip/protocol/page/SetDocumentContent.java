// Generated source
package org.chromium.wip.protocol.page;

/**
 * Sets given markup as the document's HTML.
 */
public final class SetDocumentContent extends org.jetbrains.wip.protocol.WipRequest {
  /**
   * @param frameId Frame id to set HTML for.
   * @param html HTML content to set.
   */
  public SetDocumentContent(String frameId, String html) {
    writeString("frameId", frameId);
    writeString("html", html);
  }
  @Override
  public String getMethodName() {
    return "Page.setDocumentContent";
  }
}