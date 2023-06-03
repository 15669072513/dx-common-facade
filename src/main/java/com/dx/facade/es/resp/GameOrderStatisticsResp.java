package com.dx.facade.es.resp;

import lombok.Data;

import java.math.BigDecimal;

/**
 *  游戏注单统计输出
 *
 * @author heart
 * @date 2023/06/03 14:26
 */
@Data
public class GameOrderStatisticsResp {
    /**
     * 玩家Id
     */
    private String userId;
    /**
     *  盈亏金额
     */
    private BigDecimal netAmountSum;
}
