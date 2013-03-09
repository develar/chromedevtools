// Generated source
package org.chromium.wip.protocol.output.page;

/**
 * Returns all browser cookies. Depending on the backend support, will either return detailed cookie information in the <code>cookie</code> field or string cookie representation using <code>cookieString</code>.
 */
public final class GetCookies extends org.jetbrains.wip.protocol.WipRequestWithResponse<org.chromium.wip.protocol.input.page.GetCookiesData> {

  @Override
  public String getMethodName() {
    return "Page.getCookies";
  }

  @Override
  public org.chromium.wip.protocol.input.page.GetCookiesData parseResponse(org.jetbrains.wip.protocol.WipCommandResponse.Data data, org.chromium.wip.protocol.input.GeneratedWipProtocolReader parser) throws java.io.IOException {
    return parser.parsePageGetCookiesData(data.getDeferredReader());
  }
}