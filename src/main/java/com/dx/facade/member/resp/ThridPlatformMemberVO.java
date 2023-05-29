package com.dx.facade.member.resp;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

@Data
public class ThridPlatformMemberVO implements Serializable {

    private static final long serialVersionUID = 431792500172339467L;

    @ApiModelProperty("true : 登录成功，false : 登录失败")
    private Boolean flag;

    @ApiModelProperty(value = "会员信息")
    private MemberVO memberVO;

    @ApiModelProperty("三方平台唯一标识")
    private String thridPlatformId;

}
