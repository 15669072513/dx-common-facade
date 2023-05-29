package com.dx.facade.member.proxy.req;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 代理 实体类
 *
 * @author fitz
 * @version 1.0.0
 * @date 2022/10/04
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class SetProxyContractIdReqDTO {
	
	@ApiModelProperty(value = "返点契约ID")
	@JsonFormat(shape = JsonFormat.Shape.STRING)
	private Long rebateContractId;
	
	@ApiModelProperty(value = "佣金契约ID")
	@JsonFormat(shape = JsonFormat.Shape.STRING)
	private Long commissionContractId;
	
	@ApiModelProperty(value = "代理ID")
	@JsonFormat(shape = JsonFormat.Shape.STRING)
	private Long proxyId;
	
}