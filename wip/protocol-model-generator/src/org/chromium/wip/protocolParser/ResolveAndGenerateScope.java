package org.chromium.wip.protocolParser;

import org.chromium.wip.schemaParser.ItemDescriptor;
import org.chromium.wip.schemaParser.WipMetamodel;

import java.io.IOException;
import java.util.List;

interface ResolveAndGenerateScope {
  String getDomainName();
  TypeData.Direction getTypeDirection();

  <T extends ItemDescriptor> QualifiedTypeData resolveType(T typedObject);

  BoxableType generateEnum(String description, List<String> enumConstants);
  BoxableType generateNestedObject(String description,
                                   List<WipMetamodel.ObjectProperty> properties) throws IOException;
}
