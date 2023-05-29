package com.dx.facade.account.resp;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateTimeSerializer;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 * @author agan
 */
@Data
public class ActivityInviteBetRespDTO {

    @ApiModelProperty("id")
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private Long id;

    @ApiModelProperty("活动ID")
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private Long activityId;

    @ApiModelProperty("商户ID")
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private Long merchantId;

    @ApiModelProperty("应用终端 1:OB旗舰 2:美播真人")
    private Integer appId;

    @ApiModelProperty("邀请人ID")
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private Long inviteUserId;

    @ApiModelProperty("邀请人账号")
    private String inviteUserName;

    @ApiModelProperty("被邀请人ID")
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private Long inviteesUserId;

    @ApiModelProperty("被邀请人账号")
    private String inviteesUserName;

    @ApiModelProperty("邀请人奖励订单号")
    private String eventId;

    @ApiModelProperty("投注任务计算方式：1-注册后开始起算 2-首存后开始起算")
    private Integer betCountType;

    @ApiModelProperty("注册时间")
    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private LocalDateTime registerAt;

    @ApiModelProperty("首存时间")
    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private LocalDateTime firstDepositTime;

    @ApiModelProperty("开始返利时间")
    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private LocalDateTime startRebateTime;

    @ApiModelProperty("结束返利时间")
    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private LocalDateTime endRebateTime;

    @ApiModelProperty("有效投注额")
    private BigDecimal validBetAmount;

    @ApiModelProperty("累计返利")
    private BigDecimal rebateAmount;

    @ApiModelProperty("是否达标(0=否, 1=是)")
    private Integer status;

    @ApiModelProperty("总派发返利")
    private BigDecimal totalRebate;

    @ApiModelProperty("剩余返利余额")
    private BigDecimal remainRebateAmount;

    @ApiModelProperty("返利有效期-天")
    private Integer rebateValidity;

    @ApiModelProperty("是否过有效期(0=否, 1=是)")
    private Integer validityPeriodStatus;

    @ApiModelProperty("创建时间")
    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private LocalDateTime createdAt;

    @ApiModelProperty("修改时间")
    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private LocalDateTime updatedAt;

    @ApiModelProperty("返利记录状态 1.未达标 2.进行中 3.已过期")
    private Integer betRecordStatus;

//    @ApiModelProperty("今日投注任务详情")
//    private ActivityInviteBetDetailsRespDTO todayBetDetails;

    private Integer sortField;

    private BigDecimal todayRebateAmount;



}
