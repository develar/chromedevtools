// Generated source
package org.chromium.wip.protocol.input.console;

/**
 * Issued when console is cleared. This happens either upon <code>clearMessages</code> command or after page navigation.
 */
@org.chromium.protocolParser.JsonType
public interface MessagesClearedEventData {

  public static final org.jetbrains.wip.protocol.WipEventType<org.chromium.wip.protocol.input.console.MessagesClearedEventData> TYPE
  	= new org.jetbrains.wip.protocol.WipEventType<org.chromium.wip.protocol.input.console.MessagesClearedEventData>("ConsolemessagesCleared", org.chromium.wip.protocol.input.console.MessagesClearedEventData.class) {
    @Override
    public org.chromium.wip.protocol.input.console.MessagesClearedEventData parse(org.chromium.wip.protocol.input.GeneratedWipProtocolReader parser, com.google.gson.stream.JsonReader reader) throws java.io.IOException {
      return parser.parseConsoleMessagesClearedEventData(reader);
    }
  };
}