package org.jetbrains.jsonProtocol;

import org.chromium.protocolparser.DynamicParserImpl;
import org.chromium.protocolparser.ReaderGenerator;

public class SchemaReaderGenerator extends ReaderGenerator {
  public static void main(String[] args) {
    mainImpl(args, new GenerateConfiguration("org.jetbrains.jsonProtocol", "ProtocolSchemaReaderImpl",
                                             new DynamicParserImpl<ProtocolSchemaReader>(true, ProtocolSchemaReader.class,
                                                                                         ProtocolMetaModel.class.getDeclaredClasses())));
  }
}