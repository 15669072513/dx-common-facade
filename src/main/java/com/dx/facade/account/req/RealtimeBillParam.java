package com.dx.facade.account.req;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author orbit
 * @datetime 2023-09-02 14:26
 * @desc 实时账单请求参数
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class RealtimeBillParam implements Serializable {
    /**
     * 商户ID
     */
    private Long merchantId;
    /**
     * 用户ID(代理或会员ID)
     */
    private Long userId;
    /**
     * 用户类型:0-会员，1-代理
     */
    private Integer userType;
}
