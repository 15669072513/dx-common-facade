package com.dx.facade.member.resp;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ProxyInfoRespDTO {

    @ApiModelProperty("ID")
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private Long id;

    @ApiModelProperty("商户ID")
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private Long merchantId;

    @ApiModelProperty("商户名称")
    private String merchantName;

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
    
    @ApiModelProperty("币种符号")
    private String currencySymbol;

    @ApiModelProperty("代理头像")
    private String topImagesUrl;

    @ApiModelProperty("账号类型（1-试玩，2-商务，3-正式，4-测试，5-置换）")
    private Integer accountType;

    @ApiModelProperty("账号")
    private String userName;

    @ApiModelProperty("盐")
    private String salt;

    @ApiModelProperty("密码")
    private String password;

    @ApiModelProperty("真实姓名")
    private String realName;

    @ApiModelProperty("性别 0-男, 1-女")
    private Integer gender;

    @ApiModelProperty("出生日期")
    private LocalDate birthday;

    @ApiModelProperty("手机号码")
    private String mobile;

    @ApiModelProperty("邮箱")
    private String email;

    @ApiModelProperty("QQ")
    private String qq;

    @ApiModelProperty("flygram")
    private String flygram;

    @ApiModelProperty("支付密码")
    private String payPassword;

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

    @ApiModelProperty("标签id")
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private Long labelId;

    @ApiModelProperty("标签名称")
    private String labelName;

    @ApiModelProperty("风控层级id")
    private Long windControlId;

    @ApiModelProperty("风控层级名称")
    private String windControlName;

    @ApiModelProperty("登陆锁定状态 0-未锁定 1-登陆锁定")
    private Integer loginLockStatus;

    @ApiModelProperty("充提锁定状态 0-未锁定 1-充提锁定")
    private Integer paymentLockStatus;

    @ApiModelProperty("累计返佣")
    private BigDecimal accumulatedCommission;

    @ApiModelProperty("累计返点")
    private BigDecimal accumulatedRebate;

    @ApiModelProperty("佣金钱包余额")
    private BigDecimal commissionBalance;

    @ApiModelProperty("额度钱包余额")
    private BigDecimal quotaBalance;

    @ApiModelProperty("注册终端类型（1-PC，2-IOS_APP，3-IOS_H5，4-Android_H5，5-Android_APP 6-后台）")
    private Integer registerDeviceType;

    @ApiModelProperty("注册IP")
    private String registerIp;

    @ApiModelProperty("注册设备号")
    private String registerDeviceNo;

    @ApiModelProperty("最后登陆时间")
    private LocalDateTime lastLoginDatetime;

    @ApiModelProperty("最后登录IP")
    private String lastLoginIp;

    @ApiModelProperty("最后登录设备号")
    private String lastLoginDeviceNo;

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

    @ApiModelProperty("欠款标志 0-无欠款 1-有欠款")
    private Integer debtStatus;

    @ApiModelProperty("返点契约ID")
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private Long rebateContractId;

    @ApiModelProperty("下级代理人数")
    private Integer underProxyNum;

    @ApiModelProperty("直属下级代理人数")
    private Integer directlyUnderProxyNum;

    @ApiModelProperty("下级会员人数")
    private Integer underMemberNum;

    @ApiModelProperty("直属下级会员人数")
    private Integer directlyUnderMemberNum;

    @ApiModelProperty("佣金契约ID")
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private Long commissionContractId;

    @ApiModelProperty("转出会员人数")
    private Integer transferOutNum;

    @ApiModelProperty("转入会员人数")
    private Integer transferInNum;

    @ApiModelProperty("契约状态（0-未签约 1-已签约）")
    private Integer contractStatus;

    @ApiModelProperty("佣金政策类型ID")
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private Long commissionPolicyTypeId;

    @ApiModelProperty("返点政策类型ID")
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private Long rebatePolicyTypeId;

    @ApiModelProperty("累计首存人数")
    private Integer totalFirstDepositNum;

    @ApiModelProperty("累计首存金额")
    private BigDecimal totalFirstDepositAmount;

    @ApiModelProperty("备注")
    private String remark;

    @ApiModelProperty("注册时间")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private LocalDateTime createdAt;

    @ApiModelProperty("更新时间")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private LocalDateTime updatedAt;

    @ApiModelProperty(value="已有契约 0-无契约 1-佣金契约 2-返点契约 3-佣金+返点契约")
    private Integer newContractModel;
    
    @ApiModelProperty("开局权限（0-关闭 1-开启）")
    private Integer openLockStatus;
    
    @ApiModelProperty("俱乐部管理权限（0-关闭 1-开启）")
    private Integer manageClubLockStatus;
    
    @ApiModelProperty("是否存在待签约的返点契约标志 0-不存在 1-存在")
    private Integer rebateSignStatus;
    
    @ApiModelProperty("是否存在待签约的佣金契约标志 0-不存在 1-存在")
    private Integer commissionSignStatus;
    
    @ApiModelProperty(value = "信用钱包余额")
    private BigDecimal creditWalletBalance;

    @ApiModelProperty(value = "信用额度")
    private BigDecimal creditQuota;

    @ApiModelProperty(value = "中心钱包余额")
    private BigDecimal centerWalletBalance;
    
    @ApiModelProperty(value = "应收账款")
    private BigDecimal accountsReceivable;
    
}
