// Generated source
package org.chromium.wip.protocol.network;

/**
 * Information about the request initiator.
 */
@org.chromium.protocolReader.JsonType
public interface InitiatorValue {
  /**
   * Type of this initiator.
   */
  Type type();
  /**
   * Initiator JavaScript stack trace, set for Script only.
   */
  @org.chromium.protocolReader.JsonOptionalField
  java.util.List<org.chromium.wip.protocol.console.CallFrameValue> stackTrace();
  /**
   * Initiator URL, set for Parser type only.
   */
  @org.chromium.protocolReader.JsonOptionalField
  String url();
  /**
   * Initiator line number, set for Parser type only.
   */
  @org.chromium.protocolReader.JsonOptionalField
  double lineNumber();

  /**
   * Type of this initiator.
   */
  public enum Type {
    PARSER, SCRIPT, OTHER
  }
}