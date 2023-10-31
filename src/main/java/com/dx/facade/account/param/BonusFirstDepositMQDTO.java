package com.dx.facade.account.param;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import com.dx.facade.member.resp.MemberInfoRespDTO;

/**
 * @author agan
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class BonusFirstDepositMQDTO {

    @ApiModelProperty(value = "审核主键id", required = true)
    private Long auditId;

    @ApiModelProperty(value = "商户id", required = true)
    private Long merchantId;

    @ApiModelProperty(value = "用户", required = true)
    private MemberInfoRespDTO user;

    @ApiModelProperty(value = "活动Id")
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

    @ApiModelProperty(value = "发放位置1 现金钱包 2 红利中心 3 B端场馆")
    private Integer location;

    @ApiModelProperty(value = "红利金额", required = true)
    private BigDecimal bonusAmount;

    @ApiModelProperty(value = "流水金额", required = true)
    private BigDecimal billAmount;

    @ApiModelProperty(value = "订单号")
    private String eventId;

    @ApiModelProperty(value = "场馆code")
    private String gameCode;

    @ApiModelProperty(value = "二审时间")
    private LocalDateTime audit2Time;

    @ApiModelProperty(value = "应用终端,1:OB旗舰 2:美播真人")
    private Integer appId;

    @ApiModelProperty(value = "备注", required = true)
    private String remark;
}
