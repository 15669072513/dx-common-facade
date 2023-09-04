package com.dx.facade.member.param;

import javax.validation.constraints.NotNull;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


/**
 * 会员查询请求参数
 *
 * @author fitz
 * @version 1.0.0
 * @date 2021/9/22
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class MemberQueryReqParamDTO{

	@ApiModelProperty(value = "商户id",required = true)
	private Long merchantId;

	@ApiModelProperty(value = "上级代理id",required = true)
	@NotNull(message = "上级代理id不能为空")
	private Long parentProxyId;

}
