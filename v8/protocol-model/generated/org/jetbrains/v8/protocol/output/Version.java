// Generated source
package org.jetbrains.v8.protocol.output;

/**
 * Reports version of the running V8
 */
public final class Version extends org.jetbrains.v8.protocol.V8Request implements org.jetbrains.jsonProtocol.RequestWithResponse<org.jetbrains.v8.protocol.input.VersionData, org.jetbrains.v8.protocol.input.ProtocolReponseReader> {

  @Override
  public String getMethodName() {
    return "version";
  }

  @Override
  public org.jetbrains.v8.protocol.input.VersionData readResponse(org.jetbrains.jsonProtocol.JsonObjectBased data, org.jetbrains.v8.protocol.input.ProtocolReponseReader reader) {
    return reader.readVersionData(data.getDeferredReader());
  }
}