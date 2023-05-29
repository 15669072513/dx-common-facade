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
public class ProxyRebateRecordDetailReqDTO {
	@ApiModelProperty(value = "返点record id")
	private Long id;

	@ApiModelProperty(value = "代理id")
	private Long merchantId;

}
