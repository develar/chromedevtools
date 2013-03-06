// Generated source
package org.chromium.wip.protocol.input.dom;

/**
 * DOM interaction is implemented in terms of mirror objects that represent the actual DOM nodes. DOMNode is a base node mirror type.
 */
@org.chromium.protocolParser.JsonType
public interface NodeValue {
  /**
   * Node identifier that is passed into the rest of the DOM messages as the <code>nodeId</code>. Backend will only push node with given <code>id</code> once. It is aware of all requested nodes and will only fire DOM events for nodes known to the client.
   */
  int nodeId();
  /**
   * <code>Node</code>'s nodeType.
   */
  int nodeType();
  /**
   * <code>Node</code>'s nodeName.
   */
  String nodeName();
  /**
   * <code>Node</code>'s localName.
   */
  String localName();
  /**
   * <code>Node</code>'s nodeValue.
   */
  String nodeValue();
  /**
   * Child count for <code>Container</code> nodes.
   */
  @org.chromium.protocolParser.JsonOptionalField
  int childNodeCount();
  /**
   * Child nodes of this node when requested with children.
   */
  @org.chromium.protocolParser.JsonOptionalField
  java.util.List<org.chromium.wip.protocol.input.dom.NodeValue> children();
  /**
   * Attributes of the <code>Element</code> node in the form of flat array <code>[name1, value1, name2, value2]</code>.
   */
  @org.chromium.protocolParser.JsonOptionalField
  java.util.List<String> attributes();
  /**
   * Document URL that <code>Document</code> or <code>FrameOwner</code> node points to.
   */
  @org.chromium.protocolParser.JsonOptionalField
  String documentURL();
  /**
   * Base URL that <code>Document</code> or <code>FrameOwner</code> node uses for URL completion.
   */
  @org.chromium.protocolParser.JsonOptionalField
  String baseURL();
  /**
   * <code>DocumentType</code>'s publicId.
   */
  @org.chromium.protocolParser.JsonOptionalField
  String publicId();
  /**
   * <code>DocumentType</code>'s systemId.
   */
  @org.chromium.protocolParser.JsonOptionalField
  String systemId();
  /**
   * <code>DocumentType</code>'s internalSubset.
   */
  @org.chromium.protocolParser.JsonOptionalField
  String internalSubset();
  /**
   * <code>Document</code>'s XML version in case of XML documents.
   */
  @org.chromium.protocolParser.JsonOptionalField
  String xmlVersion();
  /**
   * <code>Attr</code>'s name.
   */
  @org.chromium.protocolParser.JsonOptionalField
  String name();
  /**
   * <code>Attr</code>'s value.
   */
  @org.chromium.protocolParser.JsonOptionalField
  String value();
  /**
   * Frame ID for frame owner elements.
   */
  @org.chromium.protocolParser.JsonOptionalField
  String frameId();
  /**
   * Content document for frame owner elements.
   */
  @org.chromium.protocolParser.JsonOptionalField
  org.chromium.wip.protocol.input.dom.NodeValue contentDocument();
  /**
   * Shadow root list for given element host.
   */
  @org.chromium.protocolParser.JsonOptionalField
  java.util.List<org.chromium.wip.protocol.input.dom.NodeValue> shadowRoots();
  /**
   * Content document fragment for template elements
   */
  @org.chromium.protocolParser.JsonOptionalField
  org.chromium.wip.protocol.input.dom.NodeValue templateContent();

}