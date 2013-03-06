package org.chromium.wip.protocolParser;

class ListType extends BoxableType {
  private final BoxableType itemType;

  public ListType(BoxableType itemType) {
    this.itemType = itemType;
  }

  @Override
  String getFullText() {
    if (itemType.getFullText().equals(LONG.getFullText())) {
      return "long[]";
    }
    return "java.util.List<" + itemType.getFullText() + ">";
  }

  @Override
  String getShortText(NamePath contextNamespace) {
    if (itemType.getFullText().equals(LONG.getFullText())) {
      return "long[]";
    }
    return "java.util.List<" + itemType.getShortText(contextNamespace) + ">";
  }

  @Override
  BoxableType convertToPureReference() {
    return this;
  }
}
