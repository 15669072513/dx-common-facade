package com.dx.facade.venue.service;

import com.dx.entity.PageResp;
import com.dx.exception.BizException;
import com.dx.facade.es.resp.GameRecordBetAmountAggregation;
import com.dx.facade.es.resp.GameRecordDto;
import com.dx.facade.es.resp.GameRecordResettlementHisDetailDto;
import com.dx.facade.venue.req.BettingRecordReq;
import com.dx.facade.venue.req.ReSettleRecordReq;

import java.util.List;

/**
 * 游戏注单服务
 */
public interface GameBetRecordService {

    /**
     * 个人中心-资金页-查询个人注单统计信息
     */
    GameRecordBetAmountAggregation betRecordAggregation(BettingRecordReq req) throws BizException;

    /**
     * 个人中心-资金页-查询个人注单
     *
     * @param req
     * @return
     * @throws BizException
     */
    PageResp<GameRecordDto, Void> betRecordList(BettingRecordReq req) throws BizException;

    /**
     * 代理中心-会员管理-查询直属会员游戏记录
     *
     * @param req
     * @return
     * @throws BizException
     */
    PageResp<GameRecordDto, Void> proxyBetRecordList(BettingRecordReq req) throws BizException;

    /**
     * 使用注单ID查询重算注单列表
     *
     * @param req
     * @return
     * @throws BizException
     */
    List<GameRecordResettlementHisDetailDto> betReSettleRecordList(ReSettleRecordReq req) throws BizException;
}
