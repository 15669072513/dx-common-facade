package com.dx.facade.report.param.rebate;

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
 * @date 2021/08/5
 */
@ApiModel(value = "com-ob-member-dto-MemberRebateReportPageRpcReqDto", description = "会员返水记录表 请求参数")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class MemberRebateReportPageRpcReqDto implements Serializable {
	
	@ApiModelProperty(value = "商户ID")
	@JsonFormat(shape = JsonFormat.Shape.STRING)
	private Long merchantId;
	
	@ApiModelProperty(value="会员账号")
	private String userName;

	@ApiModelProperty(value = "使用站点:1=OB旗舰,2=美播真人")
	private Integer loginAppId;
	
	@ApiModelProperty(value="订单号")
	private String id;
	
	@ApiModelProperty(value="会员姓名")
	private String realName;
	
	@ApiModelProperty(value="领取状态（0待领取/1-已领取/2-已过期）")
	private Integer rebateStatus;
	
	@ApiModelProperty(value = "领取时间-开始",example = "2021-08-04 00:00:00")
	private String rebateAtStart;
	
	@ApiModelProperty(value = "领取时间-截止",example = "2021-08-04 23:00:00")
	private String rebateAtEnd;
	
	@ApiModelProperty(value = "订单生成时间-开始",example = "2021-08-04 00:00:00")
	private String createdAtStart;
	
	@ApiModelProperty(value = "订单生成时间-截止",example = "2021-08-04 23:00:00")
	private String createdAtEnd;
	
	@ApiModelProperty(value = "排序列(1)：1-领取时间 2-订单生成时间")
	private Integer orderKey;
	
	@ApiModelProperty(value = "排序方式(1)：desc-降序 asc-升序")
	private String orderType;

	@ApiModelProperty(value="最小vip")
	private Integer vipSerialNumMin;

	@ApiModelProperty(value="最大vip")
	private Integer vipSerialNumMax;
	
}