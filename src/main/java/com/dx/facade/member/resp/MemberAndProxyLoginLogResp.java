package com.dx.facade.member.resp;

import com.dx.annotation.I18nField;
import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class MemberAndProxyLoginLogResp {

    @Id
    @ApiModelProperty("id")
    @JsonFormat(
            shape = JsonFormat.Shape.STRING
    )
    private Long id;

    @ApiModelProperty("商户ID")
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private Long merchantId;

    @ApiModelProperty("商户名称")
    private String merchantName;

    @ApiModelProperty("登录时间")
    private String loginTime;

    @ApiModelProperty("登录状态")
    private String loginStatus;
    
    @ApiModelProperty("会员ID")
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private Long userId;

    @ApiModelProperty("会员账号")
    private String userName;

    @ApiModelProperty("账号类型")
    private String accountType;

    @ApiModelProperty("登录ip")
    private String loginIp;

    @ApiModelProperty("登录风控层级")
    private String ipControlName;

    @ApiModelProperty("IP归属地")
    private String ipAttribution;

    @ApiModelProperty("登录终端")
    private String deviceType;

    @ApiModelProperty("终端设备号")
    private String deviceNo;

    @ApiModelProperty("终端设备号风控层级")
    private String deviceNoControlName;

    @ApiModelProperty("登录地址")
    private String loginReference;

    @ApiModelProperty("设备版本")
    private String browseContent;

    @ApiModelProperty("备注")
    @I18nField
    private String loginError;

    @ApiModelProperty(value = "应用终端,1:OB旗舰 2:美播真人")
    private Integer appId;

    @ApiModelProperty(value = "登录站点:1：OB旗舰 2：美播真人")
    private Integer loginAppId;
    @ApiModelProperty("GPS")
    private String gps;
    @ApiModelProperty("GPS地址")
    private String gpsUrl;
    @ApiModelProperty("操作系统版本")
    private String osVersion;
    @ApiModelProperty("登出时间")
    private String outTime;
    
    @ApiModelProperty(value = "同ip账号登录数量")
    private Integer loginIPCount;
    
    @ApiModelProperty(value = "同设备号账号登录数量")
    private Integer deviceNoCount;
    
    @ApiModelProperty("上级代理账号")
    private String parentProxyName;
    
    @ApiModelProperty("总代账号")
    private String topProxyName;
}
