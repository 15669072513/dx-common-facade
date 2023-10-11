package com.dx.facade.member.param;

import com.dx.facade.constant.DXManagerConstant;
import com.fasterxml.jackson.annotation.JsonIgnore;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;

/**
 * @author seven
 * @date 2023年06月29日 15:19
 * @description： 代理后台修改密码
 */
@Setter
@Getter
@ApiModel(value = "代理后台会员密码修改", description = "代理后台会员密码修改")
public class MemberPasswordEditParam {
    @ApiModelProperty(value = "会员账号",required = true,example = "abc123")
    @NotBlank(message = "账号不能为空")
    @Pattern(regexp = DXManagerConstant.REG_4_11, message = "账号 4-11位，最少1个字母+数字组合，首位字母")
    private String resetUserName;
    @ApiModelProperty(value = "重置的新密码")
    @NotBlank(message = "重置的新密码不能为空")
    private String newPassword;

    @ApiModelProperty(value = "重置的新密码-确认")
    @NotBlank(message = "重置的新密码-确认不能为空")
    private String newPasswordConfirm;

    @ApiModelProperty(value = "登录密码")
    @NotBlank(message = "登录密码不能为空")
    private String loginPassword;
    @JsonIgnore
    Long merchantId ;
    @JsonIgnore
    String merchantCode;
    @JsonIgnore
    String merchantName;
    @JsonIgnore
    Long headerUserId;
}
