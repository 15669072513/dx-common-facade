package com.dx.facade.account.req;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UpdateBankCardReq {

    @ApiModelProperty(value = "ID")
    private Long id;

    @ApiModelProperty(value = "商户ID")
    private Long merchantId;

    @ApiModelProperty(value = "卡号")
    private String cardNumber;

    @ApiModelProperty(value = "持卡人姓名")
    private String cnName;

    @ApiModelProperty(value = "银行名称")
    private String bankName;

    @ApiModelProperty(value = "银行编码")
    private String bankCode;

    @ApiModelProperty(value = "省份")
    private String province;

    @ApiModelProperty(value = "城市")
    private String city;

    @ApiModelProperty(value = "开户行地址")
    private String bankAddress;

    @ApiModelProperty(value = "0-禁用，1-可用")
    private Integer status;

    @ApiModelProperty(value = "黑名单状态（0-禁用中 1-启用中）")
    private Integer blacklistStatus;

    @ApiModelProperty(value = "绑定状态（0-未绑定 1-已绑定）")
    private Integer bindStatus;

    @ApiModelProperty(value = "绑定账号次数")
    private Integer bindNum;

    @ApiModelProperty(value = "绑定会员ID")
    private Long userId;

    @ApiModelProperty(value = "绑定会员账号")
    private String userName;

    @ApiModelProperty(value = "绑定会员姓名")
    private String realName;

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
