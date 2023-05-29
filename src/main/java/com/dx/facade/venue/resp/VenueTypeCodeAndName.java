package com.dx.facade.venue.resp;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class VenueTypeCodeAndName {
    @ApiModelProperty("场馆类型的code(如zr,ty,qkl)")
    private String venueTypeCode;

    @ApiModelProperty("场馆类型的名称(如真人,体育,区块链)")
    private String venueTypeName;
}
