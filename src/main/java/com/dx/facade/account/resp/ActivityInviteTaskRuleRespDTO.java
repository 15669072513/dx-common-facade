package com.dx.facade.account.resp;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateTimeSerializer;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
public class ActivityInviteTaskRuleRespDTO {

    @ApiModelProperty("id")
    private Long id;

    @ApiModelProperty("活动ID")
    private Long activityId;

    @ApiModelProperty("存款金额(首存或累计）")
    private BigDecimal depositAmount;

    @ApiModelProperty("邀请人数")
    private Integer inviteNum;

    @ApiModelProperty("邀请人奖励礼金或比例")
    private BigDecimal inviteRewardAmount;

    @ApiModelProperty("被邀请人奖励礼金或比例")
    private BigDecimal inviteesRewardAmount;

    @ApiModelProperty("流水（倍）")
    private Integer validMultiple;

    @ApiModelProperty("创建时间")
    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private LocalDateTime createdAt;

    @ApiModelProperty("邀请人是否可以领取：true 可以 false 不可以")
    private Boolean inviteRewardFlag;

}
