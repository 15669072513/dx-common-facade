package com.dx.facade.account.resp;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import com.dx.annotation.I18nField;
import com.dx.facade.account.enums.Payment;
import com.fasterxml.jackson.annotation.JsonFormat;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class PaymentChannelListRespDTO {
    @ApiModelProperty("ID")
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private Long id;

    @ApiModelProperty("商户id")
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private Long merchantId;

    @ApiModelProperty("支付厂商id")
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private Long paymentMerchantId;

    @ApiModelProperty("支付厂商名称")
    private String paymentMerchantName;

    @ApiModelProperty("通道名称")
    private String channelName;

    @ApiModelProperty("支付参数编码，由枚举类定义")
    private String payParamCode;

    @ApiModelProperty("支付参数描述，由枚举类定义")
    private String payParamDesc;

    @ApiModelProperty("支持币种")
    private String currency;

    @ApiModelProperty("支付类型")
    private Integer payType;

    @ApiModelProperty("支付类型名称")
    @I18nField(i18nEnumClass = Payment.DepositType.class, i18nEnumMethod = "desc")
    private String payTypeName;

    @ApiModelProperty("支付通道")
    private Integer paymentChannelType;

    @ApiModelProperty("支付通道名称")
    private String paymentChannelTypeName;

    @ApiModelProperty("银行信息,json保存银行id和银行简称")
    private String bankInfo;

    @ApiModelProperty("虚拟币协议，多个用逗号隔开")
    private String virtualProtocol;

    @ApiModelProperty("单笔金额上限")
    private BigDecimal maxAmount;

    @ApiModelProperty("单笔金额下限")
    private BigDecimal minAmount;

    @ApiModelProperty("固定金额")
    private String fastAmount;

    @ApiModelProperty("备注")
    private String remark;

    @ApiModelProperty("使用状态/开关，0=否/停用，1=是/启用")
    private Integer status;

    @ApiModelProperty("创建人")
    private String createdBy;

    @ApiModelProperty("创建时间")
    @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime createdAt;

    @ApiModelProperty("修改人")
    private String updatedBy;

    @ApiModelProperty("修改时间")
    @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime updatedAt;

    @ApiModelProperty("扩展字段1")
    private String ext1;

    @ApiModelProperty("扩展字段2")
    private String ext2;
}
