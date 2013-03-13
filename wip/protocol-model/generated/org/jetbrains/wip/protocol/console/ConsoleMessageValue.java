// Generated source
package org.jetbrains.wip.protocol.console;

/**
 * Console message.
 */
@org.chromium.protocolReader.JsonType
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
  @org.chromium.protocolReader.JsonOptionalField
  Type type();
  /**
   * URL of the message origin.
   */
  @org.chromium.protocolReader.JsonOptionalField
  String url();
  /**
   * Line number in the resource that generated this message.
   */
  @org.chromium.protocolReader.JsonOptionalField
  int line();
  /**
   * Repeat count for repeated messages.
   */
  @org.chromium.protocolReader.JsonOptionalField
  int repeatCount();
  /**
   * Message parameters in case of the formatted message.
   */
  @org.chromium.protocolReader.JsonOptionalField
  java.util.List<org.jetbrains.wip.protocol.runtime.RemoteObjectValue> parameters();
  /**
   * JavaScript stack trace for assertions and error messages.
   */
  @org.chromium.protocolReader.JsonOptionalField
  java.util.List<org.jetbrains.wip.protocol.console.CallFrameValue> stackTrace();
  /**
   * Identifier of the network request associated with this message.
   */
  @org.chromium.protocolReader.JsonOptionalField
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