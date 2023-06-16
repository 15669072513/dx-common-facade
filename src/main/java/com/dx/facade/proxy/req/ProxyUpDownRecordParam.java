package com.dx.facade.proxy.req;

import com.dx.facade.common.PageRequest;
import io.swagger.annotations.ApiModelProperty;

public class ProxyUpDownRecordParam extends PageRequest {
    @ApiModelProperty(value = "商户id", hidden = true)
    private Long merchantId;

    @ApiModelProperty(value = "上下分订单号")
    private String orderNo;

    @ApiModelProperty(
            value = "账户类型(1=中心钱包,6=佣金钱包,7=额度钱包)",
            example = "1"
    )
    private Integer bizType;

    @ApiModelProperty(value = "会员/代理账号")
    private String memberProxyName;


    @ApiModelProperty(
            value = "调整类型(1=上分,2=下分)",
            example = "1"
    )
    private Integer adjustType;

    @ApiModelProperty(
            value = "调整时间-开始",
            required = true,
            example = "2021-10-17 00:00:00"
    )
    private String createdTimeStart;
    @ApiModelProperty(
            value = "调整时间-截止",
            required = true,
            example = "2021-10-31 23:59:59"
    )
    private String createdTimeEnd;
}
