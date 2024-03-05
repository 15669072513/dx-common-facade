package com.dx.facade.report.resp.zhangcheng;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * app代理中心-收益管理列表
 *
 * @author Adu
 * @create 2024/2/22
 */
@Data
@ApiModel(value = "收益管理列表返回", description = "收益管理列表返回")
public class IncomeResp implements Serializable {

    /**
     * 代理ID
     */
    @ApiModelProperty(value = "代理ID", example = "1500.00")
    private Long proxyId;

    /**
     * 代理名称
     */
    @ApiModelProperty(value = "代理名称", example = "dali887")
    private String proxyName;

    /**
     * 报表日期
     */
    @ApiModelProperty(value = "报表日期", example = "20231212")
    private Integer reportDate;

    /**
     * TODO 对应对应payout的状态是什么？
     */
    @ApiModelProperty(value = "收益状态 1:待发放 3：已发放 5：无收益 6：已取消", example = "1")
    private Integer status;

    /**
     * 德州服务费返点
     */
    @ApiModelProperty(value = "德州服务费返点", example = "1500.00")
    private BigDecimal clubRebateAmount = BigDecimal.ZERO;

    /**
     * 德州保险分成
     */
    @ApiModelProperty(value = "德州保险分成", example = "1500.00")
    private BigDecimal insureSplitAmount = BigDecimal.ZERO;

    /**
     * 其他场馆返点
     */
    @ApiModelProperty(value = "其他场馆返点", example = "1500.00")
    private BigDecimal otherRebateAmount = BigDecimal.ZERO;

    /**
     * 其他场馆分成
     */
    @ApiModelProperty(value = "其他场馆分成", example = "1500.00")
    private BigDecimal otherSplitAmount = BigDecimal.ZERO;

    /**
     * 本期应发
     */
    @ApiModelProperty(value = "本期应发（代理收益）", example = "1500.00")
    private BigDecimal incomeAmount = BigDecimal.ZERO;

    /**
     * 收益调整
     */
    @ApiModelProperty(value = "收益调整", example = "1500.00")
    private BigDecimal ajustAmount = BigDecimal.ZERO;

    /**
     * 实发收益
     */
    @ApiModelProperty(value = "实发收益（调整后收益）", example = "1500.00")
    private BigDecimal realRebateAmount = BigDecimal.ZERO;


}
