package com.dx.facade.account.resp;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

/**
 * @author orbit
 * @datetime 2023-09-27 20:40
 * @desc 获取会员/代理历史存取款统计信息查询接口
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UserWithdrawDepositStatRespDTO implements Serializable {

    /**
     * 前台存款成功次数
     */
    private Integer depositSuccessNum = 0;
    /**
     * 前台存款成功总额
     */
    private BigDecimal depositSuccessAmount = BigDecimal.ZERO;
    /**
     * 前台存款失败次数
     */
    private Integer depositFailNum = 0;
    /**
     * 前台存款失败总额
     */
    private BigDecimal depositFailAmount = BigDecimal.ZERO;
    /**
     * 前台取款成功次数
     */
    private Integer withdrawSuccessNum = 0;
    /**
     * 前提取款成功总额
     */
    private BigDecimal withdrawSuccessAmount = BigDecimal.ZERO;
    /**
     * 前台取款成功总额
     */
    private Integer withdrawFailNum = 0;
    /**
     * 前台取款失败总额
     */
    private BigDecimal withdrawFailAmount = BigDecimal.ZERO;
    /**
     * 后台取款成功总次数
     */
    private Integer backWithdrawSuccessNum;
    /**
     * 后台存款成功总额度
     */
    private BigDecimal backWithdrawSuccessAmount;

    /**
     * 后台取款成功总次数
     */
    private Integer backDepositSuccessNum;
    /**
     * 后台取款成功总额度
     */
    private BigDecimal backDepositSuccessAmount;
}
