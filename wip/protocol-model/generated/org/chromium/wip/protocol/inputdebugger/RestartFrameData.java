// Generated source.
// Generator: org.chromium.wip.protocolParser.Generator
package org.chromium.wip.protocol.inputdebugger;

/**
 Restarts particular call frame from the beginning.
 */
@org.chromium.sdk.internal.protocolparser.JsonType
public interface RestartFrameData {
  /**
   New stack trace.
   */
  java.util.List<org.chromium.wip.protocol.inputdebugger.CallFrameValue> callFrames();

  /**
   VM-specific description.
   */
  Result result();

  /**
   VM-specific description.
   */
  @org.chromium.sdk.internal.protocolparser.JsonType(allowsOtherProperties=true)
  public interface Result extends org.chromium.sdk.internal.protocolparser.JsonObjectBased {
  }
}
