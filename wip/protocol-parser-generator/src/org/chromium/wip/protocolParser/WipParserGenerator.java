package org.chromium.wip.protocolParser;

import org.chromium.sdk.internal.protocolparser.JsonProtocolModelParseException;
import org.chromium.sdk.internal.protocolparser.dynamicimpl.DynamicParserImpl;
import org.chromium.sdk.internal.protocolparser.dynamicimpl.ParserGeneratorBase;
import org.chromium.wip.protocol.input.GeneratedParserInterfaceList;

public class WipParserGenerator extends ParserGeneratorBase {
  public static void main(String[] args) throws JsonProtocolModelParseException {
    mainImpl(args, new GenerateConfiguration("org.chromium.sdk.internal.wip.protocol",
                                             "GeneratedWipProtocolParser",
                                             new DynamicParserImpl<WipProtocolParser>(true, WipProtocolParser.class,
                                                                                      GeneratedParserInterfaceList.LIST)));
  }
}