// Generated source.
// Generator: org.chromium.wip.protocolParser.Generator
package org.chromium.wip.protocol.inputconsole;

/**
 Console message.
 */
@org.chromium.sdk.internal.protocolparser.JsonType
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
  @org.chromium.sdk.internal.protocolparser.JsonOptionalField
  Type type();

  /**
   URL of the message origin.
   */
  @org.chromium.sdk.internal.protocolparser.JsonOptionalField
  String url();

  /**
   Line number in the resource that generated this message.
   */
  @org.chromium.sdk.internal.protocolparser.JsonOptionalField
  Long line();

  /**
   Repeat count for repeated messages.
   */
  @org.chromium.sdk.internal.protocolparser.JsonOptionalField
  Long repeatCount();

  /**
   Message parameters in case of the formatted message.
   */
  @org.chromium.sdk.internal.protocolparser.JsonOptionalField
  java.util.List<org.chromium.wip.protocol.inputruntime.RemoteObjectValue> parameters();

  /**
   JavaScript stack trace for assertions and error messages.
   */
  @org.chromium.sdk.internal.protocolparser.JsonOptionalField
  java.util.List<org.chromium.wip.protocol.inputconsole.CallFrameValue>/*See org.chromium.wip.protocol.inputconsole.StackTraceTypedef*/ stackTrace();

  /**
   Identifier of the network request associated with this message.
   */
  @org.chromium.sdk.internal.protocolparser.JsonOptionalField
  String/*See org.chromium.wip.protocol.commonnetwork.RequestIdTypedef*/ networkRequestId();

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
