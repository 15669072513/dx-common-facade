package com.dx.facade.account.resp;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 * @author orbit
 * @datetime 2023-09-25 13:39
 * @desc 提现限制信息响应DTO
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class WithdrawLimitInfoRespDTO implements Serializable {
    /**
     * 会员代理ID
     */
    @ApiModelProperty("用户id")
    private Long userId;

    /**
     * 用户类型:0-会员，1-代理
     */
    @ApiModelProperty("用户类型:0-会员，1-代理")
    private Integer userType;

    /**
     * 取款类型
     */
    @ApiModelProperty("取款限制类型:1-账单，2-流水")
    private Integer withdrawLimitType;

    /**
     * 线上取款剩余可提现金额
     */
    private BigDecimal onlineWithdrawRemainAmount;

    /**
     * 线下取款剩余可提现金额
     */
    private BigDecimal offlineWithdrawRemainAmount;

    /**
     * 线下取款剩余可提现金额
     */
    private BigDecimal withdrawRemainAmount;

    /**
     * 已完成有效流水
     */
    @ApiModelProperty("已完成有效流水")
    private BigDecimal completeBillAmount;

    /**
     * 所需有效流水
     */
    @ApiModelProperty("所需有效流水")
    private BigDecimal validBillAmount;

    /**
     * 流水开始时间
     */
    @ApiModelProperty("流水开始时间")
    private LocalDateTime billStartTime;

    /**
     * 手动调整总额
     */
    @ApiModelProperty("手动调整总额")
    private BigDecimal totalAdjust;
    @ApiModelProperty(value = "取款标记,0-不能取款，1-可以取款，该字段只有在是流水限制类型，且所需有效流水和已完成流水都是0时，才需要判断")
    private Integer withdrawFlag = 0;

}
