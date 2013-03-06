// Generated source
package org.chromium.wip.protocol.input.debugger;

/**
 * Edits JavaScript source live.
 */
@org.chromium.protocolParser.JsonType
public interface SetScriptSourceData {
  /**
   * New stack trace in case editing has happened while VM was stopped.
   */
  @org.chromium.protocolParser.JsonOptionalField
  java.util.List<org.chromium.wip.protocol.input.debugger.CallFrameValue> callFrames();
  /**
   * VM-specific description of the changes applied.
   */
  @org.chromium.protocolParser.JsonOptionalField
  Result result();

  /**
   * VM-specific description of the changes applied.
   */
  @org.chromium.protocolParser.JsonType(allowsOtherProperties=true)
  public interface Result extends org.chromium.protocolParser.JsonObjectBased {

  }
}