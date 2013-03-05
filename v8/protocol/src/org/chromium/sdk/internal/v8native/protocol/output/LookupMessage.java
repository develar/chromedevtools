package org.chromium.sdk.internal.v8native.protocol.output;

import org.chromium.sdk.internal.v8native.protocol.DebuggerCommand;

/**
 * Represents a "lookup" request message.
 */
public class LookupMessage extends DebuggerMessage {
  /**
   * @param handles to look up
   * @param inlineRefs whether to inline references
   */
  public LookupMessage(long[] handles, Boolean inlineRefs) {
    this(handles, inlineRefs, -1);
  }

  public LookupMessage(long[] handles, Boolean inlineRefs, long maxStringLength) {
    super(DebuggerCommand.LOOKUP.value);
    put("handles", handles);
    put("inlineRefs", inlineRefs);
    if (maxStringLength != -1) {
      put("maxStringLength", maxStringLength);
    }
  }
}