package com.dx.facade.game.resp;

import lombok.Data;

import java.math.BigDecimal;

/**
 * 转账单条交易结果返回
 * @author dereck
 * @version 1.0.0
 * @date 2022/09/22 20:09
 */
@Data
public class GameQueryTransferResp extends GameBaseResp {

    /**
     * 交易单号
     * 需要包括商户号前缀
     */
    private String transferNo;

    /**
     * 转账金额
     */
    private BigDecimal amount;

    /**
     * 转账状态
     * 0成功 1失败 2转账中
     * 0成功 1失败 2转账中 3 挂起中(未知状态)
     */
    private Integer transferStatus;

}
