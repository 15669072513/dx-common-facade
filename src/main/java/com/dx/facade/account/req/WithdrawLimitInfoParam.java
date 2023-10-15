package com.dx.facade.account.req;


import io.swagger.annotations.ApiModelProperty;
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

    @ApiModelProperty("商户ID")
    private Long merchantId;

    @ApiModelProperty("用户ID(会员或代理ID)")
    private Long userId;

    @ApiModelProperty("用户类型:0-会员，1-代理")
    private Integer userType;

    @ApiModelProperty("是否统计手动调整流水总额")
    private Boolean manualAdjust;
}