package com.dx.facade.game.service;

import com.dx.entity.CommonResp;
import com.dx.facade.game.resp.DxHandInfoSumResp;
import com.dx.facade.game.resp.DxTableInfoSumResp;

public interface GameOrderTableRpcService {


    /**
     * 获取牌桌维度统计汇总数据
     * @param tableId   表的 ID。
     * @return  DxTableInfoSumResp 的汇总响应。
     */
    CommonResp<DxTableInfoSumResp> getDxTableInfoSumResp(Long tableId);
}
