// Generated source
package org.chromium.wip.protocol.output.console;

public final class AddInspectedHeapObjectParams extends org.jetbrains.wip.WipRequest {
  public AddInspectedHeapObjectParams(int heapObjectId) {
    put("heapObjectId", heapObjectId);
  }
  @Override
  public String getMethodName() {
    return "Console.addInspectedHeapObject";
  }
}