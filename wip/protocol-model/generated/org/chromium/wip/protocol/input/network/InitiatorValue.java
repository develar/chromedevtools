// Generated source
package org.chromium.wip.protocol.input.network;

/**
 * Information about the request initiator.
 */
@org.chromium.protocolParser.JsonType
public interface InitiatorValue {
  /**
   * Type of this initiator.
   */
  Type type();
  /**
   * Initiator JavaScript stack trace, set for Script only.
   */
  @org.chromium.protocolParser.JsonOptionalField
  java.util.List<org.chromium.wip.protocol.input.console.CallFrameValue> stackTrace();
  /**
   * Initiator URL, set for Parser type only.
   */
  @org.chromium.protocolParser.JsonOptionalField
  String url();
  /**
   * Initiator line number, set for Parser type only.
   */
  @org.chromium.protocolParser.JsonOptionalField
  double lineNumber();

  /**
   * Type of this initiator.
   */
  public enum Type {
    PARSER, SCRIPT, OTHER
  }
}