package com.dx.facade.merchant.resp;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateTimeSerializer;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class MemberWithdrawSettingResp implements Serializable {
	
	private static final long serialVersionUID = 1L;
	/**
	 * id
	 */
	@ApiModelProperty(value = "id")
	@JsonSerialize(using = ToStringSerializer.class)
	private Long id;
	
	/**
	 * 商户id
	 */
	@ApiModelProperty(value = "商户id")
	@JsonSerialize(using = ToStringSerializer.class)
	private Long merchantId;
	
	/**
	 * vip等级次序
	 */
	@ApiModelProperty(value = "vip等级次序")
	private Integer vipNum;
	
	/**
	 * 单日提款总次数
	 */
	@ApiModelProperty(value = "单日提款总次数")
	private Integer dateTotalNum;
	
	/**
	 * 单日最高提款总额
	 */
	@ApiModelProperty(value = "单日最高提款总额")
	
	private BigDecimal dateMaxAmount;
	
	/** 新增字段 **/
	/**
	 * 银行卡单次提款最低限额
	 */
	@ApiModelProperty(value = "银行卡单次提款最低限额", required = true)
	
	private BigDecimal bankCardMinAmount;
	
	/**
	 * 银行卡单次提款最高限额
	 */
	@ApiModelProperty(value = "银行卡单次提款最高限额", required = true)
	
	private BigDecimal bankCardMaxAmount;
	
	/**
	 * 虚拟币单次提款最低限额
	 */
	@ApiModelProperty(value = "虚拟币单次提款最低限额", required = true)
	
	private BigDecimal virtualCardMinAmount;
	
	/**
	 * 虚拟币单次提款最高限额
	 */
	@ApiModelProperty(value = "虚拟币单次提款最高限额", required = true)
	
	private BigDecimal virtualCardMaxAmount;
	
	/** 新增字段 **/
	
	/**
	 * 大额提款标记金额
	 */
	@ApiModelProperty(value = "大额提款标记金额")
	
	private BigDecimal bigAmount;
	
	/**
	 * 创建时间
	 */
	@ApiModelProperty(value = "创建时间")
	@JsonSerialize(using = LocalDateTimeSerializer.class)
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss")
	private LocalDateTime createdTime;
	
	/**
	 * 更新时间
	 */
	@ApiModelProperty(value = "更新时间")
	@JsonSerialize(using = LocalDateTimeSerializer.class)
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss")
	private LocalDateTime updatedTime;
	
	/**
	 * 更新人
	 */
	@ApiModelProperty(value = "更新人")
	private String updatedOperator;
	
}
