package com.dx.facade.member.proxy.resp;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.math.BigDecimal;

@Data
public class ProxyTotalCommissionAmountRespDto {


    @ApiModelProperty(value = "预计拥金")
    private BigDecimal totalCommissionAmount;

    @ApiModelProperty(value = "总输赢额")
    private BigDecimal totalNetAmount;

    @ApiModelProperty(value = "总优惠额")
    private BigDecimal totalDiscountAmount;

    @ApiModelProperty(value = "总返水")
    private BigDecimal totalRebateAmount;

    @ApiModelProperty(value = "场馆费")
    private BigDecimal totalPlatformAmount;


    @ApiModelProperty(value = "账户调整")
    private BigDecimal totalAcctadjustAmount;


    @ApiModelProperty(value = "净输赢金额")
    private BigDecimal totalNetwinAmount;

    @ApiModelProperty(value = "上月结余")
    private BigDecimal totalLastAmount;

    @ApiModelProperty(value = "冲正净输赢金额")
    private BigDecimal totalAdjustnetwinAmount;


    @ApiModelProperty(value = "返佣VIP等级序号")
    private Integer commissionVipSerialnum;

    @ApiModelProperty(value = "返佣VIP等级")
    private String commissionVip;

    @ApiModelProperty(value = "返佣比率")
    private BigDecimal commissionRate;

    @ApiModelProperty(value = "本月活跃用户")
    private Integer monthActiveNum;

    @ApiModelProperty(value = "本月新增活跃用户")
    private Integer monthActiveNumNew;


    @ApiModelProperty(value = "等级专享比例")
    private BigDecimal rewardRate;

    @ApiModelProperty(value = "等级专享最高")
    private BigDecimal rewardMax;

    @ApiModelProperty(value = "VIP专享等级序号")
    private Integer rewardSerialnum;

    @ApiModelProperty(value = "VIP专享等级")
    private String rewardLevel;

}
