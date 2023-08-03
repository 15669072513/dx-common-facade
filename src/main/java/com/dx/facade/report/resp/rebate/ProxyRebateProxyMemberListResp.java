package com.dx.facade.report.resp.rebate;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.List;

@Data
public class ProxyRebateProxyMemberListResp {


    @ApiModelProperty(value = "代理账号列表")
    private List<ProxyRebateProxyMemberResp> proxyMemberList;

}
