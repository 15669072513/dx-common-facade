package com.dx.facade.account.req;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.List;

/**
 * 代理转账记录 分页查询参数封装
 *
 * @author fitz
 * @version 1.0.0
 * @date 2021/05/13
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ApiModel(value = "com-ob-dto-ProxyTransferInnerRecordRpcPageReqDto", description = "代理资料变更记录")
public class ProxyTransferInnerRecordRpcPageReqDto {
	
	@ApiModelProperty(value="商户id")
	@JsonFormat(shape = JsonFormat.Shape.STRING)
	private List<Long> merchantIdList;
	
	@ApiModelProperty(value = "代理账号",example = "abc13465")
	private String proxyName;
	
	@ApiModelProperty(value = "代理姓名",example = "张三")
	private String realName;
	
	@ApiModelProperty(value = "状态(1=成功 2=失败)",example = "1")
	private Integer orderStatus;

	@ApiModelProperty(value = "订单号", example = "PT663458494521499715")
	private String orderNo;

	@ApiModelProperty(value = "转账金额-最小值")
	private BigDecimal amountMin;
	
	@ApiModelProperty(value = "转账金额-最大值")
	private BigDecimal amountMax;
	
	@ApiModelProperty(value = "转账时间-开始")
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	private String createdTimeStart;
	
	@ApiModelProperty(value = "转账时间-截止")
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	private String createdTimeEnd;
	
	@ApiModelProperty(value = "排序方式(1)：desc-降序 asc-升序")
	private String orderType;
	
}
