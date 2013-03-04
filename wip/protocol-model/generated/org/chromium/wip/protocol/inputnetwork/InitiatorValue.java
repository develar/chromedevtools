// Generated source.
// Generator: org.chromium.wip.protocolParser.Generator
package org.chromium.wip.protocol.inputnetwork;

/**
 Information about the request initiator.
 */
@org.chromium.protocolParser.JsonType
public interface InitiatorValue {
  /**
   Type of this initiator.
   */
  Type type();

  /**
   Initiator JavaScript stack trace, set for Script only.
   */
  @org.chromium.protocolParser.JsonOptionalField
  java.util.List<org.chromium.wip.protocol.inputconsole.CallFrameValue>/*See org.chromium.wip.protocol.inputconsole.StackTraceTypedef*/ stackTrace();

  /**
   Initiator URL, set for Parser type only.
   */
  @org.chromium.protocolParser.JsonOptionalField
  String url();

  /**
   Initiator line number, set for Parser type only.
   */
  @org.chromium.protocolParser.JsonOptionalField
  Number lineNumber();

  /**
   Type of this initiator.
   */
  public enum Type {
    PARSER,
    SCRIPT,
    OTHER,
  }
}
