package com.dx.facade.game.service;

import com.dx.entity.CommonResp;
import com.dx.facade.game.resp.DxHandInfoSumResp;

public interface GameOrderHandRpcService {


    /**
     * 获取牌桌，手牌维度统计DxHandInfo 汇总数据
     * @param tableId   表的 ID。
     * @param handCode  手牌的代码。
     * @return  DxHandInfo 的汇总响应。
     */
    CommonResp<DxHandInfoSumResp> getDxHandInfoSumResp(Long tableId, String handCode);
}
