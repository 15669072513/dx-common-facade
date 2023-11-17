package com.dx.facade.enums;

import com.fasterxml.jackson.annotation.JsonValue;

import java.util.HashMap;
import java.util.Map;

public enum GameServiceChargeTypeEnum {
  POT_SCALE(1,"按底池比例"),
  PROFIT_SCALE(2,"按盈利比例");
  @JsonValue
  private int code;
  private String description;

  GameServiceChargeTypeEnum(int code, String description) {
    this.code = code;
    this.description = description;
  }


  public int code() {
    return code;
  }


  public String description() {
    return description;
  }

  private static final Map<Integer, GameServiceChargeTypeEnum> MAP;

  static {
    MAP = new HashMap<>();
    for (GameServiceChargeTypeEnum enums : GameServiceChargeTypeEnum.values()) {
      MAP.put(enums.code(), enums);
    }
  }

  public static GameServiceChargeTypeEnum getByCode(Integer code) {
    return MAP.get(code);
  }

  public int getCode() {
    return code;
  }

  public void setCode(int code) {
    this.code = code;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }
}
