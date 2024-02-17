package com.dx.facade.report.resp.proxyoverview;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 *
 * @author jackpot
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ApiModel(value = "ProxyOverviewMainDataCashRespDTO", description = "现金模式 今日数据")
public class ProxyOverviewMainDataCashRespDTO {

    @ApiModelProperty(value = "id")
    private Long id;

    @ApiModelProperty(value = "代理id")
    private Long proxyId;

    @ApiModelProperty(value = "全部-会员总投注")
    private BigDecimal betAmount;

    @ApiModelProperty(value = "直属-会员总投注")
    private BigDecimal directlyMemberBetAmount;

    @ApiModelProperty(value = "全部-会员游戏盈亏")
    private BigDecimal netAmount;

    @ApiModelProperty(value = "直属-会员游戏盈亏")
    private BigDecimal directlyMemberNetAmount;

    @ApiModelProperty(value = "全部-会员实际盈亏")
    private BigDecimal netActualAmount;

    @ApiModelProperty(value = "直属-会员实际盈亏")
    private BigDecimal directlyMemberNetActualAmount;

}
