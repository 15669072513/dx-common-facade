package com.dx.facade.report.param.report.profitandloss;

import com.baomidou.mybatisplus.annotation.TableField;
import com.dx.facade.report.param.report.basic.MemberBasicVo;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
//@TableName("dwm_member_net_amount_day")
@ApiModel(value = "DwmMemberNetAmountDayPO", description = "会员盈亏统计天表")
public class DwmMemberNetAmountDayPO extends MemberBasicVo {

    private static final long serialVersionUID = 1L;


    @ApiModelProperty("日期,比如20210531")
    @TableField(value = "statics_date")
    private Integer staticsDate;

//    @ApiModelProperty("账户状态")
//    private Integer accountStatus;

    @ApiModelProperty("登陆锁定状态 0-未锁定 1-登陆锁定")
    private Integer paymentLockStatus;
    @ApiModelProperty("充提锁定状态 0-未锁定 1-充提锁定")
    private Integer loginLockStatus;
    @ApiModelProperty("游戏锁定状态 0-未锁定 1-游戏锁定")
    private Integer gameLockStatus;

    @ApiModelProperty("风控层级")
    private String windControlLevelName;


    @ApiModelProperty("注单数")
    @TableField("bet_count")
    private Long betCount;

    @ApiModelProperty("投注金额")
    @TableField("bet_amount")
    private BigDecimal betAmount;

    @ApiModelProperty("有效投注")
    @TableField("valid_bet_amount")
    private BigDecimal validBetAmount;

    @ApiModelProperty("盈亏金额")
    @TableField("net_amount")
    private BigDecimal netAmount;

    @ApiModelProperty("会员盈利率")
    private BigDecimal memberProfitRate;
//
//    @ApiModelProperty("其他调整")
//    private BigDecimal otherChip;

    @ApiModelProperty("净盈亏")
    private BigDecimal netProfit;

    @ApiModelProperty("资料创建时间")
    @TableField("created_at")
    private LocalDateTime createdAt;

    @ApiModelProperty("更新时间")
    @TableField("updated_at")
    private LocalDateTime updatedAt;


}