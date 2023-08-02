package com.dx.facade.report.resp.rebate;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.List;

@Data
public class ProxyRebateProxyMemberResp {



    @ApiModelProperty(value = "代理账号")
    private String proxyName;

    @ApiModelProperty(value = "会员账号")
    private List<String> memberName;


}