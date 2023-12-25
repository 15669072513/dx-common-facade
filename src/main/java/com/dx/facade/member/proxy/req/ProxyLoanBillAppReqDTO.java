package com.dx.facade.member.proxy.req;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ProxyLoanBillAppReqDTO {

    @ApiModelProperty(value = "商户id", required = true)
    private Long merchantId;

    @ApiModelProperty(value = "会员id-如果当前用户是会员则填充该值")
    private Long memberId;

    @ApiModelProperty(value = "代理id-如果当前用户是代理则填充该值")
    private Long proxyId;

    @ApiModelProperty(value = "开始日期", example = "20231225")
    private Integer startDate;

    @ApiModelProperty(value = "结束日期", example = "20231226")
    private Integer endDate;

    @ApiModelProperty(value = "应还账款最小值")
    private Integer minShouldRepayAmount;

    @ApiModelProperty(value = "应还账款最大值")
    private Integer maxShouldRepayAmount;

    @ApiModelProperty(value = "可提现金额最小值")
    private Integer minWithdrawAvailable;

    @ApiModelProperty(value = "可提现金额最大值")
    private Integer maxWithdrawAvailable;

    @ApiModelProperty(value = "账单类型", notes = "0-未出账单,1-已出账单")
    private Integer billType;
}
