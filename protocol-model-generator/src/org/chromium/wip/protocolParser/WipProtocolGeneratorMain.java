package org.chromium.wip.protocolParser;

import com.google.gson.stream.JsonReader;
import org.jetbrains.jsonProtocol.ProtocolSchemaReaderImpl;

import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;

/**
 * Application that generates WIP interfaces, both input and output according to
 * specification available at
 * "http://svn.webkit.org/repository/webkit/trunk/Source/WebCore/inspector/Inspector.json".
 */
public class WipProtocolGeneratorMain {
  public static void main(String[] args) throws IOException {
    String outputDir = args.length == 0 ? "generated" : args[0];
    new Generator(outputDir).go(new ProtocolSchemaReaderImpl().parseRoot(
      new JsonReader(new InputStreamReader(
        new URL("http://svn.webkit.org/repository/webkit/trunk/Source/WebCore/inspector/Inspector.json").openStream()))));
  }
}