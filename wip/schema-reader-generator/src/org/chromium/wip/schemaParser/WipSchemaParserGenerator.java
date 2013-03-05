package org.chromium.wip.schemaParser;

import org.chromium.protocolparser.DynamicParserImpl;
import org.chromium.protocolparser.ParserGeneratorBase;

public class WipSchemaParserGenerator extends ParserGeneratorBase {
  public static void main(String[] args) {
    Class<?>[] classes = {
      WipMetamodel.Root.class,
      WipMetamodel.Version.class,
      WipMetamodel.Domain.class,
      WipMetamodel.Command.class,
      WipMetamodel.Parameter.class,
      WipMetamodel.Event.class,
      WipMetamodel.StandaloneType.class,
      WipMetamodel.ObjectProperty.class,
      WipMetamodel.ArrayItemType.class,
    };
    mainImpl(args, new GenerateConfiguration("org.chromium.sdk.wip.schemaParser", "WipProtocolSchemaParser",
                                             new DynamicParserImpl<WipMetamodelParser>(true, WipMetamodelParser.class,
                                                                                       classes)));
  }
}