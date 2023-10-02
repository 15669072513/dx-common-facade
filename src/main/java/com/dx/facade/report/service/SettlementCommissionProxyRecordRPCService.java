package com.dx.facade.report.service;

import com.dx.entity.CommonResp;
import com.dx.entity.PageResp;
import com.dx.exception.BizException;
import com.dx.facade.report.param.report.SettlementCommissionProxyRecordReqDTO;
import com.dx.facade.report.resp.report.SettlementCommissionProxyRecordRspDTO;


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
}
