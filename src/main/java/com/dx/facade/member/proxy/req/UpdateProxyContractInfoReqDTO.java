package com.dx.facade.member.proxy.req;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;


@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class UpdateProxyContractInfoReqDTO implements Serializable {
	
	@ApiModelProperty(value = "签约代理ID")
	@JsonFormat(shape = JsonFormat.Shape.STRING)
	private Long signProxyId;
	
	@ApiModelProperty(value = "契约状态：0-待签约 1-已签约'")
	private Integer contractStatus;
	
	@ApiModelProperty(value = "政策类型配置id")
	public Long policyTypeConfigId;
	
	@ApiModelProperty("佣金政策类型ID")
	private Long commissionPolicyTypeId;
	
	@ApiModelProperty("返点政策类型ID")
	private Long rebatePolicyTypeId;
	
	@ApiModelProperty("佣金契约ID")
	private Long commissionContractId;
	
	@ApiModelProperty("返点契约ID")
	private Long rebateContractId;
	
	@ApiModelProperty("契约模式 0-无契约 1-佣金契约 2-返点契约 3-佣金+返点契约")
	private Integer contractModel;
	
	@ApiModelProperty("强制契约生效标志 0-未生效 1-生效")
	private Integer enforceContractStatus;
	
	@ApiModelProperty(value = "佣金模式 1-返点模式 2-返佣模式", required = true)
	private Integer commissionModel;
}
