// Generated source
package org.chromium.wip.protocol.page;

/**
 * Returns present frame / resource tree structure.
 */
public final class GetResourceTree extends org.jetbrains.wip.protocol.WipRequest implements org.jetbrains.jsonProtocol.RequestWithResponse<org.chromium.wip.protocol.page.GetResourceTreeResult, org.chromium.wip.protocol.ProtocolReponseReader> {

  @Override
  public String getMethodName() {
    return "Page.getResourceTree";
  }

  @Override
  public GetResourceTreeResult readResult(com.google.gson.stream.JsonReaderEx jsonReader, org.chromium.wip.protocol.ProtocolReponseReader reader) {
    return reader.readPageGetResourceTreeResult(jsonReader);
  }
}