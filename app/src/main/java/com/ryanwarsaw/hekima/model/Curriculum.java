package com.ryanwarsaw.hekima.model;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.ToString;

@ToString
@Getter(AccessLevel.PUBLIC)
public class Curriculum {

  @SerializedName("version")
  public int version;

  @SerializedName("weeks")
  public List<Week> weeks;
}
