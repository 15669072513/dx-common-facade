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
 * @author grayson
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ActivityApplyRecordPageRespDTO {

    @ApiModelProperty(value = "ID")
    @JsonFormat(shape=JsonFormat.Shape.STRING)
    private Long id;

    @ApiModelProperty(value = "商户ID")
    @JsonFormat(shape=JsonFormat.Shape.STRING)
    private Long merchantId;

    @ApiModelProperty(value = "活动ID")
    @JsonFormat(shape=JsonFormat.Shape.STRING)
    private Long activityId;

    @ApiModelProperty(value = "活动名称")
    private String activityName;

    @ApiModelProperty(value = "活动模板[0:首存活动,1:纯展示页活动")
    private Integer activityType;

    @ApiModelProperty(value = "用户ID")
    @JsonFormat(shape=JsonFormat.Shape.STRING)
    private Long userId;

    @ApiModelProperty(value = "用户名")
    private String userName;

    @ApiModelProperty(value = "应用终端,1:OB旗舰 2:美播真人")
    private Integer appId;

    @ApiModelProperty(value = "登录站点:1OB旗舰,2美播真人")
    private Integer loginAppId;

    @ApiModelProperty(value = "vip等级id")
    @JsonFormat(shape=JsonFormat.Shape.STRING)
    private Long vipId;

    @ApiModelProperty(value = "vip等级序号")
    private Integer vipSerialNum;

    @ApiModelProperty(value = "风控层级id")
    @JsonFormat(shape=JsonFormat.Shape.STRING)
    private Long windControlId;

    @ApiModelProperty(value = "风控层级名称")
    private String windControlName;

    @ApiModelProperty(value = "上级代理id")
    @JsonFormat(shape=JsonFormat.Shape.STRING)
    private Long parentProxyId;

    @ApiModelProperty(value = "上级代理名称")
    private String parentProxyName;

    @ApiModelProperty(value = "申请设备号")
    private String deviceNo;

    @ApiModelProperty(value = "访问终端类型（1-PC，2-IOS_APP，3-IOS_H5，4-Android_H5，5-Android_APP 6-后台）")
    private Integer deviceType;

    @ApiModelProperty(value = "申请金额")
    private BigDecimal upAmount;

    @ApiModelProperty(value = "申请场馆")
    private String gameCode;

    @ApiModelProperty(value = "红利金额")
    private BigDecimal bonusAmount;

    @ApiModelProperty(value = "申请时间")
    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @JsonFormat(shape=JsonFormat.Shape.STRING, pattern="yyyy-MM-dd HH:mm:ss")
    private LocalDateTime createdAt;

}
