// Generated source
package org.chromium.wip.protocol.input.page;

/**
 * Fired when a JavaScript initiated dialog (alert, confirm, prompt, or onbeforeunload) is about to open.
 */
@org.chromium.protocolReader.JsonType
public interface JavascriptDialogOpeningEventData {
  /**
   * Message that will be displayed by the dialog.
   */
  String message();

  org.jetbrains.wip.protocol.WipEventType<org.chromium.wip.protocol.input.page.JavascriptDialogOpeningEventData> TYPE
  	= new org.jetbrains.wip.protocol.WipEventType<org.chromium.wip.protocol.input.page.JavascriptDialogOpeningEventData>("PagejavascriptDialogOpening", org.chromium.wip.protocol.input.page.JavascriptDialogOpeningEventData.class) {
    @Override
    public org.chromium.wip.protocol.input.page.JavascriptDialogOpeningEventData read(org.chromium.wip.protocol.input.ProtocolReponseReader protocolReader, com.google.gson.stream.JsonReaderEx reader) {
      return protocolReader.readPageJavascriptDialogOpeningEventData(reader);
    }
  };
}