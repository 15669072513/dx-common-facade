package com.dx.facade.member.proxy.req;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.util.Assert;

import com.dx.facade.member.exception.ErrorCode;
import com.dx.facade.member.param.BaseParmDTO;

/**
 * 代理信息 入参
 *
 * @author fitz
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class MerchantUnderProxyInfoReqDTO implements BaseParmDTO {
	
	@ApiModelProperty(value = "商户层级路径")
	private String merchantIdPath;
	
	@ApiModelProperty(value = "代理账号")
	private String proxyName;
	
	
	@Override
	public void check() {
		Assert.notNull(merchantIdPath, ErrorCode.MISSING_PARAM_EXCEPTION.messageAfter("merchantIdPath"));
		Assert.notNull(proxyName, ErrorCode.MISSING_PARAM_EXCEPTION.messageAfter("proxyName"));
	}
}