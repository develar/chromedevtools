package org.chromium.wip.protocolParser;

/**
 * An abstract code writer that supports indents. This approach is an attempt to build
 * purely data-driven writer. In other versions similar interfaces usually had
 * "new line" and "append" separate methods that have to be called in proper order.
 * <p>
 * Here "\t" symbol has a special treatment -- it denotes line start spaces in any
 * fragment. The writer simply replaces it with a necessary number of spaces.
 */
interface IndentWriter {
  void append(String text);

  IndentWriter createInner();

  String INDENT = "  ";
}
