package com.dx.facade.member.resp;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

@Data
@ApiModel("生成二维码")
public class QrCodeGenRespDTO implements Serializable {

    @ApiModelProperty(value = "二维码内容：https://integrative-web-fat.ak12.cc/#/home?i_code=9340752&sc=R99Ua2Px")
    private String qrCodeUrl;

}
