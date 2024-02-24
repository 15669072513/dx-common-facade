package com.dx.facade.report.resp.report;

import com.dx.facade.member.proxy.resp.ProxyStatusResp;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

/**
 * @description 代理返佣结算表
 * @date 2023-09-26
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ApiModel(value = "团队收益结算明细表", description = "团队收益结算明细表")
public class DwmProxyShareStatisticsDTO implements Serializable {

    private static final long serialVersionUID = 1L;
    /**
     * 代理id
     */
    @ApiModelProperty("代理id")
    private Long proxyId;

    /**
     * 代理账号
     */
    @ApiModelProperty("代理账号")
    private String proxyName;

    @ApiModelProperty("状态(2-待发放 3-已发放 5-无收益 6-已取消)")
    private int payoutStatus;

    @ApiModelProperty("收益调整")
    private BigDecimal adjustAmount = BigDecimal.ZERO;

    @ApiModelProperty("本期个人收益")
    protected BigDecimal incomeAmount = BigDecimal.ZERO;

    @ApiModelProperty("调整后个人收益")
    protected BigDecimal realRebateAmount = BigDecimal.ZERO;

}