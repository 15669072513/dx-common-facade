package com.dx.facade.member.resp;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModelProperty;
import lombok.*;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class MemberInfoRespDTO{

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

    @ApiModelProperty("会员币种")
    private String currency;
    
    @ApiModelProperty("会员币种符号")
    private String currencySymbol;

    @ApiModelProperty("账号类型, 使用AccountTypeEnum枚举")
    private Integer accountType;

    @ApiModelProperty("会员账号")
    private String userName;


    @ApiModelProperty("会员真实姓名")
    private String realName;

    @ApiModelProperty("性别 0-女，1-男")
    private Integer gender;

    @ApiModelProperty("出生日期")
    private LocalDate birthday;

    @ApiModelProperty("会员手机号码")
    private String mobile;

    @ApiModelProperty("邮箱")
    private String email;

    @ApiModelProperty("上级代理id")
    private Long parentProxyId;

    @ApiModelProperty("上级代理名称")
    private String parentProxyName;

    @ApiModelProperty("上级代理层级")
    private Integer parentProxyLevel;

    @ApiModelProperty("上级代理层级名称")
    private String parentProxyLevelName;

    @ApiModelProperty("上级代理层级路径")
    private String parentProxyPath;

    @ApiModelProperty("总代id")
    private Long topProxyId;

    @ApiModelProperty("总代名称")
    private String topProxyName;

    @ApiModelProperty("标签id")
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

    @ApiModelProperty("游戏锁定状态 0-未锁定 1-游戏锁定")
    private Integer gameLockStatus;
    
    @ApiModelProperty("入局锁定状态 0-未锁定 1-入局锁定")
    private Integer joinGameLockStatus;

    @ApiModelProperty("vip等级id")
    private Long vipId;

    @ApiModelProperty("vip等级")
    private Integer vipLevel;

    @ApiModelProperty("vip经验值")
    private Long vipExperience;

    @ApiModelProperty("首存金额")
    private BigDecimal firstDeposit;

    @ApiModelProperty("首存时间")
    private LocalDateTime firstDepositDatetime;

    @ApiModelProperty("现金余额")
    private BigDecimal balance;

    @ApiModelProperty("注册终端类型（1-PC，2-IOS_APP，3-IOS_H5，4-Android_H5，5-Android_APP 6-后台）")
    private Integer registerDeviceType;

    @ApiModelProperty("注册IP")
    @ToString.Exclude
    private String registerIp;

    @ApiModelProperty("IP归属地")
    private String ipAttribution;

    @ApiModelProperty("注册设备号")
    private String registerDeviceNo;

    @ApiModelProperty("最后登陆时间")
    private LocalDateTime lastLoginDatetime;

    @ApiModelProperty("最后登录IP")
    @ToString.Exclude
    private String lastLoginIp;

    @ApiModelProperty("最后登录设备号")
    private String lastLoginDeviceNo;

    @ApiModelProperty("信用等级")
    private Integer creditLevel;

    @ApiModelProperty("转代次数")
    private Integer transforNum;

    @ApiModelProperty("邀请码")
    private String invitationCode;

    @ApiModelProperty("上次存款金额")
    private BigDecimal lastDeposit;

    @ApiModelProperty("上次存款时间")
    private LocalDateTime lastDepositTime;

    @ApiModelProperty("上次提款时间")
    private LocalDateTime lastWithdrawTime;

    @ApiModelProperty("累计存款金额")
    private BigDecimal totalDeposit;

    @ApiModelProperty("累计存款次数")
    private Integer totalDepositNum;

    @ApiModelProperty("累计提款金额")
    private BigDecimal totalWithdraw;

    @ApiModelProperty("累计普通提款次数")
    private Integer totalWithdrawNum;

    @ApiModelProperty("累计大额提款次数")
    private Integer totalBigWithdrawNum;

    @ApiModelProperty("首存活动每会员一次参加标识，0未参加，1已参加")
    private Integer activityOnlyFlag;

    @ApiModelProperty("头像")
    private String topImagesUrl;

    @ApiModelProperty("开启免转模式 0-手动，1-免转")
    private Integer noTransfer;

    @ApiModelProperty("是否需要修改密码：0不需要，1需要修改密码")
    private Integer needChgPwd;
    
    @ApiModelProperty("是否需要修改昵称：0不需要，1需要修改")
    private Integer needChgNickname;

    @ApiModelProperty("备注")
    private String remark;
    
    @ApiModelProperty("俱乐部Id")
    private Long clubId;

    @ApiModelProperty("俱乐部名称")
    private String clubName;
    
    @ApiModelProperty("昵称")
    private String nickName;
    
    @ApiModelProperty("是否首次登录：0非首次，1首次登录")
    private Integer firstLogin;

    @ApiModelProperty("注册时间")
    private LocalDateTime createdAt;

    @ApiModelProperty("更新时间")
    private LocalDateTime updatedAt;
    
    /** 代理入口权限开关 0：关闭 1：开启 */
    @ApiModelProperty("代理入口权限开关")
    private Integer proxyEntryAuthority;

    String merchantIdPath;

    @ApiModelProperty("可用额度")
    private BigDecimal creditAvailable;

    @ApiModelProperty("信用额度")
    private BigDecimal creditBalance;

    @ApiModelProperty(value = "信用钱包-应还账款")
    private BigDecimal creditShouldRepayment;
    
    @ApiModelProperty("代理登陆锁定状态 0-未锁定 1-登陆锁定")
    private Integer proxyLoginLockStatus;
    
    @ApiModelProperty("是否设置支付密码标识 true 已设置 false 未设置")
    private boolean payPasswordFlag;

    @ApiModelProperty(value = "取款限制类型：1-账单限制，2-流水限制")
    private Integer withdrawLimitType;

    @ApiModelProperty("仅限直属会员可见开关 0-隐藏 1-可见'")
    private Integer onlyDirectMemberSwitch = 0;

    @ApiModelProperty(value = "业务模式：0-现金+信用，1-现金模式，2-信用模式")
    private Integer businessModel;

    @ApiModelProperty(value = "业务模式：0-现金+信用，1-现金模式，2-信用模式")
    private Integer parentBusinessModel;

    @ApiModelProperty("虚拟币地址")
    private String virAddr;
}
