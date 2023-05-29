package com.dx.facade.account.resp;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Slf4j
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ActivityBonusAuditRespDTO {
    @ApiModelProperty(value = "id")
    @TableId(value = "id", type = IdType.INPUT)
    private Long id;

    @ApiModelProperty(value = "订单号")
    private String eventId;

    @ApiModelProperty(value = "商户id")
    private Long merchantId;

    @ApiModelProperty(value = "应用终端,1:OB旗舰 2:美播真人")
    private Integer appId;

    @ApiModelProperty(value = "活动ID")
    private Long activityId;

    @ApiModelProperty(value = "活动类型")
    private Integer activityType;

    @ApiModelProperty(value = "奖励类型：1-邀请任务，2-投注任务")
    private Integer awardType;

    @ApiModelProperty(value = "好友邀请角色类型： 1-邀请人 2-被邀请人")
    private Integer inviteRuleType;

    @ApiModelProperty(value = "被邀请人Id")
    private Long inviteesUserId;

    @ApiModelProperty(value = "被邀请人账号")
    private String inviteesUserName;

    @ApiModelProperty(value = "活动名称")
    private String activityName;

    @ApiModelProperty(value = "活动主标题")
    private String activityTitle;

    @ApiModelProperty(value = "操作类型 1 单会员发放 2 批量发放")
    private Integer operationType;

    @ApiModelProperty(value = "发放位置1 中心钱包 2 红利中心")
    private Integer location;

    @ApiModelProperty(value = "场馆code")
    private String gameCode;

    @ApiModelProperty(value = "会员ID")
    private Long userId;

    @ApiModelProperty(value = "会员账号")
    private String userName;

    @ApiModelProperty(value = "红利金额")
    private BigDecimal bounsAmount;

    @ApiModelProperty(value = "流水倍数")
    private Integer billMultiple;

    @ApiModelProperty(value = "站内信通知 0 否 1 是")
    private Integer notification;

    @ApiModelProperty(value = "备注")
    private String remark;

    @ApiModelProperty(value = "操作人")
    private String operator;

    @ApiModelProperty(value = "申请时间")
    private LocalDateTime eventTime;

    @ApiModelProperty(value = "订单状态(1=待一审,2=一审审核,3=待二审,4=二审审核,5=一审拒绝,6=二审拒绝,7=审核通过)")
    private Integer orderStatus;

    @ApiModelProperty(value = "锁单状态(0=未锁单 1=锁单中)")
    private Integer lockStatus;

    @ApiModelProperty(value = "当前锁单时间")
    private LocalDateTime lockTime;

    @ApiModelProperty(value = "执行锁定人")
    private String lockAccount;

    @ApiModelProperty(value = "一审人")
    private String audit1Operator;

    @ApiModelProperty(value = "一审结果(0=未处理 1=通过 2=拒绝)")
    private Integer audit1Result;

    @ApiModelProperty(value = "一审时间")
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
    private LocalDateTime audit2Time;

    @ApiModelProperty(value = "二审备注")
    private String audit2Desc;

    @ApiModelProperty(value = "二审时长，秒，锁单到审核完毕的耗时")
    private Integer audit2Cost;

    @ApiModelProperty(value = "创建时间")
    private LocalDateTime createdAt;

    @ApiModelProperty(value = "修改时间")
    private LocalDateTime updatedAt;

    @ApiModelProperty("币种")
    private String currency;
}
