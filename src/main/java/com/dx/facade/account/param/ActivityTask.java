package com.dx.facade.account.param;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 * <p>
 * 优惠活动任务表
 * </p>
 *
 * @author quentin
 * @since 2021-07-27
 */
@Data
public class ActivityTask {

    @ApiModelProperty(value = "ID")
    private Long id;

    @ApiModelProperty(value = "会员ID")
    private Long userId;

    @ApiModelProperty(value = "商户ID")
    private Long merchantId;

    @ApiModelProperty(value = "业务订单号")
    private String businessId;

    @ApiModelProperty(value = "优惠模块:1=首存活动，2=vip晋级优惠)")
    private Integer taskType;

    @ApiModelProperty(value = "vip等级id(vip晋级优惠活动)")
    private Long vipId;

    @ApiModelProperty(value = "活动id")
    private Long activityId;

    @ApiModelProperty(value = "场馆code")
    private String gameCode;

    @ApiModelProperty(value = "参与时间")
    private LocalDateTime approveTime;

    @ApiModelProperty(value = "上分金额")
    private BigDecimal upAmount;

    @ApiModelProperty(value = "红利比例")
    private BigDecimal bonusPro;

    @ApiModelProperty(value = "红利金额")
    private BigDecimal bonusAmount;

    @ApiModelProperty(value = "流水倍数>0")
    private BigDecimal billMultiple;

    @ApiModelProperty(value = "流水要求金额")
    private BigDecimal billAmount;

    @ApiModelProperty(value = "已完成流水金额")
    private BigDecimal completeBillAmount;

    @ApiModelProperty(value = "完成流水状态[0：未完成，1：已完成]")
    private Integer billStatus;

    @ApiModelProperty(value = "活动名称")
    private String activityName;

    @ApiModelProperty(value = "创建时间")
    private LocalDateTime createdAt;

    @ApiModelProperty(value = "更新时间")
    private LocalDateTime updateAt;
    
    @ApiModelProperty(value = "近似最后投注时间")
    private Long approxLastBetTime;


}
