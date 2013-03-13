// Copyright (c) 2011 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

package org.chromium.sdk.internal.v8native.value;

import com.google.gson.stream.JsonReaderEx;
import org.chromium.sdk.JsValue;
import org.chromium.sdk.JsValue.Type;
import org.chromium.sdk.internal.v8native.V8Helper;
import org.chromium.sdk.internal.v8native.protocol.input.data.FunctionValueHandle;
import org.chromium.sdk.internal.v8native.protocol.input.data.ObjectValueHandle;
import org.chromium.sdk.internal.v8native.protocol.input.data.RefWithDisplayData;
import org.chromium.sdk.internal.v8native.protocol.input.data.ValueHandle;
import org.chromium.sdk.internal.v8native.value.LoadableString.Factory;

/**
 * A representation of a datum (value) in the remote JavaScript VM. The class must be immutable.
 * When additional (or more recent) data arrives, new instance should be put into
 * {@link ValueLoader} map.
 */
public abstract class ValueMirror {
  /**
   * Merges to {@link ValueMirror}s into one. Since {@link ValueMirror} is immutable
   * this is the right way to gather data.
   * @return possibly new {@link ValueMirror}, or any of the old ones, making a preference for
   *      'base' parameter.
   */
  static ValueMirror merge(ValueMirror base, ValueMirror alternative) {
    if (base.hasProperties()) {
      if (alternative.hasProperties()) {
        // Fall through.
      } else {
        return base;
      }
    } else {
      if (alternative.hasProperties()) {
        return alternative;
      } else {
        // Fall through.
      }
    }
    int lenDiff = base.getStringLength() - alternative.getStringLength();
    if (lenDiff < 0) {
      return alternative;
    } else {
      return base;
    }
  }

  /**
   * Constructs a {@link ValueMirror} given a V8 debugger object specification if it's possible.
   */
  public static ValueMirror create(RefWithDisplayData refWithDisplayData, Factory loadableStringFactory) {
    final String className = refWithDisplayData.className();
    final String typeString = refWithDisplayData.type();
    final Type type = V8Helper.calculateType(typeString, className, false);
    final JsonReaderEx reader = refWithDisplayData.value();
    return new ValueMirror(refWithDisplayData.ref(), type) {
      @Override
      public String getClassName() {
        return className;
      }

      @Override
      public LoadableString getStringValue() {
        String valueStr;
        if (reader == null) {
          valueStr = typeString; // e.g. "undefined"
        }
        else {
          switch (type) {
            case TYPE_STRING:
            case TYPE_NUMBER:
            case TYPE_REGEXP:
              valueStr = reader.nextString();
              break;

            case TYPE_BOOLEAN:
              valueStr = reader.nextBoolean() ? "true" : "false";
              break;

            case TYPE_NULL:
              valueStr = "null";
              break;

            default:
              throw new UnsupportedOperationException(reader.toString());
          }
        }
        return new LoadableString.Immutable(valueStr);
      }

      @Override
      public boolean hasProperties() {
        return false;
      }

      @Override
      public SubpropertiesMirror getProperties() {
        return null;
      }
    };
  }

  /**
   * Constructs a ValueMirror given a V8 debugger object specification.
   * @param valueHandle containing the object specification from the V8 debugger
   */
  public static ValueMirror create(final ValueHandle valueHandle, final Factory factory) {
    Type type = V8Helper.calculateType(valueHandle.type(), valueHandle.className(), true);
    return new ValueMirror(valueHandle.handle(), type) {
      @Override
      public LoadableString getStringValue() {
        return V8Helper.createLoadableString(valueHandle, factory);
      }

      @Override
      public SubpropertiesMirror getProperties() {
        ObjectValueHandle objectValueHandle = valueHandle.asObject();
        if (objectValueHandle == null) {
          return SubpropertiesMirror.EMPTY;
        }
        // unused
        valueHandle.handle();
        SubpropertiesMirror subpropertiesMirror;
        if (type == Type.TYPE_FUNCTION) {
          FunctionValueHandle functionValueHandle = objectValueHandle.asFunction();
          subpropertiesMirror = new SubpropertiesMirror.FunctionValueBased(functionValueHandle);
        } else {
          subpropertiesMirror = new SubpropertiesMirror.ObjectValueBased(objectValueHandle);
        }
        return subpropertiesMirror;
      }

      @Override
      public boolean hasProperties() {
        return true;
      }

      @Override
      public String getClassName() {
        return valueHandle.className();
      }
    };
  }

  public static ValueMirror create(int ref, Type type, final String className, final LoadableString loadableString, final SubpropertiesMirror subpropertiesMirror) {
    return new ValueMirror(ref, type) {
      @Override
      public String getClassName() {
        return className;
      }

      @Override
      public LoadableString getStringValue() {
        return loadableString;
      }

      @Override
      public SubpropertiesMirror getProperties() {
        return subpropertiesMirror;
      }

      @Override
      public boolean hasProperties() {
        return getProperties() != null;
      }
    };
  }

  private final int ref;
  protected final Type type;

  protected ValueMirror(int ref, Type type) {
    this.ref = ref;
    this.type = type;
  }

  public JsValue.Type getType() {
    return type;
  }

  public abstract SubpropertiesMirror getProperties();

  public int getRef() {
    return ref;
  }

  public abstract LoadableString getStringValue();

  public abstract String getClassName();

  public abstract boolean hasProperties();

  int getStringLength() {
    LoadableString loadableString = getStringValue();
    if (loadableString == null) {
      return 0;
    }
    return loadableString.getCurrentString().length();
  }
}
