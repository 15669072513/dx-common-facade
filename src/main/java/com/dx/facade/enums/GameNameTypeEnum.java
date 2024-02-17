package com.dx.facade.enums;

import io.swagger.annotations.ApiModel;
import java.util.Arrays;

@ApiModel("游戏名称类型枚举")
public enum GameNameTypeEnum {

  TEXAS(2001, "德州扑克"),
  SHORT_CARD(2002, "短牌");

  public int getCode() {
    return code;
  }

  public String getDesc() {
    return desc;
  }

  private int code;

  private String desc;

  GameNameTypeEnum(int code, String desc) {
    this.code = code;
    this.desc = desc;
  }

  /**
   * @return
   */
  public static GameNameTypeEnum getByCode(Long code) {
    return Arrays.stream(GameNameTypeEnum.values()).filter(s -> s.getCode() == code).findAny()
            .orElse(null);
  }

  /**
   * @return
   */
  public static GameNameTypeEnum getByCode(Integer code) {
    return Arrays.stream(GameNameTypeEnum.values()).filter(s -> s.getCode() == code).findAny()
            .orElse(null);
  }
}
