package com.dx.facade.member.member.param;

import com.dx.facade.member.exception.ErrorCode;
import com.dx.facade.member.param.BaseParmDTO;
import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.util.Assert;

/**
 * @Description: 根据会员账号集合，查询会员信息集合请求参数
 * @version: v1.0.0
 * @author: fitz
 * @date: 2021/10/09
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class MemberListByWindControlInfoReqDto implements BaseParmDTO {

	@ApiModelProperty(value = "商户ID")
	@JsonFormat(shape = JsonFormat.Shape.STRING)
	private Long merchantId;
	
	@ApiModelProperty("终端信息，当type_id为1或2时记录IP地址，当type_id为3或4时记录设备Id，敏感信息需加密")
	private String terminalInfo;
	
	@ApiModelProperty("类型唯一标识，1，登录IP，2：注册IP，3：登录设备，4：注册设备")
	private Integer typeId;
	
	
	@Override
	public void check() {
		
		Assert.notNull(merchantId, ErrorCode.MISSING_PARAM_EXCEPTION.messageAfter("merchantId"));
		Assert.hasText(terminalInfo, ErrorCode.MISSING_PARAM_EXCEPTION.messageAfter("terminalInfo"));
		Assert.notNull(typeId, ErrorCode.MISSING_PARAM_EXCEPTION.messageAfter("typeId"));
	}
}