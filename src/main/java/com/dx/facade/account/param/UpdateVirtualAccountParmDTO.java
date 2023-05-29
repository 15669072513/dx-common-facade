package com.dx.facade.account.param;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 * @author agan
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UpdateVirtualAccountParmDTO {

    @ApiModelProperty(value = "ID")
    private Long id;

    @ApiModelProperty(value = "商户ID")
    private Long merchantId;

    @ApiModelProperty(value = "商户名称")
    private String merchantName;

    @ApiModelProperty(value = "虚拟币账户地址")
    private String virtualAddress;

    @ApiModelProperty(value = "虚拟币种类")
    private String virtualKind;

    @ApiModelProperty(value = "虚拟币协议")
    private String virtualProtocol;

    @ApiModelProperty(value = "vip等级id")
    private Long vipId;

    @ApiModelProperty(value = "vip等级名称")
    private String vipLevel;

    @ApiModelProperty(value = "风控层级id")
    private Long windControlId;

    @ApiModelProperty(value = "风控层级名称")
    private String windControlName;

    @ApiModelProperty(value = "会员提款成功次数")
    private Integer withdrawalSuccessNum;

    @ApiModelProperty(value = "会员提款被拒次数")
    private Integer withdrawalFailNum;

    @ApiModelProperty(value = "会员提款总金额")
    private BigDecimal withdrawalTotalAmount;

    @ApiModelProperty(value = "最后成功提款时间")
    private LocalDateTime lastWithdrawalTime;

    @ApiModelProperty(value = "代理提款成功次数")
    private Integer proxyWithdrawalSuccessNum;

    @ApiModelProperty(value = "代理提款被拒次数")
    private Integer proxyWithdrawalFailNum;

    @ApiModelProperty(value = "代理提款总金额")
    private BigDecimal proxyTotalAmount;

    @ApiModelProperty(value = "修改人")
    private String updatedBy;

    @ApiModelProperty(value = "备注")
    private String remark;
}
