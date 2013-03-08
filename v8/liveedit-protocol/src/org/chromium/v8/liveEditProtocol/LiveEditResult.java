package org.chromium.v8.liveEditProtocol;

import org.chromium.protocolReader.JsonOptionalField;
import org.chromium.protocolReader.JsonType;

import java.util.List;

@JsonType
public interface LiveEditResult {
  OldTreeNode change_tree();
  TextualDiff textual_diff();

  @JsonOptionalField
  String created_script_name();

  @JsonOptionalField
  boolean stack_modified();

  boolean updated();

  @JsonType
  interface TextualDiff {
    int[] chunks();
  }

  @JsonType
  interface OldTreeNode {
    String name();
    String status();
    Positions positions();
    List<OldTreeNode> children();

    @JsonOptionalField
    Positions new_positions();

    @JsonOptionalField
    List<NewTreeNode> new_children();

    @JsonOptionalField
    String status_explanation();
  }

  @JsonType
  interface NewTreeNode {
    String name();
    Positions positions();
    List<NewTreeNode> children();
  }

  @JsonType
  interface Positions {
    long start_position();
    long end_position();
  }
}
