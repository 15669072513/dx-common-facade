package com.dx.facade.report.param.pay;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * 会员返水记录表
 *
 * @author fitz
 * @version 1.0.0
 * @date 2021/06/15
 */
@ApiModel(value = "com-ob-member-dto-MemberRebateReportDetailRpcReqDto", description = "会员返水详情 请求参数")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class MemberRebateReportDetailRpcReqDto implements Serializable {

	@ApiModelProperty(value = "商户id")
	@JsonFormat(shape = JsonFormat.Shape.STRING)
	private Long merchantId;

	@ApiModelProperty(value = "会员ID", example = "1324651321654")
	@JsonFormat(shape = JsonFormat.Shape.STRING)
	private Long userId;
	
	@ApiModelProperty(value = "报表日期", required = true, example = "20210615")
	private Integer reportDate;

	@ApiModelProperty(value = "排序方式(1)：desc-降序 asc-升序")
	private String orderType;
}