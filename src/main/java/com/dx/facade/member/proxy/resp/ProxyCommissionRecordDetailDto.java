package com.dx.facade.member.proxy.resp;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.math.BigDecimal;

/**
 * @program: member-server-parent
 * @description:
 * @author: hirty
 * @create: 2021/07/10
 */
@Data
public class ProxyCommissionRecordDetailDto {
	@ApiModelProperty(value = "佣金派发状态(0=未发放 1=已发放  2=无佣金)")
	private Integer payoutStatus;
	@ApiModelProperty(value = "上月结余")
	private BigDecimal totalLastAmount;
	@ApiModelProperty(value = "冲正后净输赢")
	private BigDecimal totalRushAmount;
	@ApiModelProperty(value = "净输赢")
	private BigDecimal totalPureAmount;
	@ApiModelProperty(value = "补单输赢")
	private BigDecimal totalPatchNetAmount;
	@ApiModelProperty(value = "总输赢")
	private BigDecimal totalNetAmount;
	@ApiModelProperty(value = "场馆费")
	private BigDecimal totalPlatformAmount;
	@ApiModelProperty(value = "返水")
	private BigDecimal totalRebateAmount;
	@ApiModelProperty(value = "账户调整")
	private BigDecimal totalAdjustAmount;
	@ApiModelProperty(value = "VIP专享")
	private BigDecimal rewardAmount;
	@ApiModelProperty(value = "总优惠")
	private BigDecimal totalActivityAmount;
	@ApiModelProperty(value = "存款")
	private BigDecimal depositAmount;
	@ApiModelProperty(value = "提款")
	private BigDecimal withdrawAmount;
	@ApiModelProperty(value = "实发佣金")
	private BigDecimal realCommissionAmount;
	@ApiModelProperty(value = "vip专享比例")
	private BigDecimal vipRate;
	@ApiModelProperty(value = "返佣金额")
	private BigDecimal commissionAmount;
	@ApiModelProperty(value = "返佣比例")
	private BigDecimal commissionRate;
}
