// Generated source.
// Generator: org.chromium.wip.protocolParser.Generator
package org.chromium.wip.protocol.output.console;

public class AddInspectedHeapObjectParams extends org.jetbrains.wip.protocol.WipParams {
  public AddInspectedHeapObjectParams(long heapObjectId) {
    put("heapObjectId", heapObjectId);
  }
  public static final String METHOD_NAME = org.jetbrains.wip.protocol.BasicConstants.Domain.CONSOLE + ".addInspectedHeapObject";

  @Override
  public String getCommand() {
    return METHOD_NAME;
  }

}