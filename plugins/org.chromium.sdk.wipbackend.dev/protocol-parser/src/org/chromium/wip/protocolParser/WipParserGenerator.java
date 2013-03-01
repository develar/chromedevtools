package org.chromium.wip.protocolParser;

import org.chromium.sdk.internal.protocolparser.JsonProtocolModelParseException;
import org.chromium.sdk.internal.protocolparser.dynamicimpl.DynamicParserImpl;
import org.chromium.sdk.internal.protocolparser.dynamicimpl.ParserGeneratorBase;
import org.chromium.wip.protocol.WipCommandResponse;
import org.chromium.wip.protocol.WipEvent;
import org.chromium.wip.protocol.WipProtocolParser;
import org.chromium.wip.protocol.WipTabList;
import org.chromium.wip.protocol.input.GeneratedParserInterfaceList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WipParserGenerator extends ParserGeneratorBase {
  public static void main(String[] args) throws JsonProtocolModelParseException {
    mainImpl(args, new GenerateConfiguration("org.chromium.sdk.internal.wip.protocol",
                                             "GeneratedWipProtocolParser", create()));
  }

  public static DynamicParserImpl<WipProtocolParser> create() throws JsonProtocolModelParseException {
    Class<?>[] baseTypes = {
      WipEvent.class, WipEvent.Data.class,
      WipCommandResponse.class, WipCommandResponse.Data.class,
      WipCommandResponse.Success.class, WipCommandResponse.Error.class,
      WipCommandResponse.Error.ErrorInfo.class,

      // Tab list protocol interfaces.
      WipTabList.class, WipTabList.TabDescription.class
    };
    Class<?>[] generatedTypes = GeneratedParserInterfaceList.LIST;

    List<Class<?>> classList = new ArrayList<Class<?>>();
    classList.addAll(Arrays.asList(baseTypes));
    classList.addAll(Arrays.asList(generatedTypes));

    return new DynamicParserImpl<WipProtocolParser>(true, WipProtocolParser.class, classList.toArray(new Class[classList.size()]));
  }
}