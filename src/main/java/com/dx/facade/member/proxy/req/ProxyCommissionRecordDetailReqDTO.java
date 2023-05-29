package com.dx.facade.member.proxy.req;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 *
 *
 * @author: kygo
 * @create: 2021.10.07
 */
@Data
public class ProxyCommissionRecordDetailReqDTO {

	@ApiModelProperty(value = "月份")
	private Integer reportYm;

	@ApiModelProperty(value = "代理账户id")
	private Long proxyId;

}
