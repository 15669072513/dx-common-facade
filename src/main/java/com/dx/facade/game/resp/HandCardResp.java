package com.dx.facade.game.resp;

import lombok.Data;

@Data
public class HandCardResp {

  private Integer cardNum;

  /**
   * 改牌标识 0未改 1已改
   */
  private Integer manipulateStatus;
}
