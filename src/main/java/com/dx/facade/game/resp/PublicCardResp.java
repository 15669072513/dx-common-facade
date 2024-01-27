package com.dx.facade.game.resp;

import lombok.Data;

@Data
public class PublicCardResp {

  /**
   * 公牌号码
   */
  private Integer cardNum;

  /**
   * 改牌标识 0未改 1已改
   */
  private Integer manipulateStatus;
}
