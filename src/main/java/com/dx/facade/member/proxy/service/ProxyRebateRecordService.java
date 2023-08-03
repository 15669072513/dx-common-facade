package com.dx.facade.member.proxy.service;

import com.dx.entity.CommonResp;
import com.dx.entity.PageReq;
import com.dx.entity.PageResp;
import com.dx.exception.BizException;
import com.dx.facade.member.member.param.ProxyPaymentDTO;
import com.dx.facade.member.proxy.po.DwmProxyRebateRecordPO;
import com.dx.facade.member.proxy.req.*;
import com.dx.facade.member.proxy.resp.*;
import com.dx.facade.report.param.agent.AgentRebateReqDTO;
import com.dx.facade.report.req.proxyrebate.ProxyRebateTackReq;
import com.dx.facade.report.resp.rebate.ProxyRebateProxyMemberListResp;
import com.dx.facade.report.resp.rebate.ProxyRebateTeamResp;

import java.util.List;


/**
 * @author kygo
 * @version 1.0.0
 * @title 返点报表RPC业务接口
 * @description OB旗舰中控后台->资金->资金审核->返点审核(页面)
 * @since 2021年9月18日 13:32:38
 */
public interface ProxyRebateRecordService {
    //--------返点审核开始---------
    /**
     * 功能菜单红点显示数量
     */
    Integer countToAuditRecordByMerchantId(Long merchantId);
    /**
     * 返点详情页
     */
    CommonResp<ProxyRebateRecordDetailRespDTO> queryProxyRebateAuditDetailPage(ProxyRebateRecordDetailReqDTO reqDTO) throws BizException;

    /**
     * 待审页代理返点分页一审查询
     */
    CommonResp<PageResp<ProxyRebateAuditRespDTO, ?>> queryProxyRebateAuditPage(PageReq<ProxyRebateAuditReqDTO> reqDTO);
    /**
     * 待审页代理返点待审 批量锁单接口
     */
    CommonResp batchEditProxyRebateLockStatus(List<Long> idList, Long currentUserMerchantId,  Long currentUserId, String currentUser, Integer lockStatus, Integer lockType);
    /**
     * 批量审核通过
     */
    CommonResp<List<ProxyRebateAuditResultRespDTO>> proxyRebateRecordAuditBatchPass(ProxyRebateDealAuditReqDTO reqDTO) throws BizException;
    /**
     * 批量审核拒绝
     */
    CommonResp<List<ProxyRebateAuditResultRespDTO>> proxyRebateRecordAuditBatchRefuse(ProxyRebateDealAuditReqDTO reqDTO) throws BizException;
    //--------返点审核结束---------


    /**
     * 资金审核记录->返点审核记录
     *
     * @param reqDTO
     * @return
     */
    CommonResp<PageResp<ProxyRebateAuditedRespDTO, ?>> queryProxyRebateRecordPage(PageReq<ProxyRebateAuditedRecordReqDTO> reqDTO) throws BizException;

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
     * @param reqDTO
     * @return
     * @throws BizException
     */
    CommonResp takeRebate(ProxyRebateTackReq reqDTO) throws BizException;

    /**
     * 代理PC-返回代理会员返点报表
     * @param proxyId  reportDate
     * @return
     * @throws BizException
     */
    CommonResp<List<ProxyRebateTeamResp>> getProxyTeamRebate(Long proxyId, Integer reportDate) throws BizException;
    /**
     * 代理PC-返回代理列表
     * @param proxyId
     * @return
     * @throws BizException
     */
    CommonResp<ProxyRebateProxyMemberListResp> getProxyMemberList(Long proxyId) throws BizException;

}
