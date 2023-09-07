package com.dx.facade.member.param;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ProxyQueryParamDTO {

    @ApiModelProperty("ID")
    private Long id;

    @ApiModelProperty("商户ID")
    private Long merchantId;

    @ApiModelProperty("商户名称")
    private String merchantName;

    @ApiModelProperty("商户层级路径")
    private String merchantPath;

    @ApiModelProperty("父级商户ID")
    private Long parentMerchantId;

    @ApiModelProperty("父级商户层级路径")
    private String parentMerchantPath;

    @ApiModelProperty("主商户ID")
    private Long topMerchantId;

    @ApiModelProperty("主商户名称")
    private String topMerchantName;

    @ApiModelProperty("账号类型（1-试玩，2-商务，3-正式，4-测试，5-置换）")
    private Integer accountType;

    @ApiModelProperty("账号")
    private String userName;

    @ApiModelProperty("代理层级")
    private Integer proxyLevel;

    @ApiModelProperty("代理层级名称")
    private String proxyLevelName;

    @ApiModelProperty("代理线层级上限")
    private Integer maxLevel;

    @ApiModelProperty("代理层级路径")
    private String proxyPath;

    @ApiModelProperty("代理用户名层级路径")
    private String proxyPathUsername;

    @ApiModelProperty("上级代理id")
    private Long parentProxyId;

    @ApiModelProperty("上级代理名称")
    private String parentProxyName;

    @ApiModelProperty("上级代理层级路径")
    private String parentProxyPath;

    @ApiModelProperty("上级代理层级")
    private Integer parentProxyLevel;

    @ApiModelProperty("上级代理层级名称")
    private String parentProxyLevelName;

    @ApiModelProperty("总代id")
    private Long topProxyId;

    @ApiModelProperty("总代名称")
    private String topProxyName;

    @ApiModelProperty("登陆锁定状态 0-未锁定 1-登陆锁定")
    private Integer loginLockStatus;

    @ApiModelProperty("充提锁定状态 0-未锁定 1-充提锁定")
    private Integer paymentLockStatus;

    @ApiModelProperty("信用等级")
    private Integer creditLevel;

    @ApiModelProperty("合营码")
    private String joinCode;

    @ApiModelProperty("入口权限（0-关闭 1-开启）")
    private Integer entryAuthority;

}
