package com.dx.facade.account.req;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.util.Assert;

import com.dx.facade.member.exception.ErrorCode;

import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 * @author grayson
 */
@Slf4j
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class AddBonusAuditParamDTO implements BaseParmDTO {

    @ApiModelProperty(value = "订单号")
    private String eventId;

    @ApiModelProperty(value = "商户id")
    private Long merchantId;

    @ApiModelProperty(value = "应用终端,1:OB旗舰 2:美播真人")
    private Integer appId;

    @ApiModelProperty(value = "活动类型，详见ActivityEnums.ActivityType")
    private Integer activityType;

    @ApiModelProperty(value = "奖励类型：1-邀请任务，2-投注任务")
    private Integer awardType;

    @ApiModelProperty(value = "好友邀请角色类型： 1-邀请人 2-被邀请人")
    private Integer inviteRuleType;

    @ApiModelProperty(value = "被邀请人Id")
    private Long inviteesUserId;

    @ApiModelProperty(value = "被邀请人账号")
    private String inviteesUserName;

    @ApiModelProperty(value = "活动ID")
    private Long activityId;

    @ApiModelProperty(value = "活动主标题")
    private String activityTitle;

    @ApiModelProperty(value = "活动名称")
    private String activityName;

    @ApiModelProperty(value = "发放位置1 现金钱包 2 红利中心 3 B端钱包，详见ActivityEnums.ActivityBonusAuditLocation")
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

    @ApiModelProperty(value = "备注")
    private String remark;

    @ApiModelProperty(value = "操作人")
    private String operator;

    @ApiModelProperty(value = "申请时间")
    private LocalDateTime eventTime;

    @ApiModelProperty(value = "创建时间")
    private LocalDateTime createdAt;

    @Override
    public void check() {
        Assert.notNull(eventId, ErrorCode.CHECK_PARAM_EXCEPTION.messageAfter("eventId"));
        Assert.notNull(merchantId, ErrorCode.CHECK_PARAM_EXCEPTION.messageAfter("merchantId"));
        Assert.notNull(appId, ErrorCode.CHECK_PARAM_EXCEPTION.messageAfter("appId"));
        Assert.notNull(activityType, ErrorCode.CHECK_PARAM_EXCEPTION.messageAfter("activityType"));
        Assert.notNull(activityTitle, ErrorCode.CHECK_PARAM_EXCEPTION.messageAfter("activityTitle"));
        Assert.notNull(activityName, ErrorCode.CHECK_PARAM_EXCEPTION.messageAfter("activityName"));
        Assert.notNull(location, ErrorCode.CHECK_PARAM_EXCEPTION.messageAfter("location"));
        Assert.notNull(userId, ErrorCode.CHECK_PARAM_EXCEPTION.messageAfter("userId"));
        Assert.notNull(userName, ErrorCode.CHECK_PARAM_EXCEPTION.messageAfter("userName"));
        Assert.notNull(bounsAmount, ErrorCode.CHECK_PARAM_EXCEPTION.messageAfter("bounsAmount"));
        Assert.notNull(billMultiple, ErrorCode.CHECK_PARAM_EXCEPTION.messageAfter("billMultiple"));
        Assert.notNull(remark, ErrorCode.CHECK_PARAM_EXCEPTION.messageAfter("remark"));
        Assert.notNull(operator, ErrorCode.CHECK_PARAM_EXCEPTION.messageAfter("operator"));
        Assert.notNull(eventTime, ErrorCode.CHECK_PARAM_EXCEPTION.messageAfter("eventTime"));
        Assert.notNull(createdAt, ErrorCode.CHECK_PARAM_EXCEPTION.messageAfter("createdAt"));
//        if(activityType.equals(ActivityEnums.ActivityType.好友邀请.code())){
//            Assert.notNull(awardType, ErrorCode.CHECK_PARAM_EXCEPTION.messageAfter("awardType"));
//            Assert.notNull(inviteRuleType, ErrorCode.CHECK_PARAM_EXCEPTION.messageAfter("inviteRuleType"));
//            Assert.notNull(inviteesUserId, ErrorCode.CHECK_PARAM_EXCEPTION.messageAfter("inviteesUserId"));
//            Assert.notNull(inviteesUserName, ErrorCode.CHECK_PARAM_EXCEPTION.messageAfter("inviteesUserName"));
//        }else if(activityType.equals(ActivityEnums.ActivityType.首存活动.code())){
//            Assert.notNull(gameCode, ErrorCode.CHECK_PARAM_EXCEPTION.messageAfter("gameCode"));
//        }
    }
}
