package org.chromium.wip.protocolParser;

import org.chromium.wip.schemaParser.WipMetamodel;

import java.util.List;

interface TypeVisitor<R> {
  R visitRef(String refName);

  R visitBoolean();

  R visitEnum(List<String> enumConstants);

  R visitString();

  R visitInteger();

  R visitNumber();

  R visitArray(WipMetamodel.ArrayItemType items);

  R visitObject(List<WipMetamodel.ObjectProperty> properties);

  R visitUnknown();
}
