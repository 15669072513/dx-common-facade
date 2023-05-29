package com.dx.facade.account.req;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.time.LocalDateTime;

/**
 * @author Yinter
 */
@Data
public class PaymentMerchantUpdateParamDTO {

    @ApiModelProperty("ID")
    private Long id;

    @ApiModelProperty("支付厂商")
    private String paymentMerchantName;

    @ApiModelProperty("厂商类型，1：入款，2：出款")
    private Integer paymentMerchantType;

    @ApiModelProperty("厂商编码")
    private String paymentMerchantCode;

    @ApiModelProperty("厂商名称code，按枚举定义的code保存")
    private Integer paymentMerchantNameCode;

    @ApiModelProperty("厂商名称描述，按枚举定义的desc保存")
    private String paymentMerchantNameDesc;

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

    @ApiModelProperty("修改人")
    private String updatedBy;

    @ApiModelProperty("修改时间")
    private LocalDateTime updatedAt;
}
