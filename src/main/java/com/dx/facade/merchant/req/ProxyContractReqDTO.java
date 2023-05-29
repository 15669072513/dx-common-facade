package com.dx.facade.merchant.req;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.math.BigDecimal;

@Data
@ApiModel(value = "ProxyContractReqDTO", description = "契约比例传参对象")
public class ProxyContractReqDTO {

    @ApiModelProperty(value = "商户id")
    public Long merchantId;

    @ApiModelProperty(value="用户名",hidden = true)
    private String userName;

    @ApiModelProperty(value = "契约类型：1-佣金契约 2-返点契约", required = true)
    private Integer contractType ;

    @ApiModelProperty(value = "比例")
    private BigDecimal rebateRatio;

    @ApiModelProperty(value="上级代理账号")
    private String parentProxyName;

    @ApiModelProperty(value="政策类型配置id")
    public Long policyTypeConfigId;

}
