package com.dx.facade.report.resp.report;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.math.BigDecimal;

@Data
public class MemberRebateDSummaryResp {
//    /**
//     * 总会员游戏流水
//     */
//    @ApiModelProperty(value = "总会员游戏流水")
//    private BigDecimal totalBetAmount;
//
//    /**
//     * 总会员有效游戏流水
//     */
//    @ApiModelProperty(value = "总会员有效游戏流水")
//    private BigDecimal totalValidBetAmount;
//
//    /**
//     * 会员游戏注单量
//     */
//    @ApiModelProperty(value = "会员游戏注单量")
//    private Integer totalBetNum;


    @ApiModelProperty(value = "币种")
    private String currency;

//    /**
//     * 总会员流水纠正金额
//     */
//    @ApiModelProperty(value = "总会员流水纠正金额")
//    private BigDecimal totalAdjustBetAmount;
//
//    /**
//     * 实际总流水金额
//     */
//    @ApiModelProperty(value = "实际总流水金额")
//    private BigDecimal totalRealBetAmount;
//
//    /**
//     * 会员总盈亏
//     */
//    @ApiModelProperty(value = "会员总盈亏")
//    private BigDecimal totalNetAmount;

    /**
     * 返点金额
     */
    @ApiModelProperty(value = "返水金额")
    private BigDecimal rebateAmount;

    /**
     * 个人返点金额
     */
    @ApiModelProperty(value = "个人返水金额")
    private BigDecimal personRebateAmount;

//    /**
//     * 下级返点金额
//     */
//    @ApiModelProperty(value = "下级返点金额")
//    private BigDecimal childRebateAmount;

    @ApiModelProperty(value = "派发状态 (0-未结算 1-待审核 2=待领取 3-领取成功 4-超时未领取 5-无返点 6-已取消)")
    private Integer payoutStatus;

    @ApiModelProperty(value = "会员账号")
    private String memberName;
}
