package com.dx.facade.report.service;


import com.dx.entity.CommonResp;
import com.dx.entity.PageReq;
import com.dx.entity.PageResp;
import com.dx.exception.BizException;
import com.dx.facade.report.param.proxy.ProxyDayReportReqDTO;
import com.dx.facade.report.resp.proxy.ProxyDayReportDetailRespDTO;
import com.dx.facade.report.resp.proxy.ProxyDayReportRespDTO;
import com.dx.facade.report.resp.proxy.ProxyDayReportSummaryDTO;


public interface ProxyDayReportRPCService {


    /**
     * 代理报表导出接口
     *
     * @param reqDTO
     * @return
     * @throws BizException
     */
    CommonResp<PageResp<ProxyDayReportRespDTO,?>> listExport(PageReq<ProxyDayReportReqDTO> reqDTO) throws BizException;

    /**
     * 代理报表列表接口
     *
     * @param reqDTO
     * @return
     * @throws BizException
     */
    CommonResp<PageResp<ProxyDayReportRespDTO, ProxyDayReportSummaryDTO>> listPage(PageReq<ProxyDayReportReqDTO> reqDTO) throws BizException;

    /**
     * 代理报表-合计接口
     *
     * @param reqDTO
     * @return
     * @throws BizException
     */
    CommonResp<ProxyDayReportSummaryDTO> summary(ProxyDayReportReqDTO reqDTO) throws BizException;

    /**
     * 代理报表详情接口
     *
     * @param requestDto
     * @return
     * @throws BizException
     */
    CommonResp<PageResp<ProxyDayReportDetailRespDTO, ?>> detailListPage(PageReq<ProxyDayReportReqDTO> requestDto) throws BizException;


    //代理报表V2
    CommonResp<PageResp<ProxyDayReportRespDTO, ProxyDayReportSummaryDTO>> getProxyReportPage(PageReq<ProxyDayReportReqDTO> reqDTO) throws BizException;
    CommonResp<ProxyDayReportSummaryDTO> getProxyReportSummary(ProxyDayReportReqDTO reqDTO) throws BizException;
}
