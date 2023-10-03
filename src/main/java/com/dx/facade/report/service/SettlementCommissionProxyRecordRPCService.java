package com.dx.facade.report.service;

import com.dx.entity.CommonResp;
import com.dx.entity.PageResp;
import com.dx.exception.BizException;
import com.dx.facade.report.param.report.SettlementCommissionProxyRecordAwaitIssueReqDTO;
import com.dx.facade.report.param.report.SettlementCommissionProxyRecordReqDTO;
import com.dx.facade.report.resp.agent.ProxyCommissionListPayDTO;
import com.dx.facade.report.resp.report.SettlementCommissionProxyRecordAwaitIssueRspDTO;
import com.dx.facade.report.resp.report.SettlementCommissionProxyRecordRspDTO;
import java.util.List;


/**
 * 代理返佣团队返佣
 */
public interface SettlementCommissionProxyRecordRPCService {


    /**
     * 代理返佣-团队返佣查询
     *
     * @param reqDTO
     * @return
     * @throws BizException
     */
    CommonResp<PageResp<SettlementCommissionProxyRecordRspDTO,Object>> listPage(SettlementCommissionProxyRecordReqDTO reqDTO) ;

    /**
     * 团队返佣需发放列表查询
     * @param reqDTO
     * @return
     */
    CommonResp<List<SettlementCommissionProxyRecordAwaitIssueRspDTO>> awaitIssueListByProxyIds(SettlementCommissionProxyRecordAwaitIssueReqDTO reqDTO);
    /**
     * 发放返佣
     * @param payDTOS
     * @return
     */
    CommonResp<Integer> issueCommission(List<ProxyCommissionListPayDTO> payDTOS);
}
