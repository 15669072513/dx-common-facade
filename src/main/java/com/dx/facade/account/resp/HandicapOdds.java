package com.dx.facade.account.resp;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @author agan
 */
@Data
public class HandicapOdds {

    @ApiModelProperty(value = "赔率")
    private String minOdds;

    @ApiModelProperty(value = "盘口")
    private String handicap;
}
