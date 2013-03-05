package org.chromium.wip.protocolParser;

import java.io.IOException;
import java.io.Writer;

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

  void writeCode(Writer writer) throws IOException {
    writer.write("  @org.chromium.protocolParser.JsonParseMethod\n");
    writer.write("  " + fullName + " " + nameScheme.getParseMethodName(domain, name) +
        "(com.google.gson.stream.JsonReader reader) throws java.io.IOException;\n");
    writer.write("\n");
  }

  @Override
  public int compareTo(ParserRootInterfaceItem o) {
    return fullName.compareTo(o.fullName);
  }
}
