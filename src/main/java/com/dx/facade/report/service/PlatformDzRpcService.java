package com.dx.facade.report.service;

import com.dx.entity.CommonResp;
import com.dx.entity.PageResp;
import com.dx.facade.report.param.report.profitandloss.ProfitPlatformDzReqDTO;
import com.dx.facade.report.resp.report.profitandloss.ProfitPlatformDzRespDTO;

/**
 * 运营状况-德州数据
 *
 * @author Adu
 * @date 2024/2/14
 */
public interface PlatformDzRpcService {

    /**
     * 运营状况-德州数据-分页列表
     *
     * @param req 查询入参
     * @return 分页列表，包括本页小计
     */
    CommonResp<PageResp<ProfitPlatformDzRespDTO, ProfitPlatformDzRespDTO>> listPage(ProfitPlatformDzReqDTO req);

    /**
     * 运营状况-德州数据-总计
     *
     * @param req 查询入参
     * @return 总计数据
     */
    CommonResp<ProfitPlatformDzRespDTO> summary(ProfitPlatformDzReqDTO req);
}
