// Generated source
package org.jetbrains.v8.protocol.output;

import org.jetbrains.v8.protocol.input.GeneratedWipProtocolReader;

/**
 * Reports version of the running V8
 */
public final class Version extends org.jetbrains.v8.protocol.V8RequestWithResponse<org.jetbrains.v8.protocol.input.VersionData> {

  @Override
  public String getMethodName() {
    return "version";
  }

  @Override
  public org.jetbrains.v8.protocol.input.VersionData parseResponse(org.jetbrains.wip.protocol.WipCommandResponse.Data data, GeneratedWipProtocolReader parser) throws java.io.IOException {
    return parser.parseVersionData(data.getDeferredReader());
  }
}