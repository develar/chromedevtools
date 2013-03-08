package org.chromium.wip.protocolParser;

class StandaloneType extends BoxableType {
  private final NamePath namePath;

  StandaloneType(NamePath namePath) {
    this.namePath = namePath;
  }

  @Override
  String getWriteMethodName() {
    return "put";
  }

  CharSequence getFullText() {
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
      StringBuilder result = subtractContextRecursively(namePos.getParent(), count - 1, prefix);
      if (result == null) {
        return null;
      }
      result.append('.');
      result.append(namePos.getLastComponent());
      return result;
    }
    else {
      String nameComponent = namePos.getLastComponent();
      namePos = namePos.getParent();
      do {
        if (!namePos.getLastComponent().equals(prefix.getLastComponent())) {
          return null;
        }
        namePos = namePos.getParent();
        prefix = prefix.getParent();
      }
      while (namePos != null);

      StringBuilder result = new StringBuilder();
      result.append(nameComponent);
      return result;
    }
  }
}