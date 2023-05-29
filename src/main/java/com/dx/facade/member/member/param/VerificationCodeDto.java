package com.dx.facade.member.member.param;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.hibernate.validator.constraints.Length;
import org.springframework.util.Assert;
import org.springframework.util.StringUtils;

import com.dx.facade.account.req.BaseParmDTO;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 * @Description:
 * @Author: gray
 * @Date 2021/5/24
 */
@Data
@ApiModel(value = "VerificationCodeDto", description = "密码找回-校验验证码")
public class VerificationCodeDto implements BaseParmDTO {

    @ApiModelProperty(value = "商户id", hidden = true)
    private Long merchantId;
    
    @ApiModelProperty(value = "用户账号", required = true)
    @NotBlank(message = "用户账号不能为空")
    private String userName;
    
    @ApiModelProperty(value = "验证码", required = true)
    @NotNull(message = "验证码不能为空")
    @Length(min = 6, max = 6, message = "请输入长度为6的验证码")
    private String verifica;

    @ApiModelProperty(value = "发送方式 1-手机;2-邮箱", required = true)
    @NotNull(message = "发送方式不能为空")
    private Integer sendType;

    @ApiModelProperty(value = "电话号码")
    private String telephoneNum;

    @ApiModelProperty("邮箱地址")
    @Email(message="邮箱填写有误")
    @Size(min = 2, max = 32, message = "请输入长度2-32个字符之间的邮箱账号")
    private String emailAddr;

    @Override
    public void check() {
        Assert.isTrue(!StringUtils.hasText(telephoneNum) && !StringUtils.hasText(emailAddr), "电话号码或邮箱不能为空");
        Assert.isTrue( sendType.equals(1) && !StringUtils.hasText(telephoneNum) , "电话号码不能为空");
        Assert.isTrue( sendType.equals(2) && !StringUtils.hasText(emailAddr) , "邮箱不能为空");

    }
    
}