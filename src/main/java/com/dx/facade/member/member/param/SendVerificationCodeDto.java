package com.dx.facade.member.member.param;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.springframework.util.Assert;
import org.springframework.util.StringUtils;

import com.dx.facade.account.req.BaseParmDTO;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Data
@ApiModel(value = "com-ob-client-dto-params-game-SendVerificationCodeDto", description = "密码找回-发送验证码参数对象")
public class SendVerificationCodeDto implements BaseParmDTO {

//    @ApiModelProperty(value = "商户id", hidden = true)
//    private Long merchantId;
//
//    @ApiModelProperty(value = "用户账号")
//    private String username;
//
    @ApiModelProperty(value = "发送验证码类型 1-手机;2-邮箱", required = true)
    @NotNull(message = "寻找方式不能为空")
    private Integer findType;

    @ApiModelProperty(value = "用户账号")
    private String username;

    @ApiModelProperty(value = "电话号码",example = "+86-13144445555")
    private String telephoneNum;

    @ApiModelProperty("邮箱地址")
    @Email(message="邮箱填写有误")
    @Size(min = 2, max = 32, message = "请输入长度2-32个字符之间的邮箱账号")
    private String emailAddr;

    @Override
    public void check() {
        Assert.isTrue(StringUtils.hasText(telephoneNum) || StringUtils.hasText(emailAddr), "电话号码或邮箱不能为空");
        Assert.isTrue( findType.equals(1) && !StringUtils.hasText(telephoneNum) , "电话号码不能为空");
        Assert.isTrue( findType.equals(2) && !StringUtils.hasText(emailAddr) , "邮箱不能为空");
    }


}
