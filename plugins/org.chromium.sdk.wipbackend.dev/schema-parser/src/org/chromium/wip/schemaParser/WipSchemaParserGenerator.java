package org.chromium.wip.schemaParser;

import org.chromium.sdk.internal.protocolparser.JsonProtocolModelParseException;
import org.chromium.sdk.internal.protocolparser.dynamicimpl.DynamicParserImpl;
import org.chromium.sdk.internal.protocolparser.dynamicimpl.ParserGeneratorBase;

public class WipSchemaParserGenerator extends ParserGeneratorBase {
  public static void main(String[] args) throws JsonProtocolModelParseException {
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
    ParserGeneratorBase.mainImpl(args, new GenerateConfiguration("org.chromium.sdk.wip.schemaParser", "WipProtocolSchemaParser",
                                                                 new DynamicParserImpl<WipMetamodelParser>(true, WipMetamodelParser.class,
                                                                                                           classes)));
  }
}