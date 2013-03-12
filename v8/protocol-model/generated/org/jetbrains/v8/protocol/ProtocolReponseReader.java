// Generated source
package org.jetbrains.v8.protocol;

@org.chromium.protocolReader.JsonParserRoot
public interface ProtocolReponseReader {
  @org.chromium.protocolReader.JsonParseMethod
  org.jetbrains.v8.protocol.SetbreakpointResult readSetbreakpointResult(com.google.gson.stream.JsonReaderEx reader);
  @org.chromium.protocolReader.JsonParseMethod
  org.jetbrains.v8.protocol.VersionResult readVersionResult(com.google.gson.stream.JsonReaderEx reader);

}