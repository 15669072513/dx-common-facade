package com.dx.facade.report.param.memberreward;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * 会员vip奖励领取记录表 实体类
 *
 * @author fitz
 * @version 1.0.0
 * @date 2021/6/14
 */
@ApiModel(value = "com-ob-vip-req-MemberVipRewardRecordRpcPageReqDto", description = "会员vip奖励领取记录 请求参数")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class MemberVipRewardRecordRpcPageReqDto implements Serializable {
	
	@ApiModelProperty(value = "订单号", example = "2165165414510")
	@JsonProperty(value = "id")
	private String orderNo;
	
	@ApiModelProperty(value = "商户id", required = true)
	private Long merchantId;
	
	@ApiModelProperty(value = "订单生成时间-开始", required = true, example = "2021-06-14 00:00:00")
	private String createdAtStart;
	
	@ApiModelProperty(value = "订单生成时间-截止", required = true, example = "2021-06-14 00:00:00")
	private String createdAtEnd;
	
	@ApiModelProperty(value = "领取时间-开始", required = true, example = "2021-06-14 00:00:00")
	private String provideAtStart;
	
	@ApiModelProperty(value = "领取时间-截止", required = true, example = "2021-06-14 00:00:00")
	private String provideAtEnd;
	
	@ApiModelProperty(value = "会员账号", example = "abc123456")
	private String userName;
	
	@ApiModelProperty(value = "奖励类型 1-晋级优惠;2-升级礼金;3-生日礼金;4-上半月红包;5-下半月红包", example = "1")
	private Integer provideType;

	@ApiModelProperty(value = "福利类型 1-会员VIP奖励 2-好友邀请")
	private Integer rewardType;
	
	@ApiModelProperty(value = "领取状态（0待发放/1-已发放/2-发放失败）")
	private Integer provideStatus;
	
	@ApiModelProperty(value = "排序列(1)：1-订单生成时间 2-领取时间 3-VIP等级", example = "1")
	private Integer orderKey;
	
	@ApiModelProperty(value = "排序方式(1)：desc-降序 asc-升序", example = "desc")
	private String orderType;
	
}