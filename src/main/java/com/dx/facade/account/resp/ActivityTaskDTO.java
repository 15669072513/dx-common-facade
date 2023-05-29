package com.dx.facade.account.resp;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@ApiModel(value = "com-ob-param-ActivityTaskDTO")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ActivityTaskDTO implements Serializable {
    /**
     *
     */
    @ApiModelProperty(value = "")
    private Long id;

    /**
     * 会员ID
     */
    @ApiModelProperty(value = "会员ID")
    private Long userId;

    /**
     * 商户ID
     */
    @ApiModelProperty(value = "商户ID")
    private Long merchantId;

    /**
     * 业务订单号
     */
    @ApiModelProperty(value = "业务订单号")
    private String businessId;

    /**
     * 优惠模块:1=首存活动，2=vip晋级优惠，3=好友邀请存款任务
     */
    @ApiModelProperty(value = "优惠模块:1=首存活动，2=vip晋级优惠, 3=好友邀请存款任务")
    private Integer taskType;

    /**
     * vip等级id(vip晋级优惠活动)
     */
    @ApiModelProperty(value = "vip等级id(vip晋级优惠活动)")
    private Long vipId;

    /**
     * 活动id
     */
    @ApiModelProperty(value = "活动id")
    private Long activityId;

    /**
     * 场馆编号
     */
    @ApiModelProperty(value = "场馆编号")
    private String gameCode;

    /**
     * 参与时间
     */
    @ApiModelProperty(value = "参与时间")
    private LocalDateTime approveTime;

    /**
     * 上分金额
     */
    @ApiModelProperty(value = "上分金额")
    private BigDecimal upAmount;

    /**
     * 红利比例
     */
    @ApiModelProperty(value = "红利比例")
    private BigDecimal bonusPro;

    /**
     * 红利金额
     */
    @ApiModelProperty(value = "红利金额")
    private BigDecimal bonusAmount;

    /**
     * 流水倍数>0
     */
    @ApiModelProperty(value = "流水倍数>0")
    private BigDecimal billMultiple;

    /**
     * 流水要求金额
     */
    @ApiModelProperty(value = "流水要求金额")
    private BigDecimal billAmount;

    /**
     * 已完成流水金额
     */
    @ApiModelProperty(value = "已完成流水金额")
    private BigDecimal completeBillAmount;

    /**
     * 完成流水状态[0：未完成，1：已完成]
     */
    @ApiModelProperty(value = "完成流水状态[0：未完成，1：已完成]")
    private Integer billStatus;

    /**
     * 活动名称
     */
    @ApiModelProperty(value = "活动名称")
    private String activityName;

    /**
     * 创建时间
     */
    @ApiModelProperty(value = "创建时间")
    private LocalDateTime createdAt;

    /**
     * 更新时间
     */
    @ApiModelProperty(value = "更新时间")
    private LocalDateTime updateAt;

    private static final long serialVersionUID = 1L;
}

