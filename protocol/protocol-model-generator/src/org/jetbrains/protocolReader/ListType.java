package org.jetbrains.protocolReader;

class ListType extends BoxableType {
  private final BoxableType itemType;

  public ListType(BoxableType itemType) {
    this.itemType = itemType;
  }

  @Override
  String getWriteMethodName() {
    if (itemType == STRING) {
      return "writeStringList";
    }
    else if (itemType == LONG) {
      return "writeLongArray";
    }
    return "writeList";
  }

  @Override
  String getFullText() {
    if (itemType == LONG || itemType == INT) {
      return itemType.getFullText() + "[]";
    }
    return "java.util.List<" + itemType.getFullText() + ">";
  }

  @Override
  String getShortText(NamePath contextNamespace) {
    if (itemType == LONG || itemType == INT) {
      return itemType.getFullText() + "[]";
    }
    return "java.util.List<" + itemType.getShortText(contextNamespace) + ">";
  }
}