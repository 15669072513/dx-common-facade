package com.dx.facade.member.proxy.resp;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.math.BigDecimal;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ApiModel(value="com-ob-facade-member-proxy-resp-ProxyBaseInfoRespDTO",description = "代理基础信息对象")
public class ProxyBaseInfoRespDTO implements Serializable {

    @ApiModelProperty(value="代理ID")
    private Long proxyId;

    @ApiModelProperty(value="代理用户名")
    private String proxyName;

    @ApiModelProperty(value="上级代理ID")
    private Long parentProxyId;

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

}