package com.dx.facade.member.param;

import com.dx.facade.member.exception.ErrorCode;
import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.util.Assert;

/**
 * 代理结构树查询请求DTO
 *
 * @author grayson
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ProxyTreeLinkParamDTO implements BaseParmDTO{

	@ApiModelProperty(value = "商户id")
	@JsonFormat(shape = JsonFormat.Shape.STRING)
	private Long merchantId;

	@ApiModelProperty(value = "代理id")
	@JsonFormat(shape = JsonFormat.Shape.STRING)
	private Long id;
	
	@ApiModelProperty(value = "是否查询所有下级代理")
	private boolean isAllSub;

	@Override
	public void check() {
		Assert.notNull(id, ErrorCode.MISSING_PARAM_EXCEPTION.messageAfter("id"));
	}
}
