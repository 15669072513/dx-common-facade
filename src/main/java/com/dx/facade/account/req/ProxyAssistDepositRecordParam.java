package com.dx.facade.account.req;

import com.dx.facade.common.PageRequest;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class ProxyAssistDepositRecordParam extends PageRequest {

    @ApiModelProperty(value = "商户id", hidden = true)
    private Long merchantId;

    @ApiModelProperty(value = "代理账号", hidden = true)
    private String proxyName;

    @ApiModelProperty(value = "会员账号")
    private String userName;

    @ApiModelProperty(
            value = "账户类型(6=佣金钱包,7=额度钱包)",
            example = "1"
    )
    private Integer bizType;

    @ApiModelProperty(
            value = "代存时间-开始",
            required = true,
            example = "2021-10-17 00:00:00"
    )
    private String createdTimeStart;
    @ApiModelProperty(
            value = "代存时间-截止",
            required = true,
            example = "2021-10-31 23:59:59"
    )
    private String createdTimeEnd;
}
