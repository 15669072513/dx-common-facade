package com.dx.facade.member.resp;

import com.dx.util.RandomUtil;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

@Data
public class QrCodeGenRespDTO implements Serializable {

    @ApiModelProperty(value = "二维码内容：https://integrative-web-fat.ak12.cc/#/home?sc=7G1835C1")
    private String qrCodeUrl;

}
