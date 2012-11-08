// Copyright (c) 2011 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

package org.chromium.sdk.internal.v8native.value;

import com.google.gson.stream.JsonReader;
import gnu.trove.TLongArrayList;
import gnu.trove.TLongIntHashMap;
import gnu.trove.TLongObjectHashMap;
import org.chromium.sdk.JsValue;
import org.chromium.sdk.RelayOk;
import org.chromium.sdk.SyncCallback;
import org.chromium.sdk.internal.JsonUtil;
import org.chromium.sdk.internal.protocolparser.JsonProtocolParseException;
import org.chromium.sdk.internal.v8native.*;
import org.chromium.sdk.internal.v8native.InternalContext.ContextDismissedCheckedException;
import org.chromium.sdk.internal.v8native.protocol.input.SuccessCommandResponse;
import org.chromium.sdk.internal.v8native.protocol.input.V8ProtocolParserAccess;
import org.chromium.sdk.internal.v8native.protocol.input.data.ObjectValueHandle;
import org.chromium.sdk.internal.v8native.protocol.input.data.RefWithDisplayData;
import org.chromium.sdk.internal.v8native.protocol.input.data.SomeHandle;
import org.chromium.sdk.internal.v8native.protocol.input.data.ValueHandle;
import org.chromium.sdk.internal.v8native.protocol.output.DebuggerMessage;
import org.chromium.sdk.internal.v8native.protocol.output.DebuggerMessageFactory;
import org.chromium.sdk.internal.v8native.protocol.output.LookupMessage;
import org.chromium.sdk.util.GenericCallback;
import org.chromium.sdk.util.MethodIsBlockingException;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Implementation of {@link ValueLoader} that loads data by 'lookup' command and additionally
 * collects data as reported by various addDataToMap methods.
 * <p>V8 typically sends a lot of (unsolicited) data about properties. There could be various
 * strategies about whether to parse and add them into a map or save parsing time and ignore.
 */
public class ValueLoaderImpl extends ValueLoader {
  private final TLongObjectHashMap<ValueMirror> refToMirror = new TLongObjectHashMap<ValueMirror>();

  private final HandleManager specialHandleManager = new HandleManager();

  private final InternalContext context;
  private final LoadableString.Factory loadableStringFactory;

  private final AtomicInteger cacheStateRef = new AtomicInteger(1);

  public ValueLoaderImpl(InternalContext context) {
    this.context = context;
    loadableStringFactory = new StringFactory();
  }

  public LoadableString.Factory getLoadableStringFactory() {
    return loadableStringFactory;
  }

  public HandleManager getSpecialHandleManager() {
    return specialHandleManager;
  }

  @Override
  public void clearCaches() {
    cacheStateRef.incrementAndGet();
    synchronized (refToMirror) {
      refToMirror.clear();
    }
  }

  @Override
  int getCurrentCacheState() {
    return cacheStateRef.get();
  }

  @Override
  public InternalContext getInternalContext() {
    return context;
  }

  public void addHandleFromRefs(SomeHandle handle) {
    if (HandleManager.isSpecialType(handle.type())) {
      specialHandleManager.put(handle.handle(), handle);
    } else {
      ValueHandle valueHandle;
      try {
        valueHandle = handle.asValueHandle();
      } catch (IOException e) {
        throw new RuntimeException(e);
      }
      addDataToMap(valueHandle);
    }
  }

  public ValueMirror addDataToMap(RefWithDisplayData refWithDisplayData) {
    ValueMirror mirror = ValueMirror.create(refWithDisplayData, getLoadableStringFactory());
    return putValueMirrorIntoMapRecursive(mirror);
  }

  public ValueMirror addDataToMap(ValueHandle valueHandle) {
    return putValueMirrorIntoMapRecursive(ValueMirror.create(valueHandle, getLoadableStringFactory()));
  }

  public ValueMirror addDataToMap(Long ref, JsValue.Type type, String className,
      LoadableString loadableString, SubpropertiesMirror subpropertiesMirror) {
    return putValueMirrorIntoMapRecursive(ValueMirror.create(ref, type, className, loadableString, subpropertiesMirror));
  }

  private ValueMirror putValueMirrorIntoMapRecursive(ValueMirror mirror) {
    if (PRE_PARSE_PROPERTIES) {
      SubpropertiesMirror subpropertiesMirror = mirror.getProperties();
      if (subpropertiesMirror != null) {
        subpropertiesMirror.reportAllProperties(this);
      }
    }
    return mergeValueMirrorIntoMap(mirror.getRef(), mirror);
  }

  private ValueMirror mergeValueMirrorIntoMap(long ref, ValueMirror mirror) {
    while (true) {
      ValueMirror old;
      synchronized (refToMirror) {
        old = refToMirror.get(ref);
        if (old == null) {
          refToMirror.put(ref, mirror);
        }
      }
      if (old == null) {
        return mirror;
      }
      ValueMirror merged = ValueMirror.merge(old, mirror);
      if (merged == old) {
        return merged;
      }

      synchronized (refToMirror) {
        ValueMirror currentValue = refToMirror.get(ref);
        if (currentValue != null && currentValue.equals(old)) {
          refToMirror.put(ref, merged);
          return merged;
        }
      }
    }
  }

  private static final boolean PRE_PARSE_PROPERTIES = false;

  /**
   * Looks up {@link ValueMirror} in map, loads them if needed or reloads them
   * if property data is unavailable (or expired).
   */
  @Override
  public SubpropertiesMirror getOrLoadSubproperties(long ref) throws MethodIsBlockingException {
    ValueMirror mirror;
    synchronized (refToMirror) {
      mirror = refToMirror.get(ref);
    }
    SubpropertiesMirror references = mirror == null ? null : mirror.getProperties();
    if (references == null) {
      // need to look up this value again
      TLongArrayList list = new TLongArrayList(1);
      list.add(ref);
      ValueMirror loadedMirror = loadValuesFromRemote(list).get(0);
      references = loadedMirror.getProperties();
      if (references == null) {
        throw new RuntimeException("Failed to load properties");
      }
    }
    return references;
  }

  /**
   * Looks up data for scope on remote in form of scope object handle.
   */
  public ObjectValueHandle loadScopeFields(int scopeNumber,
      DebuggerMessageFactory.ScopeHostParameter host) throws MethodIsBlockingException {
    DebuggerMessage message = DebuggerMessageFactory.scope(scopeNumber, host);

    V8BlockingCallback<ObjectValueHandle> callback = new V8BlockingCallback<ObjectValueHandle>() {
      @Override
      protected ObjectValueHandle handleSuccessfulResponse(
          SuccessCommandResponse response) {
        return readFromScopeResponse(response);
      }
    };

    try {
      return V8Helper.callV8Sync(context, message, callback);
    } catch (ContextDismissedCheckedException e) {
      context.getDebugSession().maybeRethrowContextException(e);
      // or
      return null;
    }
  }

  private ObjectValueHandle readFromScopeResponse(SuccessCommandResponse response) {
    List<SomeHandle> refs = response.refs();
    for (SomeHandle handle : refs) {
      addHandleFromRefs(handle);
    }

    try {
      return response.body().asScopeBody().object();
    } catch (IOException e) {
      throw new ValueLoadException(e);
    }
  }

  /**
   * For each PropertyReference from propertyRefs tries to either: 1. read it from PropertyReference
   * (possibly cached value) or 2. lookup value by refId from remote
   */
  @Override
  public ValueMirror[] getOrLoadValueFromRefs(List<? extends PropertyReference> propertyRefs)
      throws MethodIsBlockingException {
    TLongIntHashMap refToRequestIndex = new TLongIntHashMap() {
      @Override
      public int get(long key) {
        int index = index(key);
        return index < 0 ? -1 : _values[index];
      }
    };
    ValueMirror[] result = new ValueMirror[propertyRefs.size()];
    List<PropertyReference> needsLoading = new ArrayList<PropertyReference>();
    for (int i = 0; i < propertyRefs.size(); i++) {
      PropertyReference property = propertyRefs.get(i);
      DataWithRef dataWithRef = property.getValueObject();
      Long ref = dataWithRef.ref();
      RefWithDisplayData dataWithDisplayData = dataWithRef.getWithDisplayData();
      ValueMirror mirror;
      if (dataWithDisplayData == null) {
        synchronized (refToMirror) {
          mirror = refToMirror.get(ref);
        }
      } else {
        mirror = ValueMirror.create(dataWithDisplayData, loadableStringFactory);
      }
      if (mirror == null) {
        // We don't have the data (enough) right now. We are requesting them from server.
        // There might be simultaneous request for the same value, which is a normal though
        // undesired case.
        int requestPos = refToRequestIndex.get(ref);
        if (requestPos == -1) {
          refToRequestIndex.put(ref, needsLoading.size());
          needsLoading.add(property);
        }
      } else {
        result[i] = mirror;
      }
    }

    if (!needsLoading.isEmpty()) {
      TLongArrayList refIds = getRefIdFromReferences(needsLoading);
      List<ValueMirror> loadedMirrors = loadValuesFromRemote(refIds);
      assert refIds.size() == loadedMirrors.size();
      for (int i = 0; i < propertyRefs.size(); i++) {
        if (result[i] == null) {
          PropertyReference property = propertyRefs.get(i);
          DataWithRef dataWithRef = property.getValueObject();
          result[i] = loadedMirrors.get(refToRequestIndex.get(dataWithRef.ref()));
        }
      }
    }
    return result;
  }

  private static TLongArrayList getRefIdFromReferences(final List<PropertyReference> propertyRefs) {
    TLongArrayList result = new TLongArrayList(propertyRefs.size());
    for (PropertyReference ref : propertyRefs) {
      result.add(ref.getRef());
    }
    return result;
  }

  /**
   * Requests values from remote via "lookup" command. Automatically caches received data.
   * @param propertyRefIds list of ref ids we need to look up
   * @return loaded value mirrors in the same order as in propertyRefIds
   */
  public List<ValueMirror> loadValuesFromRemote(final TLongArrayList propertyRefIds)
      throws MethodIsBlockingException {
    if (propertyRefIds.isEmpty()) {
      return Collections.emptyList();
    }

    DebuggerMessage message = DebuggerMessageFactory.lookup(propertyRefIds, false);

    V8BlockingCallback<List<ValueMirror>> callback =
        new V8BlockingCallback<List<ValueMirror>>() {
      @Override
      protected List<ValueMirror> handleSuccessfulResponse(
          SuccessCommandResponse response) {
        return readResponseFromLookup(response, propertyRefIds);
      }
    };

    try {
      return V8Helper.callV8Sync(context, message, callback);
    } catch (ContextDismissedCheckedException e) {
      context.getDebugSession().maybeRethrowContextException(e);
      // or
      throw new ValueLoadException("Invalid context", e);
    }
  }

  private List<ValueMirror> readResponseFromLookup(
      SuccessCommandResponse successResponse, TLongArrayList propertyRefIds) {
    List<ValueMirror> result = new ArrayList<ValueMirror>(propertyRefIds.size());
    Map body;
    try {
      body = successResponse.body().asLookupMap();
    } catch (IOException e) {
      throw new ValueLoadException(e);
    }
    for (int i = 0; i < propertyRefIds.size(); i++) {
      long ref = propertyRefIds.getQuick(i);
      Map value = JsonUtil.getAsJSON(body, String.valueOf(ref));
      if (value == null) {
        throw new ValueLoadException("Failed to find value for ref=" + ref);
      }
      ValueHandle valueHandle;
      try {
        valueHandle = V8ProtocolParserAccess.get().parseValueHandle((JsonReader) value);
      }
      catch (IOException e) {
        throw new RuntimeException(e);
      }

      long refLong = valueHandle.handle();
      if (refLong != ref) {
        throw new ValueLoadException("Inconsistent ref in response, ref=" + ref);
      }
      ValueMirror mirror = addDataToMap(valueHandle);
      result.add(mirror);
    }
    return result;
  }

  private List<ValueHandle> readResponseFromLookupRaw(SuccessCommandResponse successResponse,
          TLongArrayList propertyRefIds) {
    List<ValueHandle> result = new ArrayList<ValueHandle>(propertyRefIds.size());
    Map body;
    try {
      body = successResponse.body().asLookupMap();
    } catch (IOException e) {
      throw new ValueLoadException(e);
    }
    for (int i = 0; i < propertyRefIds.size(); i++) {
      long ref = propertyRefIds.getQuick(i);
      Map value = JsonUtil.getAsJSON(body, String.valueOf(ref));
      if (value == null) {
        throw new ValueLoadException("Failed to find value for ref=" + ref);
      }
      ValueHandle valueHandle;
      try {
        valueHandle = V8ProtocolParserAccess.get().parseValueHandle((JsonReader) value);
      }
      catch (IOException e) {
        throw new ValueLoadException(e);
      }

      addDataToMap(valueHandle);

      result.add(valueHandle);
    }
    return result;
  }

  private RelayOk relookupValue(long handleId, Long maxLength,
      final GenericCallback<ValueHandle> callback,
      SyncCallback syncCallback) throws ContextDismissedCheckedException {
    final TLongArrayList ids = new TLongArrayList(1);
    ids.add(handleId);
    DebuggerMessage message = new LookupMessage(ids, false, maxLength);

    V8CommandCallbackBase innerCallback = new V8CommandCallbackBase() {
      @Override
      public void success(SuccessCommandResponse successResponse) {
        List<ValueHandle> handleList = readResponseFromLookupRaw(successResponse, ids);
        callback.success(handleList.get(0));
      }
      @Override
      public void failure(String message) {
        callback.failure(new Exception(message));
      }
    };

    return context.sendV8CommandAsync(message, true, innerCallback, syncCallback);
  }

  private class StringFactory implements LoadableString.Factory {
    @Override
    public LoadableString create(ValueHandle handle) {
      final long handleId = handle.handle();
      final LoadedValue initialValue = new LoadedValue(handle);

      return new LoadableString() {
        private final AtomicReference<LoadedValue> valueRef =
            new AtomicReference<LoadedValue>(initialValue);

        @Override
        public String getCurrentString() {
          return valueRef.get().stringValue;
        }

        @Override
        public boolean needsReload() {
          LoadedValue loadedValue = valueRef.get();
          return loadedValue.loadedSize < loadedValue.actualSize;
        }

        @Override
        public RelayOk reloadBigger(final GenericCallback<Void> callback,
            SyncCallback syncCallback) {

          long currentlyLoadedSize = valueRef.get().loadedSize;
          long newRequstedSize = chooseNewMaxStringLength(currentlyLoadedSize);

          GenericCallback<ValueHandle> innerCallback =
              new GenericCallback<ValueHandle>() {
            @Override
            public void success(ValueHandle handle) {
              LoadedValue newLoadedValue = new LoadedValue(handle);
              replaceValue(newLoadedValue);
              if (callback != null) {
                callback.success(null);
              }
            }

            @Override
            public void failure(Exception e) {
              if (callback != null) {
                callback.failure(new Exception(e));
              }
            }
          };

          try {
            return relookupValue(handleId, newRequstedSize, innerCallback, syncCallback);
          } catch (final ContextDismissedCheckedException e) {
            DebugSession debugSession = context.getDebugSession();
            debugSession.maybeRethrowContextException(e);
            // or
            return debugSession.sendLoopbackMessage(new Runnable() {
              @Override
              public void run() {
                if (callback != null) {
                  callback.failure(e);
                }
              }
            }, syncCallback);
          }
        }

        private void replaceValue(LoadedValue newValue) {
          while (true) {
            LoadedValue currentValue = valueRef.get();
            if (currentValue.loadedSize >= newValue.loadedSize) {
              return;
            }
            boolean updated = valueRef.compareAndSet(currentValue, newValue);
            if (updated) {
              return;
            }
          }
        }
        private long chooseNewMaxStringLength(long currentSize) {
          return Math.max(currentSize * 10, 64 * 1024);
        }
      };
    }

    private class LoadedValue {
      final String stringValue;
      final long loadedSize;
      final long actualSize;

      LoadedValue(ValueHandle handle) {
        stringValue = (String) handle.value();
        Long toIndex = handle.toIndex();
        if (toIndex == null) {
          loadedSize = stringValue.length();
          actualSize = loadedSize;
        } else {
          loadedSize = toIndex;
          actualSize = handle.length();
        }
      }
    }
  }
}
