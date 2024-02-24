package com.dx.facade.report.service;

import com.dx.entity.CommonResp;
import com.dx.entity.PageResp;
import com.dx.facade.report.req.zhangcheng.IncomeDetailReq;
import com.dx.facade.report.req.zhangcheng.IncomeReq;
import com.dx.facade.report.resp.zhangcheng.IncomeDetailResp;
import com.dx.facade.report.resp.zhangcheng.IncomeResp;
import com.dx.facade.report.resp.zhangcheng.IncomeSummaryResp;

import java.util.List;

/**
 * 占成 RPC service
 *
 * @author Adu
 * @create 2024/2/23
 */
public interface ZhangChengRpcService {


    /**
     * 收益管理--代理列表
     *
     * @param req
     * @return
     */
    CommonResp<PageResp<IncomeResp, IncomeSummaryResp>> listPage(IncomeReq req);

    /**
     * 收益管理--代理收益明细列表
     *
     * @param req
     * @return
     */
    CommonResp<List<IncomeDetailResp>> detail(IncomeDetailReq req);

    CommonResp<PageResp<IncomeDetailResp, IncomeDetailResp>> venueIncomeDetailList(IncomeDetailReq req);

    CommonResp<IncomeDetailResp> venueIncomeDetailTotal(IncomeDetailReq req);
}
