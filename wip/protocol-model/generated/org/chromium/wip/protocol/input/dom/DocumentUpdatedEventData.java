// Generated source.
// Generator: org.chromium.wip.protocolParser.Generator
package org.chromium.wip.protocol.input.dom;

/**
 Fired when <code>Document</code> has been totally updated. Node ids are no longer valid.
 */
@org.chromium.protocolParser.JsonType
public interface DocumentUpdatedEventData {
  public static final org.jetbrains.wip.protocol.WipEventType<org.chromium.wip.protocol.input.dom.DocumentUpdatedEventData> TYPE
      = new org.jetbrains.wip.protocol.WipEventType<org.chromium.wip.protocol.input.dom.DocumentUpdatedEventData>("DOMdocumentUpdated", org.chromium.wip.protocol.input.dom.DocumentUpdatedEventData.class) {
    @Override public org.chromium.wip.protocol.input.dom.DocumentUpdatedEventData parse(org.chromium.wip.protocol.input.GeneratedWipProtocolReader parser, com.google.gson.stream.JsonReader reader) throws java.io.IOException {
      return parser.parseDOMDocumentUpdatedEventData(reader);
    }
  };
}
