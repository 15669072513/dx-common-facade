package com.dx.facade.merchant.req;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotNull;

@Data
@ApiModel(value = "SubProxyContractReqDTO", description = "下级契约传参对象")
public class SubProxyContractReqDTO extends ProxyContractReqDTO{


    @ApiModelProperty(value = "代理ID", required = true)
    @NotNull(message = "代理ID不能为空")
    private Long proxyId;

}
