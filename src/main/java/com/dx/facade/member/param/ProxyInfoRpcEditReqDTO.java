package com.dx.facade.member.param;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * 代理详情-信息编辑 请求参数封装
 *
 * @author fitz
 * @version 1.0.0
 * @date 2021/05/13
 */
@Data
@ApiModel(value = "com-ob-facade-member-proxy-req-ProxyInfoRpcEditReqDTO", description = "信息编辑")
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ProxyInfoRpcEditReqDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "商户id", required = true)
    private Long merchantId;

    @ApiModelProperty(value = "商户名称")
    private String merchantName;

    @ApiModelProperty(value = "代理ID", hidden = true)
    private Long userId;

    @ApiModelProperty(value = "代理账号", required = true)
    private String userName;

    @ApiModelProperty(value = "申请人", required = true)
    private String applyName;

    @ApiModelProperty(value = "账号类型（1-试玩，2-商务，3-正式，4-测试，5-置换）")
    private Integer accountType;

    @ApiModelProperty(value = "登陆锁定状态 0-未锁定 1-登陆锁定")
    private Integer loginLockStatus;

    @ApiModelProperty(value = "账号锁定状态 0-未锁定 1-充提锁定")
    private Integer accountLockStatus;

    @ApiModelProperty(value = "标签id")
    private Long labelId;

    @ApiModelProperty(value = "标签名称")
    private String labelName;

    @ApiModelProperty(value = "风控层级id")
    private Long windControlId;

    @ApiModelProperty(value = "风控层级名称")
    private String windControlName;

    @ApiModelProperty(value = "入口权限（0-关闭 1-开启）")
    private String entryAuthority;

    @ApiModelProperty(value = "强制契约生效标志 0-未生效 1-生效")
    private Integer enforceContractStatus;

    @ApiModelProperty(value = "账号备注")
    private String remark;

    @ApiModelProperty(value = "账号备注 修改后")
    private String remarkAfter;

    @ApiModelProperty(value="应用终端,1:OB旗舰 2:美播真人")
    private Integer appId;
    
    @ApiModelProperty(value="登录站点,1:OB旗舰 2:美播真人")
    private Integer loginAppId;

    @ApiModelProperty(value="信用等级")
    private Integer creditLevel;

    @ApiModelProperty(value="代理线层级上限")
    private Integer maxLevels;
	
	@ApiModelProperty(value = "代理层级", hidden = true)
	private Integer proxyLevel;
	
	@ApiModelProperty(value = "代理层级名称", hidden = true)
	private String proxyLevelName;
	
	@ApiModelProperty(value = "分润政策id")
	@JsonFormat(shape = JsonFormat.Shape.STRING)
	private Long sharingPolicyId;
	
	@ApiModelProperty(value = "私庄模式,1:吃单模式 2:坐庄模式", example = "2")
	private Integer bankerMode;

    @ApiModelProperty("取款限制类型：1-账单限制，2-流水限制")
    private Integer withdrawLimitType;

    @ApiModelProperty(value = "账号状态 修改后内容")
    private ProxyInfoRpcEditAccountStatusReqDTO accountStatusAfter;
    @ApiModelProperty(value = "风控层级 修改后内容")
    private ProxyInfoRpcEditWindControlReqDTO windControlAfter;
    @ApiModelProperty(value = "会员标签 修改后内容")
    private ProxyInfoRpcEditLabelReqDTO labelAfter;
    @ApiModelProperty(value = "入口权限 修改后内容")
    private ProxyInfoRpcEntryAuthorityReqDTO entryAuthorityAfter;
    @ApiModelProperty(value = "支付密码重置 修改后内容")
    private ProxyInfoRpcPayPasswordReqDTO payPasswordAfter;
    @ApiModelProperty(value = "强制编辑契约生效 修改后内容")
    private ProxyInfoRpcEditMandatoryContractReqDTO mandatoryContractAfter;
    @ApiModelProperty(value = "信用等级 修改后内容")
    private ProxyInfoRpcEditCreditLevel creditLevelAfter;
    @ApiModelProperty(value = "代理线层级上限 修改后内容")
    private ProxyInfoRpcEditMaxLevels maxLevelsAfter;
    @ApiModelProperty(value = "重置密码以及备注")
    private ProxyInfoRpcEditResetPwd resetPwdAfter;
    @ApiModelProperty(value = "取款限制类型")
    private ProxyInfoRpcEditWithdrawLimitType editWithdrawLimitType;

    @ApiModelProperty(value = "权限管理")
    private ProxyInfoRpcPermissionReqDTO proxyInfoRpcPermissionReqDTO;
}
