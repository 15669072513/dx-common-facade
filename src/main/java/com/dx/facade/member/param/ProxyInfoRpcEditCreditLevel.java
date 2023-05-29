package com.dx.facade.member.param;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;


/**
 * 代理详情-代理信息编辑 信用等级 请求参数封装
 * @author gollum
 * @version 1.0.0
 * @date 2022-1-20
 */
@Data
@ApiModel(value = "com-ob-param-ProxyInfoRpcEditCreditLevel", description = "代理信息编辑-信用等级")
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ProxyInfoRpcEditCreditLevel implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "信用等级(2)")
    private Integer creditLevel;

    @ApiModelProperty(value = "提交审核备注(100)")
    private String remark;
}
