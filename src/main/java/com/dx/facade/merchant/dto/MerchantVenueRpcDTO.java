package com.dx.facade.merchant.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.math.BigDecimal;

@Data
public class MerchantVenueRpcDTO {
    @ApiModelProperty(value = "商户ID")
    private Long merchantId;

    @ApiModelProperty(value = "商户code 长度2~10个字符")
    private String merchantCode;

    @ApiModelProperty(value = "商户名称 长度2~20个字符")
    private String merchantName;

    @ApiModelProperty(value = "场馆ID")
    private Long venueId;

    @ApiModelProperty(value = "场馆code(如by,ty,imsb,cq9)(见BwVenueEnum)")
    private String venueCode;

    @ApiModelProperty(value = "场馆名(如ag真人,ob体育)")
    private String venueName;

    @ApiModelProperty(value = "场馆的货币类型,比如CNY(见BwCurrencyEnum枚举)")
    private String venueCurrency;

    @ApiModelProperty(value = "场馆的语言,逗号隔开,比如zh_CN,en_US,th_TH(见BwLanguageEnum枚举)")
    private String venueLanguages;

    @ApiModelProperty(value = "场馆费率")
    private BigDecimal venueFeeRate;

    @ApiModelProperty(value = "场馆组维护的B端信息(如商户号,md5,aes,url等)")
    private String venueConfig;
}
