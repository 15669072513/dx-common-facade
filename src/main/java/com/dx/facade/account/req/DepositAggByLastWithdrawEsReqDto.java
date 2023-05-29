package com.dx.facade.account.req;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

/**
 * @Description: 获取某商户下，某天会员的存取款情况 参数请求封装
 * @version: v1.0.0
 * @author: fitz
 * @date: 2021/6/19
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class DepositAggByLastWithdrawEsReqDto {
	
	
	@ApiModelProperty(value = "商户id", required = true, example = "123132156456312")
	@JsonFormat(shape = JsonFormat.Shape.STRING)
	private Long merchantId;
	
	@ApiModelProperty(value = "开始时间", required = true, example = "2021-06-06 00:00:00")
	private LocalDateTime lastWithdrawTime;
	
	@ApiModelProperty(value = "截止时间", required = true, example = "2021-06-06 00:00:00")
	private LocalDateTime endTime;
	
	@ApiModelProperty(value = "业务id(会员或代理id)", required = true, example = "112445245464563")
	private Long userId;
	
	@ApiModelProperty(value = "用户类型(0=会员 1=代理) 枚举ConstantEnums.UserType", required = true, example = "1")
	private Integer userType;
	
}

