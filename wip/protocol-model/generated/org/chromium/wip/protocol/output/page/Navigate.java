// Generated source
package org.chromium.wip.protocol.output.page;

/**
 * Navigates current page to the given URL.
 */
public final class Navigate extends org.jetbrains.wip.protocol.WipRequest {
  /**
   * @param url URL to navigate the page to.
   */
  public Navigate(String url) {
    writeString("url", url);
  }
  @Override
  public String getMethodName() {
    return "Page.navigate";
  }
}