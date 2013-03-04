// Generated source.
// Generator: org.chromium.wip.protocolParser.Generator
package org.chromium.wip.protocol.inputdom;

/**
 Fired when <code>Element</code>'s inline style is modified via a CSS property modification.
 */
@org.chromium.protocolParser.JsonType
public interface InlineStyleInvalidatedEventData {
  /**
   Ids of the nodes for which the inline styles have been invalidated.
   */
  long[] nodeIds();

  public static final org.jetbrains.wip.protocol.WipEventType<org.chromium.wip.protocol.inputdom.InlineStyleInvalidatedEventData> TYPE
      = new org.jetbrains.wip.protocol.WipEventType<org.chromium.wip.protocol.inputdom.InlineStyleInvalidatedEventData>("DOMinlineStyleInvalidated", org.chromium.wip.protocol.inputdom.InlineStyleInvalidatedEventData.class) {
    @Override public org.chromium.wip.protocol.inputdom.InlineStyleInvalidatedEventData parse(org.chromium.wip.protocol.input.WipGeneratedParserRoot parser, com.google.gson.stream.JsonReader reader) {
      return parser.parseDOMInlineStyleInvalidatedEventData(reader);
    }
  };
}
