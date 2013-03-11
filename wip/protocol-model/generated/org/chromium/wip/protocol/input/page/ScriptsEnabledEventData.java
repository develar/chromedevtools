// Generated source
package org.chromium.wip.protocol.input.page;

/**
 * Fired when the JavaScript is enabled/disabled on the page
 */
@org.chromium.protocolReader.JsonType
public interface ScriptsEnabledEventData {
  /**
   * Whether script execution is enabled or disabled on the page.
   */
  boolean isEnabled();

  org.jetbrains.wip.protocol.WipEventType<org.chromium.wip.protocol.input.page.ScriptsEnabledEventData> TYPE
  	= new org.jetbrains.wip.protocol.WipEventType<org.chromium.wip.protocol.input.page.ScriptsEnabledEventData>("PagescriptsEnabled", org.chromium.wip.protocol.input.page.ScriptsEnabledEventData.class) {
    @Override
    public org.chromium.wip.protocol.input.page.ScriptsEnabledEventData read(org.chromium.wip.protocol.input.ProtocolReponseReader protocolReader, com.google.gson.stream.JsonReaderEx reader) {
      return protocolReader.readPageScriptsEnabledEventData(reader);
    }
  };
}