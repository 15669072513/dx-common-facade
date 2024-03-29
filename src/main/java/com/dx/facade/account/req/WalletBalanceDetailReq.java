package com.dx.facade.account.req;

import com.baomidou.mybatisplus.annotation.TableField;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ApiModel(value = "帐变记录查询入参", description = "帐变记录查询入参")
public class WalletBalanceDetailReq implements Serializable {

    @ApiModelProperty("所属商户，支持多个")
    private List<Long> merchantIds;

    @ApiModelProperty("起始时间")
    private Long startTime;

    @ApiModelProperty("截至时间")
    private Long endTime;

    /**
     * @see com.dx.facade.account.enums.Subject
     */
    @ApiModelProperty("发生科目/调整类型")
    private String subject;

    @ApiModelProperty("钱包类型, 详细见WalletType枚举类型")
    private Integer walletType;

    @ApiModelProperty("钱包类型, 详细见WalletType枚举类型")
    private List<Integer> walletTypeList;

    @ApiModelProperty("用户类型，0=会员，1=代理")
    private Integer userType;

    @ApiModelProperty("用户id")
    private Long userId;

    @ApiModelProperty("用户id")
    private List<Long> userIdList;

    @ApiModelProperty("会员代理用户名")
    private String userName;

    @ApiModelProperty("上级代理id")
    private Long parentProxyId;

    @ApiModelProperty("上级代理账号")
    private String parentProxyName;

    @ApiModelProperty("俱乐部id")
    private Long clubId;

    @ApiModelProperty(value = "订单号")
    private String eventId;

    @ApiModelProperty("账变ID")
    private String changeTypeCode;

    @ApiModelProperty("上下分订单号")
    private String upDownOrderNo;

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

    @ApiModelProperty("客户端账变类型集合")
    private List<Integer> appTypeList;

    @ApiModelProperty("代理层级路径")
    private String proxyPath;

    @ApiModelProperty("操作人")
    private String operatorUser;

    @ApiModelProperty("通用扩展字段A")
    private String extensionA;

    @ApiModelProperty("通用扩展字段B")
    private String extensionB;

    @ApiModelProperty("通用扩展字段C")
    private BigDecimal extensionC;

    @ApiModelProperty("是否计算汇总信息")
    private Boolean needSummary;

    @ApiModelProperty(value = "业务模式：0-现金+信用，1-现金模式，2-信用模式")
    private Integer businessModel;


}
