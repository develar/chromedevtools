package org.chromium.wip.protocolParser;

import org.chromium.wip.schemaParser.ItemDescriptor;
import org.chromium.wip.schemaParser.WipMetamodel;

/**
 * A polymorphopus access to something like property (with name and type).
 */
abstract class PropertyLikeAccess<T extends ItemDescriptor.Named> {

  static final PropertyLikeAccess<WipMetamodel.Parameter> PARAMETER = new PropertyLikeAccess<WipMetamodel.Parameter>() {
  };

  static final PropertyLikeAccess<WipMetamodel.ObjectProperty> PROPERTY = new PropertyLikeAccess<WipMetamodel.ObjectProperty>() {
  };
}