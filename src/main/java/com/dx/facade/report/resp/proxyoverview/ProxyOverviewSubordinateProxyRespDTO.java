package com.dx.facade.report.resp.proxyoverview;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
@ApiModel(value = "ProxyOverviewSubordinateProxyRespDTO", description = "下级代理")
public class ProxyOverviewSubordinateProxyRespDTO implements Serializable {
    private static final long serialVersionUID = 1L;

    @ApiModelProperty("下级代理人数")
    private Integer underProxyNum;

    @ApiModelProperty("待付佣金集合")
    private List<ProxyOverviewSubordinateProxyNotPayRespDTO> notPayList;
}
