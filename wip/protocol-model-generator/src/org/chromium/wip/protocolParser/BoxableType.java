package org.chromium.wip.protocolParser;

abstract class BoxableType {
  static final BoxableType STRING = new StandaloneType(new NamePath("String"));
  static final BoxableType OBJECT = new StandaloneType(new NamePath("Object"));
  static final BoxableType NUMBER = new StandaloneType(new NamePath("double"));
  static final BoxableType LONG = new StandaloneType(new NamePath("long"));
  static final BoxableType BOOLEAN = new StandaloneType(new NamePath("boolean"));

  public static BoxableType createList(BoxableType itemType) {
    return new ListType(itemType);
  }

  abstract CharSequence getFullText();

  abstract String getShortText(NamePath contextNamespace);

  abstract String getWriteMethodName();
}