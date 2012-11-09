package org.chromium.sdk.internal.protocolparser.dynamicimpl;

import java.util.List;

abstract class AlgebraicCasesData {

  abstract List<RefToType<?>> getSubtypes();

  abstract void writeConstructorCodeJava(JavaCodeGenerator.MethodScope methodScope);

  abstract void writeFiledsJava(JavaCodeGenerator.ClassScope classScope);
}
