package com.dx.facade.report.service;

import com.dx.entity.CommonResp;
import com.dx.entity.PageResp;
import com.dx.exception.BizException;
import com.dx.facade.member.proxy.req.ProxyRebateDealAuditReqDTO;
import com.dx.facade.member.proxy.resp.ProxyRebateAuditResultRespDTO;
import com.dx.facade.report.param.report.*;
import com.dx.facade.report.resp.agent.ProxyCommissionListPayDTO;
import com.dx.facade.report.resp.rebate.ProxyRebateRecordDetailParam;
import com.dx.facade.report.resp.report.*;

import java.math.BigDecimal;
import java.util.List;


/**
 * 代理返佣团队返佣
 */
public interface DxSettlementCommissionProxyRecordRPCService {


    /**
     * 代理返佣-团队返佣查询
     *
     * @param reqDTO
     * @return
     * @throws BizException
     */
    CommonResp<PageResp<DxSettlementCommissionProxyRecordRspDTO,Object>> listPage(DxSettlementCommissionProxyRecordReqDTO reqDTO) ;

    /**
     * 团队返佣需发放列表查询
     * @param reqDTO
     * @return
     */
    CommonResp<List<DxSettlementCommissionProxyRecordAwaitIssueRspDTO>> awaitIssueListByProxyIds(DxSettlementCommissionProxyRecordAwaitIssueReqDTO reqDTO);
    /**
     * 发放返佣
     * @param payList
     * @return
     */
    CommonResp<Integer> issueCommission(List<ProxyCommissionListPayDTO> payList);

    /**
     * 代发佣金
     */
    CommonResp<Boolean> replaceIssueCommission(ProxyCommissionListPayDTO payDTO);
    /**
     * 报表-业务报表-代理返佣报表
     * @param reqDTO
     * @return
     */
    CommonResp<PageResp<DxSettlementCommissionTopProxyRecordRspDTO, DxSettlementCommissionTopProxyRecordSumRspDTO>> listTopProxyListPage(DxSettlementCommissionTopProxyRecordReqDTO reqDTO);

    /**
     * 代理资金记录-代理返佣记录-总代
     * @param reqDTO
     * @return
     */
    //代理返佣记录
    CommonResp<PageResp<DxSettlementCommissionProxyRecordRspDTO, DxFundSettlementCommissionRecordSumRspDTO>> listTopProxyCommissionRecordPage(DxFundSettlementCommissionProxyRecordReqDTO reqDTO);

    /**
     * 报表-提供代理佣金总额
     * @param
     * @return
     */
    CommonResp<BigDecimal> getProxyCommissionAmountSum(Long proxyId);

    /**
     * 报表-锁单
     * @param
     * @return
     */
    CommonResp batchEditProxyRebateLockStatus(List<Long> idList, Long currentUserMerchantId,  Long currentUserId, String currentUser, Integer lockStatus, Integer lockType);

    CommonResp<List<ProxyRebateAuditResultRespDTO>> proxyRebateRecordAuditBatchPass(ProxyRebateDealAuditReqDTO reqDTO) throws BizException;

    CommonResp<List<ProxyRebateAuditResultRespDTO>> proxyRebateRecordAuditBatchRefuse(ProxyRebateDealAuditReqDTO reqDTO) throws BizException;
    CommonResp adjustAmount(ProxyRebateRecordDetailParam param);
    CommonResp cancelAmount(ProxyRebateRecordDetailParam param);


    /**
     * 代理返佣记录-非总代
     * @param reqDTO
     * @return
     */
    CommonResp<PageResp<DxSettlementCommissionProxyRecordRspDTO, DxFundSettlementCommissionRecordNotTopProxySumRspDTO>> listNotTopProxyCommissionRecordPage(DxFundSettlementCommissionProxyRecordReqDTO reqDTO);

    /**
     * 资金调整-非总代返佣管理列表查询
     * @param reqDTO
     * @return
     */
    CommonResp<PageResp<DxFundAdjustSettlementCommissionProxyRecordRspDTO, DxFundAdjustSettlementCommissionProxyRecordSumRspDTO>> listNotTopProxyFundAdjustmentCommissionRecordPage(DxFundAdjustSettlementCommissionProxyRecordReqDTO reqDTO);

    /**
     * 根据商户id集合查询待审核数量
     * @param longs
     * @return
     */
    Integer getPendingCount(List<Long> longs);

    /**
     * 统计-返佣统计
     * @param reqDTO
     * @return
     */
    CommonResp<PageResp<DxSettlementCommissionProxyRecordRspV2DTO, DxSettlementCommissionProxyTotalRspV2DTO>> commissionStatisticsList(DxSettlementCommissionProxyRecordReqV2DTO reqDTO);
    /**
     * 统计-返佣统计汇总
     * @param reqDTO
     * @return
     */
    CommonResp<DxSettlementCommissionProxyTotalRspV2DTO> commissionStatisticsListTotal(DxSettlementCommissionProxyRecordReqV2DTO reqDTO);

    /**
     * 获取当前登录代理最近期数数据
     * @param proxyId
     * @return
     */
    CommonResp<List<String>> getNewSettlementData(Long proxyId);
}
