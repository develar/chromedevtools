package org.jetbrains.v8.protocol;

import org.chromium.sdk.internal.v8native.protocol.input.data.PropertyObject;
import org.chromium.sdk.internal.v8native.protocol.input.data.SomeRef;
import org.jetbrains.v8.value.DataWithRef;

public abstract class PropertyNameGetter<OBJ> {
  /** The name of the "this" object to report as a variable name. */
  public static final PropertyNameGetter<SomeRef> THIS = new SimpleNameGetter("this");
  static final PropertyNameGetter<SomeRef> PROTO_OBJECT = new SimpleNameGetter("__proto__");
  static final PropertyNameGetter<PropertyObject> PRIMITIVE_VALUE = new SubpropertyNameGetter();

  static class SimpleNameGetter extends PropertyNameGetter<SomeRef> {
    private final String name;
    SimpleNameGetter(String name) {
      this.name = name;
    }
    @Override
    String getName(SomeRef ref) {
      return name;
    }
    @Override
    DataWithRef getRef(SomeRef someRef) {
      return DataWithRef.fromValue(someRef);
    }
    @Override
    int getPropertyType(SomeRef someRef) {
      return -1;
    }
  }

  @SuppressWarnings("UnusedDeclaration") static final PropertyNameGetter<PropertyObject>
    LOCAL = new SubpropertyNameGetter() {
    @Override
    String getName(PropertyObject ref) {
      String name = super.getName(ref);
      if (V8ProtocolUtil.isInternalProperty(name)) {
        return null;
      }
      return name;
    }
  };

  public static final PropertyNameGetter<PropertyObject> SUBPROPERTY = new SubpropertyNameGetter();

  abstract DataWithRef getRef(OBJ prop);

  /**
   * @return property name or null if we should skip this property
   */
  abstract String getName(OBJ ref);
  abstract int getPropertyType(OBJ prop);
}
