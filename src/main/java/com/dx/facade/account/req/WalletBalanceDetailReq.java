package com.dx.facade.account.req;

import com.baomidou.mybatisplus.annotation.TableField;
import com.dx.facade.enums.ConstantEnums;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

@Data
public class WalletBalanceDetailReq implements Serializable {

    @ApiModelProperty("起始时间")
    private Long startTime;

    @ApiModelProperty("截至时间")
    private Long endTime;

    /**
     * @see com.dx.facade.account.enums.Subject
     */
    @ApiModelProperty("发生科目/调整类型")
    private String subject;

    /**
     * @see com.dx.facade.account.change.WalletType
     */
    @ApiModelProperty("钱包类型")
    private Integer walletType;

    /**
     * @see com.dx.facade.account.change.WalletType
     */
    @ApiModelProperty("钱包类型列表。WalletType")
    private List<Integer> walletTypeList;

    @ApiModelProperty("用户类型，1=会员，2=代理")
    private Integer userType;

    @ApiModelProperty("用户id")
    private Long userId;

    @ApiModelProperty("会员代理用户名")
    private String userName;

    @ApiModelProperty("上级代理id")
    private Long parentProxyId;

    @ApiModelProperty("俱乐部id")
    private Long clubId;

    @ApiModelProperty("账变ID")
    private String changeTypeCode;

    @ApiModelProperty("上下分订单号")
    private String upDownOrderNo;

    @ApiModelProperty("账变类型列表。会员枚举MemberChangeType，代理枚举ProxyChangeType")
    private Integer changeType;

    @ApiModelProperty("账变类型列表。会员枚举MemberChangeType，代理枚举ProxyChangeType")
    private List<Integer> changeTypeList;

    @ApiModelProperty("代理层级路径")
    private String proxyPath;

}
