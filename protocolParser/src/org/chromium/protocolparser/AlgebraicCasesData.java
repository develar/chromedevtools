package org.chromium.protocolparser;

import java.util.ArrayList;
import java.util.List;

abstract class AlgebraicCasesData {
  protected final List<RefToType<?>> subtypes = new ArrayList<RefToType<?>>();

  List<RefToType<?>> getSubtypes() {
    return subtypes;
  }

  abstract void writeConstructorCodeJava(JavaCodeGenerator.MethodScope methodScope, TextOutput out);

  abstract void writeFields(ClassScope classScope);
}
