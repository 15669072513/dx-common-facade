package com.dx.facade.account.req;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author orbit
 * @datetime 2023-09-25 13:36
 * @desc 会员代理提现信息查询参数
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class WithdrawInfoParam implements Serializable {

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
     * 提现类型：1-虚拟币，2-银行卡，3-信用盘代理线下付款
     */
    private Integer withdrawType;
}
