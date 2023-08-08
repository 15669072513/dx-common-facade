package com.dx.facade.venue.service;


import com.dx.entity.PageResp;
import com.dx.exception.BizException;
import com.dx.facade.es.resp.GameRecordBetAmountAggregation;
import com.dx.facade.es.resp.GameRecordDto;
import com.dx.facade.venue.req.BettingRecordReq;

/**
 * 游戏注单服务
 */
public interface GameBetRecordService {


    /**
     * 个人中心-资金页-查询个人注单
     *
     * @param req
     * @return
     * @throws BizException
     */
    PageResp<GameRecordDto, GameRecordBetAmountAggregation> betRecordList(BettingRecordReq req) throws BizException;
}
