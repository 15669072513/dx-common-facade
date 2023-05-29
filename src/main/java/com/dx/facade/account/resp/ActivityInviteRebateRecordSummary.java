package com.dx.facade.account.resp;

import lombok.Data;

import java.math.BigDecimal;


@Data
public class ActivityInviteRebateRecordSummary {

    /**
     * 今日预计返利
     */
    private BigDecimal todayRebateAmount;

    /**
     * 总计派发返利
     */
    private BigDecimal totalRebateAmount;
}
