// Generated source
package org.chromium.wip.protocol.input.dom;

/**
 * Fired when <code>Element</code>'s inline style is modified via a CSS property modification.
 */
@org.chromium.protocolParser.JsonType
public interface InlineStyleInvalidatedEventData {
  /**
   * Ids of the nodes for which the inline styles have been invalidated.
   */
  java.util.List<int> nodeIds();

  public static final org.jetbrains.wip.protocol.WipEventType<org.chromium.wip.protocol.input.dom.InlineStyleInvalidatedEventData> TYPE
  	= new org.jetbrains.wip.protocol.WipEventType<org.chromium.wip.protocol.input.dom.InlineStyleInvalidatedEventData>("DOMinlineStyleInvalidated", org.chromium.wip.protocol.input.dom.InlineStyleInvalidatedEventData.class) {
    @Override
    public org.chromium.wip.protocol.input.dom.InlineStyleInvalidatedEventData parse(org.chromium.wip.protocol.input.GeneratedWipProtocolReader parser, com.google.gson.stream.JsonReader reader) throws java.io.IOException {
      return parser.parseDOMInlineStyleInvalidatedEventData(reader);
    }
  };
}