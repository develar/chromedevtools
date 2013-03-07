// Generated source
package org.chromium.wip.protocol.input.console;

/**
 * Console message.
 */
@org.chromium.protocolParser.JsonType
public interface ConsoleMessageValue {
  /**
   * Message source.
   */
  Source source();
  /**
   * Message severity.
   */
  Level level();
  /**
   * Message text.
   */
  String text();
  /**
   * Console message type.
   */
  @org.chromium.protocolParser.JsonOptionalField
  Type type();
  /**
   * URL of the message origin.
   */
  @org.chromium.protocolParser.JsonOptionalField
  String url();
  /**
   * Line number in the resource that generated this message.
   */
  @org.chromium.protocolParser.JsonOptionalField
  int line();
  /**
   * Repeat count for repeated messages.
   */
  @org.chromium.protocolParser.JsonOptionalField
  int repeatCount();
  /**
   * Message parameters in case of the formatted message.
   */
  @org.chromium.protocolParser.JsonOptionalField
  java.util.List<org.chromium.wip.protocol.input.runtime.RemoteObjectValue> parameters();
  /**
   * JavaScript stack trace for assertions and error messages.
   */
  @org.chromium.protocolParser.JsonOptionalField
  java.util.List<org.chromium.wip.protocol.input.console.CallFrameValue> stackTrace();
  /**
   * Identifier of the network request associated with this message.
   */
  @org.chromium.protocolParser.JsonOptionalField
  String networkRequestId();

  /**
   * Message source.
   */
  public enum Source {
    XML, JAVASCRIPT, NETWORK, CONSOLE_API, STORAGE, APPCACHE, RENDERING, CSS, SECURITY, OTHER
  }
  /**
   * Message severity.
   */
  public enum Level {
    LOG, WARNING, ERROR, DEBUG
  }
  /**
   * Console message type.
   */
  public enum Type {
    LOG, DIR, DIRXML, TABLE, TRACE, CLEAR, START_GROUP, START_GROUP_COLLAPSED, END_GROUP, ASSERT, TIMING, PROFILE, PROFILE_END
  }
}