package com.dx.facade.report.resp.rebate;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.List;

@Data
public class ProxyRebateProxyMemberListResp {


    @ApiModelProperty(value = "代理列表")
    private List<ProxyRebateProxyMemberResp> proxyList;

}