package com.dx.facade.game.service;

import com.dx.entity.CommonResp;
import com.dx.entity.PageResp;
import com.dx.facade.game.dto.game.GameOrderRecordUserNetChipSumReqDto;
import com.dx.facade.game.req.GameOrderRecordUserNetChipSumReq;
import com.dx.facade.game.req.GameOrderUserTableSumReq;
import com.dx.facade.game.req.UserTableReq;
import com.dx.facade.game.resp.GameOrderUserTableSumResp;
import com.dx.facade.game.resp.gamedetail.GameOrderRecordDetail;

import java.util.List;

public interface UserTableAggRpcService {


    /**
     * 查询当前会员参与的所有牌桌ID
     * @param userTableReq
     * @return
     */
    CommonResp<List<Long>> getUserTableListByUserId(UserTableReq userTableReq);

    /**
     * 盈亏总额
     * @param req
     * @return
     */
    CommonResp<GameOrderRecordUserNetChipSumReqDto> userNetAmountSummary(GameOrderRecordUserNetChipSumReq req);

    /**
     * 查询战绩列表
     * @param orderUserTableSumReq
     * @return
     */
    CommonResp<PageResp<GameOrderUserTableSumResp, ?>> queryGameOrderUserTableSumList(GameOrderUserTableSumReq orderUserTableSumReq);

    /**
     * 查询战绩详情聚合
     * @param tableId
     * @return
     */
    CommonResp<GameOrderRecordDetail.GameOrderRecordSummary> getGameOrderRecordSummary(Long tableId);


    /**
     * 查询战绩详情
     * @param tableId
     * @return
     */
    CommonResp<List<GameOrderRecordDetail.GameOrderRecord>> getGameOrderPlayerRecords(Long tableId);


}
