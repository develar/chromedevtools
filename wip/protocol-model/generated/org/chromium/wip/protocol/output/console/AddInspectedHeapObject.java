// Generated source
package org.chromium.wip.protocol.output.console;

public final class AddInspectedHeapObject extends org.jetbrains.wip.protocol.WipRequest {
  public AddInspectedHeapObject(int heapObjectId) {
    put("heapObjectId", heapObjectId);
  }
  @Override
  public String getMethodName() {
    return "Console.addInspectedHeapObject";
  }
}