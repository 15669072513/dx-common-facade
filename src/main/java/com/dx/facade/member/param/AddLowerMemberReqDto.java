package com.dx.facade.member.param;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

/**
 * @author agan
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ApiModel(value = "新增下级会员参数封装", description = "新增下级会员参数封装")
public class AddLowerMemberReqDto {
    
    @ApiModelProperty(value = "商户id", required = true)
    @NotNull(message = "商户id不能为空")
    private Long merchantId;

	@ApiModelProperty(value = "商户名称", required = true)
	@NotNull(message = "商户名称不能为空")
	private String merchantName;

	@ApiModelProperty("父级商户ID")
	@JsonFormat(shape = JsonFormat.Shape.STRING)
	private Long parentMerchantId;

    @ApiModelProperty(value = "上级代理账号", required = true)
    @NotBlank(message = "用户名不能为空")
    @Length(min = 3, max = 12, message = "用户名长度范围在4-12")
    private String parentProxyName;
    
    @ApiModelProperty(value = "会员账号", required = true)
    @NotBlank(message = "用户名不能为空")
    @Length(min = 3, max = 12, message = "用户名长度范围在4-12")
    private String userName;
    
    @ApiModelProperty(value = "登录密码 明文密码做一次MD5大写", required = true)
    @NotBlank(message = "密码不能为空")
    @Length(min = 32, max = 32, message = "密码长度错误")
    private String password;
    
    @ApiModelProperty(value = "终端设备号")
    private String deviceNo;
    
    @ApiModelProperty(value = "注册reference(网址) (200)")
    private String registerReference;
	
	@ApiModelProperty("注册ip")
	private String registerIp;

	@ApiModelProperty("币种")
	private String currency;

	@ApiModelProperty("ip归属地")
	private String ipAttribution;
	
	@ApiModelProperty("注册终端类型（1-PC，2-IOS_APP，3-IOS_H5，4-Android_H5，5-Android_APP，6-后台）")
	private Integer deviceType;
	
	@ApiModelProperty(value="id")
	private Long id;
	
	@ApiModelProperty(value="商户code")
	private String merchantCode;
	
	@ApiModelProperty(value = "代理层级ID")
	private Long proxyLevelId;
	
	@ApiModelProperty(value = "父级代理层级ID")
	private Long parentProxyLevelId;
	
	@ApiModelProperty(value = "代理层级")
	private Integer proxyLevel;
	
	@ApiModelProperty(value = "代理层级名称")
	private String proxyLevelName;
	
	@ApiModelProperty(value = "父级代理层级名称")
	private String parentProxyLevelName;
	
	@ApiModelProperty(value="上级代理id")
	private Long parentProxyId;
	
	@ApiModelProperty(value="上级代理路劲")
	private String parentProxyPath;
	
	@ApiModelProperty(value = "代理层级路径")
	private String proxyPath;
	
	@ApiModelProperty(value = "代理层级路径（代理账号）")
	private String proxyPathUsername;
	
	@ApiModelProperty(value = "账号类型（1-试玩，2-商务，3-正式，4-测试，5-置换）")
	private Integer accountType;
	
	@ApiModelProperty(value="有效状态（0-有效 1-无效）")
	private Integer status;
	
	@ApiModelProperty(value="入口权限（0-关闭 1-开启）")
	private Integer entryAuthority;
	
}