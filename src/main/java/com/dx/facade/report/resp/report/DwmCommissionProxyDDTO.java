package com.dx.facade.report.resp.report;
import com.dx.facade.member.proxy.resp.ProxyStatusResp;
import io.swagger.annotations.ApiModel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.io.Serializable;
import java.util.List;

/**
 * @description 代理返佣结算表
 * @date 2023-09-26
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ApiModel(value = "代理返佣结算表", description = "代理返佣结算明细表")
public class DwmCommissionProxyDDTO implements Serializable {

    private static final long serialVersionUID = 1L;
    /**
     * 团队返佣数据
     */
    private DxSettlementCommissionProxyRecordRspDTO settlementCommissionProxyRecordRspDTO;


    /**
     * 代理返佣明细表数据
     */
    private List<DwmCommissionDetailProxyDDTO> dwmCommissionDetailProxyDDTOS;


    /**
     * 当前代理信息
     */
    private ProxyStatusResp proxyResp;
}