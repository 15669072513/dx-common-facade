package com.dx.facade.account.resp;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Map;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ApiModel(value = "账变记录每天列表收入支出统计", description = "账变记录每天列表收入支出统计")
public class WalletDetailTexasSumDTO implements Serializable {

    @ApiModelProperty(value = "某天总笔数总笔数", position = 1)
    private Long dailyTotal;

    @ApiModelProperty(value = "某天收入总额度", position = 1, example = "23433.98")
    private BigDecimal inDailyAmount;

    @ApiModelProperty(value = "某天支出总额度", position = 2, example = "-9898.22")
    private BigDecimal outDailyAmount;



}
