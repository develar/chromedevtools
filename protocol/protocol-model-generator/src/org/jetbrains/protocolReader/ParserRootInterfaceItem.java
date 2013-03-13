package org.jetbrains.protocolReader;

import org.jetbrains.protocolReader.TextOutput;
import org.jetbrains.protocolReader.Util;

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
    out.append("(").append(Util.JSON_READER_PARAMETER_DEF).append(")").semi().newLine();
  }

  @Override
  public int compareTo(ParserRootInterfaceItem o) {
    return fullName.compareTo(o.fullName);
  }
}
