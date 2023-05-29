package com.dx.facade.payment.req;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Description: 新增查询ORDER表会员(代理)提款订单数量接口
 * @version: v1.0.0
 * @author: fitz
 * @date: 2021/11/26
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class OrderNumByUserIdEsReqDto {
	
	@ApiModelProperty(value = "账号id")
	@JsonFormat(shape = JsonFormat.Shape.STRING)
	private Long userId;
	
	@ApiModelProperty(value = "商户id",required = true,example = "123132156456312")
	@JsonFormat(shape = JsonFormat.Shape.STRING)
	private Long merchantId;
	
	@ApiModelProperty(value = "用户类型(0=会员 1=代理) 枚举ConstantEnums.UserType")
	private Integer userType;
	

}

