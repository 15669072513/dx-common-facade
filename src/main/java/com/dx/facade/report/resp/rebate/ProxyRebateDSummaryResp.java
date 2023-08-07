package com.dx.facade.report.resp.rebate;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.math.BigDecimal;

@Data
public class ProxyRebateDSummaryResp {
    /**
     * 总会员游戏流水
     */
    @ApiModelProperty(value = "总会员游戏流水")
    private BigDecimal totalBetAmount;

    /**
     * 总会员有效游戏流水
     */
    @ApiModelProperty(value = "总会员有效游戏流水")
    private BigDecimal totalValidBetAmount;

    /**
     * 会员游戏注单量
     */
    @ApiModelProperty(value = "会员游戏注单量")
    private Integer totalBetNum;


    @ApiModelProperty(value = "币种")
    private String currency;

    /**
     * 总会员流水纠正金额
     */
    @ApiModelProperty(value = "总会员流水纠正金额")
    private BigDecimal totalAdjustBetAmount;

    /**
     * 实际总流水金额
     */
    @ApiModelProperty(value = "实际总流水金额")
    private BigDecimal totalRealBetAmount;

    /**
     * 会员总盈亏
     */
    @ApiModelProperty(value = "会员总盈亏")
    private BigDecimal totalNetAmount;

    /**
     * 返点金额
     */
    @ApiModelProperty(value = "返点金额")
    private BigDecimal rebateAmount;

    /**
     * 个人返点金额
     */
    @ApiModelProperty(value = "个人返点金额")
    private BigDecimal personRebateAmount;

    /**
     * 下级返点金额
     */
    @ApiModelProperty(value = "下级返点金额")
    private BigDecimal childRebateAmount;

}
