package com.dx.facade.merchant.resp;

import com.dx.facade.enums.BwCurrencyEnum;
import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 包网商户表
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class MerchantBaseInfoRespDTO {
	
	@ApiModelProperty(value = "商户ID")
	@JsonFormat(shape = JsonFormat.Shape.STRING)
	private Long id;
	
	@ApiModelProperty(value = "上级商户ID")
	private Long parentMerchantId;
	
	@ApiModelProperty(value = "上级商户")
	private String parentMerchantName;
	
	@ApiModelProperty(value = "主商户ID")
	private Long topMerchantId;
	
	@ApiModelProperty(value = "主商户")
	private String topMerchantName;
	
	@ApiModelProperty(value = "上级商户层级路径")
	private String parentMerchantIdPath;
	
	@ApiModelProperty(value = "商户层级路径")
	private String merchantIdPath;
	
	@ApiModelProperty(value = "商户code 长度2~10个字符")
	private String merchantCode;
	
	@ApiModelProperty(value = "商户名称 长度2~20个字符")
	private String merchantName;
	
	@ApiModelProperty(value = "钱包币种  CNY-人民币 VND-越南盾 THR-泰铢")
	private BwCurrencyEnum currency;
	
	@ApiModelProperty(value = "支持语言 ZH_CN-汉语、EN-英语、VN-越南语、TH-泰语 多选逗号分隔字符串拼接")
	private String languages;
	
	@ApiModelProperty(value = "商户层级ID")
	private Long merchantLevelId;
	
	@ApiModelProperty(value = "商户层级 长度2~20个字符")
	private String merchantLevel;
	
	
}