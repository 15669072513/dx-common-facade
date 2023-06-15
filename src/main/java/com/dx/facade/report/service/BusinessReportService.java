package com.dx.facade.report.service;


import com.dx.entity.CommonResp;
import com.dx.entity.PageReq;
import com.dx.entity.PageResp;
import com.dx.exception.BizException;
import com.dx.facade.report.param.base.LocalDatePageRequest;
import com.dx.facade.report.param.proxydayreport.ProxyDayReportRespDTO;
import com.dx.facade.report.param.report.business.BusinessBasicReportReqDTO;
import com.dx.facade.report.param.report.business.MemberReportReqDTO;
import com.dx.facade.report.param.report.business.ProxyBrokerageReportReqDTO;
import com.dx.facade.report.param.report.business.ReportRebateRespDTO;
import com.dx.facade.report.resp.report.DwdMemberStaticInfoResp;
import io.swagger.annotations.ApiModelProperty;

/**
 * @author kygo
 * @version 1.0.0
 * @title 返点报表RPC业务接口
 * @description 流水返点天明细 + 统计
 * @since 2021年9月25日
 */
public interface BusinessReportService {


    /**
     * 会员报表
     *
     * @param reqDTO
     * @return
     */
    @ApiModelProperty(value="业务报表-会员报表")
    CommonResp<PageResp<DwdMemberStaticInfoResp, ?>> pageMemberReport(PageReq<MemberReportReqDTO> reqDTO) throws BizException;


    /**
     * 代理报表
     *
     * @param reqDTO
     * @return
     */
    @ApiModelProperty(value="业务报表-代理报表")
    CommonResp<PageResp<ProxyDayReportRespDTO, ?>> pageProxyReport(PageReq<LocalDatePageRequest> reqDTO) throws BizException;

    /**
     * 代理返点报表
     *
     * @param reqDTO
     * @return
     * @throws BizException
     */
    @ApiModelProperty(value="业务报表-ReportRebateRespDTO")
    CommonResp<PageResp<ReportRebateRespDTO, ?>> pageProxyRebateReport(PageReq<BusinessBasicReportReqDTO> reqDTO) throws BizException;
}
