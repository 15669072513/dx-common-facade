package com.dx.facade.account.req;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.hibernate.validator.constraints.Range;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.util.List;

@Slf4j
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class MerchantPaymentChannelUpdateReqDTO {

    @ApiModelProperty("ID")
    private Long id;

    @ApiModelProperty("商户ID")
    private Long merchantId;

    @ApiModelProperty("支付商类型，1：充值商户，2：提款商户")
    private Integer paymentMerchantType;

    @ApiModelProperty("支付厂商Id")
    @NotNull(message = "支付厂商 必选")
    private Long paymentMerchantId;

    @ApiModelProperty("通道名称")
    private String channelName;
    
    @ApiModelProperty("支付参数code.")
    private String paymentMerchantParam;

    @ApiModelProperty("支付参数desc.")
    private String paymentMerchantDesc;

    @ApiModelProperty("支持币种")
    @NotBlank(message = "currency 必填")
    private String currency;

    @ApiModelProperty("支付类型")
    @NotNull(message = "payType必填")
    private Integer payType;


    @ApiModelProperty("支付类型名称")
    private String payTypeName;

    @ApiModelProperty("使用状态/开关，0=否/停用，1=是/启用")
    private Integer status;

    @ApiModelProperty("支付类型:银行时,支持得银行信息")
    private List<AddPaymentMerchantBankParam> bankParamList;

    @ApiModelProperty("虚拟货币时,协议名称")
    private String virtualProtocol;

    @ApiModelProperty("支付通道类型")
    private Integer paymentChannelType;

    @ApiModelProperty("支付通道类型名称")
    private String paymentChannelTypeName;

    @ApiModelProperty("单笔金额上限")
    private BigDecimal maxAmount;

    @ApiModelProperty("单笔金额下限")
    private BigDecimal minAmount;

    @ApiModelProperty("固定金额")
    private String fastAmount;

    @ApiModelProperty("备注")
    private String remark;

    @ApiModelProperty("扩展字段1")
    private String ext1;

    @ApiModelProperty("扩展字段2")
    private String ext2;

    @ApiModelProperty("修改人")
    private String updatedBy;
}
