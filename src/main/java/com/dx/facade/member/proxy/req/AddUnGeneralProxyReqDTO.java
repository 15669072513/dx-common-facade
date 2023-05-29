package com.dx.facade.member.proxy.req;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import com.dx.facade.constant.Constants;
import com.dx.facade.member.param.MemberAndProxyDto;

import java.io.Serializable;

/**
 * 代理 实体类
 *
 * @author fitz
 * @version 1.0.0
 * @date 2022/10/04
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class AddUnGeneralProxyReqDTO implements Serializable {
	
	@ApiModelProperty(value = "账号类型(1)（1-正式，2-商务，3-置换）枚举 accountType", required = true, example = "1")
	@NotNull(message = "账号类型 不能为空")
	private Integer accountType;
	
	@ApiModelProperty(value = "分配直属上级", required = true, example = "abc123")
	@NotBlank(message = "上级代理账号 不能为空")
	@Pattern(regexp = Constants.REG_4_11, message = "账号 4-11位，最少1个字母+数字组合，首位字母")
	private String parentProxyName;
	
	@ApiModelProperty(value = "分配直属上级ID", required = true, example = "123121321")
	@NotNull(message = "上级代理ID 不能为空")
	private Long parentProxyId;
	
	@ApiModelProperty(value = "选择商户ID", required = true, example = "123121321")
	@NotNull(message = "选择商户ID 不能为空")
	private Long merchantId;
	
	@ApiModelProperty(value = "选择商户", hidden = true, example = "123121321")
	private String merchantName;
	
	@ApiModelProperty(value = "选择商户层级", hidden = true, example = "123121321")
	private String merchantPath;
	
	@ApiModelProperty(value = "代理账号(20)", required = true, example = "abc123")
	@NotBlank(message = "代理账号不能为空")
	@Pattern(regexp = Constants.REG_4_11, message = "账号 4-11位，最少1个字母+数字组合，首位字母")
	private String userName;
	
	@ApiModelProperty(value = "登录密码(32)", required = true, example = "abc132")
	@NotBlank(message = "密码不能为空")
	private String password;
	
	@ApiModelProperty(value = "审核信息")
	private String applyInfo;
	
	@ApiModelProperty(value = "注册IP", hidden = true)
	private String registerIp;
	
	@ApiModelProperty(value = "注册设备号", hidden = true)
	private String registerDeviceNo;
	
	@ApiModelProperty(value = "申请人", hidden = true)
	private String applyName;
	
	
	public static MemberAndProxyDto convertMemberAndProxyDto(AddUnGeneralProxyReqDTO item) {
		return MemberAndProxyDto.builder()
				.accountType(item.getAccountType())
				.parentProxyName(item.getParentProxyName())
				.parentProxyId(item.getParentProxyId())
				.merchantId(item.getMerchantId())
				.userName(item.getUserName())
				.merchantName(item.getMerchantName())
				.password(item.getPassword().toUpperCase())
				.applyInfo(item.getApplyInfo())
				.registerIp(item.getRegisterIp())
				.registerDeviceNo(item.getRegisterDeviceNo())
				.build();
	}
	
}