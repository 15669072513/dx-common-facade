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

    @ApiModelProperty("今日已申请提款次数")
    private Integer todayCount;

    @ApiModelProperty("今日提款总额")
    @IsNullConvertZero
    private BigDecimal todayWithdrawMoney = BigDecimal.ZERO;
    /**
     * 单笔提现上限
     */
    @ApiModelProperty("单笔提现上限")
    private BigDecimal maxWithdrawAmount;
    /**
     * 单日最大申请提现次数
     */
    @ApiModelProperty("单日最大申请提现次数")
    private Integer dailyMaxCount;
    /**
     * 每日累计提款额度
     */
    private BigDecimal dailyWithdrawMaxAmount;
}
