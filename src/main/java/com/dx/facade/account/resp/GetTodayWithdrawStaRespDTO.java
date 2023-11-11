package com.dx.facade.account.resp;

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
public class GetTodayWithdrawStaRespDTO {

    @ApiModelProperty("今日已申请银行卡提款次数")
    private Integer todayBankCardCount = 0;
    @ApiModelProperty("今日已申请虚拟币提款次数")
    private Integer todayVirtualCount = 0;
    @ApiModelProperty("今日已申请线下(通过代理取款)提款次数")
    private Integer todayOfflineCount = 0;
    @ApiModelProperty("今日已申请银行卡提款usdt金额")
    private BigDecimal amountBankCardUsdt = BigDecimal.ZERO;
    @ApiModelProperty("今日已申请银行卡提款人民币金额")
    private BigDecimal amountBankCardCny = BigDecimal.ZERO;
    @ApiModelProperty("今日已申请虚拟币提款usdt金额")
    private BigDecimal amountVirtualUsdt = BigDecimal.ZERO;
    @ApiModelProperty("今日已申请虚拟币提款人民币金额")
    private BigDecimal amountVirtualdCny = BigDecimal.ZERO;
    @ApiModelProperty("今日已申请通过代理usdt金额")
    private BigDecimal amountOfflineUsdt = BigDecimal.ZERO;
    @ApiModelProperty("今日已申请通过代理人民币金额")
    private BigDecimal amountOfflineCny = BigDecimal.ZERO;
}
