package org.chromium.wip.protocolParser;

abstract class BoxableType {
  static final BoxableType STRING = new Reference(new NamePath("String"));
  static final BoxableType OBJECT = new Reference(new NamePath("Object"));
  static final BoxableType NUMBER = new Reference(new NamePath("double"));
  static final BoxableType LONG = new Reference(new NamePath("long"));
  static final BoxableType BOOLEAN = new Reference(new NamePath("boolean"));

  public static BoxableType createList(BoxableType itemType) {
    return new ListType(itemType.convertToPureReference());
  }

  abstract String getFullText();

  abstract String getShortText(NamePath contextNamespace);

  abstract BoxableType convertToPureReference();
}