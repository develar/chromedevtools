// Generated source
package org.jetbrains.wip.protocol.debugger;

/**
 * Edits JavaScript source live.
 */
@org.chromium.protocolReader.JsonType
public interface SetScriptSourceResult {
  /**
   * New stack trace in case editing has happened while VM was stopped.
   */
  @org.chromium.protocolReader.JsonOptionalField
  java.util.List<org.jetbrains.wip.protocol.debugger.CallFrameValue> callFrames();
  /**
   * VM-specific description of the changes applied.
   */
  @org.chromium.protocolReader.JsonOptionalField
  Result result();

  /**
   * VM-specific description of the changes applied.
   */
  @org.chromium.protocolReader.JsonType(allowsOtherProperties=true)
  public interface Result extends org.jetbrains.jsonProtocol.JsonObjectBased {

  }
}