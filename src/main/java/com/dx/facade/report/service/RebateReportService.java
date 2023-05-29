package com.dx.facade.report.service;


import com.dx.entity.CommonResp;
import com.dx.entity.PageReq;
import com.dx.entity.PageResp;
import com.dx.exception.BizException;
import com.dx.facade.report.param.rebate.RebateReportListReq;
import com.dx.facade.report.req.proxyrebate.ProxyRebateUnReceiveReqDTO;
import com.dx.facade.report.resp.rebate.RebateReportDetailRespDTO;
import com.dx.facade.report.resp.rebate.RebateReportRespDTO;
import com.dx.facade.report.resp.rebate.RebateReportSummaryRespDTO;

import java.util.List;


public interface RebateReportService {

    /**
     * 返水报表导出列表接口
     *
     * @param reqDTO
     * @return
     * @throws BizException
     */
    CommonResp<List<RebateReportRespDTO>> queryRebateReportExportList(RebateReportListReq reqDTO) throws BizException;


    /**
     * 返水报表列表接口
     *
     * @param reqDTO
     * @return
     * @throws BizException
     */
    CommonResp<List<RebateReportRespDTO>> queryRebateReportList(RebateReportListReq reqDTO) throws BizException;

    /**
     * 返水报表全部合计接口
     *
     * @param reqDTO
     * @return
     * @throws BizException
     */
    CommonResp<RebateReportSummaryRespDTO> queryRebateReportTotal(RebateReportListReq reqDTO) throws BizException;

    /**
     * 反水报表详情接口
     *
     * @param reqDTO
     * @return
     * @throws BizException
     */
    CommonResp<List<RebateReportDetailRespDTO>> queryRebateReportDetail(RebateReportListReq reqDTO, Long venueId) throws BizException;
}
