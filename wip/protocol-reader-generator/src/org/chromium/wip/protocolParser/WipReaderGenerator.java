package org.chromium.wip.protocolParser;

import org.chromium.protocolparser.DynamicParserImpl;
import org.chromium.protocolparser.ParserGeneratorBase;
import org.chromium.wip.protocol.input.GeneratedParserInterfaceList;

public class WipReaderGenerator extends ParserGeneratorBase {
  public static void main(String[] args) {
    mainImpl(args, new GenerateConfiguration("org.chromium.wip.protocol", "WipProtocolReaderImpl",
                                             new DynamicParserImpl<WipProtocolReader>(true, WipProtocolReader.class,
                                                                                      GeneratedParserInterfaceList.LIST)));
  }
}