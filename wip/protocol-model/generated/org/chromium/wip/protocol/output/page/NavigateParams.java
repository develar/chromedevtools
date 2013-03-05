// Generated source.
// Generator: org.chromium.wip.protocolParser.Generator
package org.chromium.wip.protocol.output.page;

/**
Navigates current page to the given URL.
 */
public class NavigateParams extends org.jetbrains.wip.protocol.WipParams {
  /**
   * @param url URL to navigate the page to.
   */
  public NavigateParams(String url) {
    put("url", url);
  }
  public static final String METHOD_NAME = org.jetbrains.wip.protocol.BasicConstants.Domain.PAGE + ".navigate";

  @Override
  public String getCommand() {
    return METHOD_NAME;
  }

}