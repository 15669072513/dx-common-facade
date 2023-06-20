package com.dx.facade.merchant.dto;

import com.baomidou.mybatisplus.annotation.TableField;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * 包网商户表
 */
@Data
@NoArgsConstructor
public class MerchantDTO {
	/**
	 * 商户ID
	 */
	@ApiModelProperty(value = "商户ID")
	private Long id;
	
	/**
	 * 上级商户ID
	 */
	@ApiModelProperty(value = "上级商户ID")
	private Long parentMerchantId;
	
	@ApiModelProperty(value = "上级商户")
	private String parentMerchantName;
	
	/**
	 * 主商户ID
	 */
	@ApiModelProperty(value = "主商户ID")
	private Long topMerchantId;
	
	@ApiModelProperty(value = "主商户")
	private String topMerchantName;
	
	/**
	 * 上级商户层级路径
	 */
	@ApiModelProperty(value = "上级商户层级路径")
	private String parentMerchantIdPath;
	
	/**
	 * 商户层级路径
	 */
	@ApiModelProperty(value = "商户层级路径")
	private String merchantIdPath;
	
	/**
	 * 商户code 长度2~10个字符
	 */
	@ApiModelProperty(value = "商户code 长度2~10个字符")
	private String merchantCode;
	
	/**
	 * 商户名称 长度2~20个字符
	 */
	@ApiModelProperty(value = "商户名称 长度2~20个字符")
	private String merchantName;
	
	/**
	 * 钱包币种  CNY-人民币 VND-越南盾 THR-泰铢
	 */
	@ApiModelProperty(value = "钱包币种  CNY-人民币 VND-越南盾 THR-泰铢")
	private String currency;
	
	/**
	 * 支持语言 1-汉语、2-英语、3-越南语、4-泰语 多选逗号分隔字符串拼接
	 */
	@ApiModelProperty(value = "支持语言 ZH_CN-汉语、EN-英语、VN-越南语、TH-泰语 多选逗号分隔字符串拼接")
	private String languages;
	
	/**
	 * 商户层级ID
	 */
	@ApiModelProperty(value = "商户层级ID")
	private Long merchantLevelId;
	
	@ApiModelProperty(value = "商户层级 长度2~20个字符")
	private String merchantLevel;
	
	/**
	 * 商户状态 0-无效,1-有效
	 */
	@ApiModelProperty(value = "商户状态 0-无效,1-有效")
	private Integer status;
	
	/**
	 * 商户备注 长度2~500个字符
	 */
	@ApiModelProperty(value = "商户备注 长度2~500个字符")
	private String remark;
	
	/**
	 * 创建时间
	 */
	@ApiModelProperty(value = "创建时间")
	private Date createdAt;
	
	/**
	 * 创建人 长度为2-10个字符
	 */
	@ApiModelProperty(value = "创建人 长度为2-10个字符")
	private String createdBy;
	
	/**
	 * 修改时间
	 */
	@ApiModelProperty(value = "修改时间")
	private Date updatedAt;
	
	/**
	 * 最近操作人 长度为2-10个字符
	 */
	@ApiModelProperty(value = "最近操作人 长度为2-10个字符")
	private String updatedBy;
	
	
	/*******************************客服配置信息*********************************/
	@ApiModelProperty(value = "会员客服地址")
	private String memberUrl;
	
	@ApiModelProperty(value = "代理客服地址")
	private String proxyUrl;
	
	/*******************************游戏地址配置信息*****************************/
	@ApiModelProperty(value = "PC游戏地址")
	private String pcUrl;
	
	@TableField(exist = false)
	private String h5Url;
	
	@TableField(exist = false)
	private String downUrl;
	
	@ApiModelProperty(value = "总代账号")
	private String proxy;
	@ApiModelProperty(value = "充值渠道集合")
	private String channelRecharge;
	
	@ApiModelProperty(value = "提现渠道集合")
	private String channelWithdraw;
	
	/* @ApiModelProperty(value = "场馆配置信息")
	private List<MerchantVenueConfig> list;
	
	@ApiModelProperty("渠道名称")
	private List<SmsChannelComboBoxResp> smsChannelList; */
	
	public static final String COL_ID = "id";
	
	public static final String COL_PARENT_MERCHANT_ID = "parent_merchant_id";
	
	public static final String COL_PARENT_MERCHANT_ID_PATH = "parent_merchant_id_path";
	
	public static final String COL_MERCHANT_ID_PATH = "merchant_id_path";
	
	public static final String COL_MERCHANT_CODE = "merchant_code";
	
	public static final String COL_MERCHANT_NAME = "merchant_name";
	
	public static final String COL_CURRENCY = "currency";
	
	public static final String COL_LANGUAGES = "languages";
	
	public static final String COL_MERCHANT_LEVEL_ID = "merchant_level_id";
	
	public static final String COL_MERCHANT_LEVEL = "merchant_level";
	
	public static final String COL_STATUS = "status";
	
	public static final String COL_REMARK = "remark";
	
	public static final String COL_CREATED_AT = "created_at";
	
	public static final String COL_CREATED_BY = "created_by";
	
	public static final String COL_UPDATED_AT = "updated_at";
	
	public static final String COL_UPDATED_BY = "updated_by";
}