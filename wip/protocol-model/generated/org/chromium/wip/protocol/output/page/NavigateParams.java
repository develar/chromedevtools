// Generated source
package org.chromium.wip.protocol.output.page;

/**
 * Navigates current page to the given URL.
 */
public final class NavigateParams extends org.jetbrains.wip.WipRequest {
  /**
   * @param url URL to navigate the page to.
   */
  public NavigateParams(String url) {
    put("url", url);
  }
  @Override
  public String getMethodName() {
    return "Page.navigate";
  }
}