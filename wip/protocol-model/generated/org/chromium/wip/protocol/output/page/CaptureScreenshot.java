// Generated source
package org.chromium.wip.protocol.output.page;

/**
 * Capture page screenshot.
 */
public final class CaptureScreenshot extends org.jetbrains.wip.protocol.WipRequest implements org.jetbrains.jsonProtocol.RequestWithResponse<org.chromium.wip.protocol.input.page.CaptureScreenshotData, org.chromium.wip.protocol.input.ProtocolReponseReader> {

  @Override
  public String getMethodName() {
    return "Page.captureScreenshot";
  }

  @Override
  public org.chromium.wip.protocol.input.page.CaptureScreenshotData readResponse(org.jetbrains.jsonProtocol.JsonObjectBased data, org.chromium.wip.protocol.input.ProtocolReponseReader reader) {
    return reader.parsePageCaptureScreenshotData(data.getDeferredReader());
  }
}