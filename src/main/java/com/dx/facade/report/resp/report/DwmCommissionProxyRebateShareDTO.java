package com.dx.facade.report.resp.report;

import com.dx.facade.member.proxy.resp.ProxyStatusResp;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;

/**
 * @description 团队收益结算明细表
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ApiModel(value = "DwmCommissionProxyRebateShareDTO", description = "团队收益结算明细表")
public class DwmCommissionProxyRebateShareDTO implements Serializable {

    private static final long serialVersionUID = 1L;
    /**
     * 团队返佣数据
     */
    @ApiModelProperty("代理收益统计")
    private DwmProxyShareStatisticsDTO settlementCommissionProxyRecordRspDTO;


    /**
     * 代理返佣明细表数据
     */
    @ApiModelProperty("收益明细")
    private List<DwmProxyRebateShareRspDTO> dwmCommissionDetailProxyDDTOS;


    /**
     * 代理状态信息
     */
    @ApiModelProperty("代理状态信息")
    private ProxyStatusResp proxyResp;
}