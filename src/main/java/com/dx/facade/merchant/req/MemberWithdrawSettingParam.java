package com.dx.facade.merchant.req;

import io.swagger.annotations.ApiModelProperty;
import lombok.Builder;
import lombok.Data;

import javax.validation.constraints.NotNull;

/**
 * 会员提款设置
 *
 * @author Jerrmy
 * @version 1.0.0
 * @date 2021/06/12
 */
@Builder
@Data
public class MemberWithdrawSettingParam {

    /**
     * 商户id
     */
    @ApiModelProperty(value = "商户id", required = true)
    @NotNull(message = "商户ID不允许为空")
    private Long merchantId;

    /**
     * vip等级次序
     */
    @ApiModelProperty(value = "vip等级次序", required = true)
    @NotNull(message = "vip等级次序不允许为空")
    private Integer vipNum;


}
