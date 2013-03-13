// Copyright (c) 2009 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

package org.chromium.sdk.internal.v8native.protocol;

import org.chromium.sdk.Script;
import org.chromium.sdk.Script.Type;
import org.chromium.sdk.internal.JsonUtil;
import org.chromium.sdk.internal.v8native.V8ContextFilter;
import org.chromium.sdk.internal.v8native.protocol.input.data.*;
import org.chromium.sdk.internal.v8native.protocol.output.ScriptsMessage;
import org.chromium.sdk.internal.v8native.value.DataWithRef;
import org.chromium.sdk.internal.v8native.value.PropertyReference;
import org.chromium.sdk.internal.v8native.value.PropertyType;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * A utility class to process V8 debugger messages.
 */
public class V8ProtocolUtil {

  /**
   * Computes a script type given a V8 Long type value
   *
   * @param typeNumber a type designator from a V8 JSON response
   * @return a type corresponding to {@code typeNumber} or {@code null} if
   *         {@code typeNumber == null}
   */
  public static Script.Type getScriptType(int typeNumber) {
    if (typeNumber == -1) {
      return null;
    }
    switch (typeNumber) {
      case ScriptsMessage.SCRIPTS_NORMAL:
        return Type.NORMAL;
      case ScriptsMessage.SCRIPTS_NATIVE:
        return Type.NATIVE;
      case ScriptsMessage.SCRIPTS_EXTENSION:
        return Type.EXTENSION;
      default:
        throw new IllegalArgumentException("unknown script type: " + typeNumber);
    }
  }

  public static int getObjectRef(SomeRef child) {
    if (child == null) {
      return -1;
    }
    return child.ref();
  }


  /**
   * Constructs {@code PropertyReference}s from the specified object, be it in
   * the "original" or "inlineRefs" format.
   *
   * @param handle to get property references from
   * @return an array of PropertyReferences
   */
  public static List<? extends PropertyReference> extractObjectProperties(ObjectValueHandle handle) {
    List<PropertyObject> properties = handle.properties();
    List<PropertyReference> result = new ArrayList<PropertyReference>(properties.size());
    for (PropertyObject property : properties) {
      putMirror(result, property, PropertyNameGetter.SUBPROPERTY);
    }
    return result;
  }

  public static List<? extends PropertyReference> extractObjectInternalProperties(
      ObjectValueHandle handle) {
    List<PropertyReference> objProps = new ArrayList<PropertyReference>(3);
    SomeRef protoObject = handle.protoObject();
    if (protoObject != null) {
      putMirror(objProps, protoObject, PropertyNameGetter.PROTO_OBJECT);
    }
    List<PropertyObject> props = handle.internalProperties();
    if (props != null) {
      for (PropertyObject prop : props) {
        putMirror(objProps, prop, PropertyNameGetter.PRIMITIVE_VALUE);
      }
    }
    return objProps;
  }

  public static List<DataWithRef> extractAllPropertyRefs(ObjectValueHandle handle) {
    final List<PropertyReference> properties = new ArrayList<PropertyReference>();
    properties.addAll(extractObjectProperties(handle));
    properties.addAll(extractObjectInternalProperties(handle));
    return new AbstractList<DataWithRef>() {
      @Override public int size() {
        return properties.size();
      }

      @Override public DataWithRef get(int index) {
        return properties.get(index).getValueObject();
      }
    };
  }

  public static <OBJ> void putMirror(List<PropertyReference> refs, OBJ propertyObject, PropertyNameGetter<OBJ> nameGetter) {
    PropertyReference propertyRef = extractProperty(propertyObject, nameGetter);
    if (propertyRef != null) {
      refs.add(propertyRef);
    }
  }

  /**
   * Constructs one {@code PropertyReference} from the specified object, be it in
   * the "original" or "inlineRefs" format.
   *
   * @param prop json object
   * @param nameGetter name of value property in this prop object, might be null
   * @return PropertyReference or null if we ignore this property
   */
  public static <OBJ> PropertyReference extractProperty(OBJ prop, PropertyNameGetter<OBJ> nameGetter) {
    String name = nameGetter.getName(prop);
    if (name == null || isInternalProperty(name)) {
      return null;
    }

    DataWithRef propValue = nameGetter.getRef(prop);
    int propType = nameGetter.getPropertyType(prop);
    // propType is NORMAL by default
    int propTypeValue = propType != -1 ? propType : PropertyType.NORMAL.value;
    if (propTypeValue == PropertyType.FIELD.value ||
        propTypeValue == PropertyType.CONSTANT_FUNCTION.value ||
        propTypeValue == PropertyType.CALLBACKS.value ||
        propTypeValue == PropertyType.NORMAL.value) {
      return new PropertyReference(name, propValue);
    }
    return null;
  }

  /**
   * @param propertyName the property name to check
   * @return whether the given property name corresponds to an internal V8
   *         property
   */
  public static boolean isInternalProperty(String propertyName) {
    // Chrome can return properties like ".arguments". They should be ignored.
    return propertyName.isEmpty() || propertyName.charAt(0) == '.';
  }

  /**
   * Gets a function name from the given function handle.
   *
   * @param functionObject the function handle
   * @return the actual of inferred function name. Will handle {@code null} or
   *         unnamed functions
   */
  public static String getFunctionName(Map functionObject) {
    if (functionObject == null) {
      return "<unknown>";
    } else {
      String name = getNameOrInferred(functionObject, V8Protocol.LOCAL_NAME);
      if (isNullOrEmpty(name)) {
        return "(anonymous function)";
      } else {
        return name;
      }
    }
  }

  /**
   * Determines if a {@code script} is valid in the current debug context.
   * Returns {@code null} if it is not, otherwise returns {@code script}.
   *
   * @param script to check and, possibly, modify
   * @param refs from the corresponding V8 response
   * @return script with a non-null name if the script is valid, {@code null}
   *         otherwise
   */
  public static ScriptHandle validScript(ScriptHandle script, List<SomeHandle> refs,
      V8ContextFilter contextFilter) {
    int contextRef = getObjectRef(script.context());
    for (SomeHandle ref : refs) {
      if (ref.handle() != contextRef) {
        continue;
      }
      if (!contextFilter.isContextOurs(ref.asContextHandle())) {
        return null;
      }
      return script;
    }
    return null; // good context not found
  }

  private static String getNameOrInferred(Map obj, V8Protocol nameProperty) {
    String name = JsonUtil.getAsString(obj, nameProperty);
    if (isNullOrEmpty(name)) {
      name = JsonUtil.getAsString(obj, V8Protocol.INFERRED_NAME);
    }
    return name;
  }

  private static boolean isNullOrEmpty(String value) {
    return value == null || value.length() == 0;
  }
}
