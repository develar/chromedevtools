// This is a generated source.
package org.chromium.wip;

import org.jetbrains.jsonProtocol.*;

import static org.jetbrains.jsonProtocol.JsonReaders.*;
import com.google.gson.stream.JsonReader;
import org.jetbrains.jsonProtocol.readerGenerator.WipMetamodel;
import org.jetbrains.jsonProtocol.readerGenerator.WipMetamodelParser;

import java.io.IOException;

public final class WipProtocolSchemaReader implements WipMetamodelParser {
  @Override
  public WipMetamodel.Root parseRoot(com.google.gson.stream.JsonReader reader) throws IOException {
    return new M6(reader);
  }

  public static final class M0 implements WipMetamodel.ArrayItemType {
    private String _type;
    private String _$ref;
    private java.util.List<WipMetamodel.ObjectProperty> _properties;
    private String _description;
    private boolean _optional;
    private WipMetamodel.ArrayItemType _items;
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
          _properties = readObjectArray(reader, name, new M4F(), true);
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
    public WipMetamodel.ArrayItemType items() {
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
    public java.util.List<WipMetamodel.ObjectProperty> properties() {
      return _properties;
    }
  }

  public static final class M1 implements WipMetamodel.Command {
    private String _name;
    private String _description;
    private java.util.List<WipMetamodel.Parameter> _parameters;
    private java.util.List<WipMetamodel.Parameter> _returns;
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
          _parameters = readObjectArray(reader, name, new M5F(), true);
        }
        else if (name.equals("returns")) {
          _returns = readObjectArray(reader, name, new M5F(), true);
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
    public java.util.List<WipMetamodel.Parameter> returns() {
      return _returns;
    }

    @Override
    public java.util.List<WipMetamodel.Parameter> parameters() {
      return _parameters;
    }

    @Override
    public boolean async() {
      return _async;
    }
  }

  public static final class M2 implements WipMetamodel.Domain {
    private String _domain;
    private String _description;
    private boolean _hidden;
    private java.util.List<WipMetamodel.StandaloneType> _types;
    private java.util.List<WipMetamodel.Command> _commands;
    private java.util.List<WipMetamodel.Event> _events;

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
          _types = readObjectArray(reader, name, new M7F(), true);
        }
        else if (name.equals("commands")) {
          _commands = readObjectArray(reader, name, new M1F(), false);
        }
        else if (name.equals("events")) {
          _events = readObjectArray(reader, name, new M3F(), true);
        }
        else {
          reader.skipValue();
        }
      }
      reader.endObject();
    }

    @Override
    public java.util.List<WipMetamodel.Command> commands() {
      return _commands;
    }

    @Override
    public java.util.List<WipMetamodel.Event> events() {
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
    public java.util.List<WipMetamodel.StandaloneType> types() {
      return _types;
    }
  }

  public static final class M3 implements WipMetamodel.Event {
    private String _name;
    private String _description;
    private java.util.List<WipMetamodel.Parameter> _parameters;
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
          _parameters = readObjectArray(reader, name, new M5F(), true);
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
    public java.util.List<WipMetamodel.Parameter> parameters() {
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

  public static final class M4 implements WipMetamodel.ObjectProperty {
    private String _name;
    private String _type;
    private String _$ref;
    private String _description;
    private boolean _optional;
    private WipMetamodel.ArrayItemType _items;
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
    public WipMetamodel.ArrayItemType items() {
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

  public static final class M5 implements WipMetamodel.Parameter {
    private String _name;
    private String _type;
    private String _$ref;
    private String _description;
    private boolean _optional;
    private WipMetamodel.ArrayItemType _items;
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
    public WipMetamodel.ArrayItemType items() {
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

  public static final class M6 implements WipMetamodel.Root {
    private java.util.List<WipMetamodel.Domain> _domains;
    private WipMetamodel.Version _version;

    public M6(JsonReader reader) throws IOException {
      reader.beginObject();
      while (reader.hasNext()) {
        String name = reader.nextName();
        if (name.equals("domains")) {
          _domains = readObjectArray(reader, name, new M2F(), false);
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
    public java.util.List<WipMetamodel.Domain> domains() {
      return _domains;
    }

    @Override
    public WipMetamodel.Version version() {
      return _version;
    }
  }

  public static final class M7 implements WipMetamodel.StandaloneType {
    private String _type;
    private String _id;
    private java.util.List<WipMetamodel.ObjectProperty> _properties;
    private String _description;
    private WipMetamodel.ArrayItemType _items;
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
          _properties = readObjectArray(reader, name, new M4F(), true);
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
    public WipMetamodel.ArrayItemType items() {
      return _items;
    }

    @Override
    public java.util.List<WipMetamodel.ObjectProperty> properties() {
      return _properties;
    }

    @Override
    public java.lang.String type() {
      return _type;
    }
  }

  public static final class M8 implements WipMetamodel.Version {
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

  static final class M4F extends ObjectFactory<WipMetamodel.ObjectProperty> {
    @Override
    public WipMetamodel.ObjectProperty read(JsonReader reader) throws IOException {
      return new M4(reader);
    }
  }

  static final class M3F extends ObjectFactory<WipMetamodel.Event> {
    @Override
    public WipMetamodel.Event read(JsonReader reader) throws IOException {
      return new M3(reader);
    }
  }

  static final class M7F extends ObjectFactory<WipMetamodel.StandaloneType> {
    @Override
    public WipMetamodel.StandaloneType read(JsonReader reader) throws IOException {
      return new M7(reader);
    }
  }

  static final class M5F extends ObjectFactory<WipMetamodel.Parameter> {
    @Override
    public WipMetamodel.Parameter read(JsonReader reader) throws IOException {
      return new M5(reader);
    }
  }

  static final class M2F extends ObjectFactory<WipMetamodel.Domain> {
    @Override
    public WipMetamodel.Domain read(JsonReader reader) throws IOException {
      return new M2(reader);
    }
  }

  static final class M1F extends ObjectFactory<WipMetamodel.Command> {
    @Override
    public WipMetamodel.Command read(JsonReader reader) throws IOException {
      return new M1(reader);
    }
  }

}