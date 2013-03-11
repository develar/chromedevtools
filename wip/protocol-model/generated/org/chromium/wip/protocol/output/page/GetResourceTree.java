// Generated source
package org.chromium.wip.protocol.output.page;

/**
 * Returns present frame / resource tree structure.
 */
public final class GetResourceTree extends org.jetbrains.wip.protocol.WipRequest implements org.jetbrains.jsonProtocol.RequestWithResponse<org.chromium.wip.protocol.input.page.GetResourceTreeData, org.chromium.wip.protocol.input.ProtocolReponseReader> {

  @Override
  public String getMethodName() {
    return "Page.getResourceTree";
  }

  @Override
  public org.chromium.wip.protocol.input.page.GetResourceTreeData readResponse(org.jetbrains.jsonProtocol.JsonObjectBased data, org.chromium.wip.protocol.input.ProtocolReponseReader reader) {
    return reader.parsePageGetResourceTreeData(data.getDeferredReader());
  }
}