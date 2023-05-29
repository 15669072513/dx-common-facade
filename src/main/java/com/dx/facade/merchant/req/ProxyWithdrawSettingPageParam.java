package com.dx.facade.merchant.req;

import com.dx.entity.PageReq;
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
public class ProxyWithdrawSettingPageParam extends PageReq {

    /**
     * 商户id
     */
    @ApiModelProperty(value = "商户id", required = true)
    @NotNull(message = "商户ID不允许为空")
    private Long merchantId;


}
