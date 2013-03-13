package org.jetbrains.v8;

import org.chromium.sdk.internal.transport.Handshaker;
import org.chromium.sdk.internal.transport.LineReader;
import org.chromium.sdk.internal.transport.Message;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.charset.Charset;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;

/**
 * Stateful handshaker implementation for Standalone V8 protocol.
 */
public class StandaloneV8Handshaker implements Handshaker {
  public interface RemoteInfo {
    String getProtocolVersion();
    String getV8VmVersion();
    String getEmbeddingHostName();
  }

  public Future<RemoteInfo> getRemoteInfo() {
    return runnableFuture;
  }

  private final FutureTask<RemoteInfo> runnableFuture =
      new FutureTask<RemoteInfo>(new HandshakeTaks());

  private LineReader input = null;

  public void perform(LineReader input, OutputStream output) throws IOException {
    this.input = input;
    runnableFuture.run();

    // Check for possible exceptions
    try {
      runnableFuture.get();
    } catch (InterruptedException e) {
      throw new RuntimeException(e);
    } catch (ExecutionException e) {
      throw JavascriptVmImpl.newIOException("Failed to perform handshake", e);
    }

  }

  class HandshakeTaks implements Callable<RemoteInfo> {
    public RemoteInfo call() throws IOException {
      final Message message = Message.fromBufferedReader(input, UTF8_CHARSET);
              if (message == null) {
        throw new IOException("End of stream");
      }
      final String protocolVersion = message.getHeader("Protocol-Version", null);
      if (protocolVersion == null) {
        throw new IOException("Absent protocol version");
      }
      final String vmVersion = message.getHeader("V8-Version", null);
      if (vmVersion == null) {
        throw new IOException("Absent V8 VM version");
      }
      return new RemoteInfo() {
        public String getProtocolVersion() {
          return protocolVersion;
        }
        public String getV8VmVersion() {
          return vmVersion;
        }
        public String getEmbeddingHostName() {
          return message.getHeader("Embedding-Host", null);
        }
      };
    }
  }

  private static final Charset UTF8_CHARSET = Charset.forName("UTF-8");
}
