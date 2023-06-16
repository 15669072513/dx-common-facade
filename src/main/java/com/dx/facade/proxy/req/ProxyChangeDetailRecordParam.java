package com.dx.facade.proxy.req;

import com.dx.facade.common.PageRequest;
import io.swagger.annotations.ApiModelProperty;

public class ProxyChangeDetailRecordParam extends PageRequest {
    @ApiModelProperty(value = "商户id", hidden = true)
    private Long merchantId;

    @ApiModelProperty(value = "账变ID")
    private String orderNo;

    @ApiModelProperty(value = "代理账号")
    private String memberProxyName;

    @ApiModelProperty(value = "代理ID")
    private String proxyId;


    @ApiModelProperty(
            value = "账变类型(1=官方给代理上分,2=代理被上级上分,xxxxxxx)",
            example = "1"
    )
    private Integer changeType;

    @ApiModelProperty(
            value = "账变时间-开始",
            required = true,
            example = "2021-10-17 00:00:00"
    )
    private String createdTimeStart;
    @ApiModelProperty(
            value = "账变时间-截止",
            required = true,
            example = "2021-10-31 23:59:59"
    )
    private String createdTimeEnd;
}
