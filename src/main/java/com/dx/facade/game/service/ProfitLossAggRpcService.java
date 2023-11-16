package com.dx.facade.game.service;

import com.dx.entity.CommonResp;
import com.dx.facade.game.req.ProfitAndLossStatementReq;
import com.dx.facade.game.resp.ProfitAndLossStatementResp;

import java.util.List;

public interface ProfitLossAggRpcService {
    /**
     * 盈亏表
     * @param req
     * @return
     */
    CommonResp<List<ProfitAndLossStatementResp>> getProfitAndLossStatement(ProfitAndLossStatementReq req);
}
