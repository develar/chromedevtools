package org.jetbrains.protocolReader;

abstract class BoxableType {
  static final BoxableType STRING = new StandaloneType(new NamePath("String"), "writeString");
  static final BoxableType OBJECT = new StandaloneType(new NamePath("com.google.gson.stream.JsonReaderEx"), "writeString");
  static final BoxableType INT = new StandaloneType(new NamePath("int"), "writeInt");
  static final BoxableType LONG = new StandaloneType(new NamePath("long"), "writeLong");
  static final BoxableType NUMBER = new StandaloneType(new NamePath("double"), "writeDouble");
  static final BoxableType BOOLEAN = new StandaloneType(new NamePath("boolean"), "writeBoolean");

  public static BoxableType createList(BoxableType itemType) {
    return new ListType(itemType);
  }

  abstract CharSequence getFullText();

  abstract String getShortText(NamePath contextNamespace);

  abstract String getWriteMethodName();
}