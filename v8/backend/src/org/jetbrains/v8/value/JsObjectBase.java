// Copyright (c) 2009 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

package org.jetbrains.v8.value;

import org.chromium.sdk.JsFunction;
import org.chromium.sdk.JsObject;
import org.chromium.sdk.JsVariable;
import org.jetbrains.v8.InternalContext;
import org.chromium.sdk.util.AsyncFuture;
import org.chromium.sdk.util.MethodIsBlockingException;

import java.util.*;
import java.util.concurrent.atomic.AtomicReference;

/**
 * A generic implementation of the JsObject interface.
 * @param <D> type of convenience user-provided property-data-holding structure, that always
 *     includes {@link BasicPropertyData} but may also contain other fields that expire when
 *     properties expire
 */
public abstract class JsObjectBase<D> extends JsValueBase implements JsObject {
  private final int ref;
  private final String className;
  private final ValueLoader valueLoader;

  /**
   * Fully qualified name of variable holding this object.
   */
  private final String variableFqn;

  /**
   * Property data in form of {@link AsyncFuture} for property load operation
   * that several threads may access simultaneously. The future gets reinitialized
   * on the next access after cache state was updated.
   */
  private final AtomicReference<AsyncFuture<D>> propertyDataRef = new AtomicReference<AsyncFuture<D>>(null);

  /**
   * This constructor implies the lazy resolution of object properties.
   *
   * @param valueLoader where this instance belongs in
   * @param variableFqn the fully qualified name of the variable holding this object
   */
  JsObjectBase(ValueLoader valueLoader, String variableFqn, ValueMirror mirror) {
    super(mirror);
    this.valueLoader = valueLoader;
    ref = mirror.getRef();
    className = mirror.getClassName();
    this.variableFqn = variableFqn;
  }

  @Override
  public Collection<JsVariableImpl> getProperties() throws MethodIsBlockingException {
    return getBasicPropertyData(true).getProperties();
  }

  @Override
  public Collection<JsVariableImpl> getInternalProperties() throws MethodIsBlockingException {
    return getBasicPropertyData(true).getIntenalProperties();
  }

  @Override
  public String getRefId() {
    if (ref < 0) {
      // Negative handle means that it's transient. We don't expose it.
      return null;
    }
    else {
      return String.valueOf(ref);
    }
  }

  @Override
  public ValueLoader getRemoteValueMapping() {
    return valueLoader;
  }

  public static int parseRefId(String value) {
    return Integer.parseInt(value);
  }

  @Override
  public JsObjectBase<D> asObject() {
    return this;
  }

  @Override
  public JsVariable getProperty(String name) throws MethodIsBlockingException {
    return getBasicPropertyData(true).getProperty(name);
  }

  @Override
  public String getClassName() {
    return className;
  }

  @Override
  public String getValueString() {
    switch (getType()) {
      case TYPE_OBJECT:
      case TYPE_ARRAY:
        return "[" + getClassName() + "]";
      case TYPE_FUNCTION:
        return "[Function]";
      default:
        return "";
    }
  }

  protected InternalContext getInternalContext() {
    return valueLoader.getInternalContext();
  }

  protected int getRef() {
    return ref;
  }

  /**
   * Gets or creates property data. The data have cache timestamp inside and gets recreated
   * if checkFreshness is true and if global timestamp has been updated.
   * @param checkFreshness whether data freshness is to be check against global cache timestamp
   * @return property data wrapped in convenience class as specified by
   *     {@link #wrapBasicData(BasicPropertyData)} method
   */
  protected D getPropertyData(boolean checkFreshness) throws MethodIsBlockingException {
    if (propertyDataRef.get() == null) {
      startPropertyLoadOperation(false, getRemoteValueMapping().getCurrentCacheState());
    }
    else if (checkFreshness) {
      int currentCacheState = getRemoteValueMapping().getCurrentCacheState();
      D result = propertyDataRef.get().getSync();
      BasicPropertyData basicPropertyData = unwrapBasicData(result);
      if (basicPropertyData.getCacheState() == currentCacheState) {
        return result;
      }
      startPropertyLoadOperation(true, currentCacheState);
    }
    return propertyDataRef.get().getSync();
  }

  /**
   * Convenience method that gets property data and returns wrapped {@link BasicPropertyData}.
   */
  protected BasicPropertyData getBasicPropertyData(boolean checkFreshness) throws MethodIsBlockingException {
    return unwrapBasicData(getPropertyData(checkFreshness));
  }

  private void startPropertyLoadOperation(boolean reload, final int currentCacheState) throws MethodIsBlockingException {
    // The operation is blocking, because we will wait for its result anyway.
    // On the other hand there is a post-load job that we need a thread to occupy with.
    AsyncFuture.SyncOperation<D> blockingOperation = new AsyncFuture.SyncOperation<D>() {
      @Override
      protected D runSync() throws MethodIsBlockingException {
        SubpropertiesMirror subpropertiesMirror = getRemoteValueMapping().getOrLoadSubproperties(ref);
        List<JsVariableImpl> properties = wrapProperties(subpropertiesMirror.getProperties());
        List<JsVariableImpl> internalProperties = wrapProperties(subpropertiesMirror.getInternalProperties());
        return wrapBasicData(new BasicPropertyData(currentCacheState, properties,  internalProperties, subpropertiesMirror));
      }

      private List<JsVariableImpl> wrapProperties(List<? extends PropertyReference> propertyRefs) throws MethodIsBlockingException {
        return Collections.unmodifiableList(createPropertiesFromMirror(valueLoader.getOrLoadValueFromRefs(propertyRefs), propertyRefs));
      }
    };
    if (reload) {
      AsyncFuture.reinitializeReference(propertyDataRef, blockingOperation.asAsyncOperation());
    }
    else {
      AsyncFuture.initializeReference(propertyDataRef, blockingOperation.asAsyncOperation());
    }
    blockingOperation.execute();
  }

  /**
   * User-provided method that wraps basic property data in the class of user choice D.
   * User wrapper will be kept by {@link JsObjectBase} and easily accessible when needed,
   * plus it will be dropped when caches become reset.
   * <p>
   * Alternative design would be to require D to extend BasicPropertyData, but we would have
   * to expose all of its constructor parameters in this case.
   */
  protected abstract D wrapBasicData(BasicPropertyData basicPropertyData);

  /**
   * User-provided method that extracts basic property data from user-provided data class.
   */
  protected abstract BasicPropertyData unwrapBasicData(D wrappedBasicData);

  private List<JsVariableImpl> createPropertiesFromMirror(ValueMirror[] mirrorProperties, List<? extends PropertyReference> propertyRefs) {
    // TODO(peter.rybin) Maybe assert that context is valid here
    List<JsVariableImpl> result = new ArrayList<JsVariableImpl>(mirrorProperties.length);
    for (int i = 0; i < mirrorProperties.length; i++) {
      ValueMirror mirror = mirrorProperties[i];
      Object varName = propertyRefs.get(i).getName();
      String fqn = getFullyQualifiedName(varName);
      if (fqn == null) {
        continue;
      }
      String decoratedName = JsVariableImpl.NameDecorator.decorateVarName(varName);
      result.add(new JsVariableImpl(valueLoader, mirror, varName, decoratedName, fqn));
    }
    return result;
  }

  private String getFullyQualifiedName(Object propName) {
    if (variableFqn == null) {
      return null;
    }
    if (propName instanceof String) {
      String propNameStr = (String) propName;
      if (propNameStr.startsWith("")) {
        // ".arguments" is not legal
        return null;
      }
    }
    return variableFqn + JsVariableImpl.NameDecorator.buildAccessSuffix(propName);
  }

  public static class Impl extends JsObjectBase<BasicPropertyData> {
    Impl(ValueLoader valueLoader, String variableFqn, ValueMirror valueState) {
      super(valueLoader, variableFqn, valueState);
    }

    @Override
    public JsArrayImpl asArray() {
      return null;
    }

    @Override
    public JsFunction asFunction() {
      return null;
    }

    @Override
    public String toString() {
      StringBuilder result = new StringBuilder();
      result.append("[JsObject: type=").append(getType());
      try {
        for (JsVariable prop : getProperties()) {
          result.append(',').append(prop);
        }
      } catch (MethodIsBlockingException e) {
        return "[JsObject: Exception in retrieving data]";
      }
      result.append(']');
      return result.toString();
    }

    @Override
    protected BasicPropertyData wrapBasicData(BasicPropertyData basicPropertyData) {
      return basicPropertyData;
    }

    @Override
    protected BasicPropertyData unwrapBasicData(BasicPropertyData additionalPropertyStore) {
      return additionalPropertyStore;
    }
  }
}
