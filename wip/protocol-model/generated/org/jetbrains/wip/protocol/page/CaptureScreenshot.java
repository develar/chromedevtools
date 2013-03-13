// Generated source
package org.jetbrains.wip.protocol.page;

/**
 * Capture page screenshot.
 */
public final class CaptureScreenshot extends org.jetbrains.wip.protocol.WipRequest implements org.jetbrains.jsonProtocol.RequestWithResponse<org.jetbrains.wip.protocol.page.CaptureScreenshotResult, org.jetbrains.wip.protocol.ProtocolReponseReader> {

  @Override
  public String getMethodName() {
    return "Page.captureScreenshot";
  }

  @Override
  public CaptureScreenshotResult readResult(com.google.gson.stream.JsonReaderEx jsonReader, org.jetbrains.wip.protocol.ProtocolReponseReader reader) {
    return reader.readPageCaptureScreenshotResult(jsonReader);
  }
}