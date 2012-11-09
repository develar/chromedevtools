package org.chromium.sdk.internal.protocolparser.dynamicimpl;

import org.chromium.sdk.internal.protocolparser.JsonProtocolParseException;

import java.util.List;
import java.util.Map;

abstract class AlgebraicCasesData {
  abstract void parseObjectSubtype(ObjectData objectData, Map<?, ?> jsonProperties, Object input) throws JsonProtocolParseException;

  abstract List<RefToType<?>> getSubtypes();

  abstract void writeConstructorCodeJava(JavaCodeGenerator.MethodScope methodScope);

  abstract void writeFiledsJava(JavaCodeGenerator.ClassScope classScope);
}
