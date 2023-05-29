package com.dx.facade.account.resp;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 * @author grayson
 */
@Data
public class ProxyTransferRecordRpcPageRespDTO implements Serializable {

    @ApiModelProperty(value = "业务类型，1代理代存，2代理转账")
    private Integer bizType;

    @ApiModelProperty(value = "子业务类型，详见Payment.ProxyAssistDepositType")
    private Integer type;

    @ApiModelProperty(value = "转出事件ID")
    private String outEventId;

    @ApiModelProperty(value = "转出用户商户id")
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private Long outMerchantId;

    @ApiModelProperty(value = "转出用户id")
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private Long outUserId;

    @ApiModelProperty(value = "转出用户账号")
    private String outUserName;

    @ApiModelProperty(value = "转出用户姓名")
    private String outRealName;

    @ApiModelProperty(value = "转出用户类型，1会员，2代理")
    private Integer outUserType;

    @ApiModelProperty(value = "转出账户类型，AccountType")
    private Integer outAccountType;

    @ApiModelProperty(value = "转出用户层级")
    private Integer outUserLevel;

    @ApiModelProperty(value = "转入用户商户id")
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private Long inMerchantId;

    @ApiModelProperty(value = "转入用户id")
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private Long inUserId;

    @ApiModelProperty(value = "转入用户账号")
    private String inUserName;

    @ApiModelProperty(value = "转入用户姓名")
    private String inRealName;

    @ApiModelProperty(value = "转入用户类型，1会员，2代理")
    private Integer inUserType;

    @ApiModelProperty(value = "转入账户类型，AccountType")
    private Integer inAccountType;

    @ApiModelProperty(value = "状态(0=待处理 1=成功 2=失败)")
    private Integer orderStatus;

    @ApiModelProperty(value = "子业务类型，代理代存（1,佣金代存 2,额度代存）代理转账（6,佣金转账 7,额度转账）")
    private Integer assistType;

    @ApiModelProperty(value = "金额")
    private BigDecimal amount;

    @ApiModelProperty(value = "事件时间")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime eventTime;

    @ApiModelProperty(value = "创建时间")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime createdAt;

    @ApiModelProperty(value = "备注")
    private String remark;

    @ApiModelProperty(value = "币种")
    private String currency;
}
