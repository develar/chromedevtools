// Generated source.
// Generator: org.chromium.wip.protocolParser.Generator
package org.chromium.wip.protocol.inputdom;

/**
 Mirrors <code>DOMNodeInserted</code> event.
 */
@org.chromium.protocolParser.JsonType
public interface ChildNodeInsertedEventData {
  /**
   Id of the node that has changed.
   */
  long parentNodeId();

  /**
   If of the previous siblint.
   */
  long previousNodeId();

  /**
   Inserted node data.
   */
  org.chromium.wip.protocol.inputdom.NodeValue node();

  public static final org.jetbrains.wip.protocol.WipEventType<org.chromium.wip.protocol.inputdom.ChildNodeInsertedEventData> TYPE
      = new org.jetbrains.wip.protocol.WipEventType<org.chromium.wip.protocol.inputdom.ChildNodeInsertedEventData>("DOMchildNodeInserted", org.chromium.wip.protocol.inputdom.ChildNodeInsertedEventData.class) {
    @Override public org.chromium.wip.protocol.inputdom.ChildNodeInsertedEventData parse(org.chromium.wip.protocol.input.GeneratedWipProtocolReader parser, com.google.gson.stream.JsonReader reader) throws java.io.IOException {
      return parser.parseDOMChildNodeInsertedEventData(reader);
    }
  };
}
