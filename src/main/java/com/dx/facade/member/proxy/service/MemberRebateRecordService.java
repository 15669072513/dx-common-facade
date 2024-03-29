package com.dx.facade.member.proxy.service;

import com.dx.entity.CommonResp;
import com.dx.entity.PageReq;
import com.dx.entity.PageResp;
import com.dx.exception.BizException;
import com.dx.facade.member.proxy.req.*;
import com.dx.facade.member.proxy.resp.*;
import com.dx.facade.report.param.member.MemberExpectRebateReqDTO;
import com.dx.facade.report.param.rebate.RebateDayListReqDTO;
import com.dx.facade.report.req.proxyrebate.ProxyRebateTackReq;
import com.dx.facade.report.resp.member.MemberExpectRebateRespDTO;
import com.dx.facade.report.resp.member.MemberExpectRebateSummaryRespDTO;
import com.dx.facade.report.resp.member.MemberNetAmountRebateRespDTO;
import com.dx.facade.report.resp.rebate.ProxyRebateProxyMemberListResp;
import com.dx.facade.report.resp.rebate.ProxyRebateTeamResp;
import org.springframework.validation.annotation.Validated;

import java.util.List;


/**
 * @author kygo
 * @version 1.0.0
 * @title 返点报表RPC业务接口
 * @description OB旗舰中控后台->资金->资金审核->返点审核(页面)
 * @since 2021年9月18日 13:32:38
 */
public interface MemberRebateRecordService {
    //--------返点审核开始---------

    /**
     * 功能菜单红点显示数量
     */
    Integer countToAuditRecordByMerchantId(Long merchantId);

    /**
     * 返点详情页
     */
    CommonResp<MemberRebateRecordDetailRespDTO> queryMemberRebateAuditDetailPage(MemberRebateRecordDetailReqDTO reqDTO) throws BizException;

    /**
     * 待审页代理返点分页一审查询
     */
    CommonResp<PageResp<MemberRebateAuditRespDTO, ?>> queryMemberRebateAuditPage(PageReq<MemberRebateAuditReqDTO> reqDTO);

    /**
     * 待审页代理返点待审 批量锁单接口
     */
    CommonResp batchEditMemberRebateLockStatus(List<Long> idList, Long currentUserMerchantId, Long currentUserId, String currentUser, Integer lockStatus, Integer lockType);

    /**
     * 批量审核通过
     */
    CommonResp<List<MemberRebateAuditResultRespDTO>> memberRebateRecordAuditBatchPass(MemberRebateDealAuditReqDTO reqDTO) throws BizException;

    /**
     * 批量审核拒绝
     */
    CommonResp<List<MemberRebateAuditResultRespDTO>> memberRebateRecordAuditBatchRefuse(MemberRebateDealAuditReqDTO reqDTO) throws BizException;
    //--------返点审核结束---------


    /**
     * 资金审核记录->返点审核记录
     *
     * @param reqDTO
     * @return
     */
    CommonResp<PageResp<MemberRebateAuditedRespDTO, ?>> queryMemberRebateRecordPage(PageReq<MemberRebateAuditedRecordReqDTO> reqDTO) throws BizException;

    /**
     * 代理资金记录->返点流水记录
     */
    CommonResp<PageResp<ProxyRebatePageRespDTO, ?>> queryProxyRebateListPage(PageReq<ProxyRebatePageReqDTO> reqDTO) throws BizException;

    /**
     * 待审页代理返点分页统计
     *
     * @param param
     * @return
     */
    CommonResp<ProxyRebateRecordTotalRespDTO> queryRebateReportListPageTotal(ProxyRebatePageReqDTO param) throws BizException;


    /**
     * 代理PC-代理返点-领取返点
     *
     * @param reqDTO
     * @return
     * @throws BizException
     */
    CommonResp takeRebate(ProxyRebateTackReq reqDTO) throws BizException;

    /**
     * 代理PC-返回代理会员返点报表
     *
     * @param proxyId reportDate
     * @return
     * @throws BizException
     */
    CommonResp<List<ProxyRebateTeamResp>> getMemberTeamRebate(Long proxyId, Integer reportDate) throws BizException;

    /**
     * 代理PC-返回代理列表
     *
     * @param proxyId
     * @return
     * @throws BizException
     */
    CommonResp<ProxyRebateProxyMemberListResp> getProxyMemberList(Long proxyId) throws BizException;

    /**
     * 会员返点列表
     *
     * @param req
     * @return
     * @throws BizException
     */
    CommonResp<PageResp<MemberNetAmountRebateRespDTO, ?>> getMemberTotalRebate(RebateDayListReqDTO req) throws BizException;

    /**
     * 历史会员返点列表
     *
     * @param req
     * @return
     * @throws BizException
     */
    CommonResp<PageResp<MemberNetAmountRebateRespDTO, ?>> getMemberTeamRebateList(RebateDayListReqDTO req) throws BizException;

    /**
     * 会员自动审核
     * @param reportDate
     */
    void memberRebateAutoAudit(Integer reportDate);

    /**
     * 中控后台，会员预期返水列表
     *
     * @param param
     * @return
     */
    CommonResp<PageResp<MemberExpectRebateRespDTO, MemberExpectRebateSummaryRespDTO>> expectRebatePage(MemberExpectRebateReqDTO param);

    /**
     * 中控后台，会员预期返水合计
     * @param param
     * @return
     */
    CommonResp<MemberExpectRebateSummaryRespDTO> expectRebatePageSummary(MemberExpectRebateReqDTO param);



}
