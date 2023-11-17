package com.dx.facade.member.rep;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

@Data
@ApiModel("解析二维码入参")
public class QrCodeParseReqDTO implements Serializable {

    @ApiModelProperty(value="短码")
    private String sc;

}
