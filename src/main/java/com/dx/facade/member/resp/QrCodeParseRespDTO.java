package com.dx.facade.member.resp;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.*;

import java.io.Serializable;

@Data
@ApiModel("会员扫码成功")
public class QrCodeParseRespDTO implements Serializable {

    @ApiModelProperty(value="二维码类型：1-用户码，2-用户牌桌码，3-牌桌码")
    private Integer type;

    @ApiModelProperty(value = "牌桌ID")
    private String tableId;

    @ApiModelProperty(value = "代理合营码")
    private String joinCode;

    @ApiModelProperty(value = "会员信息")
    private MemberInfoRespDTO memberInfo;

    @ApiModelProperty(value = "token")
    private String token;

    @ApiModelProperty(value="password")
    private String password;

    @ApiModelProperty(value="游戏类型id")
    private String gameTypeId;

    @ApiModelProperty(value="俱乐部ID")
    private String clubId;

    @ApiModelProperty(value="牌桌密码")
    private String tablePwd;

    @ApiModelProperty(value="用户ID")
    private Long userId;

    @ApiModelProperty(value="代理ID")
    private Long proxyId;

    @ApiModelProperty(value="用户名称")
    private String userName;

    @ApiModelProperty(value="代理名称")
    private String proxyName;
}
