package com.dx.facade.report.resp.report.proxy;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.NonNull;

import javax.validation.constraints.NotNull;


@Data
@ApiModel
public class ProxyIncomeAuditLockReq  {

    @ApiModelProperty("订单号")
    @NotNull(message = "订单号参数不能为空")
    private String orderNos;

    @ApiModelProperty("锁单状态（0-解锁 1-上锁）")
    @NotNull(message = "锁单状态参数不能为空")
    private Integer lockStatus;


}
