package org.chromium.wip.protocolReader;

import org.jetbrains.protocolReader.DynamicParserImpl;
import org.jetbrains.protocolReader.ReaderGenerator;
import org.chromium.wip.protocol.GeneratedReaderInterfaceList;
import org.jetbrains.wip.protocol.WipProtocolReader;

import java.io.IOException;

public class WipReaderGenerator extends ReaderGenerator {
  public static void main(String[] args) throws IOException {
    mainImpl(args, new GenerateConfiguration("org.chromium.wip.protocol", "WipProtocolReaderImpl",
                                             new DynamicParserImpl<WipProtocolReader>(WipProtocolReader.class,
                                                                                      GeneratedReaderInterfaceList.LIST)));
  }
}