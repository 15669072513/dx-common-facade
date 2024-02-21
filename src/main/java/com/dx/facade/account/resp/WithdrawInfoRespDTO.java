package com.dx.facade.account.resp;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;
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
 * @desc 提现相关信息响应DTO
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class WithdrawInfoRespDTO implements Serializable {
    /**
     * 会员代理ID
     */
    @ApiModelProperty(value = "")
    @JsonSerialize(using = ToStringSerializer.class)
    private Long userId;
    /**
     * 用户类型:0-会员，1-代理
     */
    @ApiModelProperty(value = "用户类型:0-会员，1-代理")
    private Integer userType;
    /**
     * 可提现净资产
     */
    @ApiModelProperty(value = "可提现净资产")
    private BigDecimal withdrawAsset;
    /**
     * 今日提现次数
     */
    @ApiModelProperty(value = "今日提现次数")
    private Integer withdrawCountToday;
    /**
     * 每天最大提现次数
     */
    @ApiModelProperty(value = "每天最大提现次数")
    private Integer withdrawCountMaxToday;
    /**
     * 今日可用提现额度
     */
    @ApiModelProperty(value = "今日可用提现额度")
    private BigDecimal withdrawAvailableToday;
    /**
     * 取款类型
     */
    @ApiModelProperty(value = "取款类型: 1-账单限制，2流水限制")
    private Integer withdrawLimitType;
    /**
     * 剩余可提现金额
     */
    @ApiModelProperty(value = "剩余可提现金额")
    private BigDecimal withdrawRemainAmount;
    /**
     * 已完成有效流水
     */
    @ApiModelProperty(value = "已完成有效流水")
    private BigDecimal completeBillAmount;
    /**
     * 所需有效流水
     */
    @ApiModelProperty(value = "所需有效流水")
    private BigDecimal validBillAmount;
    /**
     * 流水开始时间
     */
    @ApiModelProperty(value = "流水开始时间")
    private LocalDateTime billStartTime;

    @ApiModelProperty(value = "取款标记,0-不能取款，1-可以取款，该字段只有在是流水限制类型，且所需有效流水和已完成流水都是0时，才需要判断")
    private Integer withdrawFlat = 0;

}
