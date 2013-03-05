package org.chromium.wip.protocolParser;

import org.chromium.wip.schemaParser.WipMetamodel;

import java.io.IOException;
import java.util.List;

interface ResolveAndGenerateScope {
  String getDomainName();
  TypeData.Direction getTypeDirection();

  <T> QualifiedTypeData resolveType(T typedObject, TypedObjectAccess<T> access);

  BoxableType generateEnum(String description, List<String> enumConstants);
  BoxableType generateNestedObject(String description,
                                   List<WipMetamodel.ObjectProperty> properties) throws IOException;
}
