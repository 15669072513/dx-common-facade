package com.dx.facade.member.resp;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

@Data
@ApiModel("会员登陆成功返回前端对象")
public class MemberVO implements Serializable {

    private static final long serialVersionUID = 431792500172339467L;

    @ApiModelProperty(value = "会员信息")
    private MemberInfoRespDTO memberInfo;

    @ApiModelProperty(value = "token")
    private String token;

}
