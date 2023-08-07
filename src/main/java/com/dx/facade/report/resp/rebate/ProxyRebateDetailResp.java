package com.dx.facade.report.resp.rebate;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.math.BigDecimal;

@Data
public class ProxyRebateDetailResp {
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
    @JsonFormat(shape = JsonFormat.Shape.STRING)
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

    @ApiModelProperty(value = "代理账号")
    private String proxyName;

    @ApiModelProperty(value = "代理ID")
    private Long proxyId;

    @ApiModelProperty(value = "派发状态 (0-未结算 1-待审核 2=待领取 3-领取成功 4-超时未领取 5-无返点 6-已取消)")
    private Integer payoutStatus;

}
