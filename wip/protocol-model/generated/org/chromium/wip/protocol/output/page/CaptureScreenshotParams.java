// Generated source
package org.chromium.wip.protocol.output.page;

/**
 * Capture page screenshot.
 */
public final class CaptureScreenshotParams extends org.jetbrains.wip.WipRequestWithResponse<org.chromium.wip.protocol.input.page.CaptureScreenshotData> {

  @Override
  public String getMethodName() {
    return "Page.captureScreenshot";
  }

  @Override
  public org.chromium.wip.protocol.input.page.CaptureScreenshotData parseResponse(org.jetbrains.wip.protocol.WipCommandResponse.Data data, org.chromium.wip.protocol.input.GeneratedWipProtocolReader parser) throws java.io.IOException {
    return parser.parsePageCaptureScreenshotData(data.getDeferredReader());
  }
}