package com.dx.facade.game.service;

import com.dx.entity.CommonResp;
import com.dx.entity.PageResp;
import com.dx.facade.game.req.GameOrderReq;
import com.dx.facade.game.resp.GameOrderResp;

public interface OrderRecordRpcService {


  /**
   * 订单记录列表
   * @param req
   * @return
   */
  CommonResp<PageResp<GameOrderResp, Void>> listPage(GameOrderReq req);


  /**
   * 订单记录详情信息
   * @param id 订单主键id
   * @return
   */
  CommonResp<GameOrderResp> getGameOrder(Long id);
}
