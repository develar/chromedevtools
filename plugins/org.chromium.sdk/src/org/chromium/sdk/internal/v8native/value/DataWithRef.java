package org.chromium.sdk.internal.v8native.value;

import org.chromium.sdk.internal.v8native.protocol.input.data.SomeRef;
import org.jetbrains.annotations.Nullable;

public abstract class DataWithRef {
  public abstract int ref();

  @Nullable
  public abstract SomeRef getWithDisplayData();

  public static DataWithRef fromValue(final SomeRef someRef) {
    return new DataWithRef() {
      @Override
      public SomeRef getWithDisplayData() {
        return someRef;
      }

      @Override
      public int ref() {
        return someRef.ref();
      }
    };
  }

  public static DataWithRef fromRef(final int ref) {
    return new DataWithRef() {
      @Override
      public SomeRef getWithDisplayData() {
        return null;
      }

      @Override
      public int ref() {
        return ref;
      }
    };
  }
}
