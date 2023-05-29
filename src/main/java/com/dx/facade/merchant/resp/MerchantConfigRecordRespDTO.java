package com.dx.facade.merchant.resp;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class MerchantConfigRecordRespDTO {
    @ApiModelProperty(value = "商户ID")
    private Long merchantId;

    @ApiModelProperty(value = "商户code 长度2~10个字符")
    private String merchantCode;

    @ApiModelProperty(value = "初始总代账号")
    private String proxy;

    @ApiModelProperty(value = "合营码")
    private String code;
}
