// Generated source
package org.chromium.wip.protocol.output.page;

/**
 * Accepts or dismisses a JavaScript initiated dialog (alert, confirm, prompt, or onbeforeunload).
 */
public final class HandleJavaScriptDialog extends org.jetbrains.wip.protocol.WipRequest {
  /**
   * @param accept Whether to accept or dismiss the dialog.
   */
  public HandleJavaScriptDialog(boolean accept) {
    put("accept", accept);
  }
  @Override
  public String getMethodName() {
    return "Page.handleJavaScriptDialog";
  }
}