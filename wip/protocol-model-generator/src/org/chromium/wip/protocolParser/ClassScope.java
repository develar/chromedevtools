package org.chromium.wip.protocolParser;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

abstract class ClassScope {
  private final List<DeferredWriter> additionalMemberTexts = new ArrayList<DeferredWriter>(2);
  private final NamePath contextNamespace;
  final DomainGenerator generator;

  ClassScope(DomainGenerator generator, NamePath classNamespace) {
    contextNamespace = classNamespace;
    this.generator = generator;
  }

  protected String getShortClassName() {
    return contextNamespace.getLastComponent();
  }

  String getFullName() {
    return contextNamespace.getFullText();
  }

  NamePath getClassContextNamespace() {
    return contextNamespace;
  }

  void addMember(DeferredWriter deferredWriter) {
    additionalMemberTexts.add(deferredWriter);
  }

  void writeAdditionalMembers(IndentWriter writer) throws IOException {
    for (DeferredWriter deferredWriter : additionalMemberTexts) {
      deferredWriter.writeContent(writer);
    }
  }

  protected abstract TypeData.Direction getTypeDirection();
}
