// Generated source
package org.chromium.wip.protocol.page;

/**
 * Fired when a JavaScript initiated dialog (alert, confirm, prompt, or onbeforeunload) has been closed.
 */
@org.chromium.protocolReader.JsonType
public interface JavascriptDialogClosedEventData {

  org.jetbrains.wip.protocol.WipEventType<org.chromium.wip.protocol.page.JavascriptDialogClosedEventData> TYPE
  	= new org.jetbrains.wip.protocol.WipEventType<org.chromium.wip.protocol.page.JavascriptDialogClosedEventData>("PagejavascriptDialogClosed", org.chromium.wip.protocol.page.JavascriptDialogClosedEventData.class) {
    @Override
    public org.chromium.wip.protocol.page.JavascriptDialogClosedEventData read(org.chromium.wip.protocol.ProtocolReponseReader protocolReader, com.google.gson.stream.JsonReaderEx reader) {
      return protocolReader.readPageJavascriptDialogClosedEventData(reader);
    }
  };
}