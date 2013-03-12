// Generated source
package org.jetbrains.v8.protocol;

/**
 * Reports version of the running V8
 */
public final class Version extends org.jetbrains.v8.protocol.V8Request implements org.jetbrains.jsonProtocol.RequestWithResponse<org.jetbrains.v8.protocol.VersionResult, org.jetbrains.v8.protocol.ProtocolReponseReader> {

  @Override
  public String getMethodName() {
    return "version";
  }

  @Override
  public VersionResult readResult(com.google.gson.stream.JsonReaderEx jsonReader, org.jetbrains.v8.protocol.ProtocolReponseReader reader) {
    return reader.readVersionResult(jsonReader);
  }
}