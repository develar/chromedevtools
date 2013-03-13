package org.jetbrains.jsonProtocol;

import org.jetbrains.protocolReader.DynamicParserImpl;
import org.jetbrains.protocolReader.ReaderGenerator;

public class SchemaReaderGenerator extends ReaderGenerator {
  public static void main(String[] args) {
    mainImpl(args, new GenerateConfiguration("org.jetbrains.jsonProtocol", "ProtocolSchemaReaderImpl",
                                             new DynamicParserImpl<ProtocolSchemaReader>(true, ProtocolSchemaReader.class,
                                                                                         ProtocolMetaModel.class.getDeclaredClasses())));
  }
}