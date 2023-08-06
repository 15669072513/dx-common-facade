package com.dx.facade.venue.resp;

import com.dx.facade.venue.dto.ConfigVenueDTO;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.ToString;

@Data
@ToString(callSuper = true)
public class VenueListResp extends ConfigVenueDTO {

    //额外的属性
    @ApiModelProperty("含游戏（总）")
    private int gameAmountTotal;

    @ApiModelProperty("含游戏（开启中）")
    private int gameAmountEnabled;

    @ApiModelProperty("含游戏（维护中）")
    private int gameAmountInMaintenance;

    @ApiModelProperty("含游戏（已禁用）")
    private int gameAmountDisabled;

    @ApiModelProperty("钱包名称(不要用walletNames属性,用这个解析好的)")
    private WalletNames walletNamesJson;
}
