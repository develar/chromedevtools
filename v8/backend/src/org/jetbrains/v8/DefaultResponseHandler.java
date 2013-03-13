package org.jetbrains.v8;

import gnu.trove.THashMap;
import org.jetbrains.v8.processor.AfterCompileProcessor;
import org.jetbrains.v8.processor.BreakpointProcessor;
import org.jetbrains.v8.processor.ScriptCollectedProcessor;
import org.jetbrains.v8.processor.V8EventProcessor;
import org.chromium.sdk.internal.v8native.protocol.DebuggerCommand;
import org.chromium.sdk.internal.v8native.protocol.input.EventNotification;
import org.chromium.sdk.internal.v8native.protocol.input.IncomingMessage;

import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DefaultResponseHandler {

  /** The class logger. */
  private static final Logger LOGGER = Logger.getLogger(DefaultResponseHandler.class.getName());

  /** The breakpoint processor. */
  private final BreakpointProcessor bpp;

  /** The "afterCompile" event processor. */
  private final AfterCompileProcessor afterCompileProcessor;

  /** The "scriptCollected" event processor. */
  private final ScriptCollectedProcessor scriptCollectedProcessor;

  public DefaultResponseHandler(DebugSession debugSession) {
    bpp = new BreakpointProcessor(debugSession);
    afterCompileProcessor = new AfterCompileProcessor(debugSession);
    scriptCollectedProcessor = new ScriptCollectedProcessor(debugSession);
  }

  public void handleResponseWithHandler(IncomingMessage response) {
    EventNotification eventResponse = response.asNotification();
    if (eventResponse == null) {
      // Currently only events are supported.
      return;
    }
    String commandString = eventResponse.event();
    DebuggerCommand command = DebuggerCommand.forString(commandString);
    if (command == null) {
      LOGGER.log(Level.WARNING, "Unknown command in V8 debugger reply JSON: {0}", commandString);
      return;
    }
    ProcessorGetter handlerGetter = commandToEventProcessorGetter.get(command);
    if (handlerGetter == null) {
      return;
    }
    handlerGetter.get(this).messageReceived(eventResponse);
  }

  private static abstract class ProcessorGetter {
    abstract V8EventProcessor get(DefaultResponseHandler instance);
  }

  /**
   * The handlers that should be invoked when certain command responses arrive.
   */
  private static final Map<DebuggerCommand, ProcessorGetter> commandToEventProcessorGetter;

  static {
    commandToEventProcessorGetter = new THashMap<DebuggerCommand, ProcessorGetter>();
    ProcessorGetter bppGetter = new ProcessorGetter() {
      @Override
      BreakpointProcessor get(DefaultResponseHandler instance) {
        return instance.bpp;
      }
    };
    commandToEventProcessorGetter.put(DebuggerCommand.BREAK /* event */, bppGetter);
    commandToEventProcessorGetter.put(DebuggerCommand.EXCEPTION /* event */, bppGetter);
    commandToEventProcessorGetter.put(DebuggerCommand.AFTER_COMPILE /* event */,
                                      new ProcessorGetter() {
                                        @Override
                                        AfterCompileProcessor get(DefaultResponseHandler instance) {
                                          return instance.afterCompileProcessor;
                                        }
                                      });
    commandToEventProcessorGetter.put(DebuggerCommand.SCRIPT_COLLECTED /* event */,
                                      new ProcessorGetter() {
                                        @Override
                                        ScriptCollectedProcessor get(DefaultResponseHandler instance) {
                                          return instance.scriptCollectedProcessor;
                                        }
                                      });
  }
}
