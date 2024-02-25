package com.dx.facade.report.service;

import com.dx.entity.CommonResp;
import com.dx.entity.PageResp;
import com.dx.facade.member.proxy.resp.ProxyRebateAuditResultIncomeRespDTO;
import com.dx.facade.member.proxy.resp.ProxyRebateAuditResultRespDTO;
import com.dx.facade.report.resp.report.proxy.UpdMemberAuditDetailIncomeParamDTO;
import com.dx.facade.report.resp.report.proxy.*;

import java.util.List;

/**
 * 资金-资金审核
 *
 * @author flash
 * @date 2024/2/24
 */
public interface ProxyIncomeService {

    CommonResp<PageResp<ProxyIncomeAuditListRes, Object>> getProxyIncomeAuditList(ProxyIncomeAuditListReq reqDTO);

    CommonResp<Boolean> auditLock(List<String> idList, Long headerMerchantId, Long headerUserId, String headerUserName, Integer lockStatus, Integer lockType);

    CommonResp<List<ProxyRebateAuditResultIncomeRespDTO>> proxyIncomeRecordAuditBatchPass(ProxyRebateDealAuditIncomeReqDTO reqDTO);

    CommonResp<List<ProxyRebateAuditResultIncomeRespDTO>> proxyIncomeRecordAuditBatchRefuse(ProxyRebateDealAuditIncomeReqDTO reqDTO);

    FundsAuditIncomeDetailResp incomeDetail(UpdMemberAuditDetailIncomeParamDTO param);

    FundsAuditInfoDetailResp auditDetail(UpdMemberAuditDetailIncomeParamDTO param);
}
