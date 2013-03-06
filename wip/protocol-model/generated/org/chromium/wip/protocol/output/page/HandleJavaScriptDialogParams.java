// Generated source
package org.chromium.wip.protocol.output.page;

/**
 * Accepts or dismisses a JavaScript initiated dialog (alert, confirm, prompt, or onbeforeunload).
 */
public class HandleJavaScriptDialogParams extends org.jetbrains.wip.protocol.WipParams {
  /**
   * @param accept Whether to accept or dismiss the dialog.
   */
  public HandleJavaScriptDialogParams(boolean accept) {
    put("accept", accept);
  }
  public static final String METHOD_NAME = org.jetbrains.wip.protocol.BasicConstants.Domain.PAGE + ".handleJavaScriptDialog";

  @Override
  public String getCommand() {
    return METHOD_NAME;
  }
}