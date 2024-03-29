package com.dx.facade.member.member.resp;

import com.fasterxml.jackson.annotation.JsonFormat;
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
 * 会员信息 返回
 *
 * @author fitz
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class MerchantUnderMemberRespDTO {
	
	@ApiModelProperty("ID")
	@JsonFormat(shape = JsonFormat.Shape.STRING)
	private Long id;
	
	@ApiModelProperty("商户ID")
	@JsonFormat(shape = JsonFormat.Shape.STRING)
	private Long merchantId;
	
	@ApiModelProperty("商户名称")
	private String merchantName;
	
	@ApiModelProperty("商户名称")
	private String merchantCode;
	
	@ApiModelProperty("商户层级路径")
	private String merchantPath;
	
	@ApiModelProperty("父级商户ID")
	@JsonFormat(shape = JsonFormat.Shape.STRING)
	private Long parentMerchantId;
	
	@ApiModelProperty("父级商户层级路径")
	private String parentMerchantPath;
	
	@ApiModelProperty("主商户ID")
	@JsonFormat(shape = JsonFormat.Shape.STRING)
	private Long topMerchantId;
	
	@ApiModelProperty("主商户名称")
	private String topMerchantName;
	
	@ApiModelProperty("币种")
	private String currency;

	@ApiModelProperty("账号类型（1-正式，2-商务，3-置换）")
	private Integer accountType;
	
	@ApiModelProperty("账号")
	private String userName;
	
	@ApiModelProperty("真实姓名")
	private String realName;
	
	@ApiModelProperty("风控层级id")
	@JsonFormat(shape = JsonFormat.Shape.STRING)
	private Long windControlId;
	
	@ApiModelProperty("风控层级名称")
	private String windControlName;
	
	@ApiModelProperty("最后登陆时间")
	@JsonSerialize(using = LocalDateTimeSerializer.class)
	@JsonFormat(shape=JsonFormat.Shape.STRING, pattern="yyyy-MM-dd HH:mm:ss")
	private LocalDateTime lastLoginDatetime;


	@ApiModelProperty("可用额度")
	private BigDecimal creditAvailable;

	@ApiModelProperty("信用额度")
	private BigDecimal creditBalance;

	@ApiModelProperty(value = "信用钱包-应还账款")
	private BigDecimal creditShouldRepayment;

	@ApiModelProperty(value = "业务模式：0-现金+信用，1-现金模式，2-信用模式")
	private Integer businessModel;
}
