// Generated source.
// Generator: org.chromium.wip.protocolParser.Generator
package org.chromium.wip.protocol.inputconsole;

/**
 Issued when console is cleared. This happens either upon <code>clearMessages</code> command or after page navigation.
 */
@org.chromium.protocolParser.JsonType
public interface MessagesClearedEventData {
  public static final org.jetbrains.wip.protocol.WipEventType<org.chromium.wip.protocol.inputconsole.MessagesClearedEventData> TYPE
      = new org.jetbrains.wip.protocol.WipEventType<org.chromium.wip.protocol.inputconsole.MessagesClearedEventData>("ConsolemessagesCleared", org.chromium.wip.protocol.inputconsole.MessagesClearedEventData.class) {
    @Override public org.chromium.wip.protocol.inputconsole.MessagesClearedEventData parse(org.chromium.wip.protocol.input.WipGeneratedParserRoot parser, com.google.gson.stream.JsonReader reader) {
      return parser.parseConsoleMessagesClearedEventData(reader);
    }
  };
}
