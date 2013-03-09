package org.chromium.protocolparser;

import java.util.ArrayList;
import java.util.List;

class AlgebraicCasesData {
  protected final List<RefToType<?>> subtypes = new ArrayList<RefToType<?>>();

  void writeConstructorCodeJava(JavaCodeGenerator.MethodScope methodScope, TextOutput out) {
  }

  void writeFields(ClassScope classScope) {
  }
}
