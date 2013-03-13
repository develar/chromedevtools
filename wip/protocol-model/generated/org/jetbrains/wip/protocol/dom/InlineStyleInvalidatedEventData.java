// Generated source
package org.jetbrains.wip.protocol.dom;

/**
 * Fired when <code>Element</code>'s inline style is modified via a CSS property modification.
 */
@org.chromium.protocolReader.JsonType
public interface InlineStyleInvalidatedEventData {
  /**
   * Ids of the nodes for which the inline styles have been invalidated.
   */
  int[] nodeIds();

  org.jetbrains.wip.protocol.WipEventType<org.jetbrains.wip.protocol.dom.InlineStyleInvalidatedEventData> TYPE
  	= new org.jetbrains.wip.protocol.WipEventType<org.jetbrains.wip.protocol.dom.InlineStyleInvalidatedEventData>("DOMinlineStyleInvalidated", org.jetbrains.wip.protocol.dom.InlineStyleInvalidatedEventData.class) {
    @Override
    public org.jetbrains.wip.protocol.dom.InlineStyleInvalidatedEventData read(org.jetbrains.wip.protocol.ProtocolReponseReader protocolReader, com.google.gson.stream.JsonReaderEx reader) {
      return protocolReader.readDOMInlineStyleInvalidatedEventData(reader);
    }
  };
}