package com.dx.facade.report.resp.rebate;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.List;

@Data
public class ProxyRebateProxyMemberResp {



    @ApiModelProperty(value = "代理ID")
    private Long proxyId;

    @ApiModelProperty(value = "代理账号")
    private String userName;

    @ApiModelProperty(value = "所属会员账号列表")
    private List<String> memberUserNameList;




}