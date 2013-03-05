package org.chromium.wip.protocolParser;

import org.chromium.wip.schemaParser.WipMetamodel;

import java.io.IOException;
import java.util.List;

interface StandaloneTypeBinding {
  BoxableType getJavaType();
  void generate() throws IOException;

  /** @return null if not direction-specific */
  TypeData.Direction getDirection();

  interface Target {
    BoxableType resolve(Target.ResolveContext context);

    interface ResolveContext {
      BoxableType generateNestedObject(String shortName, String description,
                                                 List<WipMetamodel.ObjectProperty> properties) throws IOException;
    }
  }

  class PredefinedTarget implements Target {
    private final BoxableType resolvedType;

    PredefinedTarget(BoxableType resolvedType) {
      this.resolvedType = resolvedType;
    }

    @Override public BoxableType resolve(ResolveContext context) {
      return resolvedType;
    }

    public static final PredefinedTarget STRING = new PredefinedTarget(BoxableType.STRING);
    public static final PredefinedTarget LONG = new PredefinedTarget(BoxableType.LONG);
    public static final PredefinedTarget NUMBER = new PredefinedTarget(BoxableType.NUMBER);
  }

}
