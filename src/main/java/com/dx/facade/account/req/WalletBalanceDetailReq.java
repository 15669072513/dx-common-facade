package com.dx.facade.account.req;

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

    @ApiModelProperty("用户id")
    private Long userId;

    @ApiModelProperty("会员代理用户名")
    private String userName;

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



}
