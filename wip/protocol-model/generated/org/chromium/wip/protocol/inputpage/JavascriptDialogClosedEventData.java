// Generated source.
// Generator: org.chromium.wip.protocolParser.Generator
package org.chromium.wip.protocol.inputpage;

/**
 Fired when a JavaScript initiated dialog (alert, confirm, prompt, or onbeforeunload) has been closed.
 */
@org.chromium.protocolParser.JsonType
public interface JavascriptDialogClosedEventData {
  public static final org.jetbrains.wip.protocol.WipEventType<org.chromium.wip.protocol.inputpage.JavascriptDialogClosedEventData> TYPE
      = new org.jetbrains.wip.protocol.WipEventType<org.chromium.wip.protocol.inputpage.JavascriptDialogClosedEventData>("PagejavascriptDialogClosed", org.chromium.wip.protocol.inputpage.JavascriptDialogClosedEventData.class) {
    @Override public org.chromium.wip.protocol.inputpage.JavascriptDialogClosedEventData parse(org.chromium.wip.protocol.input.GeneratedWipProtocolReader parser, com.google.gson.stream.JsonReader reader) throws java.io.IOException {
      return parser.parsePageJavascriptDialogClosedEventData(reader);
    }
  };
}
