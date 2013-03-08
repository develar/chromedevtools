package org.jetbrains.jsonProtocol;

import org.chromium.protocolReader.JsonField;
import org.chromium.protocolReader.JsonOptionalField;
import org.chromium.protocolReader.JsonType;

import java.util.List;

/**
 * Defines schema of WIP metamodel defined in http://svn.webkit.org/repository/webkit/trunk/Source/WebCore/inspector/Inspector.json
 */
public interface ProtocolMetaModel {
  @JsonType
  interface Root {
    @JsonOptionalField
    Version version();

    List<Domain> domains();
  }

  @JsonType
  interface Version {
    String major();
    String minor();
  }

  @JsonType
  interface Domain {
    String domain();

    @JsonOptionalField
    List<StandaloneType> types();

    List<Command> commands();

    @JsonOptionalField
    List<Event> events();

    @JsonOptionalField
    String description();

    @JsonOptionalField
    boolean hidden();
  }

  @JsonType
  interface Command {
    String name();

    @JsonOptionalField
    List<Parameter> parameters();

    @JsonOptionalField
    List<Parameter> returns();

    @JsonOptionalField
    String description();

    @JsonOptionalField
    boolean hidden();

    @JsonOptionalField
    boolean async();
  }

  @JsonType
  interface Parameter extends ItemDescriptor.Named {
    String name();

    @JsonOptionalField
    String type();

    @JsonOptionalField
    ArrayItemType items();

    @JsonField(jsonLiteralName = "enum")
    @JsonOptionalField
    List<String> getEnum();

    @JsonOptionalField
    @JsonField(jsonLiteralName = "$ref")
    String ref();

    @JsonOptionalField
    boolean optional();

    @JsonOptionalField
    String description();

    @JsonOptionalField
    boolean hidden();
  }

  @JsonType
  interface Event {
    String name();

    @JsonOptionalField
    List<Parameter> parameters();

    @JsonOptionalField
    String description();

    @JsonOptionalField
    boolean hidden();
  }

  @JsonType
  interface StandaloneType extends ItemDescriptor.Type {
    String id();

    @JsonOptionalField
    String description();

    String type();

    @JsonOptionalField
    boolean hidden();

    @JsonOptionalField
    List<ObjectProperty> properties();

    @JsonField(jsonLiteralName = "enum")
    @JsonOptionalField
    List<String> getEnum();

    @JsonOptionalField
    ArrayItemType items();
  }


  @JsonType
  interface ArrayItemType extends ItemDescriptor.Type, ItemDescriptor.Referenceable {
    @JsonOptionalField
    String description();

    @JsonOptionalField
    boolean optional();

    @JsonOptionalField
    String type();

    @JsonOptionalField
    ArrayItemType items();

    @JsonField(jsonLiteralName = "$ref")
    @JsonOptionalField
    String ref();

    @JsonField(jsonLiteralName = "enum")
    @JsonOptionalField
    List<String> getEnum();

    @JsonOptionalField
    List<ObjectProperty> properties();
  }

  @JsonType
  interface ObjectProperty extends ItemDescriptor.Named {
    String name();

    @JsonOptionalField
    String description();

    @JsonOptionalField
    boolean optional();

    @JsonOptionalField
    String type();

    @JsonOptionalField
    ArrayItemType items();

    @JsonField(jsonLiteralName = "$ref")
    @JsonOptionalField
    String ref();

    @JsonField(jsonLiteralName = "enum")
    @JsonOptionalField
    List<String> getEnum();

    @JsonOptionalField
    boolean hidden();
  }

  String STRING_TYPE = "string";
  String INTEGER_TYPE = "integer";
  String NUMBER_TYPE = "number";
  String BOOLEAN_TYPE = "boolean";
  String OBJECT_TYPE = "object";
  String ARRAY_TYPE = "array";
  String UNKNOWN_TYPE = "unknown";
  String ANY_TYPE = "any";
}
