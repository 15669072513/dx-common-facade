package com.dx.facade.report.resp.rebate;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.math.BigDecimal;

@Data
public class ProxyRebateDRespDTO {

    /**
     * 报表日期
     */
    @ApiModelProperty(value = "报表日期")
    private String reportDate;

    /**
     * 团队总流水
     */
    @ApiModelProperty(value = "团队总流水")
    private BigDecimal totalBetAmount;

    /**
     * 活跃用户
     */
    @ApiModelProperty(value = "活跃人数")
    private Integer activeNum;

    /**
     * 有效活跃用户
     */
    @ApiModelProperty(value = "有效活跃人数")
    private Integer effecactiveActiveNum;


    @ApiModelProperty(value = "币种")
    private String currency;

    /**
     * 契约ID
     */
    @ApiModelProperty(value = "契约ID")
    private Long contractId;

    /**
     * 等级序号
     */
    @ApiModelProperty(value = "等级序号")
    private Integer contractLevel;

    /**
     * 流水纠正
     */
    @ApiModelProperty(value = "流水纠正")
    private BigDecimal totalAdjustBetAmount;

    /**
     * 实际总流水
     */
    @ApiModelProperty(value = "实际总流水")
    private BigDecimal totalRealBetAmount;

    /**
     * 返点比例
     */
    @ApiModelProperty(value = "返点比例")
    private BigDecimal rebateRate;

    /**
     * 团队返点
     */
    @ApiModelProperty(value = "团队返点")
    private BigDecimal rebateAmount;

    /**
     * 下级返点
     */
    @ApiModelProperty(value = "下级返点")
    private BigDecimal childRebateAmount;

    /**
     * 个人返点
     */
    @ApiModelProperty(value = "个人返点")
    private BigDecimal personRebateAmount;
}