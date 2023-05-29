package com.dx.facade.account.param;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import java.math.BigDecimal;

import com.dx.facade.account.resp.GetScActivityBonusRespDTO;
import com.dx.facade.member.resp.MemberInfoRespDTO;

/**
 * @author agan
 */
@Slf4j
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ApplyActivitySCRecordParamDTO {

    @ApiModelProperty(value = "商户ID")
    private Long merchantId;

    @ApiModelProperty(value = "商户名称")
    private String merchantName;

    @ApiModelProperty(value = "活动ID")
    private Long activityId;

    @ApiModelProperty(value = "用户ID")
    private Long userId;

    @ApiModelProperty(value = "申请设备号")
    private String deviceNo;

    @ApiModelProperty(value = "访问终端类型（1-PC，2-IOS_APP，3-IOS_H5，4-Android_H5，5-Android_APP 6-后台）")
    private Integer deviceType;

    @ApiModelProperty(value = "申请金额")
    private BigDecimal upAmount;

    @ApiModelProperty(value = "申请场馆")
    private String gameCode;

    @ApiModelProperty(value = "用户")
    private MemberInfoRespDTO member;

    @ApiModelProperty(value = "红利")
    private GetScActivityBonusRespDTO scActivityBonus;
}
