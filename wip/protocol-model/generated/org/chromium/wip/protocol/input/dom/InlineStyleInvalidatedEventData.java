// Generated source
package org.chromium.wip.protocol.input.dom;

/**
 * Fired when <code>Element</code>'s inline style is modified via a CSS property modification.
 */
@org.chromium.protocolReader.JsonType
public interface InlineStyleInvalidatedEventData {
  /**
   * Ids of the nodes for which the inline styles have been invalidated.
   */
  int[] nodeIds();

  public static final org.jetbrains.wip.protocol.WipEventType<org.chromium.wip.protocol.input.dom.InlineStyleInvalidatedEventData> TYPE
  	= new org.jetbrains.wip.protocol.WipEventType<org.chromium.wip.protocol.input.dom.InlineStyleInvalidatedEventData>("DOMinlineStyleInvalidated", org.chromium.wip.protocol.input.dom.InlineStyleInvalidatedEventData.class) {
    @Override
    public org.chromium.wip.protocol.input.dom.InlineStyleInvalidatedEventData parse(org.chromium.wip.protocol.input.GeneratedWipProtocolReader parser, com.google.gson.stream.JsonReaderEx reader) {
      return parser.parseDOMInlineStyleInvalidatedEventData(reader);
    }
  };
}