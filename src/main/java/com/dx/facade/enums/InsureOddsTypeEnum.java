package com.dx.facade.enums;

import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;

import java.util.HashMap;
import java.util.Map;

@ApiModel("保险赔率类型")
public enum InsureOddsTypeEnum {
  TWO_ALLIN(1,"2人allin赔率"),
  THREE_ALLIN(2,"3人allin赔率"),
  FOUR_ALLIN(3,"4人allin赔率"),
  FIVE_ALLIN(4,"5人allin赔率"),
  SIX_ALLIN(5,"6人allin赔率"),
  SEVEN_ALLIN(6,"7人allin赔率"),
  EIGHT_ALLIN(7,"8人allin赔率"),
  NINE_ALLIN(8,"9人allin赔率")
  ;
  @JsonValue
  private int code;
  private String description;

  InsureOddsTypeEnum(int code, String description) {
    this.code = code;
    this.description = description;
  }


  public int code() {
    return code;
  }


  public String description() {
    return description;
  }

  private static final Map<Integer, InsureOddsTypeEnum> MAP;

  static {
    MAP = new HashMap<>();
    for (InsureOddsTypeEnum enums : InsureOddsTypeEnum.values()) {
      MAP.put(enums.code(), enums);
    }
  }

  public static InsureOddsTypeEnum getByCode(Integer code) {
    return MAP.get(code);
  }

}
