package com.dx.facade.account.resp;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ApiModel(value = "提款记录小计", description = "提款记录小计")
public class WithdrawOrderSumVO {
    @ApiModelProperty("提款金额小计:当前币种")
    private BigDecimal withdrawPageSum;

    @ApiModelProperty("提款金额总计:当前币种")
    private BigDecimal withdrawTotal;

    @ApiModelProperty("提款手续费小计")
    private BigDecimal withdrawFeePageSum;
    @ApiModelProperty("提款手续费总计")
    private BigDecimal withdrawFeeTotal;

}
