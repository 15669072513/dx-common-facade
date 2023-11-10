package com.dx.facade.game.req;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class UserTableReq {

    @ApiModelProperty("会员id")
    private Long userId;

    @ApiModelProperty("商户Id")
    private Long merchantId;

    @ApiModelProperty("会员账号")
    private String userName;
}
