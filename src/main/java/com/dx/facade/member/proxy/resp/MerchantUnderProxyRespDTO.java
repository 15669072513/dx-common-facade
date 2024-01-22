package com.dx.facade.member.proxy.resp;

import com.baomidou.mybatisplus.annotation.TableField;
import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * <p>
 * 代理表
 * </p>
 *
 * @author fitz
 * @since 2022-10-10
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class MerchantUnderProxyRespDTO {
	
	
	@ApiModelProperty("代理ID")
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
	
	@ApiModelProperty("代理层级")
	private Integer proxyLevel;
	
	@ApiModelProperty("代理层级名称")
	private String proxyLevelName;
	
	@ApiModelProperty("代理线层级上限")
	private Integer maxLevel;
	
	@ApiModelProperty("代理层级路径")
	private String proxyPath;
	
	@ApiModelProperty("代理用户名层级路径")
	private String proxyPathUsername;
	
	@ApiModelProperty("上级代理id")
	@JsonFormat(shape = JsonFormat.Shape.STRING)
	private Long parentProxyId;
	
	@ApiModelProperty("上级代理名称")
	private String parentProxyName;
	
	@ApiModelProperty("上级代理层级路径")
	private String parentProxyPath;
	
	@ApiModelProperty("上级代理层级")
	private Integer parentProxyLevel;
	
	@ApiModelProperty("上级代理层级名称")
	private String parentProxyLevelName;
	
	@ApiModelProperty("总代id")
	@JsonFormat(shape = JsonFormat.Shape.STRING)
	private Long topProxyId;
	
	@ApiModelProperty("总代名称")
	private String topProxyName;
	
	@ApiModelProperty("信用等级")
	private Integer creditLevel;
	
	@ApiModelProperty("合营码")
	private String joinCode;
	
	@ApiModelProperty("入口权限（0-关闭 1-开启）")
	private Integer entryAuthority;
	
	@ApiModelProperty("强制契约生效标志 0-未生效 1-生效")
	private Integer enforceContractStatus;
	
	@ApiModelProperty("契约模式 0-无契约 1-佣金契约 2-返点契约 3-佣金+返点契约")
	private Integer contractModel;
	
	@ApiModelProperty("真实姓名")
	private String realName;
	
	@ApiModelProperty("风控层级id")
	@JsonFormat(shape = JsonFormat.Shape.STRING)
	private Long windControlId;
	
	@ApiModelProperty("风控层级名称")
	private String windControlName;
	
	@ApiModelProperty(value = "佣金模式 1-返点模式 2-返佣模式", required = true)
	private Integer commissionModel;
	
    @ApiModelProperty("返点比率分配模式 1：自由模式 2：模板模式")
    private Integer rebateAllotMode;

	@ApiModelProperty(value = "业务模式：0-现金+信用，1-现金模式，2-信用模式")
	private Integer businessModel;
}
