package com.dx.facade.account.param;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Description: 聚合统计 返回参数封装
 * @version: v1.0.0
 * @author: fitz
 * @date: 2021/6/13
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class DataCountDto {
	
	@ApiModelProperty(value = "统计维度")
	private String countType ;
	
	@ApiModelProperty(value = "统计值")
	private Long value = 0L;
	
}
