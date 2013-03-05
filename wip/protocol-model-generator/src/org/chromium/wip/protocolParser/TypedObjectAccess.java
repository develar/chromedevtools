package org.chromium.wip.protocolParser;

import org.chromium.wip.schemaParser.WipMetamodel;

import java.util.List;

/**
 * A set of external methods that provides a type-safe polymorphous access
 * to several unrelated types.
 */
abstract class TypedObjectAccess<T> {
  abstract String getDescription(T obj);
  abstract Boolean getOptional(T obj);
  abstract String getRef(T obj);
  abstract List<String> getEnum(T obj);
  abstract String getType(T obj);
  abstract WipMetamodel.ArrayItemType getItems(T obj);
  abstract List<WipMetamodel.ObjectProperty> getProperties(T obj);

  static final TypedObjectAccess<WipMetamodel.Parameter> FOR_PARAMETER = new TypedObjectAccess<WipMetamodel.Parameter>() {
    @Override String getDescription(WipMetamodel.Parameter obj) {
      return obj.description();
    }
    @Override Boolean getOptional(WipMetamodel.Parameter obj) {
      return obj.optional();
    }
    @Override String getRef(WipMetamodel.Parameter obj) {
      return obj.ref();
    }
    @Override List<String> getEnum(WipMetamodel.Parameter obj) {
      return obj.getEnum();
    }
    @Override String getType(WipMetamodel.Parameter obj) {
      return obj.type();
    }
    @Override
    WipMetamodel.ArrayItemType getItems(WipMetamodel.Parameter obj) {
      return obj.items();
    }
    @Override List<WipMetamodel.ObjectProperty> getProperties(WipMetamodel.Parameter obj) {
      return obj.properties();
    }
  };

  static final TypedObjectAccess<WipMetamodel.ObjectProperty> FOR_OBJECT_PROPERTY =
      new TypedObjectAccess<WipMetamodel.ObjectProperty>() {
    @Override String getDescription(WipMetamodel.ObjectProperty obj) {
      return obj.description();
    }
    @Override Boolean getOptional(WipMetamodel.ObjectProperty obj) {
      return obj.optional();
    }
    @Override String getRef(WipMetamodel.ObjectProperty obj) {
      return obj.ref();
    }
    @Override List<String> getEnum(WipMetamodel.ObjectProperty obj) {
      return obj.getEnum();
    }
    @Override String getType(WipMetamodel.ObjectProperty obj) {
      return obj.type();
    }
    @Override
    WipMetamodel.ArrayItemType getItems(WipMetamodel.ObjectProperty obj) {
      return obj.items();
    }
    @Override List<WipMetamodel.ObjectProperty> getProperties(WipMetamodel.ObjectProperty obj) {
      throw new RuntimeException();
    }
  };

  static final TypedObjectAccess<WipMetamodel.ArrayItemType> FOR_ARRAY_ITEM =
      new TypedObjectAccess<WipMetamodel.ArrayItemType>() {
    @Override String getDescription(WipMetamodel.ArrayItemType obj) {
      return obj.description();
    }
    @Override Boolean getOptional(WipMetamodel.ArrayItemType obj) {
      return obj.optional();
    }
    @Override String getRef(WipMetamodel.ArrayItemType obj) {
      return obj.ref();
    }
    @Override List<String> getEnum(WipMetamodel.ArrayItemType obj) {
      return obj.getEnum();
    }
    @Override String getType(WipMetamodel.ArrayItemType obj) {
      return obj.type();
    }
    @Override
    WipMetamodel.ArrayItemType getItems(WipMetamodel.ArrayItemType obj) {
      return obj.items();
    }
    @Override List<WipMetamodel.ObjectProperty> getProperties(WipMetamodel.ArrayItemType obj) {
      return obj.properties();
    }
  };

  static final TypedObjectAccess<WipMetamodel.StandaloneType> FOR_STANDALONE =
      new TypedObjectAccess<WipMetamodel.StandaloneType>() {
    @Override String getDescription(WipMetamodel.StandaloneType obj) {
      return obj.description();
    }
    @Override Boolean getOptional(WipMetamodel.StandaloneType obj) {
      return null;
    }
    @Override String getRef(WipMetamodel.StandaloneType obj) {
      return null;
    }
    @Override List<String> getEnum(WipMetamodel.StandaloneType obj) {
      return obj.getEnum();
    }
    @Override String getType(WipMetamodel.StandaloneType obj) {
      return obj.type();
    }
    @Override
    WipMetamodel.ArrayItemType getItems(WipMetamodel.StandaloneType obj) {
      return obj.items();
    }
    @Override List<WipMetamodel.ObjectProperty> getProperties(WipMetamodel.StandaloneType obj) {
      return obj.properties();
    }
  };
}
