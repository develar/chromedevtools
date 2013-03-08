package org.chromium.wip.protocolParser;

import org.jetbrains.jsonProtocol.readerGenerator.ItemDescriptor;
import org.jetbrains.jsonProtocol.readerGenerator.WipMetamodel;

import java.io.IOException;
import java.util.List;

interface ResolveAndGenerateScope {
  String getDomainName();
  TypeData.Direction getTypeDirection();

  <T extends ItemDescriptor> QualifiedTypeData resolveType(T typedObject);

  BoxableType generateNestedObject(String description,
                                   List<WipMetamodel.ObjectProperty> properties) throws IOException;
}
