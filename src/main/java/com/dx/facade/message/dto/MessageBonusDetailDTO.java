package com.dx.facade.message.dto;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * <p>
 * 红利明细表
 * </p>
 *
 * @author dereck
 * @since 2022-10-05
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ApiModel(value = "BwMessageBonusDetailPO对象", description = "红利明细表")
public class MessageBonusDetailDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("主键,即消息的id")
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private Long id;

    @ApiModelProperty("用户id")
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private Long userId;

    @ApiModelProperty("商户id")
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private Long merchantId;

    @ApiModelProperty("红利类型[ 1、升级礼金，2、生日礼金，3、上半月红包，4、下半月红包，5、会员返水，6、充值送活动]")
    private Integer bonusType;

    @ApiModelProperty("红利金额")
    private BigDecimal bonusAmount;

    @ApiModelProperty("需要的流水金额")
    private BigDecimal billAmount;

    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private String businessId;

    @ApiModelProperty("状态,0=未领取,1=已领取")
    private Integer bonusStatus;

    private String remark;

    @ApiModelProperty("红利消息")
    private String content;

    @ApiModelProperty("红利标题")
    private String title;

    @ApiModelProperty("创建时间")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private LocalDateTime createdAt;

    @ApiModelProperty("领取时间")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private LocalDateTime receiveTime;

    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @ApiModelProperty(value = "邀请用户ID")
    private Long inviteUserId;

    @ApiModelProperty(value = "邀请用户 用户名")
    private String inviteUserName;


}
