package com.dx.facade.merchant.req;

import io.swagger.annotations.ApiModelProperty;
import lombok.Builder;
import lombok.Data;

import javax.validation.constraints.NotNull;

/**
 * 代理提款设置
 *
 * @author Jerrmy
 * @version 1.0.0
 * @date 2021/06/12
 */
@Builder
@Data
public class ProxyWithdrawSettingParam {

    /**
     * 商户id
     */
    @ApiModelProperty(value = "商户id", required = true)
    @NotNull(message = "商户ID不允许为空")
    private Long merchantId;


    /**
     * 代理姓名.通用设置标识为：0
     */
    private String proxyName;

    /**
     * 代理账号.通用设置标识为：0
     */
    private String proxyAccount;

    /**
     * 代理id
     */
    private Long proxyId;

}
