package com.dx.facade.auth.pojo.req;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotNull;

/**
 * 主键ID 入参
 *
 * @author fitz
 */
@Data
public class DelIpWhitelistReqDTO {
	
	@JsonFormat(shape = JsonFormat.Shape.STRING)
	@NotNull(message = "主键ID")
	private Long id;
	
	@ApiModelProperty( value = "商户id")
	@JsonFormat(shape = JsonFormat.Shape.STRING)
	private Long merchantId;
	
}
