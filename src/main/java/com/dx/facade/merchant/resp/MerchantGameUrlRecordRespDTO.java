package com.dx.facade.merchant.resp;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class MerchantGameUrlRecordRespDTO {
    @ApiModelProperty(value = "商户ID")
    private Long merchantId;

    @ApiModelProperty(value = "商户code 长度2~10个字符")
    private String merchantCode;

    @ApiModelProperty(value = "pc下载地址")
    private String pcUrl;

    @ApiModelProperty(value = "h5下载地址")
    private String h5Url;

    @ApiModelProperty(value = "全站下载地址")
    private String downUrl;
    @ApiModelProperty("安卓下载地址")
    private String androidUrl;
    @ApiModelProperty("ios下载地址")
    private String iosUrl;
}
