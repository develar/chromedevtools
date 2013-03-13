// Generated source
package org.jetbrains.wip.protocol.page;

/**
 * Fired when a JavaScript initiated dialog (alert, confirm, prompt, or onbeforeunload) is about to open.
 */
@org.chromium.protocolReader.JsonType
public interface JavascriptDialogOpeningEventData {
  /**
   * Message that will be displayed by the dialog.
   */
  String message();

  org.jetbrains.wip.protocol.WipEventType<org.jetbrains.wip.protocol.page.JavascriptDialogOpeningEventData> TYPE
  	= new org.jetbrains.wip.protocol.WipEventType<org.jetbrains.wip.protocol.page.JavascriptDialogOpeningEventData>("PagejavascriptDialogOpening", org.jetbrains.wip.protocol.page.JavascriptDialogOpeningEventData.class) {
    @Override
    public org.jetbrains.wip.protocol.page.JavascriptDialogOpeningEventData read(org.jetbrains.wip.protocol.ProtocolReponseReader protocolReader, com.google.gson.stream.JsonReaderEx reader) {
      return protocolReader.readPageJavascriptDialogOpeningEventData(reader);
    }
  };
}