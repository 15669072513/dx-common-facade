package com.dx.facade.member.proxy.resp;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.math.BigDecimal;

@Data
public class ProxyRebateDAuditRespDTO {
    /**
     * 报表日期
     * yyyymmdd --> yyyy-mm-dd
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
    @ApiModelProperty(value = "活跃用户")
    private Integer activeNum;

    /**
     * 有效活跃用户
     */
    @ApiModelProperty(value = "有效活跃用户")
    private Integer effecactiveActiveNum;

    /**
     * 契约ID(根据id查询规则)
     */
    @ApiModelProperty(value = "契约ID(根据id查询规则)")
    private Long contractId;

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
     * 团队总返点
     */
    @ApiModelProperty(value = "团队总返点")
    private Integer rebateAmount;

    /**
     * 下级总返点
     */
    @ApiModelProperty(value = "下级总返点")
    private Integer childRebateAmount;

    /**
     * 个人返点
     */
    @ApiModelProperty(value = "个人返点")
    private Integer personRebateAmount;
}
