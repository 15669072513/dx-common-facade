package com.dx.facade.venue.req;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class ReSettleRecordReq {

    @ApiModelProperty("带场馆code拼接的注单id(如OBTY_8923472)")
    private String id;

}
