package com.dx.facade.venue.resp;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class VenueWhitelistResp {

    @ApiModelProperty("场馆ID")
    private Long venueId;

    @ApiModelProperty("场馆code(如by,ty,imsb,cq9)(见BwVenueEnum)")
    private String venueCode;

    @ApiModelProperty("场馆名(如ag真人,ob体育)")
    private String venueName;

    @ApiModelProperty("场馆类型(如ty,zr,qkl)(见BwVenueTypeEnum)")
    private String venueType;

    @ApiModelProperty("场馆类型名称(如体育,真人,区块链)(见BwVenueTypeEnum)")
    private String venueTypeName;

    @ApiModelProperty("场馆IP,逗号隔开")
    private String ips;

    @ApiModelProperty("支持的接口URL,逗号隔开")
    private String url;

    @ApiModelProperty("修改人")
    private String createdBy;

}
