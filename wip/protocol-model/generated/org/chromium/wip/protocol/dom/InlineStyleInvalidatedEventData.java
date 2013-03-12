// Generated source
package org.chromium.wip.protocol.dom;

/**
 * Fired when <code>Element</code>'s inline style is modified via a CSS property modification.
 */
@org.chromium.protocolReader.JsonType
public interface InlineStyleInvalidatedEventData {
  /**
   * Ids of the nodes for which the inline styles have been invalidated.
   */
  int[] nodeIds();

  org.jetbrains.wip.protocol.WipEventType<org.chromium.wip.protocol.dom.InlineStyleInvalidatedEventData> TYPE
  	= new org.jetbrains.wip.protocol.WipEventType<org.chromium.wip.protocol.dom.InlineStyleInvalidatedEventData>("DOMinlineStyleInvalidated", org.chromium.wip.protocol.dom.InlineStyleInvalidatedEventData.class) {
    @Override
    public org.chromium.wip.protocol.dom.InlineStyleInvalidatedEventData read(org.chromium.wip.protocol.ProtocolReponseReader protocolReader, com.google.gson.stream.JsonReaderEx reader) {
      return protocolReader.readDOMInlineStyleInvalidatedEventData(reader);
    }
  };
}