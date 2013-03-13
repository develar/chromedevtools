package org.jetbrains.protocolReader;

import com.google.gson.stream.JsonReaderEx;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.jsonProtocol.ProtocolSchemaReaderImpl;

import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.nio.charset.StandardCharsets;

/**
 * Application that generates WIP interfaces, both input and output according to
 * specification available at
 * "http://svn.webkit.org/repository/webkit/trunk/Source/WebCore/inspector/Inspector.json".
 */
public class ProtocolModelGenerator {
  public static void main(String[] args) throws IOException {
    String outputDir = args[0];
    String schemaUrl = args[1];
    //noinspection IOResourceOpenedButNotSafelyClosed
    InputStream inputStream = schemaUrl.startsWith("http") ? new URL(schemaUrl).openStream() : new FileInputStream(schemaUrl);
    @SuppressWarnings("Since15")
    JsonReaderEx reader = new JsonReaderEx(new String(loadBytes(inputStream), StandardCharsets.UTF_8));
    reader.setLenient(true);
    new Generator(outputDir, args[2], args[3]).go(new ProtocolSchemaReaderImpl().parseRoot(reader));
    inputStream.close();
  }

  @NotNull
  public static byte[] loadBytes(@NotNull InputStream stream) throws IOException {
    ByteArrayOutputStream buffer = new ByteArrayOutputStream();
    final byte[] bytes = new byte[1024 * 20];
    while (true) {
      int n = stream.read(bytes, 0, bytes.length);
      if (n <= 0) break;
      buffer.write(bytes, 0, n);
    }
    buffer.close();
    return buffer.toByteArray();
  }
}