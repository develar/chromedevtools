// Generated source
package org.jetbrains.wip.protocol.dom;

/**
 * DOM interaction is implemented in terms of mirror objects that represent the actual DOM nodes. DOMNode is a base node mirror type.
 */
@org.chromium.protocolReader.JsonType
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
  @org.chromium.protocolReader.JsonOptionalField
  int childNodeCount();
  /**
   * Child nodes of this node when requested with children.
   */
  @org.chromium.protocolReader.JsonOptionalField
  java.util.List<org.jetbrains.wip.protocol.dom.NodeValue> children();
  /**
   * Attributes of the <code>Element</code> node in the form of flat array <code>[name1, value1, name2, value2]</code>.
   */
  @org.chromium.protocolReader.JsonOptionalField
  java.util.List<String> attributes();
  /**
   * Document URL that <code>Document</code> or <code>FrameOwner</code> node points to.
   */
  @org.chromium.protocolReader.JsonOptionalField
  String documentURL();
  /**
   * Base URL that <code>Document</code> or <code>FrameOwner</code> node uses for URL completion.
   */
  @org.chromium.protocolReader.JsonOptionalField
  String baseURL();
  /**
   * <code>DocumentType</code>'s publicId.
   */
  @org.chromium.protocolReader.JsonOptionalField
  String publicId();
  /**
   * <code>DocumentType</code>'s systemId.
   */
  @org.chromium.protocolReader.JsonOptionalField
  String systemId();
  /**
   * <code>DocumentType</code>'s internalSubset.
   */
  @org.chromium.protocolReader.JsonOptionalField
  String internalSubset();
  /**
   * <code>Document</code>'s XML version in case of XML documents.
   */
  @org.chromium.protocolReader.JsonOptionalField
  String xmlVersion();
  /**
   * <code>Attr</code>'s name.
   */
  @org.chromium.protocolReader.JsonOptionalField
  String name();
  /**
   * <code>Attr</code>'s value.
   */
  @org.chromium.protocolReader.JsonOptionalField
  String value();
  /**
   * Frame ID for frame owner elements.
   */
  @org.chromium.protocolReader.JsonOptionalField
  String frameId();
  /**
   * Content document for frame owner elements.
   */
  @org.chromium.protocolReader.JsonOptionalField
  org.jetbrains.wip.protocol.dom.NodeValue contentDocument();
  /**
   * Shadow root list for given element host.
   */
  @org.chromium.protocolReader.JsonOptionalField
  java.util.List<org.jetbrains.wip.protocol.dom.NodeValue> shadowRoots();
  /**
   * Content document fragment for template elements
   */
  @org.chromium.protocolReader.JsonOptionalField
  org.jetbrains.wip.protocol.dom.NodeValue templateContent();

}