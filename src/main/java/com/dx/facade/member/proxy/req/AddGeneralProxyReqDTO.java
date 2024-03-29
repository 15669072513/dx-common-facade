package com.dx.facade.member.proxy.req;

import java.util.List;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import com.baomidou.mybatisplus.annotation.TableField;
import com.dx.facade.constant.Constants;
import com.dx.facade.member.param.BaseCommissionRateParamDTO;
import com.dx.facade.member.param.BaseRebateRateParamDTO;
import com.dx.facade.merchant.req.ProxyContractAddReqDTO;
import com.dx.facade.merchant.req.RebateContractParam;
import com.fasterxml.jackson.annotation.JsonFormat;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

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
public class AddGeneralProxyReqDTO {
	
	@ApiModelProperty(value = "账号类型(1)（1-正式，2-商务，3-置换）", required = true, example = "1")
	@NotNull(message = "账号类型 不能为空")
	private Integer accountType;
	
	@ApiModelProperty(value = "选择商户ID", required = true, example = "123121321")
	@NotNull(message = "选择商户ID 不能为空")
	private Long merchantId;
	
	@ApiModelProperty(value = "选择商户", hidden = true)
	private String merchantName;
	
	@ApiModelProperty(value = "选择商户", hidden = true)
	private String merchantPath;
	
	@ApiModelProperty(value = "代理账号(20)", required = true, example = "abc123")
	@NotBlank(message = "代理账号不能为空")
	@Pattern(regexp = Constants.REG_4_11, message = Constants.USER_NAME_ERROR_MSG)
	private String userName;
	
	@ApiModelProperty(value = "登录密码(32)", required = true, example = "abc132")
	@NotBlank(message = "密码不能为空")
	private String password;
	
	@ApiModelProperty(value = "契约模式 0-无契约 1-佣金契约 2-返点契约 3-佣金+返点契约", required = true)
	private Integer contractModel;

	@ApiModelProperty(value = "佣金模式 1-返点模式 2-返佣模式", required = true)
	private Integer commissionModel;
	
    @ApiModelProperty("返点比率分配模式 1：自由模式 2：模板模式")
    private Integer rebateAllotMode;
    
    @ApiModelProperty(value = "返点比率模板ID，当返点比率分配模式为2时需要传")
    private Long rebateRateTemplateId;
	
	@ApiModelProperty(value = "代理线层级上限", required = true)
	@NotNull(message = "代理线层级上限不能为空")
	private Integer maxLevels;
	
	@ApiModelProperty(value = "审核信息")
	private String applyInfo;
	
	@ApiModelProperty(value = "返点比例集合", required = true)
	public List<RebateContractParam> rebateContractList;
	
	@ApiModelProperty(value = "佣金比例集合", required = true)
	public List<RebateContractParam> commissionContractList;
	
	@ApiModelProperty(value = "返点政策类型ID")
	@JsonFormat(shape = JsonFormat.Shape.STRING)
	private Long rebatePolicyTypeId;
	
	@ApiModelProperty(value = "佣金政策类型ID")
	@JsonFormat(shape = JsonFormat.Shape.STRING)
	private Long commissionPolicyTypeId;
	
	@ApiModelProperty(value = "注册IP", hidden = true)
	private String registerIp;
	
	@ApiModelProperty(value = "注册设备号", hidden = true)
	private String registerDeviceNo;
	
	@ApiModelProperty(value = "申请人", hidden = true)
	private String applyName;
	
	@ApiModelProperty(value = "代理ID(20)", hidden = true)
	private Long userId;
	
	@ApiModelProperty(value = "返点契约ID", hidden = true)
	private Long rebateContractId;
	
	@ApiModelProperty(value = "佣金契约ID", hidden = true)
	private Long commissionContractId;

	@ApiModelProperty("返佣比例列表")
	private List<BaseCommissionRateParamDTO> commissionRateList;

	@ApiModelProperty("返点比例列表")
	private List<BaseRebateRateParamDTO> rebateRateList;

	@ApiModelProperty(value = "取款限制类型 1账单限制  2流水限制")
	@NotNull(message = "取款限制类型 不能为空")
	@TableField("withdraw_limit_type")
	private Integer withdrawLimitType;


	@ApiModelProperty(value = "是否可创建牌桌开桌,0-不允许（默认），1-允许")
	private Integer dxTableCreatable;

	@ApiModelProperty(value = "业务模式：0-现金+信用，1-现金模式，2-信用模式")
	private Integer businessModel;


	public static ProxyContractAddReqDTO convert(AddGeneralProxyReqDTO reqDTO) {
		
		return ProxyContractAddReqDTO.builder()
				.merchantId(reqDTO.getMerchantId())
				.signProxyName(reqDTO.getUserName())
				.signProxyId(reqDTO.getUserId())
				.parentProxyId(Constants.ZERO_L)
				.accountType(reqDTO.getAccountType())
				.rebatePolicyTypeId(reqDTO.getRebatePolicyTypeId())
				.commissionPolicyTypeId(reqDTO.getCommissionPolicyTypeId())
				.updatedBy(reqDTO.getApplyName())
				.backNote(reqDTO.getApplyInfo())
				.dataSources(1)
				//审核通过后 修改为生效 1
				.effectStatus(-1)
				.contractStatus(1)
				.sginType(1)
				.signProxyLevel(0)
				.signProxyLevelId(0L)
				.commissionContractList(reqDTO.getCommissionContractList())
				.rebateContractList(reqDTO.getRebateContractList())
				.rebateContractId(reqDTO.getRebateContractId())
				.commissionContractId(reqDTO.getCommissionContractId())
				.sginType(1)
				.createAccount(reqDTO.getApplyName())
				.build();
	}
}