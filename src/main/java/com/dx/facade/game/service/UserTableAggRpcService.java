package com.dx.facade.game.service;

import com.dx.entity.CommonResp;
import com.dx.facade.game.req.GameOrderUserTableSumReq;
import com.dx.facade.game.req.RecordDetailReq;
import com.dx.facade.game.req.UserTableReq;
import com.dx.facade.game.resp.UserTableAggListResp;

import java.util.List;

public interface UserTableAggRpcService {


    /**
     * 查询当前会员参与的所有牌桌ID
     * @param userTableReq
     * @return
     */
    CommonResp<List<Long>> getUserTableListByUserId(UserTableReq userTableReq);

    /**
     * 查询战绩列表
     * @param orderUserTableSumReq
     * @return
     */
    CommonResp<List<UserTableAggListResp>> queryGameOrderUserTableSumList(GameOrderUserTableSumReq orderUserTableSumReq);

    /**
     * 查询战绩详情
     * @param recordDetailReq
     * @return
     */
    CommonResp<List<Long>> recordDetailList(RecordDetailReq recordDetailReq);
}
