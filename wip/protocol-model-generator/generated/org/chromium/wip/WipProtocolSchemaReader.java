// This is a generated source.
package org.chromium.wip;

import com.google.gson.stream.JsonReader;
import org.jetbrains.jsonProtocol.ObjectFactory;

import java.io.IOException;

import static org.jetbrains.jsonProtocol.JsonReaders.*;

public final class WipProtocolSchemaReader implements org.chromium.wip.schemaParser.WipMetamodelParser {
  @Override
  public org.chromium.wip.schemaParser.WipMetamodel.Root parseRoot(com.google.gson.stream.JsonReader reader) throws IOException {
    return new M6(reader);
  }

  public static final class M0 implements org.chromium.wip.schemaParser.WipMetamodel.ArrayItemType {
    private String _type;
    private String _$ref;
    private java.util.List<org.chromium.wip.schemaParser.WipMetamodel.ObjectProperty> _properties;
    private String _description;
    private boolean _optional;
    private org.chromium.wip.schemaParser.WipMetamodel.ArrayItemType _items;
    private java.util.List<String> _enum;

    public M0(JsonReader reader) throws IOException {
      reader.beginObject();
      while (reader.hasNext()) {
        String name = reader.nextName();
        if (name.equals("type")) {
          _type = readString(reader, name);
        }
        else if (name.equals("$ref")) {
          _$ref = readString(reader, name);
        }
        else if (name.equals("properties")) {
          _properties = readObjectArray(reader, name, new M4F());
        }
        else if (name.equals("description")) {
          _description = readString(reader, name);
        }
        else if (name.equals("optional")) {
          _optional = readBoolean(reader, name);
        }
        else if (name.equals("items")) {
          _items = new M0(reader);
        }
        else if (name.equals("enum")) {
          _enum = nextList(reader);
        }
        else {
          reader.skipValue();
        }
      }
      reader.endObject();
    }

    @Override
    public java.util.List<java.lang.String> getEnum() {
      return _enum;
    }

    @Override
    public boolean optional() {
      return _optional;
    }

    @Override
    public java.lang.String description() {
      return _description;
    }

    @Override
    public org.chromium.wip.schemaParser.WipMetamodel.ArrayItemType items() {
      return _items;
    }

    @Override
    public java.lang.String ref() {
      return _$ref;
    }

    @Override
    public java.lang.String type() {
      return _type;
    }

    @Override
    public java.util.List<org.chromium.wip.schemaParser.WipMetamodel.ObjectProperty> properties() {
      return _properties;
    }
  }

  public static final class M1 implements org.chromium.wip.schemaParser.WipMetamodel.Command {
    private String _name;
    private String _description;
    private java.util.List<org.chromium.wip.schemaParser.WipMetamodel.Parameter> _parameters;
    private java.util.List<org.chromium.wip.schemaParser.WipMetamodel.Parameter> _returns;
    private boolean _hidden;
    private boolean _async;

    public M1(JsonReader reader) throws IOException {
      reader.beginObject();
      while (reader.hasNext()) {
        String name = reader.nextName();
        if (name.equals("name")) {
          _name = readString(reader, name);
        }
        else if (name.equals("description")) {
          _description = readString(reader, name);
        }
        else if (name.equals("parameters")) {
          _parameters = readObjectArray(reader, name, new M5F());
        }
        else if (name.equals("returns")) {
          _returns = readObjectArray(reader, name, new M5F());
        }
        else if (name.equals("hidden")) {
          _hidden = readBoolean(reader, name);
        }
        else if (name.equals("async")) {
          _async = readBoolean(reader, name);
        }
        else {
          reader.skipValue();
        }
      }
      reader.endObject();
    }

    @Override
    public boolean hidden() {
      return _hidden;
    }

    @Override
    public java.lang.String description() {
      return _description;
    }

    @Override
    public java.lang.String name() {
      return _name;
    }

    @Override
    public java.util.List<org.chromium.wip.schemaParser.WipMetamodel.Parameter> returns() {
      return _returns;
    }

    @Override
    public java.util.List<org.chromium.wip.schemaParser.WipMetamodel.Parameter> parameters() {
      return _parameters;
    }

    @Override
    public boolean async() {
      return _async;
    }
  }

  public static final class M2 implements org.chromium.wip.schemaParser.WipMetamodel.Domain {
    private String _domain;
    private String _description;
    private boolean _hidden;
    private java.util.List<org.chromium.wip.schemaParser.WipMetamodel.StandaloneType> _types;
    private java.util.List<org.chromium.wip.schemaParser.WipMetamodel.Command> _commands;
    private java.util.List<org.chromium.wip.schemaParser.WipMetamodel.Event> _events;

    public M2(JsonReader reader) throws IOException {
      reader.beginObject();
      while (reader.hasNext()) {
        String name = reader.nextName();
        if (name.equals("domain")) {
          _domain = readString(reader, name);
        }
        else if (name.equals("description")) {
          _description = readString(reader, name);
        }
        else if (name.equals("hidden")) {
          _hidden = readBoolean(reader, name);
        }
        else if (name.equals("types")) {
          _types = readObjectArray(reader, name, new M7F());
        }
        else if (name.equals("commands")) {
          _commands = readObjectArray(reader, name, new M1F());
        }
        else if (name.equals("events")) {
          _events = readObjectArray(reader, name, new M3F());
        }
        else {
          reader.skipValue();
        }
      }
      reader.endObject();
    }

    @Override
    public java.util.List<org.chromium.wip.schemaParser.WipMetamodel.Command> commands() {
      return _commands;
    }

    @Override
    public java.util.List<org.chromium.wip.schemaParser.WipMetamodel.Event> events() {
      return _events;
    }

    @Override
    public boolean hidden() {
      return _hidden;
    }

    @Override
    public java.lang.String description() {
      return _description;
    }

    @Override
    public java.lang.String domain() {
      return _domain;
    }

    @Override
    public java.util.List<org.chromium.wip.schemaParser.WipMetamodel.StandaloneType> types() {
      return _types;
    }
  }

  public static final class M3 implements org.chromium.wip.schemaParser.WipMetamodel.Event {
    private String _name;
    private String _description;
    private java.util.List<org.chromium.wip.schemaParser.WipMetamodel.Parameter> _parameters;
    private boolean _hidden;

    public M3(JsonReader reader) throws IOException {
      reader.beginObject();
      while (reader.hasNext()) {
        String name = reader.nextName();
        if (name.equals("name")) {
          _name = readString(reader, name);
        }
        else if (name.equals("description")) {
          _description = readString(reader, name);
        }
        else if (name.equals("parameters")) {
          _parameters = readObjectArray(reader, name, new M5F());
        }
        else if (name.equals("hidden")) {
          _hidden = readBoolean(reader, name);
        }
        else {
          reader.skipValue();
        }
      }
      reader.endObject();
    }

    @Override
    public java.util.List<org.chromium.wip.schemaParser.WipMetamodel.Parameter> parameters() {
      return _parameters;
    }

    @Override
    public boolean hidden() {
      return _hidden;
    }

    @Override
    public java.lang.String description() {
      return _description;
    }

    @Override
    public java.lang.String name() {
      return _name;
    }
  }

  public static final class M4 implements org.chromium.wip.schemaParser.WipMetamodel.ObjectProperty {
    private String _name;
    private String _type;
    private String _$ref;
    private String _description;
    private boolean _optional;
    private org.chromium.wip.schemaParser.WipMetamodel.ArrayItemType _items;
    private java.util.List<String> _enum;
    private boolean _hidden;

    public M4(JsonReader reader) throws IOException {
      reader.beginObject();
      while (reader.hasNext()) {
        String name = reader.nextName();
        if (name.equals("name")) {
          _name = readString(reader, name);
        }
        else if (name.equals("type")) {
          _type = readString(reader, name);
        }
        else if (name.equals("$ref")) {
          _$ref = readString(reader, name);
        }
        else if (name.equals("description")) {
          _description = readString(reader, name);
        }
        else if (name.equals("optional")) {
          _optional = readBoolean(reader, name);
        }
        else if (name.equals("items")) {
          _items = new M0(reader);
        }
        else if (name.equals("enum")) {
          _enum = nextList(reader);
        }
        else if (name.equals("hidden")) {
          _hidden = readBoolean(reader, name);
        }
        else {
          reader.skipValue();
        }
      }
      reader.endObject();
    }

    @Override
    public java.util.List<java.lang.String> getEnum() {
      return _enum;
    }

    @Override
    public boolean optional() {
      return _optional;
    }

    @Override
    public java.lang.String name() {
      return _name;
    }

    @Override
    public boolean hidden() {
      return _hidden;
    }

    @Override
    public java.lang.String description() {
      return _description;
    }

    @Override
    public org.chromium.wip.schemaParser.WipMetamodel.ArrayItemType items() {
      return _items;
    }

    @Override
    public java.lang.String ref() {
      return _$ref;
    }

    @Override
    public java.lang.String type() {
      return _type;
    }
  }

  public static final class M5 implements org.chromium.wip.schemaParser.WipMetamodel.Parameter {
    private String _name;
    private String _type;
    private String _$ref;
    private String _description;
    private boolean _optional;
    private org.chromium.wip.schemaParser.WipMetamodel.ArrayItemType _items;
    private java.util.List<String> _enum;
    private boolean _hidden;

    public M5(JsonReader reader) throws IOException {
      reader.beginObject();
      while (reader.hasNext()) {
        String name = reader.nextName();
        if (name.equals("name")) {
          _name = readString(reader, name);
        }
        else if (name.equals("type")) {
          _type = readString(reader, name);
        }
        else if (name.equals("$ref")) {
          _$ref = readString(reader, name);
        }
        else if (name.equals("description")) {
          _description = readString(reader, name);
        }
        else if (name.equals("optional")) {
          _optional = readBoolean(reader, name);
        }
        else if (name.equals("items")) {
          _items = new M0(reader);
        }
        else if (name.equals("enum")) {
          _enum = nextList(reader);
        }
        else if (name.equals("hidden")) {
          _hidden = readBoolean(reader, name);
        }
        else {
          reader.skipValue();
        }
      }
      reader.endObject();
    }

    @Override
    public org.chromium.wip.schemaParser.WipMetamodel.ArrayItemType items() {
      return _items;
    }

    @Override
    public java.util.List<java.lang.String> getEnum() {
      return _enum;
    }

    @Override
    public boolean optional() {
      return _optional;
    }

    @Override
    public java.lang.String name() {
      return _name;
    }

    @Override
    public boolean hidden() {
      return _hidden;
    }

    @Override
    public java.lang.String description() {
      return _description;
    }

    @Override
    public java.lang.String ref() {
      return _$ref;
    }

    @Override
    public java.lang.String type() {
      return _type;
    }
  }

  public static final class M6 implements org.chromium.wip.schemaParser.WipMetamodel.Root {
    private java.util.List<org.chromium.wip.schemaParser.WipMetamodel.Domain> _domains;
    private org.chromium.wip.schemaParser.WipMetamodel.Version _version;

    public M6(JsonReader reader) throws IOException {
      reader.beginObject();
      while (reader.hasNext()) {
        String name = reader.nextName();
        if (name.equals("domains")) {
          _domains = readObjectArray(reader, name, new M2F());
        }
        else if (name.equals("version")) {
          _version = new M8(reader);
        }
        else {
          reader.skipValue();
        }
      }
      reader.endObject();
    }

    @Override
    public java.util.List<org.chromium.wip.schemaParser.WipMetamodel.Domain> domains() {
      return _domains;
    }

    @Override
    public org.chromium.wip.schemaParser.WipMetamodel.Version version() {
      return _version;
    }
  }

  public static final class M7 implements org.chromium.wip.schemaParser.WipMetamodel.StandaloneType {
    private String _type;
    private String _id;
    private java.util.List<org.chromium.wip.schemaParser.WipMetamodel.ObjectProperty> _properties;
    private String _description;
    private org.chromium.wip.schemaParser.WipMetamodel.ArrayItemType _items;
    private java.util.List<String> _enum;
    private boolean _hidden;

    public M7(JsonReader reader) throws IOException {
      reader.beginObject();
      while (reader.hasNext()) {
        String name = reader.nextName();
        if (name.equals("type")) {
          _type = readString(reader, name);
        }
        else if (name.equals("id")) {
          _id = readString(reader, name);
        }
        else if (name.equals("properties")) {
          _properties = readObjectArray(reader, name, new M4F());
        }
        else if (name.equals("description")) {
          _description = readString(reader, name);
        }
        else if (name.equals("items")) {
          _items = new M0(reader);
        }
        else if (name.equals("enum")) {
          _enum = nextList(reader);
        }
        else if (name.equals("hidden")) {
          _hidden = readBoolean(reader, name);
        }
        else {
          reader.skipValue();
        }
      }
      reader.endObject();
    }

    @Override
    public java.lang.String id() {
      return _id;
    }

    @Override
    public boolean hidden() {
      return _hidden;
    }

    @Override
    public java.lang.String description() {
      return _description;
    }

    @Override
    public java.util.List<java.lang.String> getEnum() {
      return _enum;
    }

    @Override
    public org.chromium.wip.schemaParser.WipMetamodel.ArrayItemType items() {
      return _items;
    }

    @Override
    public java.util.List<org.chromium.wip.schemaParser.WipMetamodel.ObjectProperty> properties() {
      return _properties;
    }

    @Override
    public java.lang.String type() {
      return _type;
    }
  }

  public static final class M8 implements org.chromium.wip.schemaParser.WipMetamodel.Version {
    private String _major;
    private String _minor;

    public M8(JsonReader reader) throws IOException {
      reader.beginObject();
      while (reader.hasNext()) {
        String name = reader.nextName();
        if (name.equals("major")) {
          _major = readString(reader, name);
        }
        else if (name.equals("minor")) {
          _minor = readString(reader, name);
        }
        else {
          reader.skipValue();
        }
      }
      reader.endObject();
    }

    @Override
    public java.lang.String major() {
      return _major;
    }

    @Override
    public java.lang.String minor() {
      return _minor;
    }
  }

  static final class M3F extends ObjectFactory<org.chromium.wip.schemaParser.WipMetamodel.Event> {
    @Override
    public org.chromium.wip.schemaParser.WipMetamodel.Event read(JsonReader reader) throws IOException {
      return new M3(reader);
    }
  }

  static final class M2F extends ObjectFactory<org.chromium.wip.schemaParser.WipMetamodel.Domain> {
    @Override
    public org.chromium.wip.schemaParser.WipMetamodel.Domain read(JsonReader reader) throws IOException {
      return new M2(reader);
    }
  }

  static final class M7F extends ObjectFactory<org.chromium.wip.schemaParser.WipMetamodel.StandaloneType> {
    @Override
    public org.chromium.wip.schemaParser.WipMetamodel.StandaloneType read(JsonReader reader) throws IOException {
      return new M7(reader);
    }
  }

  static final class M1F extends ObjectFactory<org.chromium.wip.schemaParser.WipMetamodel.Command> {
    @Override
    public org.chromium.wip.schemaParser.WipMetamodel.Command read(JsonReader reader) throws IOException {
      return new M1(reader);
    }
  }

  static final class M4F extends ObjectFactory<org.chromium.wip.schemaParser.WipMetamodel.ObjectProperty> {
    @Override
    public org.chromium.wip.schemaParser.WipMetamodel.ObjectProperty read(JsonReader reader) throws IOException {
      return new M4(reader);
    }
  }

  static final class M5F extends ObjectFactory<org.chromium.wip.schemaParser.WipMetamodel.Parameter> {
    @Override
    public org.chromium.wip.schemaParser.WipMetamodel.Parameter read(JsonReader reader) throws IOException {
      return new M5(reader);
    }
  }

}