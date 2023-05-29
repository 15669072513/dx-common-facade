package com.dx.facade.report.service;

import com.dx.entity.CommonResp;
import com.dx.entity.PageReq;
import com.dx.entity.PageResp;
import com.dx.facade.report.param.pay.MemberRebateReportDetailRpcReqDto;
import com.dx.facade.report.param.pay.MemberRebateReportPageRpcReqDto;
import com.dx.facade.report.resp.pay.MemberRebateReportDetailRpcPageRespDTO;
import com.dx.facade.report.resp.pay.MemberRebateReportDetailSummaryRpcRespDTO;
import com.dx.facade.report.resp.pay.MemberRebateReportRpcPageRespDTO;
import com.dx.facade.report.resp.pay.MemberRebateReportSummaryRpcRepsDTO;

import io.swagger.annotations.ApiModelProperty;

/**
 * @Description 会员返水
 * @Author Carlos
 * @Date 2022/2/8 15:57
 * @Version 1.0
 **/
public interface MemberRebateRPCService {
    /**
     * 会员返水报表记录 分页查询
     *
     * @param pageReq 会员返水报表记录 分页参数
     * @return 会员返水报表记录
     * @throws Exception 异常
     */
    @ApiModelProperty(value="会员返水报表记录 分页")
    CommonResp<PageResp<MemberRebateReportRpcPageRespDTO, ?>> rebateReport(PageReq<MemberRebateReportPageRpcReqDto> pageReq) throws Exception;


    /**
     * 会员返水报表总计
     *
     * @param rpcReqDto 会员返水报表记录
     * @return 会员返水报表记录
     * @throws Exception 异常
     */
    CommonResp<MemberRebateReportSummaryRpcRepsDTO> rebateReportSummary(MemberRebateReportPageRpcReqDto rpcReqDto) throws Exception;


    /**
     * 会员返水报表详情 分页查询
     *
     * @param pageReq 会员返水记录 分页参数
     * @return 会员返水记录
     * @throws Exception 异常
     */
    @ApiModelProperty(value="会员返水详情记录 分页")
    CommonResp<PageResp<MemberRebateReportDetailRpcPageRespDTO, ?>> rebateReportDetail(PageReq<MemberRebateReportDetailRpcReqDto> pageReq) throws Exception;


    /**
     * 会员返水报表详情 汇总
     * @param detailRpcReqDto
     * @return
     * @throws Exception
     */
    CommonResp<MemberRebateReportDetailSummaryRpcRespDTO> rebateReportDetailSummary(MemberRebateReportDetailRpcReqDto detailRpcReqDto) throws Exception;
}
