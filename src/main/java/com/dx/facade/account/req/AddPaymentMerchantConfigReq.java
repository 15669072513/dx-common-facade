package com.dx.facade.account.req;

import com.baomidou.mybatisplus.annotation.TableField;
import com.dx.facade.account.service.BaseParmDTO;
import com.dx.facade.member.exception.ErrorCode;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.util.Assert;

import java.math.BigDecimal;
import java.util.Objects;

@Slf4j
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AddPaymentMerchantConfigReq implements BaseParmDTO {

    @ApiModelProperty("ID")
    private Long id;

    @ApiModelProperty("支付商类型，1：充值商户，2：提款商户")
    private Integer paymentMerchantType;

    @ApiModelProperty("支付商户编码")
    private String paymentMerchantCode;

    @ApiModelProperty("支付商户名称")
    private String paymentMerchantName;

    @ApiModelProperty("通道名称")
    private String channelName;

    @ApiModelProperty("支付类型")
    private Integer payType;

    @ApiModelProperty("支付类型名称：微信, 支付宝")
    private String payName;

    @ApiModelProperty("支付通道类型")
    private Integer paymentChannelType;

    @ApiModelProperty("支付通道名称")
    private String paymentChannelName;

    @ApiModelProperty("三方支付渠道")
    private String thirdPaymentType;

    @ApiModelProperty("支持币种")
    private String currency;

    @ApiModelProperty("单笔金额上限")
    private BigDecimal maxAmount;

    @ApiModelProperty("单笔金额下限")
    private BigDecimal minAmount;

    @ApiModelProperty("固定金额")
    private String fastAmount;

    @ApiModelProperty("公钥")
    private String publicKey;

    @ApiModelProperty("私钥")
    private String privateKey;

    @ApiModelProperty("请求url")
    private String requestUrl;

    @ApiModelProperty("向第三方查询支付状态的url")
    private String resultUrl;

    @ApiModelProperty("回调url")
    private String notifyUrl;

    @ApiModelProperty("备注")
    private String remark;

    @ApiModelProperty("使用状态/开关，0=否/停用，1=是/启用")
    private Integer status;

    @ApiModelProperty("创建人")
    private String createdBy;

    @ApiModelProperty("修改人")
    private String updatedBy;

    @ApiModelProperty("扩展字段1")
    private String ext1;

    @ApiModelProperty("扩展字段2")
    private String ext2;

    @Override
    public void check() {
        Assert.notNull(id, ErrorCode.MISSING_PARAM_EXCEPTION.messageAfter("id"));
        Assert.notNull(paymentMerchantType, ErrorCode.MISSING_PARAM_EXCEPTION.messageAfter("paymentMerchantType"));
        Assert.hasText(paymentMerchantCode, ErrorCode.MISSING_PARAM_EXCEPTION.messageAfter("paymentMerchantCode"));
        Assert.hasText(paymentMerchantName, ErrorCode.MISSING_PARAM_EXCEPTION.messageAfter("paymentMerchantName"));
        Assert.hasText(channelName, ErrorCode.MISSING_PARAM_EXCEPTION.messageAfter("channelName"));
        Assert.notNull(payType, ErrorCode.MISSING_PARAM_EXCEPTION.messageAfter("payType"));
        Assert.hasText(payName, ErrorCode.MISSING_PARAM_EXCEPTION.messageAfter("payName"));
        Assert.hasText(currency, ErrorCode.MISSING_PARAM_EXCEPTION.messageAfter("currency"));
        Assert.isTrue(Objects.nonNull(maxAmount) && maxAmount.compareTo(BigDecimal.ZERO) > 0, ErrorCode.MISSING_PARAM_EXCEPTION.messageAfter("maxAmount"));
        Assert.isTrue(Objects.nonNull(minAmount) && minAmount.compareTo(BigDecimal.ZERO) > 0, ErrorCode.MISSING_PARAM_EXCEPTION.messageAfter("minAmount"));
        Assert.isTrue(maxAmount.compareTo(minAmount) > 0, "maxAmount 要大于 minAmount");
        Assert.hasText(privateKey, ErrorCode.MISSING_PARAM_EXCEPTION.messageAfter("privateKey"));
        Assert.hasText(requestUrl, ErrorCode.MISSING_PARAM_EXCEPTION.messageAfter("requestUrl"));
        Assert.hasText(remark, ErrorCode.MISSING_PARAM_EXCEPTION.messageAfter("remark"));
        Assert.notNull(status, ErrorCode.MISSING_PARAM_EXCEPTION.messageAfter("status"));
        Assert.hasText(createdBy, ErrorCode.MISSING_PARAM_EXCEPTION.messageAfter("createdBy"));
        Assert.hasText(updatedBy, ErrorCode.MISSING_PARAM_EXCEPTION.messageAfter("updatedBy"));
    }
}
