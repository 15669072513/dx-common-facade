package com.dx.facade.member.param;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 代理详情-信息编辑 权限管理 请求参数封装
 *
 * @author fitz
 * @version 1.0.0
 * @date 2021/05/13
 */
@Data
@ApiModel(value = "com-ob-proxy-req-ProxyInfoRpcPermissionReqDTO", description = "信息编辑-权限管理")
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ProxyInfoRpcPermissionReqDTO implements Serializable {
    
    private static final long serialVersionUID = 1L;
    
    @ApiModelProperty(value = "提交审核备注(100)", required = true)
    private Integer playerToProxyAble;
    @ApiModelProperty(value = "开通跨代理操作权限")
    private Integer crossOptLevel;
}
