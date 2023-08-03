package com.dx.facade.account.param;

import com.baomidou.mybatisplus.annotation.TableField;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ApiModel(value = "会员/代理 帐变记录入参", description = "会员/代理 帐变记录入参")
public class WalletDetailParamDTO {

    @ApiModelProperty("所属商户，支持多个")
    private List<Long> merchantIds;

    @ApiModelProperty("用户类型（0=会员/1=代理）")
    private Integer userType;

    @ApiModelProperty("帐变时间开始")
    private LocalDateTime eventTimeStart;

    @ApiModelProperty("帐变时间结束")
    private LocalDateTime eventTimeEnd;

    @ApiModelProperty("关联订单号")
    private String eventId;

    @ApiModelProperty("会员账号")
    private String userName;

    @ApiModelProperty("会员/代理真实姓名")
    private String realName;

    @ApiModelProperty("会员/代理id")
    private Long userId;

    @ApiModelProperty("上级代理id")
    private Long parentProxyId;

    @ApiModelProperty("上级代理id数组")
    private List<Long> parentProxyIdList;

    @ApiModelProperty("登陆锁定状态 0-未锁定 1-登陆锁定")
    private Integer loginLockStatus;

    @ApiModelProperty("账号锁定状态 0-未锁定 1-充提锁定")
    private Integer accountLockStatus;

    @ApiModelProperty("游戏锁定状态 0-未锁定 1-游戏锁定")
    private Integer gameLockStatus;

    @ApiModelProperty("风控层级ID")
    private Long windControlId;

    @ApiModelProperty("vip最小等级")
    private Integer vipLevelMin;

    @ApiModelProperty("vip最大等级")
    private Integer vipLevelMax;

    @ApiModelProperty("业务类型。会员枚举MemberBizType ，代理枚举ProxyBizType")
    private Integer bizType;

    @ApiModelProperty("业务类型。会员枚举MemberBizType ，代理枚举ProxyBizType")
    private List<Integer> bizTypeList;

    @ApiModelProperty("账变类型。会员枚举MemberChangeType，代理枚举ProxyChangeType")
    private Integer changeType;

    @ApiModelProperty("账变类型列表。会员枚举MemberChangeType，代理枚举ProxyChangeType")
    private List<Integer> changeTypeList;

    @ApiModelProperty("收支类型，TransType")
    private Integer transType;

    @ApiModelProperty("app类型")
    private Integer appType;

    @ApiModelProperty("最小账变金额")
    private BigDecimal minAmount;

    @ApiModelProperty("最大账变金额")
    private BigDecimal maxAmount;

    @ApiModelProperty(
            value = "排序列名，eventTime",
            example = "eventTime"
    )
    private String orderKey;
    @ApiModelProperty(
            value = "排序方式(1)：desc-降序 asc-升序",
            example = "asc"
    )
    private String sortType;

    @ApiModelProperty("钱包类型 1:中心钱包, 9: 信用钱包")
    private Integer walletType;

    @ApiModelProperty("钱包类型 1:中心钱包, 9: 信用钱包")
    private List<Integer> walletTypeList;

    @ApiModelProperty("用户名列表")
    private List<String> userNameList;

    @ApiModelProperty("账变ID")
    private String changeTypeID;

    @ApiModelProperty("俱乐部ID")
    private long clubId;

    @ApiModelProperty("代理层级路径")
    private String proxyPath;

}
