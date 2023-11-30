package com.dx.facade.member.proxy.req;

import com.dx.facade.common.PageRequest;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
@ApiModel(value="中控代理预期返水列表查询param", description="中控代理预期返水列表")
public class ProxyAnticipateReBateRecordPageReqDTO extends PageRequest {
    @ApiModelProperty(value="代理账号")
    private String proxyAccount;

    @ApiModelProperty(value = "总代账号")
    private String topProxyAccount;

    @ApiModelProperty(value = "所属商户Id")
    private String merchantId;
}
