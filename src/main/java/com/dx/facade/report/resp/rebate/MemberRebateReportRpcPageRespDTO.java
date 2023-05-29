package com.dx.facade.report.resp.rebate;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
* 会员返水记录分页查询 返回参数
*
* @author fitz
* @version 1.0.0
* @date 2021/08/05
*/
@ApiModel(value="com-ob-member-resp-MemberRebateReportRpcPageRespDTO")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class MemberRebateReportRpcPageRespDTO implements Serializable {
	
	@ApiModelProperty(value = "订单号",example = "t45456354654654")
	private String id;
	
	@ApiModelProperty(value="会员账号")
	@JsonFormat(shape = JsonFormat.Shape.STRING)
	private Long userId;

	@ApiModelProperty(value = "使用站点ID:1=OB旗舰,2=美播真人")
	private Integer loginAppId;

	@ApiModelProperty(value = "使用站点名字")
	private String loginAppIdName;
	
	@ApiModelProperty(value="会员账号")
	private String userName;

	@ApiModelProperty(value = "记录生成时vip等级序号")
	private Integer vipSerialNum;
	
	@ApiModelProperty(value="报表日期（yyyymmdd）")
	private Integer reportDate;
	
	@ApiModelProperty(value="会员姓名")
	private String realName;
	
	@ApiModelProperty(value="领取状态（0待领取/1-已领取/2-已过期）")
	private Integer rebateStatus;
	
	@ApiModelProperty(value="有效投注额")
	
	private BigDecimal validBetAmount;

	@ApiModelProperty(value="返水金额")
	
	private BigDecimal rebateAmount;
	
	@ApiModelProperty(value = "领取时间",example = "2021-08-04 00:00:00")
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	private LocalDateTime rebateAt;
	
	@ApiModelProperty(value="生成时间")
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	private LocalDateTime createdAt;
	
}