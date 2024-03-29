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

    @ApiModelProperty(value ="失效类型")
    private Boolean expireFlag;

    @ApiModelProperty(value ="过期时长")
    private Integer duration;

    @ApiModelProperty(value ="过期时间")
    private Long expireTime;

    @ApiModelProperty(value="用户ID")
    private Long userId;

    @ApiModelProperty(value="代理ID")
    private Long proxyId;

    @ApiModelProperty(value="用户名称")
    private String userName;

    @ApiModelProperty(value="代理名称")
    private String proxyName;
}
