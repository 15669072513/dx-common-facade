package com.dx.facade.member.resp;

import com.dx.util.RandomUtil;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

@Data
public class QrCodeGenRespDTO implements Serializable {

    @ApiModelProperty(value = "二维码内容：https://integrative-web-fat.ak12.cc/#/home?i_code=9340752&sc=R99Ua2Px")
    private String qrCodeUrl;

}
