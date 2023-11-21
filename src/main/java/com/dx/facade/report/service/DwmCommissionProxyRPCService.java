package com.dx.facade.report.service;

import com.dx.entity.CommonResp;
import com.dx.exception.BizException;
import com.dx.facade.report.param.report.DwmCommissionProxyDReqDTO;
import com.dx.facade.report.resp.report.DwmCommissionDetailProxyDV2DTO;
import com.dx.facade.report.resp.report.DwmCommissionProxyDDTO;
import java.util.List;

/**
 * 代理返佣 详情
 */
public interface DwmCommissionProxyRPCService {


    /**
     * 会员报表-合计接口
     *
     * @param reqDTO
     * @return
     * @throws BizException
     */
    CommonResp<DwmCommissionProxyDDTO> detail(DwmCommissionProxyDReqDTO reqDTO);

    /**
     * 查询代理返佣结算明细表
     * @param reqDTO
     * @return
     */
    CommonResp<List<DwmCommissionDetailProxyDV2DTO>> commissionStatisticsDetail(DwmCommissionProxyDReqDTO reqDTO);
}
