package com.dx.facade.report.service;

import com.dx.entity.CommonResp;
import com.dx.entity.PageResp;
import com.dx.exception.BizException;
import com.dx.facade.report.param.report.DxSettlementCommissionProxyRecordAwaitIssueReqDTO;
import com.dx.facade.report.param.report.DxSettlementCommissionProxyRecordReqDTO;
import com.dx.facade.report.param.report.DxSettlementCommissionTopProxyRecordReqDTO;
import com.dx.facade.report.resp.agent.ProxyCommissionListPayDTO;
import com.dx.facade.report.resp.report.DxSettlementCommissionProxyRecordAwaitIssueRspDTO;
import com.dx.facade.report.resp.report.DxSettlementCommissionProxyRecordRspDTO;
import com.dx.facade.report.resp.report.DxSettlementCommissionTopProxyRecordSumRspDTO;
import com.dx.facade.report.resp.report.DxSettlementCommissionTopProxyRecordRspDTO;

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
     * 报表-业务报表-代理返佣报表
     * @param reqDTO
     * @return
     */
    CommonResp<PageResp<DxSettlementCommissionTopProxyRecordRspDTO, DxSettlementCommissionTopProxyRecordSumRspDTO>> listTopProxyListPage(DxSettlementCommissionTopProxyRecordReqDTO reqDTO);
    /**
     * 报表-提供代理佣金总额
     * @param
     * @return
     */
    CommonResp<BigDecimal> getProxyCommissionAmountSum(Long proxyId);
}
