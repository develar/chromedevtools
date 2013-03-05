// Generated source.
// Generator: org.chromium.wip.protocolParser.Generator
package org.chromium.wip.protocol.inputpage;

/**
 Fired when a JavaScript initiated dialog (alert, confirm, prompt, or onbeforeunload) is about to open.
 */
@org.chromium.protocolParser.JsonType
public interface JavascriptDialogOpeningEventData {
  /**
   Message that will be displayed by the dialog.
   */
  String message();

  public static final org.jetbrains.wip.protocol.WipEventType<org.chromium.wip.protocol.inputpage.JavascriptDialogOpeningEventData> TYPE
      = new org.jetbrains.wip.protocol.WipEventType<org.chromium.wip.protocol.inputpage.JavascriptDialogOpeningEventData>("PagejavascriptDialogOpening", org.chromium.wip.protocol.inputpage.JavascriptDialogOpeningEventData.class) {
    @Override public org.chromium.wip.protocol.inputpage.JavascriptDialogOpeningEventData parse(org.chromium.wip.protocol.input.GeneratedWipProtocolReader parser, com.google.gson.stream.JsonReader reader) throws java.io.IOException {
      return parser.parsePageJavascriptDialogOpeningEventData(reader);
    }
  };
}
