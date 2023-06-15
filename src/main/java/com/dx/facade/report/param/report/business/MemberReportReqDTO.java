package com.dx.facade.report.param.report.business;

import com.baomidou.mybatisplus.annotation.TableField;
import com.dx.facade.report.param.report.basic.MemberBasicVo;
import io.swagger.annotations.ApiModelProperty;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class MemberReportReqDTO extends MemberBasicVo {

    @ApiModelProperty("会员创建时间")
    @TableField("user_created_at")
    private LocalDateTime userCreatedAt;
    @ApiModelProperty("注单数")
    private Long minBetCount;
    @ApiModelProperty("注单数")
    private Long maxBetCount;

    @ApiModelProperty("最小投注金额")
    private BigDecimal minBetAmount;
    @ApiModelProperty("最大投注金额")
    private BigDecimal maxBetAmount;

    @ApiModelProperty("有效投注")
    private BigDecimal minValidBetAmount;
    @ApiModelProperty("有效投注")
    private BigDecimal maxValidBetAmount;

    @ApiModelProperty("最小盈亏金额")
    @TableField("min_net_amount")
    private BigDecimal minNetAmount;

    @ApiModelProperty("最大盈亏金额")
    private BigDecimal maxNetAmount;

    @ApiModelProperty("最小净盈亏")
    private BigDecimal minNetProfit;

    @ApiModelProperty("最大净盈亏")
    private BigDecimal maxNetProfit;

}
