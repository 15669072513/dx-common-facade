package com.dx.facade.member.report.req;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 @title 待审佣金锁单接口请求数据传输对象
 @desc
 @path
 @author gollum
 @version 1.0.0
 @since 2021年09月28日 00:17:05
*/
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ApiModel("待审佣金锁单接口请求数据传输对象")
public class FundsProxyCommisonLockStatusReqDTO implements Serializable {

    @ApiModelProperty(value = "订单号")
    private String orderNo;

    @ApiModelProperty(value = "锁单用户")
    private String currentUser;

    @ApiModelProperty(value = "佣金月份")
    private String reportYm;

    @ApiModelProperty(value = "传入锁单编辑状态(0=未锁单 1=锁单中)")
    private Integer lockStatus;
}
