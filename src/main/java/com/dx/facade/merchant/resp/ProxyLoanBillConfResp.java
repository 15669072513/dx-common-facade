package com.dx.facade.merchant.resp;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ApiModel(value = "账单配置RPC接口响应", description = "账单配置RPC接口响应")
public class ProxyLoanBillConfResp implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("每周几结算，1到7代表周日到周六")
    private Integer periodDayOfweek;

    @ApiModelProperty("哪个小时结算，24小时制")
    private Integer periodHour;

    @ApiModelProperty("账单当日可提现的次数")
    private Integer withdrawDailyMaxCount;
    
    @ApiModelProperty("账单单笔可提现的金额上限")
    private BigDecimal withdrawDailyMaxAmount;
}
