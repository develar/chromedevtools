package org.chromium.wip.protocolParser;

class DecoratedBoxableType extends BoxableType {
  private final BoxableType original;

  DecoratedBoxableType(BoxableType original) {
    this.original = original;
  }

  @Override
  String getFullText() {
    return original.getFullText();
    //return decorateTypeName(original.getFullText(), typedefJavaType.getFullText());
  }

  @Override
  String getShortText(NamePath contextNamespace) {
    return original.getShortText(contextNamespace);
    //return decorateTypeName(original.getShortText(contextNamespace),
    //                        typedefJavaType.getShortText(contextNamespace));
  }

  @Override
  BoxableType convertToPureReference() {
    BoxableType pureReference = original.convertToPureReference();
    if (pureReference == original) {
      return this;
    }
    else {
      return new DecoratedBoxableType(pureReference);
    }
  }
}
