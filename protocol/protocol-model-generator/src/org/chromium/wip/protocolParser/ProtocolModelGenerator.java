package org.chromium.wip.protocolParser;

import com.google.gson.stream.JsonReader;
import org.jetbrains.jsonProtocol.ProtocolSchemaReaderImpl;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;

/**
 * Application that generates WIP interfaces, both input and output according to
 * specification available at
 * "http://svn.webkit.org/repository/webkit/trunk/Source/WebCore/inspector/Inspector.json".
 */
public class ProtocolModelGenerator {
  public static void main(String[] args) throws IOException {
    String outputDir = args[0];
    String schemaUrl = args[1];
    InputStream inputStream = schemaUrl.startsWith("http") ? new URL(schemaUrl).openStream() : new FileInputStream(schemaUrl);
    JsonReader reader = new JsonReader(new InputStreamReader(inputStream));
    new Generator(outputDir, args[2], args[3]).go(new ProtocolSchemaReaderImpl().parseRoot(reader));
    inputStream.close();
  }
}