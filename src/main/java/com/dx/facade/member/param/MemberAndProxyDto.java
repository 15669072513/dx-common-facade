package com.dx.facade.member.param;

import com.baomidou.mybatisplus.annotation.TableField;
import com.dx.facade.member.enums.ThirdPlatform;
import com.dx.facade.member.proxy.req.AddLowerProxyReqDTO;
import com.dx.facade.merchant.req.RebateContractParam;
import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

/**
 * 会员和代理 通用类
 *
 * @author fitz
 * @version 1.0.0
 * @date 2021/09/22
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class MemberAndProxyDto {

    private static final long serialVersionUID = 1L;

    /**
     * id
     */
    @ApiModelProperty(value = "id")
    private Long id;

    /**
     * 商户id
     */
    @ApiModelProperty(value = "商户id")
    private Long merchantId;

    /**
     * 商户code
     */
    @ApiModelProperty(value = "商户code")
    private String merchantCode;

    @ApiModelProperty("商户名称")
    private String merchantName;

    @ApiModelProperty("商户层级路径")
    private String merchantPath;

    @ApiModelProperty("父级商户ID")
    private Long parentMerchantId;

    @ApiModelProperty("父级商户层级路径")
    private String parentMerchantPath;

    @ApiModelProperty("主商户ID")
    private Long topMerchantId;

    @ApiModelProperty("主商户名称")
    private String topMerchantName;

    @ApiModelProperty("币种")
    private String currency;

    /**
     * 会员等级id
     */
    @ApiModelProperty(value = "会员等级id")
    private Long levelId;

    /**
     * 用户名
     */
    @ApiModelProperty(value = "用户名")
    private String userName;

    /**
     * 加盐
     */
    @ApiModelProperty("加盐")
    private String salt;

    /**
     * 密码
     */
    @ApiModelProperty(value = "密码")
    private String password;

    /**
     * 真实姓名
     */
    @ApiModelProperty(value = "真实姓名")
    private String realName;

    /**
     * 手机号码
     */
    @ApiModelProperty(value = "手机号码")
    private String mobile;

    /**
     * 注册手机号
     */
    @ApiModelProperty(value = "注册手机号")
    private String registerPhone;

    /**
     * 上级代理id
     */
    @ApiModelProperty(value = "上级代理id")
    private Long parentProxyId;

    /**
     * 上级代理账号
     */
    @ApiModelProperty(value = "上级代理账号")
    private String parentProxyName;

    @ApiModelProperty(value = "上级代理层级路劲")
    private String parentProxyPath;

    @ApiModelProperty("总代id")
    private Long topProxyId;

    @ApiModelProperty("总代名称")
    private String topProxyName;

    /**
     * 账号类型（1-试玩，2-商务，3-正式，4-测试，5-置换）
     */
    @ApiModelProperty(value = "账号类型（1-试玩，2-商务，3-正式，4-测试，5-置换）")
    private Integer accountType;

    /**
     * 标签id
     */
    @ApiModelProperty(value = "标签id")
    private Long labelId;

    /**
     * 标签名称
     */
    @ApiModelProperty(value = "标签名称")
    private String labelName;

    /**
     * 风控层级id
     */
    @ApiModelProperty(value = "风控层级id")
    private Long windControlId;

    /**
     * 风控层级名称
     */
    @ApiModelProperty(value = "风控层级名称")
    private String windControlName;

    /**
     * vip等级id
     */
    @ApiModelProperty(value = "vip等级id")
    private Long vipId;

    /**
     * vip等级序号
     */
    @ApiModelProperty(value = "vip等级序号")
    private Integer vipSerialNum;

    /**
     * vip等级序号
     */
    @ApiModelProperty(value = "vip经验值")
    private Long vipExperienceVal;


    /**
     * 邮箱
     */
    @ApiModelProperty(value = "邮箱")
    private String email;

    /**
     * 性别
     */
    @ApiModelProperty("性别 0-女，1-男")
    private Integer gender;

    /**
     * 生日
     */
    @ApiModelProperty(value = "生日 (20) 格式：yyyy-MM-dd")
    private String birth;

    /**
     * 生日月和日
     */
    @ApiModelProperty(value = "出生月和日(11),格式801")
    private Integer birthDay;

    /**
     * 首存时间
     */
    @ApiModelProperty(value = "首存时间")
    private String firstDepositTime;

    /**
     * 首存金额
     */
    @ApiModelProperty(value = "首存金额")
    private BigDecimal firstDepositAmount;

    /**
     * 最后登陆时间
     */
    @ApiModelProperty(value = "最后登陆时间")
    private String lastLoginTime;

    /**
     * 最后登陆ip
     */
    @ApiModelProperty(value = "最后登陆ip")
    private String lastLoginIp;
	
	@ApiModelProperty(value = "登陆锁定状态 0-未锁定 1-登陆锁定")
	private Integer loginLockStatus;
	
	@ApiModelProperty(value = "账号锁定状态 0-未锁定 1-充提锁定")
	private Integer paymentLockStatus;
	
	@ApiModelProperty(value = "游戏锁定状态 0-未锁定 1-游戏锁定")
	private Integer gameLockStatus;
	
	@ApiModelProperty(value = "入局锁定状态 0-未锁定 1-入局锁定")
	private Integer joinGameLockStatus;

    /**
     * 注册ip
     */
    @ApiModelProperty(value = "注册ip")
    private String registerIp;

    /**
     * ip归属地
     */
    @ApiModelProperty(value = "ip归属地")
    private String ipAttribution;

    /**
     * 注册reference(网址)
     */
    @ApiModelProperty(value = "注册reference(网址)")
    private String registerReference;

    /**
     * 注册终端类型（1-PC，2-IOS_APP，3-IOS_H5，4-Android_H5，5-Android_APP，6-后台）
     */
	@ApiModelProperty("注册终端类型（1-PC，2-IOS_APP，3-IOS_H5，4-Android_H5，5-Android_APP 6-后台）")
	private Integer registerDeviceType;

    /**
     * 注册设备号
     */
    @ApiModelProperty(value = "注册设备号")
    private String registerDeviceNo;

    /**
     * 注册时间
     */
    @ApiModelProperty(value = "注册时间")
    private String createDt;

    /**
     * 更新时间
     */
    @ApiModelProperty(value = "更新时间")
    private String updateDt;

    /**
     * 开启免转模式 0-手动，1-免转
     */
    @ApiModelProperty(value = "开启免转模式 0-手动，1-免转  (1)")
    private Integer noTransfer;

    @ApiModelProperty("申请信息")
    private String applyInfo;

    @ApiModelProperty("申请人")
    private String applyName;

    @ApiModelProperty("转代次数")
    private Integer transforNum;


    @ApiModelProperty(value = "首提时间")
    private LocalDateTime firstWithdrawTime;
    @ApiModelProperty(value = "首提金额")
    private BigDecimal firstWithdrawAmount;

    @ApiModelProperty(value = "上次存款时间")
    private LocalDateTime lastDepositTime;
    @ApiModelProperty(value = "上次存款id")
    private Long lastDepositId;

    @ApiModelProperty(value = "上次提款时间")
    private LocalDateTime lastWithdrawTime;
    @ApiModelProperty(value = "上次提款id")
    private Long lastWithdrawId;

    @ApiModelProperty(value = "累计存款金额")
    private BigDecimal totalDepositAmount;
    @ApiModelProperty(value = "累计存款次数")
    private Integer totalDepositNum;

    @ApiModelProperty(value = "累计提款金额")
    private BigDecimal totalWithdrawAmount;
    @ApiModelProperty(value = "累计提款次数")
    private Integer totalWithdrawNum;

    @ApiModelProperty(value = "会员头像URL")
    private String topImagesUrl;
	
	/**
	 * 代理层级路径
	 */
	@ApiModelProperty(value = "代理层级路径")
	private String proxyPath;
	
	/**
	 * 代理层级ID
	 */
	@ApiModelProperty(value = "代理层级ID")
	@JsonFormat(shape = JsonFormat.Shape.STRING)
	private Long proxyLevelId;
	
	/**
	 * 代理层级
	 */
	@ApiModelProperty(value = "代理层级")
	private Integer proxyLevel;
	
	/**
	 * 代理层级名称
	 */
	@ApiModelProperty(value = "代理层级名称")
	private String proxyLevelName;
	
	/**
	 * 代理线层级上限
	 */
	@ApiModelProperty(value = "代理线层级上限")
	private Integer maxLevels;
	
	/**
	 * 代理层级路径（代理账号）
	 */
	@ApiModelProperty(value = "代理层级路径（代理账号）")
	private String proxyPathUsername;
	
	/**
	 * qq
	 */
	@TableField(value = "qq")
	@ApiModelProperty(value="qq")
	private String qq;
	
	/**
	 * flygram
	 */
	@TableField(value = "flygram")
	@ApiModelProperty(value="flygram")
	private String flygram;
	
	
	/**
	 * 支付密码
	 */
	@TableField(value = "pay_password")
	@ApiModelProperty(value="支付密码")
	private String payPassword;
	
	/**
	 * 合营代码
	 */
	@TableField(value = "invitation_code")
	@ApiModelProperty(value="合营代码")
	private String invitationCode;

	@ApiModelProperty(value="好友邀请码-活动邀请")
	private String friendInvitationCode;

	@ApiModelProperty(value="设备码")
	private String deviceNo;

	@TableField(value = "entry_authority")
	@ApiModelProperty(value="入口权限（0-关闭 1-开启）")
	private Integer entryAuthority;
	
	/**
	 * 强制契约生效标志 0-未生效 1-生效
	 */
	@ApiModelProperty(value = "强制契约生效标志 0-未生效 1-生效")
	private Integer enforceContractStatus;
	
	/**
	 * 契约模式 0-无契约 1-佣金契约 2-返点契约 3-佣金+返点契约
	 */
	@ApiModelProperty(value = "契约模式 0-无契约 1-佣金契约 2-返点契约 3-佣金+返点契约")
	private Integer contractModel;
	
    @ApiModelProperty("佣金模式 1：返点模式 2：返佣模式")
    private Integer commissionMode;
    
    @ApiModelProperty("佣金结算周期 1：半月结 2：月结")
    private Integer commissionSettleCycle;
	
	/**
	 * 欠款标志 0-无欠款 1-有欠款
	 */
	@ApiModelProperty(value = "欠款标志 0-无欠款 1-有欠款")
	private Integer debtStatus;
	
	/**
	 * 返点契约ID
	 */
	@ApiModelProperty(value = "返点契约ID")
	private Long rebateContractId;
	
	/**
	 * 下级代理人数
	 */
	@ApiModelProperty(value = "下级代理人数")
	private Integer underProxyNum;
	
	/**
	 * 直属下级代理人数
	 */
	@ApiModelProperty(value = "直属下级代理人数")
	private Integer directlyUnderProxyNum;
	
	/**
	 * 下级会员人数
	 */
	@ApiModelProperty(value = "下级会员人数")
	private Integer underMemberNum;
	
	/**
	 * 直属下级会员人数
	 */
	@ApiModelProperty(value = "直属下级会员人数")
	private Integer directlyUnderMemberNum;
	
	/**
	 * 注册方式 0-手动 1-自动
	 */
	@ApiModelProperty(value = "注册方式 0-手动 1-自动")
	private Integer registerType;
	
	/**
	 * 佣金契约ID
	 */
	@ApiModelProperty(value = "佣金契约ID")
	private Long commissionContractId;
	
	/**
	 * 转出会员人数
	 */
	@ApiModelProperty(value = "转出会员人数")
	private Integer transferOutNum;
	
	/**
	 * 转入会员人数
	 */
	@ApiModelProperty(value = "转入会员人数")
	private Integer transferInNum;
	
	@ApiModelProperty(value = "上级代理层级ID")
	@JsonFormat(shape = JsonFormat.Shape.STRING)
	private Long parentProxyLevelId;

    /**
     * 上级代理层级
     */
    @ApiModelProperty(value = "上级代理层级")
    private Integer parentProxyLevel;
	
	@ApiModelProperty(value = "上级代理层级名称")
	private String parentProxyLevelName;
	
	@ApiModelProperty(value = "契约状态 （0-未签约 1-已签约）")
	private Integer contractStatus;
	
	@ApiModelProperty(value = "是否是app新增下级会员，true时，不会维护同名代理信息的层级关系")
	private Boolean isAppAddMember = Boolean.FALSE;
	
	@ApiModelProperty(value = "反点比例集合")
	public List<RebateContractParam> rebateContractList;
	
	@ApiModelProperty(value = "佣金比例集合")
	public List<RebateContractParam> commissionContractList;
	
	@ApiModelProperty(value="返点政策类型ID")
	@JsonFormat(shape = JsonFormat.Shape.STRING)
	private Long rebatePolicyTypeId;
	
	@ApiModelProperty(value="佣金政策类型ID")
	@JsonFormat(shape = JsonFormat.Shape.STRING)
	private Long commissionPolicyTypeId;
	
	@ApiModelProperty(value = "绑定自己 true-绑定 false-不绑定 默认 false")
	private Boolean bindYourself = Boolean.FALSE;
	
	@ApiModelProperty("是否需要修改密码：0不需要，1需要修改密码")
	private Integer needChgPwd;

	@ApiModelProperty("三方平台")
	private ThirdPlatform thirdPlatform;

	@ApiModelProperty("三方平台唯一标识")
	private String thirdPlatformId;
	
    @ApiModelProperty("俱乐部Id")
    private Long clubId;

    @ApiModelProperty("俱乐部名称")
    private String clubName;
    
    @ApiModelProperty("昵称")
    private String nickName;
    
    @ApiModelProperty("开局权限（0-关闭 1-开启）")
    private Integer openLockStatus;
    
    @ApiModelProperty("俱乐部管理权限（0-关闭 1-开启）")
    private Integer manageClubLockStatus;

	@ApiModelProperty(value = "取款限制类型 1账单限制  2流水限制")
	private Integer withdrawLimitType;
	
	public static MemberAndProxyDto convertToMemberAndProxyDto(AddLowerProxyReqDTO item) {
		if (item == null) {
			return null;
		}
		MemberAndProxyDto result = new MemberAndProxyDto();
		result.setId(item.getId());
		result.setMerchantId(item.getMerchantId());
		result.setMerchantCode(item.getMerchantCode());
		result.setMerchantName(item.getMerchantName());
		result.setMerchantPath(item.getMerchantPath());
		result.setParentMerchantId(item.getParentMerchantId());
		result.setParentMerchantPath(item.getParentMerchantPath());
		result.setTopMerchantId(item.getTopMerchantId());
		result.setTopMerchantName(item.getTopMerchantName());
		result.setCurrency(item.getCurrency());
		result.setUserName(item.getUserName());
		result.setSalt(item.getSalt());
		result.setPassword(item.getPassword());
		result.setRealName(item.getRealName());
		result.setMobile(item.getMobile());
		result.setRegisterPhone(item.getRegisterPhone());
		result.setParentProxyId(item.getParentProxyId());
		result.setParentProxyName(item.getParentProxyName());
		result.setParentProxyPath(item.getParentProxyPath());
		result.setTopProxyId(item.getTopProxyId());
		result.setTopProxyName(item.getTopProxyName());
		result.setAccountType(item.getAccountType());
		result.setLabelId(item.getLabelId());
		result.setLabelName(item.getLabelName());
		result.setWindControlId(item.getWindControlId());
		result.setWindControlName(item.getWindControlName());
		result.setEmail(item.getEmail());
		result.setGender(item.getGender());
		result.setBirth(item.getBirth());
		result.setRegisterDeviceType(item.getDeviceType());
		result.setLoginLockStatus(item.getLoginLockStatus());
		result.setPaymentLockStatus(item.getAccountLockStatus());
		result.setGameLockStatus(item.getGameLockStatus());
		result.setRegisterIp(item.getRegisterIp());
		result.setIpAttribution(item.getIpAttribution());
		result.setRegisterReference(item.getRegisterReference());
		result.setRegisterDeviceNo(item.getDeviceNo());
		result.setCreateDt(item.getCreateDt());
		result.setUpdateDt(item.getUpdateDt());
		result.setNoTransfer(item.getNoTransfer());
		result.setApplyInfo(item.getApplyInfo());
		result.setApplyName(item.getApplyName());
		result.setTopImagesUrl(item.getTopImagesUrl());
		result.setProxyPath(item.getProxyPath());
		result.setProxyLevelId(item.getProxyLevelId());
		result.setProxyLevel(item.getProxyLevel());
		result.setProxyLevelName(item.getProxyLevelName());
		result.setMaxLevels(item.getMaxLevels());
		result.setProxyPathUsername(item.getProxyPathUsername());
		result.setQq(item.getQq());
		result.setFlygram(item.getFlygram());
		result.setPayPassword(item.getPayPassword());
		result.setInvitationCode(item.getInvitationCode());
		result.setEntryAuthority(item.getEntryAuthority());
		result.setEnforceContractStatus(item.getEnforceContractStatus());
		result.setContractModel(item.getContractModel());
		result.setCommissionMode(item.getCommissionMode());
		result.setDebtStatus(item.getDebtStatus());
		result.setRebateContractId(item.getRebateContractId());
		result.setUnderProxyNum(item.getUnderProxyNum());
		result.setDirectlyUnderProxyNum(item.getDirectlyUnderProxyNum());
		result.setUnderMemberNum(item.getUnderMemberNum());
		result.setDirectlyUnderMemberNum(item.getDirectlyUnderMemberNum());
		result.setRegisterType(item.getRegisterType());
		result.setCommissionContractId(item.getCommissionContractId());
		result.setTransferOutNum(item.getTransferOutNum());
		result.setTransferInNum(item.getTransferInNum());
		result.setParentProxyLevelId(item.getParentProxyLevelId());
		result.setParentProxyLevel(item.getParentProxyLevel());
		result.setParentProxyLevelName(item.getParentProxyLevelName());
		result.setContractStatus(item.getContractStatus());
		result.setRebatePolicyTypeId(item.getRebatePolicyTypeId());
		result.setCommissionPolicyTypeId(item.getCommissionPolicyTypeId());
		result.setBindYourself(Boolean.TRUE);
		result.setNeedChgPwd(1);
		result.setCommissionContractList(item.commissionContractList);
		result.setRebateContractList(item.rebateContractList);
		result.setIpAttribution(item.getIpAttribution());
		result.setClubId(item.getClubId());
		result.setClubName(item.getClubName());
		result.setOpenLockStatus(item.getOpenLockStatus());
		result.setManageClubLockStatus(item.getManageClubLockStatus());
		result.setCommissionSettleCycle(item.getCommissionSettleCycle());
		return result;
	}
	
}