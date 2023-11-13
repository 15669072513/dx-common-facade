package com.dx.facade.account.resp;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;
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
     * 前台取款成功次数（所有银行卡虚拟币成功取款次数，包含大额取款成功次数）
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
    private Integer backWithdrawSuccessNum = 0;
    /**
     * 后台取成功总额度
     */
    private BigDecimal backWithdrawSuccessAmount = BigDecimal.ZERO;

    /**
     * 后台存款成功总次数
     */
    private Integer backDepositSuccessNum = 0;
    /**
     * 后台存款成功总额度
     */
    private BigDecimal backDepositSuccessAmount = BigDecimal.ZERO;
    /**
     * 大额存款（银行卡虚拟币大额取款）
     */
    private Integer bigWithdrawNum;
    /**
     * 最后一笔存款usdt金额
     */
    private BigDecimal lastDepositAmount;
}
