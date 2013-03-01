// Generated source.
// Generator: org.chromium.wip.protocolParser.Generator
package org.chromium.wip.protocol.inputpage;

/**
 Fired when a JavaScript initiated dialog (alert, confirm, prompt, or onbeforeunload) is about to open.
 */
@org.chromium.sdk.internal.protocolparser.JsonType
public interface JavascriptDialogOpeningEventData {
  /**
   Message that will be displayed by the dialog.
   */
  String message();

  public static final org.chromium.sdk.internal.wip.protocol.input.WipEventType<org.chromium.wip.protocol.inputpage.JavascriptDialogOpeningEventData> TYPE
      = new org.chromium.sdk.internal.wip.protocol.input.WipEventType<org.chromium.wip.protocol.inputpage.JavascriptDialogOpeningEventData>("PagejavascriptDialogOpening", org.chromium.wip.protocol.inputpage.JavascriptDialogOpeningEventData.class) {
    @Override public org.chromium.wip.protocol.inputpage.JavascriptDialogOpeningEventData parse(org.chromium.wip.protocol.input.WipGeneratedParserRoot parser, org.json.simple.JSONObject obj) throws org.chromium.sdk.internal.protocolparser.JsonProtocolParseException {
      return parser.parsePageJavascriptDialogOpeningEventData(obj);
    }
  };
}
