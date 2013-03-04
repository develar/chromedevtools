package org.chromium.wip.protocolParser;

import org.chromium.protocolparser.DynamicParserImpl;
import org.chromium.protocolparser.ParserGeneratorBase;
import org.chromium.wip.protocol.input.GeneratedParserInterfaceList;

public class WipParserGenerator extends ParserGeneratorBase {
  public static void main(String[] args) {
    mainImpl(args, new GenerateConfiguration("org.chromium.sdk.internal.wip.protocol",
                                             "GeneratedWipProtocolParser",
                                             new DynamicParserImpl<WipProtocolParser>(true, WipProtocolParser.class,
                                                                                      GeneratedParserInterfaceList.LIST)));
  }
}