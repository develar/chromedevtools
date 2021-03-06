package org.jetbrains.v8.protocol;

import org.chromium.sdk.internal.v8native.protocol.input.data.PropertyObject;
import org.jetbrains.v8.value.DataWithRef;

class SubpropertyNameGetter extends PropertyNameGetter<PropertyObject> {
  @Override
  String getName(PropertyObject ref) {
    return ref.name();
  }

  @Override
  DataWithRef getRef(PropertyObject property) {
    if (property.value() == null) {
      return DataWithRef.fromRef(property.ref());
    }
    else {
      return DataWithRef.fromValue(property.value());
    }
  }

  @Override
  int getPropertyType(PropertyObject property) {
    return property.propertyType();
  }
}
