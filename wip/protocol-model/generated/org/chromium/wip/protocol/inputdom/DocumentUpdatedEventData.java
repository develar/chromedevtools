// Generated source.
// Generator: org.chromium.wip.protocolParser.Generator
package org.chromium.wip.protocol.inputdom;

/**
 Fired when <code>Document</code> has been totally updated. Node ids are no longer valid.
 */
@org.chromium.protocolParser.JsonType
public interface DocumentUpdatedEventData {
  public static final org.jetbrains.wip.protocol.WipEventType<org.chromium.wip.protocol.inputdom.DocumentUpdatedEventData> TYPE
      = new org.jetbrains.wip.protocol.WipEventType<org.chromium.wip.protocol.inputdom.DocumentUpdatedEventData>("DOMdocumentUpdated", org.chromium.wip.protocol.inputdom.DocumentUpdatedEventData.class) {
    @Override public org.chromium.wip.protocol.inputdom.DocumentUpdatedEventData parse(org.chromium.wip.protocol.input.WipGeneratedParserRoot parser, com.google.gson.stream.JsonReader reader) throws java.io.IOException {
      return parser.parseDOMDocumentUpdatedEventData(reader);
    }
  };
}
