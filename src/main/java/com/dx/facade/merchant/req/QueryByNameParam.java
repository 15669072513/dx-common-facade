package com.dx.facade.merchant.req;

import com.dx.annotation.I18nField;
import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

/**
 * 根据用户名查询会员信息
 *
 * @author gray
 * @date 2021/4/3
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class QueryByNameParam {

    @ApiModelProperty(value = "会员账号")
    private String userName;

    @ApiModelProperty(value = "密码 (64)")
    private String password;

    @ApiModelProperty(value = "商户id")
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private Long merchantId;

    @ApiModelProperty(value = "会员ID或代理ID")
    private Long id;

    @ApiModelProperty(value = "登录ip")
    private String loginIp;

    @ApiModelProperty(value = "登录终端类型（1-PC，2-IOS_APP，3-IOS_H5，4-Android_H5，5-Android_APP）")
    private Integer deviceType;

    @ApiModelProperty(value = "终端设备号")
    private String deviceNo;

    @ApiModelProperty(value = "登录网址")
    private String loginUrl;

    @ApiModelProperty(value = "国家")
    private String country;

    @ApiModelProperty(value = "省份")
    private String province;

    @ApiModelProperty(value = "市")
    private String city;

    @ApiModelProperty(value = "设备版本")
    private String deviceVersion;

    @ApiModelProperty(value = "登录状态（0-失败 1-成功")
    private Integer loginStatus;

    @ApiModelProperty(value = "登录失败原因")
    @I18nField
    private String loginError;

    @ApiModelProperty(value = "账号类型（1-试玩，2-商务，3-正式，4-测试，5-置换)")
    private Integer accountType;

    /**
     * ip归属地
     */
    @ApiModelProperty(value = "ip归属地")
    private String ipAttribution;
    
    @ApiModelProperty(value = "数据类型 （0-会员 1-代理）")
    private Integer userType;

    /**
     * 登录时间
     */
    @ApiModelProperty(value = "登录时间")
    private LocalDateTime loginTime;

    @ApiModelProperty(value = "应用终端,1:OB旗舰 2:美播真人")
    private Integer appId;
    @ApiModelProperty(value = "登录站点, 1:OB旗舰,2:美播真人")
    private Integer loginAppId;

}
