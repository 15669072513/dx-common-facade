package com.dx.facade.account.param;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class SelectActivityTaskReqDTO {

    /**
     * 会员ID
     */
    @ApiModelProperty(value = "会员ID")
    @NotNull(message = "会员ID不允许为空")
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private Long userId;

    /**
     * 商户ID
     */
    @ApiModelProperty(value = "商户ID")
    @NotNull(message = "商户ID不允许为空")
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private Long merchantId;
    
    @ApiModelProperty(value = "活动id")
    private Long activityId;

    @ApiModelProperty(value = "优惠模块:1=首存活动，2=vip晋级优惠")
    private Integer taskType;
    
    /**
     * 场馆编号
     */
    @ApiModelProperty(value = "场馆编号")
    @NotBlank(message = "场馆编号不允许为空")
    private String gameCode;

    @ApiModelProperty(value = "完成流水状态[0：未完成，1：已完成]", hidden = true)
    private Integer billStatus;
    
    @ApiModelProperty(value = "开始时间")
    private LocalDateTime startTime;

    @ApiModelProperty(value = "结束时间")
    private LocalDateTime endTime;
}
