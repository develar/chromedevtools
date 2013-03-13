package org.chromium.protocolparser;

import gnu.trove.TObjectProcedure;

interface GlobalScope {
  String getTypeImplReference(TypeHandler<?> typeHandler);

  String requireFactoryGenerationAndGetName(TypeHandler<?> typeHandler);

  String getTypeImplShortName(TypeHandler<?> typeHandler);

  FileScopeImpl newFileScope(StringBuilder output);

  void forEachTypeFactory(TObjectProcedure<TypeHandler> procedure);
}
