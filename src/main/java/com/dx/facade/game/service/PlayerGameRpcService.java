package com.dx.facade.game.service;

import com.dx.entity.CommonResp;
import com.dx.entity.PageResp;
import com.dx.facade.game.req.GameOrderUserSettlementDetailByProxyReq;
import com.dx.facade.game.resp.GameOrderUserSettlementDetailByProxyResp;

public interface PlayerGameRpcService {

  /**
   * 牌桌结算详情rpc
   * @param req
   * @return
   */
  CommonResp<PageResp<GameOrderUserSettlementDetailByProxyResp, ?>> gameOrderUserSettlementByProxyList(
      GameOrderUserSettlementDetailByProxyReq req);
}
