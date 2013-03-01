// Generated source.
// Generator: org.chromium.wip.protocolParser.Generator
package org.chromium.wip.protocol.inputdebugger;

/**
 Edits JavaScript source live.
 */
@org.chromium.sdk.internal.protocolparser.JsonType
public interface SetScriptSourceData {
  /**
   New stack trace in case editing has happened while VM was stopped.
   */
  @org.chromium.sdk.internal.protocolparser.JsonOptionalField
  java.util.List<org.chromium.wip.protocol.inputdebugger.CallFrameValue> callFrames();

  /**
   VM-specific description of the changes applied.
   */
  @org.chromium.sdk.internal.protocolparser.JsonOptionalField
  Result result();

  /**
   VM-specific description of the changes applied.
   */
  @org.chromium.sdk.internal.protocolparser.JsonType(allowsOtherProperties=true)
  public interface Result extends org.chromium.sdk.internal.protocolparser.JsonObjectBased {
  }
}
