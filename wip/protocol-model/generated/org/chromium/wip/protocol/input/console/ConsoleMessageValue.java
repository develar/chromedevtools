// Generated source.
// Generator: org.chromium.wip.protocolParser.Generator
package org.chromium.wip.protocol.input.console;

/**
 Console message.
 */
@org.chromium.protocolParser.JsonType
public interface ConsoleMessageValue {
  /**
   Message source.
   */
  Source source();

  /**
   Message severity.
   */
  Level level();

  /**
   Message text.
   */
  String text();

  /**
   Console message type.
   */
  @org.chromium.protocolParser.JsonOptionalField
  Type type();

  /**
   URL of the message origin.
   */
  @org.chromium.protocolParser.JsonOptionalField
  String url();

  /**
   Line number in the resource that generated this message.
   */
  @org.chromium.protocolParser.JsonOptionalField
  long line();

  /**
   Repeat count for repeated messages.
   */
  @org.chromium.protocolParser.JsonOptionalField
  long repeatCount();

  /**
   Message parameters in case of the formatted message.
   */
  @org.chromium.protocolParser.JsonOptionalField
  java.util.List<org.chromium.wip.protocol.input.runtime.RemoteObjectValue> parameters();

  /**
   JavaScript stack trace for assertions and error messages.
   */
  @org.chromium.protocolParser.JsonOptionalField
  java.util.List<org.chromium.wip.protocol.input.console.CallFrameValue> stackTrace();

  /**
   Identifier of the network request associated with this message.
   */
  @org.chromium.protocolParser.JsonOptionalField
  String networkRequestId();

  /**
   Message source.
   */
  public enum Source {
    HTML,
    WML,
    XML,
    JAVASCRIPT,
    NETWORK,
    CONSOLE_API,
    OTHER,
  }
  /**
   Message severity.
   */
  public enum Level {
    TIP,
    LOG,
    WARNING,
    ERROR,
    DEBUG,
  }
  /**
   Console message type.
   */
  public enum Type {
    LOG,
    DIR,
    DIRXML,
    TABLE,
    TRACE,
    CLEAR,
    STARTGROUP,
    STARTGROUPCOLLAPSED,
    ENDGROUP,
    ASSERT,
    TIMING,
    PROFILE,
    PROFILEEND,
  }
}
