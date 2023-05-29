package com.dx.facade.member.resp;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

/**
 * @author grayson
 */
@Data
@ApiModel("代理登陆成功返回对象")
public class ProxyLoginRespDTO implements Serializable {

    private static final long serialVersionUID = 431792500172339467L;

    @ApiModelProperty(value = "token")
    private String token;

}
