// Copyright (c) 2009 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

package org.jetbrains.v8;

import gnu.trove.TIntObjectHashMap;
import gnu.trove.TObjectProcedure;
import org.chromium.sdk.Script;
import org.chromium.sdk.Script.Type;
import org.chromium.sdk.internal.ScriptBase.Descriptor;
import org.jetbrains.v8.protocol.V8ProtocolUtil;
import org.chromium.sdk.internal.v8native.protocol.input.data.ScriptHandle;
import org.chromium.sdk.internal.v8native.protocol.input.data.SomeHandle;

import java.util.Collection;
import java.util.HashSet;
import java.util.List;

/**
 * Manages scripts known in the corresponding browser tab.
 */
public class ScriptManager {
  public interface Callback {
    /**
     * This method gets invoked for every script in the manager.
     *
     * @param script to process
     * @return whether other scripts should be processed. If false, the #forEach
     *         method terminates.
     */
    boolean process(Script script);
  }

  private final TIntObjectHashMap<ScriptImpl> idToScript = new TIntObjectHashMap<ScriptImpl>();

  private final V8ContextFilter contextFilter;
  private final DebugSession debugSession;

  ScriptManager(V8ContextFilter contextFilter, DebugSession debugSession) {
    this.contextFilter = contextFilter;
    this.debugSession = debugSession;
  }

  /**
   * Adds a script using a "script" V8 response.
   *
   * @param scriptBody to add the script from
   * @param refs that contain the associated script debug context
   * @return the new script, or {@code null} if the response does not contain
   *         a valid script JSON
   */
  public synchronized Script addScript(ScriptHandle scriptBody, List<SomeHandle> refs) {
    ScriptImpl theScript = findById(scriptBody.id());
    if (theScript == null) {
      Descriptor<Integer> desc = createDescriptor(scriptBody, refs, contextFilter);
      if (desc == null) {
        return null;
      }
      theScript = new ScriptImpl(desc, debugSession);
      idToScript.put(desc.id, theScript);
    }
    if (scriptBody.source() != null) {
      setSourceCode(scriptBody, theScript);
    }

    debugSession.getSessionManager().getDebugEventListener().scriptLoaded(theScript);
    return theScript;
  }

  public void scriptCollected(int scriptId) {
    ScriptImpl script;
    synchronized (this) {
      script = idToScript.remove(scriptId);
      if (script == null) {
        return;
      }
      script.setCollected();
    }
    debugSession.getDebugEventListener().scriptCollected(script);
  }

  /**
   * Associates a source received in a "source" V8 response with the given
   * script.
   *
   * @param body the JSON response body
   * @param script the script to associate the source with
   */
  private static void setSourceCode(ScriptHandle body, ScriptImpl script) {
    String src = body.source();
    if (src == null) {
      return;
    }
    if (script != null) {
      script.setSource(src);
    }
  }

  public ScriptImpl findById(int id) {
    return idToScript.get(id);
  }

  /**
   * Determines whether all scripts added into this manager have associated
   * sources.
   *
   * @return whether all known scripts have associated sources
   */
  public boolean isAllSourcesLoaded() {
    final boolean[] result = new boolean[1];
    result[0] = true;
    forEach(new Callback() {
      public boolean process(Script script) {
        if (!script.hasSource()) {
          result[0] = false;
          return false;
        }
        return true;
      }
    });
    return result[0];
  }

  public Collection<Script> allScripts() {
    final Collection<Script> result = new HashSet<Script>();
    forEach(new Callback() {
      public boolean process(Script script) {
        result.add(script);
        return true;
      }
    });
    return result;
  }

  /**
   * This method allows running the same code for all scripts in the manager. All modifications
   * are blocked for this period of time.
   * @param callback to invoke for every script, until
   *        {@link Callback#process(Script)} returns {@code false}.
   */
  public synchronized void forEach(final Callback callback) {
    idToScript.forEachValue(new TObjectProcedure<ScriptImpl>() {
      @Override
      public boolean execute(ScriptImpl script) {
        return callback.process(script);
      }
    });
  }

  public void reset() {
    idToScript.clear();
  }

  public V8ContextFilter getContextFilter() {
    return contextFilter;
  }

  private static Descriptor<Integer> createDescriptor(ScriptHandle script, List<SomeHandle> refs, V8ContextFilter contextFilter) {
    script = V8ProtocolUtil.validScript(script, refs, contextFilter);
    if (script == null) {
      return null;
    }
    String name = script.name();
    try {
      int scriptType = script.scriptType();
      Type type = V8ProtocolUtil.getScriptType(scriptType);
      if (type == null) {
        return null;
      }
      int id = script.id();
      if (id == -1) {
        throw new RuntimeException("Null script id");
      }
      return new Descriptor<Integer>(type, id, name, script.lineOffset(), script.columnOffset(), script.lineCount());
    }
    catch (Exception ignored) {
      // Not a script object has been passed in.
      return null;
    }
  }
}
