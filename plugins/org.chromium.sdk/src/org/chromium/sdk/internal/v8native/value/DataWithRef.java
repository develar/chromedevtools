package org.chromium.sdk.internal.v8native.value;

import org.chromium.sdk.internal.v8native.protocol.input.data.RefWithDisplayData;
import org.chromium.sdk.internal.v8native.protocol.input.data.SomeRef;

public abstract class DataWithRef {
  public abstract int ref();

  /** @return data or null */
  public abstract RefWithDisplayData getWithDisplayData();

  public static DataWithRef fromSomeRef(final SomeRef someRef) {
    return new DataWithRef() {
      @Override
      public RefWithDisplayData getWithDisplayData() {
        return someRef.asWithDisplayData();
      }
      @Override
      public int ref() {
        return someRef.ref();
      }
    };
  }
  public static DataWithRef fromLong(final int ref) {
    return new DataWithRef() {
      @Override
      public RefWithDisplayData getWithDisplayData() {
        return null;
      }
      @Override
      public int ref() {
        return ref;
      }
    };
  }
}
