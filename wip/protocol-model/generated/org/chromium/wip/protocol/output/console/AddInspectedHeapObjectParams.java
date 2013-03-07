// Generated source
package org.chromium.wip.protocol.output.console;

public class AddInspectedHeapObjectParams extends org.jetbrains.wip.protocol.WipRequest {
  public AddInspectedHeapObjectParams(int heapObjectId) {
    put("heapObjectId", heapObjectId);
  }
  @Override
  public String getMethodName() {
    return "Console.addInspectedHeapObject";
  }
}