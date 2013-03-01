// Generated source.
// Generator: org.chromium.wip.protocolParser.Generator
package org.chromium.wip.protocol.inputconsole;

/**
 Stack entry for console errors and assertions.
 */
@org.chromium.sdk.internal.protocolparser.JsonType
public interface CallFrameValue {
  /**
   JavaScript function name.
   */
  String functionName();

  /**
   JavaScript script name or url.
   */
  String url();

  /**
   JavaScript script line number.
   */
  long lineNumber();

  /**
   JavaScript script column number.
   */
  long columnNumber();

}
