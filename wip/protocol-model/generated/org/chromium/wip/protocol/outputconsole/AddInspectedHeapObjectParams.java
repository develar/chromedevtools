// Generated source.
// Generator: org.chromium.wip.protocolParser.Generator
package org.chromium.wip.protocol.outputconsole;

public class AddInspectedHeapObjectParams extends org.jetbrains.wip.protocol.WipParams {
  public AddInspectedHeapObjectParams(long heapObjectId) {
    this.put("heapObjectId", heapObjectId);
  }

  public static final String METHOD_NAME = org.chromium.sdk.internal.wip.protocol.BasicConstants.Domain.CONSOLE + ".addInspectedHeapObject";

  @Override protected String getRequestName() {
    return METHOD_NAME;
  }

}
