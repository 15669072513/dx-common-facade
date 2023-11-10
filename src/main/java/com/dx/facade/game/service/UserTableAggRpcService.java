package com.dx.facade.game.service;

import com.dx.entity.CommonResp;
import com.dx.facade.game.req.UserTableReq;

import java.util.List;

public interface UserTableAggRpcService {


    /**
     * 查询当前会员参与的所有牌桌ID
     * @param userTableReq
     * @return
     */
    CommonResp<List<Long>> getUserTableListByUserId(UserTableReq userTableReq);
}
