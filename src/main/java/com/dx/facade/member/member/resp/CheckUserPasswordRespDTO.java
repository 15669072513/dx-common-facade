package com.dx.facade.member.member.resp;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class CheckUserPasswordRespDTO {

    /**
     * 会员账号
     */
    @ApiModelProperty(value = "会员账号")
    private String userName;

    /**
     * 邮箱地址
     */
    @ApiModelProperty("邮箱地址")
    private String emailAddr;

    /**
     * 电话号码
     */
    @ApiModelProperty(value = "电话号码")
    private String telephoneNum;


}
