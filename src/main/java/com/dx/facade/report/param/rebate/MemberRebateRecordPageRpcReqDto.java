package com.dx.facade.report.param.rebate;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
 * 会员返水记录表
 *
 * @author fitz
 * @version 1.0.0
 * @date 2021/06/15
 */
@ApiModel(value = "com-ob-member-dto-MemberRebateRecordPageRpcReqDto", description = "会员返水记录表 请求参数")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class MemberRebateRecordPageRpcReqDto implements Serializable {
	
	@ApiModelProperty(value = "商户id")
	@JsonFormat(shape = JsonFormat.Shape.STRING)
	private Long merchantId;

	@ApiModelProperty(value = "使用站点:1=OB旗舰,2=美播真人")
	@NotNull(message = "使用站点不能为空")
	private Integer loginAppId;
	
	@ApiModelProperty(value = "会员ID", example = "1324651321654")
	@JsonFormat(shape = JsonFormat.Shape.STRING)
	private Long userId;
	
	@ApiModelProperty(value = "报表日期", required = true, example = "20210615")
	private Integer reportDate;
	
	@ApiModelProperty(value = "排序方式(1)：desc-降序 asc-升序")
	private String orderType;
	
}