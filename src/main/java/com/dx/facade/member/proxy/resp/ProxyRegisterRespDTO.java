package com.dx.facade.member.proxy.resp;

import io.swagger.annotations.ApiModelProperty;
import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class ProxyRegisterRespDTO {

    // 代理注册详情
    /**
     * 注册时间
     */
    @ApiModelProperty(value = "注册时间")
    private String createDt ;

    /**
     * 最后登录时间
     */
    @ApiModelProperty(value = "最后登录时间")
    private String lastLoginTime;

    /**
     * 注册端类型
     */
    @ApiModelProperty(value = "注册端类型")
    private String deviceType;

    /**
     * 注册IP
     */
    @ApiModelProperty(value = "注册IP")
    private String registerIp;

    /**
     * 注册端设备编号
     */
    @ApiModelProperty(value = "注册端设备编号")
    private String deviceNo;

    /**
     * 账户类型 代理类型（1-正式，2-测试，3-合作）
     */
    @ApiModelProperty(value = "账户类型 代理类型（1-正式，2-测试，3-合作）")
    private Integer accountType;

    /**
     * 注册reference(网址)
     */
    @ApiModelProperty(value = "注册reference(网址)")
    private String registerReference;

}
