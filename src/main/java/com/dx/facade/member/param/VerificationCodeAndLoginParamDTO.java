package com.dx.facade.member.param;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Length;
import org.springframework.util.Assert;

import com.dx.facade.member.exception.ErrorCode;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

/**
 * @author grayson
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class VerificationCodeAndLoginParamDTO implements BaseParmDTO{
    @ApiModelProperty(value = "商户id", hidden = true)
    private Long merchantId;

    @ApiModelProperty(value = "会员账号 (20)", required = true)
    private String userName;

    @ApiModelProperty(value = "发送方式 1-手机;2-邮箱", required = true)
    @NotNull(message = "发送方式不能为空")
    private Integer sendType;

    @ApiModelProperty(value = "验证码", required = true)
    private String verifica;

    @ApiModelProperty(value = "客户端类型")
    private Integer clientType;

    @ApiModelProperty(value = "注册ip")
    private String ip;

    @ApiModelProperty(value = "终端设备号（6-40）")
    //@Length(min=6,max = 40,message = "终端设备号长度范围6-40")
    private String deviceNo;

    @ApiModelProperty(value = "登录reference (128)")
    @Length(max = 128,message = "登录reference最大长度128")
    private String loginUrl;

    @ApiModelProperty(value = "app类型")
    private String appType;

    @ApiModelProperty(value = "app版本")
    private String appVersion;

    @ApiModelProperty(value = "设备版本")
    private String deviceVersion;

    @Override
    public void check() {
        Assert.notNull(merchantId, ErrorCode.MISSING_PARAM_EXCEPTION.messageAfter("merchantId"));
        Assert.notNull(userName, ErrorCode.MISSING_PARAM_EXCEPTION.messageAfter("userName"));
        Assert.notNull(sendType, ErrorCode.MISSING_PARAM_EXCEPTION.messageAfter("sendType"));
        Assert.notNull(verifica, ErrorCode.MISSING_PARAM_EXCEPTION.messageAfter("verifica"));
        Assert.notNull(clientType, ErrorCode.MISSING_PARAM_EXCEPTION.messageAfter("clientType"));
        Assert.notNull(ip, ErrorCode.MISSING_PARAM_EXCEPTION.messageAfter("ip"));
        Assert.notNull(deviceNo, ErrorCode.MISSING_PARAM_EXCEPTION.messageAfter("deviceNo"));
        Assert.notNull(loginUrl, ErrorCode.MISSING_PARAM_EXCEPTION.messageAfter("loginReference"));
    }
}
