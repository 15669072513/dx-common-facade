package com.dx.facade.account.req;

import lombok.*;

import java.io.Serializable;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class WithdrawTodayTotalReqDTO implements Serializable {

    private Long userId;

    private Integer userType;

    private Long merchantId;

    /**
     * 提现类型：1-银行卡，2-虚拟币，3-信用盘代理线下支付
     */
    private Integer withdrawType;


}
