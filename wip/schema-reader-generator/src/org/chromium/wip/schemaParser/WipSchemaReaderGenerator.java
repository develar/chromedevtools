package org.chromium.wip.schemaParser;

import org.chromium.protocolparser.DynamicParserImpl;
import org.chromium.protocolparser.ParserGeneratorBase;

public class WipSchemaReaderGenerator extends ParserGeneratorBase {
  public static void main(String[] args) {
    mainImpl(args, new GenerateConfiguration("org.chromium.wip", "WipProtocolSchemaReader",
                                             new DynamicParserImpl<WipMetamodelParser>(true, WipMetamodelParser.class,
                                                                                       WipMetamodel.class.getDeclaredClasses())));
  }
}