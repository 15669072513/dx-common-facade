package com.dx.facade.venue.resp;

import com.dx.facade.venue.dto.ConfigVenuePO;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;

@Data
@ToString(callSuper = true)
public class VenueConnectResp extends ConfigVenuePO {
    //额外的属性
    @ApiModelProperty("使用过这个场馆的商户的数量")
    private Integer usedMerchantCount;

    @ApiModelProperty("使用过这个场馆的商户的列表")
    private List<String> usedMerchantList = new ArrayList<>();

    @ApiModelProperty("币种,如CNY,THB(见BwCurrencyEnum)")
    private List<String> currencyTypesList = new ArrayList<>();

    @ApiModelProperty("支持语言,如zh_CN,en_US,th_TH(见BwCurrencyEnum)")
    private List<String> languageTypesList = new ArrayList<>();
}
