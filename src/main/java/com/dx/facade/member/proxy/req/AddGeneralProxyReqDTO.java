package com.dx.facade.member.proxy.req;

import com.dx.facade.constant.Constants;
import com.dx.facade.merchant.req.ProxyContractAddReqDTO;
import com.dx.facade.merchant.req.RebateContractParam;
import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import java.math.BigDecimal;
import java.util.List;

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
	@Pattern(regexp = Constants.REG_4_11, message = "账号 4-11位，最少1个字母+数字组合，首位字母")
	private String userName;
	
	@ApiModelProperty(value = "登录密码(32)", required = true, example = "abc132")
	@NotBlank(message = "密码不能为空")
	private String password;
	
	@ApiModelProperty(value = "契约模式 0-无契约 1-佣金契约 2-返点契约 3-佣金+返点契约", required = true)
	private Integer contractModel;
	
	@ApiModelProperty(value = "佣金模式 1-返点模式 2-返佣模式", required = true)
	private Integer commissionModel;
	
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
	
	@ApiModelProperty("德州返点比例")
    @DecimalMin(value = "0.00", message = "德州返点比例不能小于0.00")
    @NotNull(message = "德州返点比例不能为空")
    private BigDecimal texasRebate;
	
	@ApiModelProperty("德州保险返点比例")
    @DecimalMin(value = "0.00", message = "德州保险返点比例不能小于0.00")
    @NotNull(message = "德州保险返点比例不能为空")
    private BigDecimal texasInsuranceRebate;
    
    
    @ApiModelProperty("真人返点比例")
    @NotNull(message = "真人返点比例不能为空")
    @DecimalMin(value = "0.00", message = "真人返点比例不能小于0.00")
    private BigDecimal actualPersonRebate;
    
    @ApiModelProperty("体育返点比例")
    @NotNull(message = "体育返点比例不能为空")
    @DecimalMin(value = "0.00", message = "体育返点比例不能小于0.00")
    private BigDecimal sportsRebate;
    
    @ApiModelProperty("彩票返点比例")
    @NotNull(message = "彩票返点比例不能为空")
    @DecimalMin(value = "0.00", message = "彩票返点比例不能小于0.00")
    private BigDecimal lotteryTicketRebate;
    
    @ApiModelProperty("棋牌返点比例")
    @NotNull(message = "棋牌返点比例不能为空")
    @DecimalMin(value = "0.00", message = "棋牌返点比例不能小于0.00")
    private BigDecimal chessRebate;
    
    @ApiModelProperty("电竞返点比例")
    @NotNull(message = "电竞返点比例不能为空")
    @DecimalMin(value = "0.00", message = "电竞返点比例不能小于0.00")
    private BigDecimal esportsRebate;
    
    @ApiModelProperty("德州返佣比例")
    @DecimalMin(value = "0.00", message = "电竞返点比例不能小于0.00")
    private BigDecimal texasCommission;
    
    @ApiModelProperty("德州保险返佣比例")
    @DecimalMin(value = "0.00", message = "电竞返点比例不能小于0.00")
    private BigDecimal texasInsuranceCommission;
    
    @ApiModelProperty("其他返佣比例")
    @DecimalMin(value = "0.00", message = "电竞返点比例不能小于0.00")
    private BigDecimal otherCommission;
	
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