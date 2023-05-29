package com.dx.facade.account.resp;

import com.dx.annotation.IsNullConvertZero;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

/**
 * 今日提款次数和金额
 * @author agan
 */

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class WithdrawTodayTotalRespDTO {

    @ApiModelProperty("今日提款次数")
    private Integer todayCount;

    @ApiModelProperty("今日提款总额")
    @IsNullConvertZero
    private BigDecimal todayWithdrawMoney = BigDecimal.ZERO;
}
