package com.dx.facade.member.proxy.req;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * 代理信息 入参
 *
 * @author fitz
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ProxyBaseInfoReqDTO implements Serializable {
	
	@ApiModelProperty(value = "代理ID")
	private Long proxyId;
	
	@ApiModelProperty(value = "代理账号")
	private String proxyName;
	
	@ApiModelProperty(value = "商户id")
	private Long merchantId;
	
}