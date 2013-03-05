package org.chromium.wip.protocolParser;

interface Naming {
  ClassNameScheme PARAMS = new ClassNameScheme.Output("Params");
  ClassNameScheme ADDITIONAL_PARAM = new ClassNameScheme.Output("Param");
  ClassNameScheme OUTPUT_TYPEDEF = new ClassNameScheme.Output("Typedef");

  ClassNameScheme.Input COMMAND_DATA = new ClassNameScheme.Input("Data");
  ClassNameScheme.Input EVENT_DATA = new ClassNameScheme.Input("EventData");
  ClassNameScheme INPUT_VALUE = new ClassNameScheme.Input("Value");
  ClassNameScheme INPUT_ENUM = new ClassNameScheme.Input("Enum");
  ClassNameScheme INPUT_TYPEDEF = new ClassNameScheme.Input("Typedef");

  ClassNameScheme COMMON_TYPEDEF = new ClassNameScheme.Common("Typedef");
}
