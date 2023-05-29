package com.dx.facade.member.member.param;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.hibernate.validator.constraints.Length;
import org.springframework.util.Assert;
import org.springframework.util.StringUtils;

import com.dx.facade.account.req.BaseParmDTO;

import javax.validation.constraints.NotBlank;

@Data
@ApiModel(value = "com-ob-client-dto-params-game-ResetPassWordDto", description = "密码找回-重置密码")
public class ResetPassWordReqDto implements BaseParmDTO {

//    @ApiModelProperty(value = "商户id (20)", hidden = true)
//    private Long merchantId;
//
    @ApiModelProperty(value = "用户账号", required = true)
    @NotBlank(message = "用户账号不能为空")
    private String username;
    
    @ApiModelProperty(value = "密码 (32)", required = true)
    @NotBlank(message = "密码不能为空")
    @Length(min = 32, max = 32, message = "密码长度错误")
    private String passWord;
    
    @ApiModelProperty(value = "确认密码 (32)", required = true)
    @NotBlank(message = "确认密码不能为空")
    @Length(min = 32, max = 32, message = "密码长度错误")
    private String confirmPassWord;

    @Override
    public void check() {
        Assert.isTrue(!passWord.equals(confirmPassWord), "密码和确认密码不一致");

    }
    
}