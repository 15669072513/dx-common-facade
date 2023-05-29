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
 * 邀请码 / 合营码 重复校验 入参
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class JoinCodeIsRepeatParamDTO implements BaseParmDTO{

	@ApiModelProperty(value = "商户ID")
	@JsonFormat(shape = JsonFormat.Shape.STRING)
	private Long merchantId;
	
	@ApiModelProperty("合营代码:7位数字//邀请码：6位 字母+数字")
	private String joinCode;

	@Override
	public void check() {
		Assert.notNull(merchantId, ErrorCode.MISSING_PARAM_EXCEPTION.messageAfter("merchantId"));
		Assert.notNull(joinCode, ErrorCode.MISSING_PARAM_EXCEPTION.messageAfter("joinCode"));
	}
}