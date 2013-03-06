// Generated source
package org.chromium.wip.protocol.input.console;

/**
 * Stack entry for console errors and assertions.
 */
@org.chromium.protocolParser.JsonType
public interface CallFrameValue {
  /**
   * JavaScript function name.
   */
  String functionName();
  /**
   * JavaScript script name or url.
   */
  String url();
  /**
   * JavaScript script line number.
   */
  int lineNumber();
  /**
   * JavaScript script column number.
   */
  int columnNumber();

}