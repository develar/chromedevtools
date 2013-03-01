// Generated source.
// Generator: org.chromium.wip.protocolParser.Generator
package org.chromium.wip.protocol.inputpage;

/**
 Fired when a JavaScript initiated dialog (alert, confirm, prompt, or onbeforeunload) has been closed.
 */
@org.chromium.sdk.internal.protocolparser.JsonType
public interface JavascriptDialogClosedEventData {
  public static final org.chromium.sdk.internal.wip.protocol.input.WipEventType<org.chromium.wip.protocol.inputpage.JavascriptDialogClosedEventData> TYPE
      = new org.chromium.sdk.internal.wip.protocol.input.WipEventType<org.chromium.wip.protocol.inputpage.JavascriptDialogClosedEventData>("PagejavascriptDialogClosed", org.chromium.wip.protocol.inputpage.JavascriptDialogClosedEventData.class) {
    @Override public org.chromium.wip.protocol.inputpage.JavascriptDialogClosedEventData parse(org.chromium.wip.protocol.input.WipGeneratedParserRoot parser, org.json.simple.JSONObject obj) throws org.chromium.sdk.internal.protocolparser.JsonProtocolParseException {
      return parser.parsePageJavascriptDialogClosedEventData(obj);
    }
  };
}
