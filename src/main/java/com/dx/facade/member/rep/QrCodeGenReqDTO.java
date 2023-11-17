package com.dx.facade.member.rep;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

@Data
@ApiModel("生成二维码入参")
public class QrCodeGenReqDTO implements Serializable {

    @ApiModelProperty(value="二维码类型：1-用户码，2-用户牌桌码，3-牌桌码")
    private Integer type;

    @ApiModelProperty(value="代理ID")
    private Long proxyId;

    @ApiModelProperty(value="用户ID")
    private Long userId;

    @ApiModelProperty(value="牌桌ID")
    private String tableId;

}
