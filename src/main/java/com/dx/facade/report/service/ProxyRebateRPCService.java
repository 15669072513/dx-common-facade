package com.dx.facade.report.service;


import com.dx.entity.CommonResp;
import com.dx.entity.PageReq;
import com.dx.entity.PageResp;
import com.dx.exception.BizException;
import com.dx.facade.report.param.ReportRebateReqDTO;
import com.dx.facade.report.req.proxyrebate.ProxyRebateUnReceiveReqDTO;
import com.dx.facade.report.resp.ReportRebateDetailsRespDTO;
import com.dx.facade.report.resp.ReportRebateRespDTO;
import com.dx.facade.report.resp.ReportRebateTotalRespDTO;

import java.text.ParseException;

/**
 * @author gollum
 * @version 1.0.0
 * @title 返点报表RPC业务接口
 * @description OB旗舰中控后台->报表->业务报表->返点报表
 * /report/previous-rebate/queryRebateList	ProxyRebateRPCService().queryRebateList(pageReq);
 * /report/previous-rebate/queryRebateReportTotal	ProxyRebateRPCService().queryRebateReportTotal(reportRebateReqDTO);
 * @since 2021年9月18日 上午00:02:38
 */
public interface ProxyRebateRPCService {

    /**
     * @param reqDTO
     * @return
     * @throws BizException
     * @title 返点报表查询接口s
     * @author gollum
     * @since 2021年9月18日 上午00:12:02
     */
    CommonResp<PageResp<ReportRebateRespDTO, ?>> queryRebateList(PageReq<ReportRebateReqDTO> reqDTO) throws BizException, ParseException;

    /**
     * @param reqDTO
     * @return
     * @throws BizException
     * @title 返点报表查询接口s
     * @author gollum
     * @since 2021年9月18日 上午00:12:02
     */
    CommonResp<PageResp<ReportRebateDetailsRespDTO, ?>> queryRebateDetailList(PageReq<ReportRebateReqDTO> reqDTO) throws BizException;

    /**
     * @param reqDTO
     * @return
     * @throws BizException
     * @title 返点报表查询合计接口
     * @author gollum
     * @since 2021年9月18日 上午00:44:14
     */
    CommonResp<ReportRebateTotalRespDTO> queryRebateReportTotal(ReportRebateReqDTO reqDTO) throws BizException;

    /**
     * 待返点条数总计
     *
     * @param reqDTO
     * @return CommonResp
     * @throws BizException
     * @author kygo
     * @since 2022年10月19日 下午18:18:52
     */
    CommonResp<Integer> proxyRebateUnReceiveCount(ProxyRebateUnReceiveReqDTO reqDTO) throws BizException;
}
