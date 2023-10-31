package com.dx.facade.account.resp;

import com.baomidou.mybatisplus.annotation.TableField;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateTimeSerializer;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 * @author grayson
 */
@Data
public class ActivityBonusAuditApplyPageRespDTO {

    @ApiModelProperty(value = "id")
    @JsonFormat(shape=JsonFormat.Shape.STRING)
    private Long id;

    @ApiModelProperty(value = "订单号")
    private String eventId;

    @ApiModelProperty(value = "商户id")
    @JsonFormat(shape=JsonFormat.Shape.STRING)
    private Long merchantId;

    @ApiModelProperty(value = "应用终端,1:OB旗舰 2:美播真人")
    private Integer appId;

    @ApiModelProperty(value = "活动ID")
    @JsonFormat(shape=JsonFormat.Shape.STRING)
    private Long activityId;

    @ApiModelProperty(value = "活动类型")
    private Integer activityType;

    @ApiModelProperty(value = "奖励类型：1-邀请任务，2-投注任务")
    private Integer awardType;

    @ApiModelProperty(value = "活动主标题")
    private String activityTitle;

    @ApiModelProperty(value = "操作类型 1 单会员发放 2 批量发放")
    private Integer operationType;

    @ApiModelProperty(value = "发放位置1 现金钱包 2 红利中心 3 B端场馆")
    private Integer location;

    @ApiModelProperty(value = "场馆code")
    private String gameCode;

    @ApiModelProperty(value = "会员ID")
    @JsonFormat(shape=JsonFormat.Shape.STRING)
    private Long userId;

    @ApiModelProperty(value = "会员账号")
    private String userName;

    @ApiModelProperty(value = "红利金额")
    private BigDecimal bounsAmount;

    @ApiModelProperty(value = "币种")
    private String currency;

    @ApiModelProperty(value = "流水倍数")
    private Integer billMultiple;

    @ApiModelProperty(value = "站内信通知 0 否 1 是")
    private Integer notification;

    @ApiModelProperty(value = "备注")
    private String remark;

    @ApiModelProperty(value = "操作人")
    private String operator;

    @ApiModelProperty(value = "申请时间")
    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @JsonFormat(shape=JsonFormat.Shape.STRING, pattern="yyyy-MM-dd HH:mm:ss")
    private LocalDateTime eventTime;

    @ApiModelProperty(value = "订单状态(1=待一审,2=一审审核,3=待二审,4=二审审核,5=一审拒绝,6=二审拒绝,7=审核通过)")
    private Integer orderStatus;

    @ApiModelProperty(value = "锁单状态(0=未锁单 1=锁单中)")
    private Integer lockStatus;

    @ApiModelProperty(value = "当前锁单时间")
    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @JsonFormat(shape=JsonFormat.Shape.STRING, pattern="yyyy-MM-dd HH:mm:ss")
    private LocalDateTime lockTime;

    @ApiModelProperty(value = "执行锁定人")
    private String lockAccount;

    @ApiModelProperty("锁单人id")
    private Long lockAccountId;

    @ApiModelProperty(value = "一审人")
    private String audit1Operator;

    @ApiModelProperty(value = "一审结果(0=未处理 1=通过 2=拒绝)")
    private Integer audit1Result;

    @ApiModelProperty(value = "一审时间")
    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @JsonFormat(shape=JsonFormat.Shape.STRING, pattern="yyyy-MM-dd HH:mm:ss")
    private LocalDateTime audit1Time;

    @ApiModelProperty(value = "一审备注")
    private String audit1Desc;

    @ApiModelProperty(value = "一审时长，秒，锁单到审核完毕的耗时")
    private Integer audit1Cost;

    @ApiModelProperty(value = "二审人")
    private String audit2Operator;

    @ApiModelProperty(value = "二审结果(0=未处理 1=通过 2=拒绝)")
    private Integer audit2Result;

    @ApiModelProperty(value = "二审时间")
    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @JsonFormat(shape=JsonFormat.Shape.STRING, pattern="yyyy-MM-dd HH:mm:ss")
    private LocalDateTime audit2Time;

    @ApiModelProperty(value = "二审备注")
    private String audit2Desc;

    @ApiModelProperty(value = "二审时长，秒，锁单到审核完毕的耗时")
    private Integer audit2Cost;

    @ApiModelProperty(value = "创建时间")
    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @JsonFormat(shape=JsonFormat.Shape.STRING, pattern="yyyy-MM-dd HH:mm:ss")
    private LocalDateTime createdAt;

    @ApiModelProperty(value = "修改时间")
    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @JsonFormat(shape=JsonFormat.Shape.STRING, pattern="yyyy-MM-dd HH:mm:ss")
    private LocalDateTime updatedAt;
}

