// Generated source
package org.chromium.wip.protocol.output.page;

/**
 * Returns content of the given resource.
 */
public final class GetResourceContent extends org.jetbrains.wip.protocol.WipRequest implements org.jetbrains.jsonProtocol.RequestWithResponse<org.chromium.wip.protocol.input.page.GetResourceContentData, org.chromium.wip.protocol.input.ProtocolReponseReader> {
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
  public org.chromium.wip.protocol.input.page.GetResourceContentData readResponse(org.jetbrains.jsonProtocol.JsonObjectBased data, org.chromium.wip.protocol.input.ProtocolReponseReader reader) {
    return reader.readPageGetResourceContentData(data.getDeferredReader());
  }
}