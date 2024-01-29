package com.dx.facade.member.proxy.resp;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

import com.baomidou.mybatisplus.annotation.TableField;
import com.fasterxml.jackson.annotation.JsonFormat;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ApiModel(value="com-ob-facade-member-proxy-resp-ProxyBaseInfoRespDTO",description = "代理基础信息对象")
public class ProxyBaseInfoRespDTO implements Serializable {

	private static final long serialVersionUID = -4255685900888636572L;

	@ApiModelProperty(value="代理ID")
    private Long proxyId;

    @ApiModelProperty(value="代理用户名")
    private String proxyName;

    @ApiModelProperty(value="上级代理ID")
    private Long parentProxyId;
    
    @ApiModelProperty(value="总代ID")
    private Long topProxyId;

    @ApiModelProperty(value="'代理层级ID'")
    private Long proxyLevelId;

    @ApiModelProperty(value="'代理线层级上限'")
    private Integer maxLevels;

    @ApiModelProperty(value="契约模式 0-无契约 1-佣金契约 2-返点契约 3-佣金+返点契约")
    private Integer contractModel;

    @ApiModelProperty(value="代理账号类型（1-试玩，2-商务，3-正式，4-测试，5-置换）")
    private Integer accountType;

    @ApiModelProperty(value="头像地址")
    private String headImgUrl;

    @ApiModelProperty(value="注册时间")
    private String createAt;

    @ApiModelProperty(value = "代理佣金余额")
    private BigDecimal commissionBalance;

    @ApiModelProperty(value = "代理额度余额")
    private BigDecimal quotaBalance;

    @ApiModelProperty(value = "未读消息条数")
    private Integer unReadMsgCount;

    @ApiModelProperty(value = "未领返点数")
    private Integer unReceiveRebateCount;

    @ApiModelProperty(value = "是否设置支付密码 0未设置 1已设置")
    private Integer payPasswordFlag;

    @ApiModelProperty(value = "qq")
    private String qq;

    @ApiModelProperty(value = "flyGram")
    private String flyGram;

    @ApiModelProperty(value = "是否签约类型（0-未签约，1-佣金签约，2-返点签约，3-返点+佣金签约")
    private Integer signContractType;

    @ApiModelProperty(value="返点政策类型ID")
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private Long rebatePolicyTypeId;

    @ApiModelProperty(value="佣金政策类型ID")
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private Long commissionPolicyTypeId;

    @ApiModelProperty(value = "佣金契约ID")
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private Long commissionContractId;

    @ApiModelProperty(value = "返点契约ID")
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private Long rebateContractId;

    @ApiModelProperty(value="已有契约 0-无契约 1-佣金契约 2-返点契约 3-佣金+返点契约")
    private Integer newContractModel;
    
    @ApiModelProperty("登录权限（0-关闭 1-开启）")
    private Integer loginLockStatus;
    
    @ApiModelProperty("开局权限（0-关闭 1-开启）")
    private Integer openLockStatus;
    
    @ApiModelProperty("俱乐部管理权限（0-关闭 1-开启）")
    private Integer manageClubLockStatus;

    @ApiModelProperty("币种")
    private String currency;
    
    @ApiModelProperty("币种符号")
    private String currencySymbol;
    
    @ApiModelProperty(value = "信用钱包余额")
    private BigDecimal creditWalletBalance;

    @ApiModelProperty(value = "信用额度")
    private BigDecimal creditQuota;

    @ApiModelProperty(value = "信用总额")
    private BigDecimal teamCreditTotal;

    @ApiModelProperty(value = "现金余额")
    private BigDecimal centerWalletBalance;
    
    @ApiModelProperty(value = "应收账款")
    private BigDecimal accountsReceivable;
    
    @ApiModelProperty(value = "当前借款")
    private BigDecimal accountsLoan;
    
    @ApiModelProperty("代理层级")
    private Integer proxyLevel;

    @ApiModelProperty("代理层级名称")
    private String proxyLevelName;
    
    @ApiModelProperty("最后登陆时间")
    private LocalDateTime lastLoginDatetime;
    
    @ApiModelProperty("最后登录IP")
    private String lastLoginIp;
    
    @ApiModelProperty("上级代理名称")
    private String parentProxyName;
    
    @ApiModelProperty("合营码")
    private String joinCode;

    @ApiModelProperty("取款限制类型：1-账单限制，2-流水限制")
    private Integer withdrawLimitType;

    @ApiModelProperty("充提锁定状态 0-未锁定 1-充提锁定")
    private Integer paymentLockStatus;

    @ApiModelProperty("冻结中余额")
    private BigDecimal lockBalance;
    
    @ApiModelProperty("佣金模式 1：返点模式 2：返佣模式")
    private Integer commissionMode;
    
    @ApiModelProperty("佣金结算周期 1：半月结 2：月结")
    private Integer commissionSettleCycle;


    @ApiModelProperty(value = "总代银行通道状态 - 1:开启，0:关闭")
    private Integer bankChannelStatus;

    @ApiModelProperty(value = "代理跨级操作权限 - 1:开启，0:关闭")
    private Integer crossOptLevel;

    @ApiModelProperty(value = "会员转代开关 - 1:开启，0:关闭")
    private Integer playerToProxy;


    @ApiModelProperty(value = "业务模式：0-现金+信用，1-现金模式，2-信用模式")
    private Integer businessModel;
}
