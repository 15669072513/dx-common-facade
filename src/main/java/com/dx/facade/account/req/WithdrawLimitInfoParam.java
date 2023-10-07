package com.dx.facade.account.req;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author orbit
 * @datetime 2023-09-25 13:36
 * @desc 会员代理提现限制信息查询参数
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class WithdrawLimitInfoParam implements Serializable {

    /**
     * 商户ID
     */
    private Long merchantId;
    /**
     * 用户ID(会员或代理ID)
     */
    private Long userId;
    /**
     * 用户类型:0-会员，1-代理
     */
    private Integer userType;

    /**
     * 取款类型：1-银行卡，2-虚拟币，3-通过代理线下交易
     */
    private Integer withdrawType;
}
