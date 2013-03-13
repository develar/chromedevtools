// Generated source
package org.jetbrains.wip.protocol.page;

/**
 * Fired when a JavaScript initiated dialog (alert, confirm, prompt, or onbeforeunload) has been closed.
 */
@org.chromium.protocolReader.JsonType
public interface JavascriptDialogClosedEventData {

  org.jetbrains.wip.protocol.WipEventType<org.jetbrains.wip.protocol.page.JavascriptDialogClosedEventData> TYPE
  	= new org.jetbrains.wip.protocol.WipEventType<org.jetbrains.wip.protocol.page.JavascriptDialogClosedEventData>("PagejavascriptDialogClosed", org.jetbrains.wip.protocol.page.JavascriptDialogClosedEventData.class) {
    @Override
    public org.jetbrains.wip.protocol.page.JavascriptDialogClosedEventData read(org.jetbrains.wip.protocol.ProtocolReponseReader protocolReader, com.google.gson.stream.JsonReaderEx reader) {
      return protocolReader.readPageJavascriptDialogClosedEventData(reader);
    }
  };
}