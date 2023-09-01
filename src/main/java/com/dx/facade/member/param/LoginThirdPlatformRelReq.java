package com.dx.facade.member.param;

import io.swagger.annotations.ApiModelProperty;
import lombok.*;
import lombok.extern.slf4j.Slf4j;
import org.springframework.util.Assert;

import com.dx.facade.account.service.BaseParmDTO;
import com.dx.facade.member.enums.ThirdPlatform;
import com.dx.facade.member.exception.ErrorCode;

import javax.validation.constraints.NotNull;

@Slf4j
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class LoginThirdPlatformRelReq implements BaseParmDTO {

    @ApiModelProperty(value = "商户id (20)")
    private Long merchantId;

    @ApiModelProperty("三方平台")
    private ThirdPlatform thirdPlatform;

    @ApiModelProperty("三方平台唯一标识")
    private String thirdPlatformId;

    @ApiModelProperty(value = "客户端类型")
    @NotNull(message = "客户端类型不能为空")
    private Integer clientType;

    @ApiModelProperty(value = "登录ip")
    @ToString.Exclude
    private String ip;

    @ApiModelProperty(value = "终端设备号（6-100）")
    private String deviceNo;

    @ApiModelProperty(value = "登录网址 (128)")
    private String loginUrl;

    @ApiModelProperty(value = "设备版本")
    private String deviceVersion;

    @Override
    public void check() {
        Assert.notNull(merchantId, ErrorCode.MISSING_PARAM_EXCEPTION.messageAfter("merchantId"));
        Assert.notNull(thirdPlatform, ErrorCode.MISSING_PARAM_EXCEPTION.messageAfter("thirdPlatform"));
        Assert.hasText(thirdPlatformId, ErrorCode.MISSING_PARAM_EXCEPTION.messageAfter("thirdPlatformId"));
        Assert.notNull(clientType, ErrorCode.MISSING_PARAM_EXCEPTION.messageAfter("clientType"));
        Assert.hasText(ip, ErrorCode.MISSING_PARAM_EXCEPTION.messageAfter("ip"));
        Assert.hasText(deviceNo, ErrorCode.MISSING_PARAM_EXCEPTION.messageAfter("deviceNo"));
        Assert.hasText(deviceVersion, ErrorCode.MISSING_PARAM_EXCEPTION.messageAfter("deviceVersion"));
    }
}
