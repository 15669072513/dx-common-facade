package com.dx.facade.report.service;

import com.dx.entity.CommonResp;
import com.dx.entity.PageResp;
import com.dx.exception.BizException;
import com.dx.facade.report.param.report.*;
import com.dx.facade.report.resp.report.*;


/**
 * 代理返佣团队返佣
 */
public interface DxSettlementCommissionProxyRecordLogRPCService {


    /**
     * 代理返佣-团队返佣日志查询
     *
     * @param reqDTO
     * @return
     * @throws BizException
     */
    CommonResp<PageResp<DxSettlementCommissionProxyRecordLogRspDTO, Object>> listPage(DxSettlementCommissionProxyRecordLogReqDTO reqDTO) ;
    /**
     * 返佣调整回显-基于代理id
     *
     * @return
     * @throws BizException
     */
    CommonResp<DxSettlementCommissionProxyRecordLogRspDTO> getLastLogRecordByProxyId(DxSettlementCommissionProxyRecordLogDetailReqDTO reqDTO);

}
