package com.dx.facade.enums;

import com.fasterxml.jackson.annotation.JsonValue;

import java.util.HashMap;
import java.util.Map;

public enum RequestSourceEnum {
  GAME_APP(1,"游戏app"),
  PROXT_APP(2,"代理app")
  ;
  @JsonValue
  private int code;
  private String description;

  RequestSourceEnum(int code, String description) {
    this.code = code;
    this.description = description;
  }


  public int code() {
    return code;
  }


  public String description() {
    return description;
  }

  private static final Map<Integer, RequestSourceEnum> MAP;

  static {
    MAP = new HashMap<>();
    for (RequestSourceEnum enums : RequestSourceEnum.values()) {
      MAP.put(enums.code(), enums);
    }
  }

  public static RequestSourceEnum getByCode(Integer code) {
    return MAP.get(code);
  }

}
