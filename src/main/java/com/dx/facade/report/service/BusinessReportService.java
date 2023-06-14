package com.dx.facade.report.service;


import com.dx.entity.CommonResp;
import com.dx.entity.PageReq;
import com.dx.entity.PageResp;
import com.dx.exception.BizException;
import com.dx.facade.report.param.base.LocalDatePageRequest;
import com.dx.facade.report.param.report.business.BusinessBasicReportReqDTO;
import com.dx.facade.report.param.report.business.UserReportReqDTO;
import com.dx.facade.report.param.report.business.ProxyBrokerageReportReqDTO;

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
    CommonResp<PageResp<?, ?>> pageMemberReport(PageReq<UserReportReqDTO> reqDTO) throws BizException;


    /**
     * 代理报表
     *
     * @param reqDTO
     * @return
     */
    CommonResp<PageResp<?, ?>> pageProxyReport(PageReq<LocalDatePageRequest> reqDTO) throws BizException;


    /**
     * 代理佣金报表
     *
     * @param reqDTO
     * @return
     */
    CommonResp<PageResp<?, ?>> pageProxyBrokerageReport(PageReq<ProxyBrokerageReportReqDTO> reqDTO) throws BizException;

    /**
     * 代理收付报表
     *
     * @param reqDTO
     * @return
     * @throws BizException
     */
    CommonResp<PageResp<?, ?>> pageProxyTransferReport(PageReq<BusinessBasicReportReqDTO> reqDTO) throws BizException;

    /**
     * 代理返点报表
     *
     * @param reqDTO
     * @return
     * @throws BizException
     */
    CommonResp<PageResp<?, ?>> pageProxyRebateReport(PageReq<BusinessBasicReportReqDTO> reqDTO) throws BizException;
}
