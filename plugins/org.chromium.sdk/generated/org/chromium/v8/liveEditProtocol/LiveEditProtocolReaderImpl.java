// This is a generated source.
package org.chromium.v8.liveEditProtocol;

import org.jetbrains.jsonProtocol.*;

import static org.jetbrains.jsonProtocol.JsonReaders.*;
import com.google.gson.stream.JsonReader;
import java.io.IOException;

public final class LiveEditProtocolReaderImpl implements org.chromium.v8.liveEditProtocol.LiveEditProtocolReader {
  @Override
  public org.chromium.v8.liveEditProtocol.LiveEditResult parseLiveEditResult(com.google.gson.stream.JsonReader reader) throws IOException {
    return new M0(reader);
  }

  public static final class M0 implements org.chromium.v8.liveEditProtocol.LiveEditResult {
    private org.chromium.v8.liveEditProtocol.LiveEditResult.OldTreeNode _change_tree;
    private org.chromium.v8.liveEditProtocol.LiveEditResult.TextualDiff _textual_diff;
    private String _created_script_name;
    private boolean _stack_modified;
    private boolean _updated;

    public M0(JsonReader reader) throws IOException {
      reader.beginObject();
      while (reader.hasNext()) {
        String name = reader.nextName();
        if (name.equals("change_tree")) {
          _change_tree = new M2(reader);
        }
        else if (name.equals("textual_diff")) {
          _textual_diff = new M4(reader);
        }
        else if (name.equals("created_script_name")) {
          _created_script_name = readString(reader, name);
        }
        else if (name.equals("stack_modified")) {
          _stack_modified = readBoolean(reader, name);
        }
        else if (name.equals("updated")) {
          _updated = readBoolean(reader, name);
        }
        else {
          reader.skipValue();
        }
      }
      reader.endObject();
    }

    @Override
    public boolean stack_modified() {
      return _stack_modified;
    }

    @Override
    public java.lang.String created_script_name() {
      return _created_script_name;
    }

    @Override
    public org.chromium.v8.liveEditProtocol.LiveEditResult.TextualDiff textual_diff() {
      return _textual_diff;
    }

    @Override
    public org.chromium.v8.liveEditProtocol.LiveEditResult.OldTreeNode change_tree() {
      return _change_tree;
    }

    @Override
    public boolean updated() {
      return _updated;
    }
  }

  public static final class M1 implements org.chromium.v8.liveEditProtocol.LiveEditResult.NewTreeNode {
    private String _name;
    private org.chromium.v8.liveEditProtocol.LiveEditResult.Positions _positions;
    private java.util.List<org.chromium.v8.liveEditProtocol.LiveEditResult.NewTreeNode> _children;

    public M1(JsonReader reader) throws IOException {
      reader.beginObject();
      while (reader.hasNext()) {
        String name = reader.nextName();
        if (name.equals("name")) {
          _name = readString(reader, name);
        }
        else if (name.equals("positions")) {
          _positions = new M3(reader);
        }
        else if (name.equals("children")) {
          _children = readObjectArray(reader, name, new M1F(), false);
        }
        else {
          reader.skipValue();
        }
      }
      reader.endObject();
    }

    @Override
    public java.util.List<org.chromium.v8.liveEditProtocol.LiveEditResult.NewTreeNode> children() {
      return _children;
    }

    @Override
    public java.lang.String name() {
      return _name;
    }

    @Override
    public org.chromium.v8.liveEditProtocol.LiveEditResult.Positions positions() {
      return _positions;
    }
  }

  public static final class M3 implements org.chromium.v8.liveEditProtocol.LiveEditResult.Positions {
    private long _start_position;
    private long _end_position;

    public M3(JsonReader reader) throws IOException {
      reader.beginObject();
      while (reader.hasNext()) {
        String name = reader.nextName();
        if (name.equals("start_position")) {
          _start_position = readLong(reader, name);
        }
        else if (name.equals("end_position")) {
          _end_position = readLong(reader, name);
        }
        else {
          reader.skipValue();
        }
      }
      reader.endObject();
    }

    @Override
    public long end_position() {
      return _end_position;
    }

    @Override
    public long start_position() {
      return _start_position;
    }
  }

  public static final class M2 implements org.chromium.v8.liveEditProtocol.LiveEditResult.OldTreeNode {
    private String _name;
    private org.chromium.v8.liveEditProtocol.LiveEditResult.Positions _positions;
    private java.util.List<org.chromium.v8.liveEditProtocol.LiveEditResult.OldTreeNode> _children;
    private String _status;
    private org.chromium.v8.liveEditProtocol.LiveEditResult.Positions _new_positions;
    private java.util.List<org.chromium.v8.liveEditProtocol.LiveEditResult.NewTreeNode> _new_children;
    private String _status_explanation;

    public M2(JsonReader reader) throws IOException {
      reader.beginObject();
      while (reader.hasNext()) {
        String name = reader.nextName();
        if (name.equals("name")) {
          _name = readString(reader, name);
        }
        else if (name.equals("positions")) {
          _positions = new M3(reader);
        }
        else if (name.equals("children")) {
          _children = readObjectArray(reader, name, new M2F(), false);
        }
        else if (name.equals("status")) {
          _status = readString(reader, name);
        }
        else if (name.equals("new_positions")) {
          _new_positions = new M3(reader);
        }
        else if (name.equals("new_children")) {
          _new_children = readObjectArray(reader, name, new M1F(), true);
        }
        else if (name.equals("status_explanation")) {
          _status_explanation = readString(reader, name);
        }
        else {
          reader.skipValue();
        }
      }
      reader.endObject();
    }

    @Override
    public java.util.List<org.chromium.v8.liveEditProtocol.LiveEditResult.OldTreeNode> children() {
      return _children;
    }

    @Override
    public java.util.List<org.chromium.v8.liveEditProtocol.LiveEditResult.NewTreeNode> new_children() {
      return _new_children;
    }

    @Override
    public org.chromium.v8.liveEditProtocol.LiveEditResult.Positions positions() {
      return _positions;
    }

    @Override
    public org.chromium.v8.liveEditProtocol.LiveEditResult.Positions new_positions() {
      return _new_positions;
    }

    @Override
    public java.lang.String name() {
      return _name;
    }

    @Override
    public java.lang.String status() {
      return _status;
    }

    @Override
    public java.lang.String status_explanation() {
      return _status_explanation;
    }
  }

  public static final class M4 implements org.chromium.v8.liveEditProtocol.LiveEditResult.TextualDiff {
    private int[] _chunks;

    public M4(JsonReader reader) throws IOException {
      reader.beginObject();
      while (reader.hasNext()) {
        String name = reader.nextName();
        if (name.equals("chunks")) {
          _chunks = readIntArray(reader);
        }
        else {
          reader.skipValue();
        }
      }
      reader.endObject();
    }

    @Override
    public int[] chunks() {
      return _chunks;
    }
  }

  static final class M2F extends ObjectFactory<org.chromium.v8.liveEditProtocol.LiveEditResult.OldTreeNode> {
    @Override
    public org.chromium.v8.liveEditProtocol.LiveEditResult.OldTreeNode read(JsonReader reader) throws IOException {
      return new M2(reader);
    }
  }

  static final class M1F extends ObjectFactory<org.chromium.v8.liveEditProtocol.LiveEditResult.NewTreeNode> {
    @Override
    public org.chromium.v8.liveEditProtocol.LiveEditResult.NewTreeNode read(JsonReader reader) throws IOException {
      return new M1(reader);
    }
  }

}