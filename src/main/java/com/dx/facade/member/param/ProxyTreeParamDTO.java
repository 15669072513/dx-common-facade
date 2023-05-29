package com.dx.facade.member.param;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 红利消息 实体类
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ProxyTreeParamDTO {
	
	@ApiModelProperty(value = "商户id")
	@JsonFormat(shape = JsonFormat.Shape.STRING)
	private Long merchantId;
	
}
