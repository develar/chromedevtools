// Generated source
package org.chromium.wip.protocol.input.page;

/**
 * Fired when a JavaScript initiated dialog (alert, confirm, prompt, or onbeforeunload) has been closed.
 */
@org.chromium.protocolReader.JsonType
public interface JavascriptDialogClosedEventData {

  public static final org.jetbrains.wip.protocol.WipEventType<org.chromium.wip.protocol.input.page.JavascriptDialogClosedEventData> TYPE
  	= new org.jetbrains.wip.protocol.WipEventType<org.chromium.wip.protocol.input.page.JavascriptDialogClosedEventData>("PagejavascriptDialogClosed", org.chromium.wip.protocol.input.page.JavascriptDialogClosedEventData.class) {
    @Override
    public org.chromium.wip.protocol.input.page.JavascriptDialogClosedEventData parse(org.chromium.wip.protocol.input.GeneratedWipProtocolReader parser, com.google.gson.stream.JsonReaderEx reader) {
      return parser.parsePageJavascriptDialogClosedEventData(reader);
    }
  };
}