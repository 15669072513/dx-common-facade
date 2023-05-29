package com.dx.facade.account.param;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.util.Assert;

import com.dx.facade.account.service.BaseParmDTO;
import com.dx.facade.member.exception.ErrorCode;

import java.time.LocalDateTime;

/**
 * 余额输出
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ActivityTaskReqDto implements BaseParmDTO {

    @ApiModelProperty(value = "会员ID")
    private Long userId;

    @ApiModelProperty(value = "商户ID",required = true)
    private Long merchantId;

    @ApiModelProperty(value = "活动id")
    private Long activityId;

    @ApiModelProperty(value = "场馆code",required = true)
    private String gameCode;

    @ApiModelProperty(value = "优惠模块:1=首存活动，2=vip晋级优惠")
    private Integer taskType;

    @ApiModelProperty(value = "开始时间")
    private LocalDateTime startTime;

    @ApiModelProperty(value = "结束时间")
    private LocalDateTime endTime;

    @ApiModelProperty(value = "完成流水状态[0：未完成，1：已完成]")
    private Integer billStatus;

    @Override
    public void check() {
        Assert.notNull(merchantId, ErrorCode.MISSING_PARAM_EXCEPTION.messageAfter("merchantId"));
        Assert.notNull(userId, ErrorCode.MISSING_PARAM_EXCEPTION.messageAfter("userId"));
        Assert.notNull(activityId, ErrorCode.MISSING_PARAM_EXCEPTION.messageAfter("activityId"));
    }
}
