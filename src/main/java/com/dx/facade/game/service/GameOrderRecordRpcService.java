package com.dx.facade.game.service;

import com.dx.entity.CommonResp;
import com.dx.entity.PageResp;
import com.dx.facade.game.req.FundDetailReq;
import com.dx.facade.game.req.GameOrderRecordProxyReq;
import com.dx.facade.game.resp.FundDetailRecordResp;
import com.dx.facade.game.resp.FundDetailSumResp;
import com.dx.facade.game.resp.GameOrderRecordProxyResp;

public interface GameOrderRecordRpcService {


  /**
   * 资金明细页的统计数据
   * @param req
   * @return
   */
  CommonResp<FundDetailSumResp> getFundDetailSum(FundDetailReq req);

  /**
   * 资金明细页分页数据
   * @param req
   * @return
   */
  CommonResp<PageResp<FundDetailRecordResp,Void>> getFundDetailRecord(FundDetailReq req);

  /**
   * 游戏记录分页数据
   * @param req
   * @return
   */
  CommonResp<PageResp<GameOrderRecordProxyResp, ?>> getGameRecord(GameOrderRecordProxyReq req);

}
