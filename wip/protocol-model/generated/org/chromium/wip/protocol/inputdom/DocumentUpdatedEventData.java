// Generated source.
// Generator: org.chromium.wip.protocolParser.Generator
package org.chromium.wip.protocol.inputdom;

/**
 Fired when <code>Document</code> has been totally updated. Node ids are no longer valid.
 */
@org.chromium.sdk.internal.protocolparser.JsonType
public interface DocumentUpdatedEventData {
  public static final org.chromium.sdk.internal.wip.protocol.input.WipEventType<org.chromium.wip.protocol.inputdom.DocumentUpdatedEventData> TYPE
      = new org.chromium.sdk.internal.wip.protocol.input.WipEventType<org.chromium.wip.protocol.inputdom.DocumentUpdatedEventData>("DOMdocumentUpdated", org.chromium.wip.protocol.inputdom.DocumentUpdatedEventData.class) {
    @Override public org.chromium.wip.protocol.inputdom.DocumentUpdatedEventData parse(org.chromium.wip.protocol.input.WipGeneratedParserRoot parser, org.json.simple.JSONObject obj) throws org.chromium.sdk.internal.protocolparser.JsonProtocolParseException {
      return parser.parseDOMDocumentUpdatedEventData(obj);
    }
  };
}
