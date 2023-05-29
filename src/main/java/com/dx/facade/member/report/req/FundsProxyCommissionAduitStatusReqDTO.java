package com.dx.facade.member.report.req;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;

/**
 @title 待审佣金审核接口请求数据传输对象
 @desc
 @path
 @author gollum
 @version 1.0.0
 @since 2021年09月28日 00:15:57
*/
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ApiModel("待审佣金审核接口请求数据传输对象")
public class FundsProxyCommissionAduitStatusReqDTO implements Serializable {

    @ApiModelProperty(value = "商户ID")
    private Long merchantId;

    @ApiModelProperty(value = "id")
    private List<Long> ids;

    @ApiModelProperty(value = "审核用户Id")
    private Long currentUserId;

    @ApiModelProperty(value = "审核用户")
    private String currentUser;

    @ApiModelProperty(value = "审核备注")
    private String auditDesc;

    @ApiModelProperty(value = "1：待一审，2：待二审")
    private Integer auditStatus;

    @ApiModelProperty(value = "1：通过，2：拒绝")
    private Integer operationId;

    @ApiModelProperty(value = "佣金月份")
    private String reportYm;
}
