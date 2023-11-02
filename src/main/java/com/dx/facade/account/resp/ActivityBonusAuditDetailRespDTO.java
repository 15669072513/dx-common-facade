package com.dx.facade.account.resp;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
public class ActivityBonusAuditDetailRespDTO {

    /** 用户部分 **/

    @ApiModelProperty(value = "会员id")
    @JsonFormat(
            shape = JsonFormat.Shape.STRING
    )
    private Long userId;

    @ApiModelProperty(value = "会员账号")
    private String userName;

    @ApiModelProperty(value = "账号类型（1-试玩，2-商务，3-正式，4-测试，5-置换）")
    private Integer accountType;

    @ApiModelProperty(value = "登陆锁定状态 0-未锁定 1-登陆锁定")
    private Integer loginLockStatus;

    @ApiModelProperty(value = "账号锁定状态 0-未锁定 1-充提锁定")
    private Integer accountLockStatus;

    @ApiModelProperty(value = "游戏锁定状态 0-未锁定 1-游戏锁定")
    private Integer gameLockStatus;

    @ApiModelProperty(value = "上级代理id")
    @JsonFormat(
            shape = JsonFormat.Shape.STRING
    )
    private Long parentProxyId;

    @ApiModelProperty(value = "上级代理账号")
    private String parentProxyName;

    @ApiModelProperty(value = "真实姓名")
    private String realName;

    @ApiModelProperty(value = "vip等级序号")
    private Integer vipSerialNum;

    @ApiModelProperty(value = "风控层级id")
    @JsonFormat(
            shape = JsonFormat.Shape.STRING
    )
    private Long windControlId;

    @ApiModelProperty(value = "风控层级名")
    private String windControlLevelName;

    // 会员注册信息
    @ApiModelProperty("注册时间")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private LocalDateTime registerTime;

    @ApiModelProperty("注册设备号")
    private String registerDeviceNo;

    @ApiModelProperty("最后登陆时间")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private LocalDateTime lastLoginDatetime;

    @ApiModelProperty("最后下注时间")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private LocalDateTime lastBetTime;

    @ApiModelProperty("最后登录IP")
    private String lastLoginIp;

    @ApiModelProperty("最后登录设备号")
    private String lastLoginDeviceNo;

    @ApiModelProperty("注册端")
    private String registryAppTypeStr;

    @ApiModelProperty("注册IP")
    private String registerIp;

    @ApiModelProperty("IP归属地")
    private String ipAttribution;

    @ApiModelProperty("会员标签")
    private String labelName;

    @ApiModelProperty("会员备注")
    private String memberRemark;

    @ApiModelProperty("绑定银行卡数量")
    private Integer bindBankCardCount;

    @ApiModelProperty("绑定虚拟币数量")
    private Integer bindVirtualCount;

    /** 申请信息部分 **/

    @ApiModelProperty(value = "红利id")
    @JsonFormat(
            shape = JsonFormat.Shape.STRING
    )
    private Long bonusId;

    @ApiModelProperty(value = "活动主标题")
    private String activityTitle;

    @ApiModelProperty(value = "红利金额")
    private BigDecimal bounsAmount;

    @ApiModelProperty(value = "流水倍数")
    private Integer billMultiple;

    @ApiModelProperty(value = "发放位置1 现金钱包 2 红利中心 3 B端场馆")
    private Integer location;

    @ApiModelProperty(value = "场馆code")
    private String gameCode;

    @ApiModelProperty(value = "游戏平台名称", required = true)
    private String gameName;

    @ApiModelProperty(value = "申请人")
    private String operator;

    @ApiModelProperty(value = "申请时间")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime eventTime;

    @ApiModelProperty(value = "申请备注")
    private String remark;

    /** 审核信息 **/

    @ApiModelProperty(value = "一审人")
    private String audit1Operator;

    @ApiModelProperty(value = "一审时间")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime audit1Time;

    @ApiModelProperty(value = "一审备注")
    private String audit1Desc;

    @ApiModelProperty(value = "二审人")
    private String audit2Operator;

    @ApiModelProperty(value = "二审时间")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime audit2Time;

    @ApiModelProperty(value = "二审备注")
    private String audit2Desc;


    /** 补充信息 场馆使用 **/

    @ApiModelProperty(value = "订单号")
    private String eventId;

    @ApiModelProperty(value = "商户id")
    @JsonFormat(
            shape = JsonFormat.Shape.STRING
    )
    private Long merchantId;

    @ApiModelProperty(value = "应用终端,1:OB旗舰 2:美播真人")
    private Integer appId;

    @ApiModelProperty(value = "活动ID")
    @JsonFormat(
            shape = JsonFormat.Shape.STRING
    )
    private Long activityId;

    @ApiModelProperty(value = "活动类型")
    private Integer activityType;

    @ApiModelProperty(value = "奖励类型：1-邀请任务，2-投注任务")
    private Integer awardType;

    @ApiModelProperty(value = "活动名称")
    private String activityName;

    @ApiModelProperty(value = "操作类型 1 单会员发放 2 批量发放")
    private Integer operationType;

    @ApiModelProperty(value = "站内信通知 0 否 1 是")
    private Integer notification;

    @ApiModelProperty(value = "订单状态(1=待一审,2=一审审核,3=待二审,4=二审审核,5=一审拒绝,6=二审拒绝,7=审核通过)")
    private Integer orderStatus;

    @ApiModelProperty(value = "锁单状态(0=未锁单 1=锁单中)")
    private Integer lockStatus;

    @ApiModelProperty(value = "当前锁单时间")
    private LocalDateTime lockTime;

    @ApiModelProperty(value = "执行锁定人")
    private String lockAccount;

    @ApiModelProperty(value = "一审结果(0=未处理 1=通过 2=拒绝)")
    private Integer audit1Result;

    @ApiModelProperty(value = "一审时长，秒，锁单到审核完毕的耗时")
    private Integer audit1Cost;

    @ApiModelProperty(value = "二审结果(0=未处理 1=通过 2=拒绝)")
    private Integer audit2Result;

    @ApiModelProperty(value = "二审时长，秒，锁单到审核完毕的耗时")
    private Integer audit2Cost;

    @ApiModelProperty(value = "创建时间")
    private LocalDateTime createdAt;

    @ApiModelProperty(value = "修改时间")
    private LocalDateTime updatedAt;

    @ApiModelProperty(value = "币种")
    private String currency;

}
