package com.dx.facade.report.resp.membergrade;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 * 会员vip变更记录表
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class MemberVipChangeRecordRespDTO implements Serializable {

    private static final long serialVersionUID = 1L;


    @ApiModelProperty(value = "商户id")
    private Long merchantId;

    @ApiModelProperty(value = "会员id")
    private Long userId;

    @ApiModelProperty(value = "应用终端,1:OB旗舰 2:美播真人")
    private Integer appId;

    @ApiModelProperty(value = "会员账号")
    private String userName;

    @ApiModelProperty(value = "记录日期")
    private Long reportDate;

    @ApiModelProperty(value = "变更类型（0-升级,1-降级）")
    private Integer changeType;

    @ApiModelProperty(value = "调整前VIP等级")
    private String beforeGrade;

    @ApiModelProperty(value = "调整后VIP等级")
    private String afterGrade;

    @ApiModelProperty(value = "当前累计存款")
    private BigDecimal totalDeposit;

    @ApiModelProperty(value = "有效投注额")
    private BigDecimal validBetAmount;

    @ApiModelProperty(value = "创建时间")
    private LocalDateTime createdAt;
}