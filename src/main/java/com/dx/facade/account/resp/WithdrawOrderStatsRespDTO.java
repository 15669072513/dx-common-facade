package com.dx.facade.account.resp;

import com.dx.annotation.IsNullConvertZero;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

/**
 * 提现统计
 * @author agan
 */

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class WithdrawOrderStatsRespDTO {

    @ApiModelProperty("提现申请总额")
    private BigDecimal totalAmount;

    @ApiModelProperty("提现拒绝总额")
    private BigDecimal refusedAmount;

    private BigDecimal onlineTotalAmount;

    private BigDecimal onlineRefusedAmount;

    private BigDecimal offlineTotalAmount;

    private BigDecimal offlineRefusedAmount;
}
