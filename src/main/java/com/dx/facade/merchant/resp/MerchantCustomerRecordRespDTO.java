package com.dx.facade.merchant.resp;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class MerchantCustomerRecordRespDTO {
    @ApiModelProperty(value = "商户ID")
    private Long merchantId;

    @ApiModelProperty(value = "商户code 长度2~10个字符")
    private String merchantCode;

    @ApiModelProperty(value = "会员客服地址")
    private String memberUrl;

    @ApiModelProperty(value = "代理客服地址")
    private String proxyUrl;
}
