package com.dx.facade.account.resp;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateTimeSerializer;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 * @Author: AC
 * @Description: TODO
 * @Date: 2023/04/12 10:32
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ActivityInviteTaskRespDTO {

    @ApiModelProperty(value = "id")
    @JsonFormat(shape=JsonFormat.Shape.STRING)
    private Long id;

    @ApiModelProperty(value = "商户id")
    @JsonFormat(shape=JsonFormat.Shape.STRING)
    private Long merchantId;

    @ApiModelProperty(value = "应用终端,1:OB旗舰 2:美播真人")
    private Integer appId;

    @ApiModelProperty("邀请人账号")
    private String inviteUserName;

    @ApiModelProperty("被邀请人账号")
    private String inviteesUserName;

    @ApiModelProperty(value = "注册时间")
    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @JsonFormat(shape=JsonFormat.Shape.STRING, pattern="yyyy-MM-dd HH:mm:ss")
    private LocalDateTime registerAt;

    @ApiModelProperty("注册IP")
    private String registerIp;

    @ApiModelProperty("注册设备号")
    private String registerDeviceNo;

    @ApiModelProperty(value = "首存时间")
    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @JsonFormat(shape=JsonFormat.Shape.STRING, pattern="yyyy-MM-dd HH:mm:ss")
    private LocalDateTime firstDepositTime;

    @ApiModelProperty("首存金额")
    private BigDecimal firstDepositAmount;

    @ApiModelProperty("累计存款金额")
    private BigDecimal totalDepositAmount;

    @ApiModelProperty("存款达标金额")
    private BigDecimal taskDeposit;

    @ApiModelProperty("存款计算方式: 1-首存存款 2-累计存款")
    private Integer depositCountType;

    @ApiModelProperty("邀请任务奖励形式: 1-按存款金额 2-按邀请人数")
    private Integer rewardType;

    @ApiModelProperty("邀请人奖励礼金")
    private BigDecimal inviteRewardAmount;

    @ApiModelProperty("邀请人派奖时间")
    @JsonFormat(shape=JsonFormat.Shape.STRING, pattern="yyyy-MM-dd HH:mm:ss")
    private LocalDateTime inviteRewardAt;

    @ApiModelProperty("邀请人派奖状态 1.未达标 2.已失效 3.审核中 4.已拒绝 5.待领取 6.已领取 7.已过期")
    private Integer inviteRewardStatus;

    @ApiModelProperty("被邀请人奖励礼金")
    private BigDecimal inviteesRewardAmount;

    @ApiModelProperty("被邀请人派奖时间")
    @JsonFormat(shape=JsonFormat.Shape.STRING, pattern="yyyy-MM-dd HH:mm:ss")
    private LocalDateTime inviteesRewardAt;

    @ApiModelProperty("被邀请人派奖状态 1.未达标 2.已失效 3.审核中 4.已拒绝 5.待领取 6.已领取 7.已过期")
    private Integer inviteesRewardStatus;


}