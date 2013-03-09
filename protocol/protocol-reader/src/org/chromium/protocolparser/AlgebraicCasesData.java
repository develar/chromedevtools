package org.chromium.protocolparser;

import java.util.ArrayList;
import java.util.List;

class AlgebraicCasesData {
  protected final List<RefToType<?>> subtypes = new ArrayList<RefToType<?>>();

  List<RefToType<?>> getSubtypes() {
    return subtypes;
  }

  void writeConstructorCodeJava(JavaCodeGenerator.MethodScope methodScope, TextOutput out) {
  }

  void writeFields(ClassScope classScope) {
  }
}
