package org.chromium.wip.protocolParser;

import org.chromium.protocolparser.TextOutput;

import java.io.IOException;

class ParserRootInterfaceItem implements Comparable<ParserRootInterfaceItem> {
  private final String domain;
  private final String name;
  private final ClassNameScheme.Input nameScheme;
  private final String fullName;

  public ParserRootInterfaceItem(String domain, String name, ClassNameScheme.Input nameScheme) {
    this.domain = domain;
    this.name = name;
    this.nameScheme = nameScheme;
    fullName = nameScheme.getFullName(domain, name).getFullText();
  }

  void writeCode(TextOutput out) throws IOException {
    out.append("@org.chromium.protocolReader.JsonParseMethod").newLine();
    out.append(fullName).space().append(nameScheme.getParseMethodName(domain, name));
    out.append("(com.google.gson.stream.JsonReader reader) throws java.io.IOException;").newLine();
  }

  @Override
  public int compareTo(ParserRootInterfaceItem o) {
    return fullName.compareTo(o.fullName);
  }
}
