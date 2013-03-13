package org.jetbrains.v8.value;

import org.chromium.sdk.JsVariable;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Contains immutable data about object properties plus lazy-initialized fields that are
 * derived from property data. There can be more fields in user-provided wrapper class.
 */
class BasicPropertyData {
  private final int cacheState;

  private final List<JsVariableImpl> properties;
  private final List<JsVariableImpl> intenalProperties;
  private final SubpropertiesMirror subpropertiesMirror;

  private volatile Map<String, JsVariableImpl> propertyMap;

  BasicPropertyData(int cacheState, List<JsVariableImpl> properties, List<JsVariableImpl> intenalProperties,
                    SubpropertiesMirror subpropertiesMirror) {
    this.cacheState = cacheState;
    this.properties = properties;
    this.intenalProperties = intenalProperties;
    this.subpropertiesMirror = subpropertiesMirror;
  }

  int getCacheState() {
    return cacheState;
  }

  List<JsVariableImpl> getProperties() {
    return properties;
  }

  List<JsVariableImpl> getIntenalProperties() {
    return intenalProperties;
  }

  SubpropertiesMirror getSubpropertiesMirror() {
    return subpropertiesMirror;
  }

  JsVariable getProperty(String name) {
    JsVariableImpl result = findProperty(name, properties);
    return result == null ? findProperty(name, intenalProperties) : result;
  }

  private static JsVariableImpl findProperty(String name, List<JsVariableImpl> properties) {
    for (JsVariableImpl property : properties) {
      if (property.getName().equals(name)) {
        return property;
      }
    }
    return null;
  }

  Map<String, JsVariableImpl> getPropertyMap() {
    // Method is not synchronized -- it's OK if we initialize volatile propertyMap field
    // several times.
    if (propertyMap == null) {
      Map<String, JsVariableImpl> map = new HashMap<String, JsVariableImpl>(properties.size());
      for (JsVariableImpl property : properties) {
        map.put(property.getName(), property);
      }
      // Make synchronized for such not thread-safe methods as entrySet.
      propertyMap = Collections.unmodifiableMap(Collections.synchronizedMap(map));
    }
    return propertyMap;
  }
}
