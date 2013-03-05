package org.chromium.wip.protocolParser;

import org.chromium.wip.schemaParser.WipMetamodel;

/**
 * A polymorphopus access to something like property (with name and type).
 */
abstract class PropertyLikeAccess<T> {
  abstract TypedObjectAccess<T> forTypedObject();
  abstract String getName(T obj);

  static final PropertyLikeAccess<WipMetamodel.Parameter> PARAMETER = new PropertyLikeAccess<WipMetamodel.Parameter>() {
    @Override
    TypedObjectAccess<WipMetamodel.Parameter> forTypedObject() {
      return TypedObjectAccess.FOR_PARAMETER;
    }
    @Override String getName(WipMetamodel.Parameter obj) {
      return obj.name();
    }
  };

  static final PropertyLikeAccess<WipMetamodel.ObjectProperty> PROPERTY =
      new PropertyLikeAccess<WipMetamodel.ObjectProperty>() {
    @Override
    TypedObjectAccess<WipMetamodel.ObjectProperty> forTypedObject() {
      return TypedObjectAccess.FOR_OBJECT_PROPERTY;
    }
    @Override String getName(WipMetamodel.ObjectProperty obj) {
      return obj.name();
    }
  };
}
