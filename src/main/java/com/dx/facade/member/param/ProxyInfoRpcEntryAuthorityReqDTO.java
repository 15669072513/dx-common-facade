package com.dx.facade.member.param;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * 代理详情-信息编辑 入口权限 请求参数封装
 *
 * @author fitz
 * @version 1.0.0
 * @date 2021/05/13
 */
@Data
@ApiModel(value = "com-ob-proxy-req-ProxyInfoRpcEntryAuthorityReqDTO", description = "信息编辑-入口权限")
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ProxyInfoRpcEntryAuthorityReqDTO implements Serializable {
    
    private static final long serialVersionUID = 1L;
	
	@ApiModelProperty(value="直属上级账号")
	private String parentProxyName;
    
    @ApiModelProperty(value = "入口权限（0-关闭 1-开启）", required = true)
    private String entryAuthority;
    
    @ApiModelProperty(value = "提交审核备注(100)", required = true)
    private String remark;
}
