package com.dx.facade.member.report.req;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 @title 获取TOP3场馆接口请求数据传输对象
 @desc
 @path
 @author gollum
 @version 1.0.0
 @since 2021年09月28日 00:44:19
*/
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ApiModel("获取TOP3场馆接口请求数据传输对象")
public class ProxyVenuesTop3ReqDTO implements Serializable {

    @ApiModelProperty(value = "代理id")
    private Long proxyId;

    @ApiModelProperty(value = "排序方式，1：输赢，2：投注")
    private Integer sortType;
}
