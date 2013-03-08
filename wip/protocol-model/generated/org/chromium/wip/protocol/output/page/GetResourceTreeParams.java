// Generated source
package org.chromium.wip.protocol.output.page;

/**
 * Returns present frame / resource tree structure.
 */
public final class GetResourceTreeParams extends org.jetbrains.wip.WipRequestWithResponse<org.chromium.wip.protocol.input.page.GetResourceTreeData> {

  @Override
  public String getMethodName() {
    return "Page.getResourceTree";
  }

  @Override
  public org.chromium.wip.protocol.input.page.GetResourceTreeData parseResponse(org.jetbrains.wip.protocol.WipCommandResponse.Data data, org.chromium.wip.protocol.input.GeneratedWipProtocolReader parser) throws java.io.IOException {
    return parser.parsePageGetResourceTreeData(data.getDeferredReader());
  }
}