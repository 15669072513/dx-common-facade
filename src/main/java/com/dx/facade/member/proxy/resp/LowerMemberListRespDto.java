package com.dx.facade.member.proxy.resp;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateTimeSerializer;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 * 下级会员列表 返回参数封装
 *
 * @author fitz
 * @version 1.0.0
 * @date 2021/9/29
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class LowerMemberListRespDto {
	
	@ApiModelProperty("会员id")
	@JsonFormat(shape = JsonFormat.Shape.STRING)
	private Long id;
	
	@ApiModelProperty("账号")
	private String userName;
	
	@ApiModelProperty("上级代理账号")
	private String parentProxyName;
	
	@ApiModelProperty("VIP等级名称")
	private String vipGradeName;
	
	@ApiModelProperty("VIP等级序号")
	private Integer vipSerialNum;
	
	@ApiModelProperty("存款")
	@JsonProperty("deposit")
	private BigDecimal totalDeposit;
	
	@ApiModelProperty("取款")
	@JsonProperty("withdraw")
	private BigDecimal totalWithdraw;
	
	@ApiModelProperty("余额")
	private BigDecimal balance;
	
	@ApiModelProperty(value="输赢&游戏盈亏")
	private BigDecimal netAmount;
	
	@ApiModelProperty("注册时间")
	@JsonSerialize(using = LocalDateTimeSerializer.class)
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	private LocalDateTime createdAt;
	
	@ApiModelProperty(value = "最后登录时间")
	@JsonSerialize(using = LocalDateTimeSerializer.class)
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	private LocalDateTime lastLoginDatetime;
	
	@ApiModelProperty(value = "代理层级路径(代理账号)")
	private String proxyPathName;
	
}