package com.dx.facade.enums;

import com.fasterxml.jackson.annotation.JsonValue;

import java.util.HashMap;
import java.util.Map;

public enum TexasGameTypeEnum {
  TEXAS(2001,"德州"),
  SHORT_CARD(2002,"短牌")
  ;
  @JsonValue
  private int code;
  private String description;

  TexasGameTypeEnum(int code, String description) {
    this.code = code;
    this.description = description;
  }


  public int code() {
    return code;
  }


  public String description() {
    return description;
  }

  private static final Map<Integer, TexasGameTypeEnum> MAP;

  static {
    MAP = new HashMap<>();
    for (TexasGameTypeEnum enums : TexasGameTypeEnum.values()) {
      MAP.put(enums.code(), enums);
    }
  }

  public static TexasGameTypeEnum getByCode(Integer code) {
    return MAP.get(code);
  }

}
