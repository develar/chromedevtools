// Generated source
package org.chromium.wip.protocol.output.debugger;

/**
 * Tells whether <code>setScriptSource</code> is supported.
 */
public final class CanSetScriptSource extends org.jetbrains.wip.protocol.WipRequestWithResponse<org.chromium.wip.protocol.input.debugger.CanSetScriptSourceData> {

  @Override
  public String getMethodName() {
    return "Debugger.canSetScriptSource";
  }

  @Override
  public org.chromium.wip.protocol.input.debugger.CanSetScriptSourceData parseResponse(org.jetbrains.wip.protocol.WipCommandResponse.Data data, org.chromium.wip.protocol.input.GeneratedWipProtocolReader parser) throws java.io.IOException {
    return parser.parseDebuggerCanSetScriptSourceData(data.getDeferredReader());
  }
}