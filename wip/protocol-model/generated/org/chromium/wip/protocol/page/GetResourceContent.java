// Generated source
package org.chromium.wip.protocol.page;

/**
 * Returns content of the given resource.
 */
public final class GetResourceContent extends org.jetbrains.wip.protocol.WipRequest implements org.jetbrains.jsonProtocol.RequestWithResponse<org.chromium.wip.protocol.page.GetResourceContentResult, org.chromium.wip.protocol.ProtocolReponseReader> {
  /**
   * @param frameId Frame id to get resource for.
   * @param url URL of the resource to get content for.
   */
  public GetResourceContent(String frameId, String url) {
    writeString("frameId", frameId);
    writeString("url", url);
  }
  @Override
  public String getMethodName() {
    return "Page.getResourceContent";
  }

  @Override
  public GetResourceContentResult readResult(com.google.gson.stream.JsonReaderEx jsonReader, org.chromium.wip.protocol.ProtocolReponseReader reader) {
    return reader.readPageGetResourceContentResult(jsonReader);
  }
}