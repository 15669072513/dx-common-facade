package com.dx.facade.report.resp.report;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;

@Data
public class ProxyNetAmountDetailRespDTO implements Serializable {

    @ApiModelProperty(value = "代理名称")
    private String proxyName;

    @ApiModelProperty(value = "统计时间")
    private Integer staticsDate;

    @ApiModelProperty(value = "投注额")
    private BigDecimal betAmount;

    @ApiModelProperty(value = "有效投注流水")
    private BigDecimal validBetAmount;

    @ApiModelProperty(value = "流水纠正")
    private BigDecimal flowCorrection;

    @ApiModelProperty(value = "游戏盈亏")
    private BigDecimal netAmount;

    @ApiModelProperty(value = "返水金额=会员返水+返水人工加减额")
    private BigDecimal rebateAmount;

    @ApiModelProperty(value = "优惠金额=会员优惠+会员活动人工加减额+会员VIP福利")
    private BigDecimal discountAmount;

    @ApiModelProperty(value = "账户调整=人工加减额中的其他调整额")
    private BigDecimal artificialPatchAmount;

    @ApiModelProperty(value = "场馆费用")
    private BigDecimal venueFee;

    @ApiModelProperty(value = "代理返点")
    private BigDecimal proxyRebatePoint;

    @ApiModelProperty(value = "代理净输赢")
    private BigDecimal proxyNet;

    @ApiModelProperty(value = "上月结余")
    private BigDecimal lastMonthBalance;

    @ApiModelProperty(value = "代理冲正后净输赢")
    private BigDecimal rushNet;

    @ApiModelProperty(value = "会员总盈亏")
    private BigDecimal totalNetAmount;

}
