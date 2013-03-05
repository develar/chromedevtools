package org.chromium.wip.protocolParser;

abstract class BoxableType {
  public static BoxableType createReference(NamePath namePath) {
    return new Reference(namePath);
  }

  public static BoxableType createList(BoxableType itemType) {
    return new ListType(itemType.convertToPureReference());
  }

  abstract String getFullText();

  abstract String getShortText(NamePath contextNamespace);

  abstract BoxableType convertToPureReference();

  private static class Reference extends BoxableType {
    private final NamePath namePath;

    private Reference(NamePath namePath) {
      this.namePath = namePath;
    }

    String getFullText() {
      return namePath.getFullText();
    }

    String getShortText(NamePath contextNamespace) {
      int nameLength = namePath.getLength();
      int contextLength = contextNamespace.getLength();
      if (nameLength > contextLength) {
        StringBuilder builder = subtractContextRecursively(namePath, nameLength - contextLength, contextNamespace);
        if (builder != null) {
          return builder.toString();
        }
      }
      return namePath.getFullText();
    }

    private static StringBuilder subtractContextRecursively(NamePath namePos, int count, NamePath prefix) {
      if (count > 1) {
        StringBuilder result =
            subtractContextRecursively(namePos.getParent(), count - 1, prefix);
        if (result == null) {
          return null;
        }
        result.append('.');
        result.append(namePos.getLastComponent());
        return result;
      } else {
        String nameComponent = namePos.getLastComponent();
        namePos = namePos.getParent();
        do {
          if (!namePos.getLastComponent().equals(prefix.getLastComponent())) {
            return null;
          }
          namePos = namePos.getParent();
          prefix = prefix.getParent();
        } while (namePos != null);

        StringBuilder result = new StringBuilder();
        result.append(nameComponent);
        return result;
      }
    }

    BoxableType convertToPureReference() {
      return this;
    }
  }

  private static class ListType extends BoxableType {
    private final BoxableType itemType;

    public ListType(BoxableType itemType) {
      this.itemType = itemType;
    }

    @Override String getFullText() {
      if (itemType.getFullText().equals(LONG.getFullText())) {
        return "long[]";
      }
      return "java.util.List<" + itemType.getFullText() + ">";
    }

    @Override String getShortText(NamePath contextNamespace) {
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

  static final BoxableType STRING = createReference(new NamePath("String"));
  static final BoxableType OBJECT = createReference(new NamePath("Object"));
  static final BoxableType NUMBER = createReference(new NamePath("Number"));
  static final BoxableType LONG = createReference(new NamePath("long"));
  static final BoxableType BOOLEAN = createReference(new NamePath("boolean"));
}
