package com.dx.facade.member.param;

import com.dx.facade.member.exception.ErrorCode;
import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.util.Assert;

import java.util.List;

/**
 * 红利消息 实体类
 *
 * @author fitz
 * @version 1.0.0
 * @date 2021/9/15
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class GetProxyPathByUserNameParamDTO implements BaseParmDTO{
	
	@ApiModelProperty(value = "商户id")
	@JsonFormat(shape = JsonFormat.Shape.STRING)
	private Long merchantId;

	@ApiModelProperty(value = "商户ids")
	@JsonFormat(shape = JsonFormat.Shape.STRING)
	private List<Long> merchantIds;
	
	@ApiModelProperty(value = "代理账号")
	private String userName;

	@Override
	public void check() {

	}
}
