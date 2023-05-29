package com.dx.facade.merchant.req;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ProxyRebateQueryParam {


    @ApiModelProperty(value = "契约或模板ID",required = true, dataType = "java.lang.String")
    public Long contractId;

    @ApiModelProperty(value = "商户id")
    public Long merchantId;

    @ApiModelProperty(value = "数据来源 1:模板配置 2:契约管理",required = true)
    public Integer dataSourceType;

    @ApiModelProperty(value = "契约类型 1:佣金契约 2:反点契约",required = true)
    @Min(value = 1, message = "契约类型只能是1或者2")
    @Max(value = 2, message = "契约类型只能是1或者2")
    private Integer contractType;

    @ApiModelProperty(value = "签约代理账号")
    private String signProxyName;

    @ApiModelProperty("来源 1:app 2:平台")
    public Integer callSource;

}
