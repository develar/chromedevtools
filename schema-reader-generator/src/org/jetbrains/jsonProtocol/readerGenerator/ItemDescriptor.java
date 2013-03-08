package org.jetbrains.jsonProtocol.readerGenerator;

import java.util.List;

public interface ItemDescriptor {
  String description();

  String type();

  List<String> getEnum();

  WipMetamodel.ArrayItemType items();

  interface Named extends Referenceable {
    String name();

    boolean optional();
  }

  interface Referenceable extends ItemDescriptor {
    String ref();
  }

  interface Type extends ItemDescriptor {
    List<WipMetamodel.ObjectProperty> properties();
  }
}