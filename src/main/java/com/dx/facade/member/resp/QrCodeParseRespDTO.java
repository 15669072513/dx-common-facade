package com.dx.facade.member.resp;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

@Data
public class QrCodeParseRespDTO implements Serializable {

    @ApiModelProperty(value="二维码类型：1-用户码，2-用户牌桌码，3-牌桌码")
    private Integer type;

    @ApiModelProperty(value = "token")
    private String token;

    @ApiModelProperty(value = "牌桌ID")
    private String tableId;

    @ApiModelProperty(value = "代理合营码")
    private String joinCode;
}
