// Generated source
package org.chromium.wip.protocol.console;

public final class AddInspectedHeapObject extends org.jetbrains.wip.protocol.WipRequest {
  public AddInspectedHeapObject(int heapObjectId) {
    writeInt("heapObjectId", heapObjectId);
  }
  @Override
  public String getMethodName() {
    return "Console.addInspectedHeapObject";
  }
}