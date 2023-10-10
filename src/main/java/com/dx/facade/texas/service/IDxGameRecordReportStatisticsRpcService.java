package com.dx.facade.texas.service;

import com.dx.entity.CommonResp;
import com.dx.facade.game.req.ProfitAndLossStatementReq;
import com.dx.facade.game.resp.ProfitAndLossStatementResp;
import com.dx.facade.texas.req.DxGamePersonalReq;
import com.dx.facade.texas.resp.DxGamePersonalResp;

import java.util.List;

public interface IDxGameRecordReportStatisticsRpcService {
    /**
     * 盈亏表
     * @param req
     * @return
     */
    CommonResp<List<ProfitAndLossStatementResp>> getProfitAndLossStatement(ProfitAndLossStatementReq req);
}
