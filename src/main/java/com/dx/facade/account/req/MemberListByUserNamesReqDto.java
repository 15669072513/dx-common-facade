package com.dx.facade.account.req;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @Description: 根据会员账号集合，查询会员信息集合请求参数
 * @version: v1.0.0
 * @author: agan
 * @date: 2022/10/01
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class MemberListByUserNamesReqDto {

	@ApiModelProperty(value = "商户ID")
	@JsonFormat(shape = JsonFormat.Shape.STRING)
	private Long merchantId;
	
	@ApiModelProperty("账号集合")
	private List<String> userNames;
	
}