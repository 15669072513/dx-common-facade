package com.dx.facade.account.resp;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
public class UserVipActivityInfoRespDTO {

    @ApiModelProperty(value = "会员ID")
    private Long userId;

    @ApiModelProperty(value = "商户ID")
    private Long merchantId;

    @ApiModelProperty("vip等级")
    private Integer vipSerialNum;


    @ApiModelProperty(value = "参与活动状态：0未参与，1参与中，2已完成")
    private Integer activityStatus;


    @ApiModelProperty(value = "活动id")
    private Long activityId;

    @ApiModelProperty(value = "场馆名称")
    private String gameName;

    @ApiModelProperty(value = "参与时间")
    @JsonFormat(shape=JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private LocalDateTime approveTime;

    @ApiModelProperty(value = "未完成流水金额")
    private BigDecimal undoneBillAmount;

    @ApiModelProperty(value = "活动名称")
    private String activityName;

    private static final long serialVersionUID = 1L;
}
