package com.dx.facade.account.param;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;

/**
 * @author orbit
 * @datetime 2023-11-04 11:02
 * @desc 取款count统计按查询条件统计订单数
 */
@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class CountByConditionParamDTO implements Serializable {
    /**
     * 用户类型：0-会员，1-代理
     */
    private Integer userType;
    /**
     *取款方式：1-银行卡，2-虚拟币，3-通过代理线下取款
     */
    private List<Integer> withdrawTypeList;
    /**
     * 订单状态集合，参见 WithdrawOrderStatus
     */
    private List<Integer> orderStatusList;
}
