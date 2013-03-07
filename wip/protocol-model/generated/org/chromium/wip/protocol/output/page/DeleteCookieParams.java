// Generated source
package org.chromium.wip.protocol.output.page;

/**
 * Deletes browser cookie with given name, domain and path.
 */
public class DeleteCookieParams extends org.jetbrains.wip.protocol.WipRequest {
  /**
   * @param cookieName Name of the cookie to remove.
   * @param url URL to match cooke domain and path.
   */
  public DeleteCookieParams(String cookieName, String url) {
    put("cookieName", cookieName);
    put("url", url);
  }
  @Override
  public String getMethodName() {
    return "Page.deleteCookie";
  }
}