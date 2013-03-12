// Generated source
package org.chromium.wip.protocol.page;

/**
 * Capture page screenshot.
 */
public final class CaptureScreenshot extends org.jetbrains.wip.protocol.WipRequest implements org.jetbrains.jsonProtocol.RequestWithResponse<org.chromium.wip.protocol.page.CaptureScreenshotResult, org.chromium.wip.protocol.ProtocolReponseReader> {

  @Override
  public String getMethodName() {
    return "Page.captureScreenshot";
  }

  @Override
  public CaptureScreenshotResult readResult(com.google.gson.stream.JsonReaderEx jsonReader, org.chromium.wip.protocol.ProtocolReponseReader reader) {
    return reader.readPageCaptureScreenshotResult(jsonReader);
  }
}