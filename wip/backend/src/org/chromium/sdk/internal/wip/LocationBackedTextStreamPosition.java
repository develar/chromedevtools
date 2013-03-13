package org.chromium.sdk.internal.wip;

import org.chromium.sdk.TextStreamPosition;
import org.jetbrains.wip.protocol.debugger.LocationValue;

public class LocationBackedTextStreamPosition implements TextStreamPosition {
  private final LocationValue position;

  public LocationBackedTextStreamPosition(LocationValue position) {
    this.position = position;
  }

  @Override
  public int getOffset() {
    throw new UnsupportedOperationException();
  }

  @Override
  public int getLine() {
    return position.lineNumber();
  }

  @Override
  public int getColumn() {
    return position.columnNumber();
  }
}
