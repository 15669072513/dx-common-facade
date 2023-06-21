package com.dx.facade.report.param.report.basic;

import com.baomidou.mybatisplus.annotation.TableField;
import com.dx.facade.report.param.base.LocalDatePageRequest;
import io.swagger.annotations.ApiModelProperty;

public class MemberBasicVo extends LocalDatePageRequest {
    @ApiModelProperty("会员ID")
    @TableField(value = "user_id")
    private Long memberId;


    @ApiModelProperty("会员账号")
    private String memberName;
    @ApiModelProperty("会员名称")
    private String nickName;


    @ApiModelProperty("上级代理id")
    @TableField(value = "proxy_id")
    private Long proxyId;

    @ApiModelProperty("上级代理账号")
    @TableField("proxy_name")
    private String proxyName;

    @ApiModelProperty("总代理ID")
    @TableField("top_proxy_id")
    private String topProxyId;

    @ApiModelProperty("总代理账号")
    @TableField("top_proxy_name")
    private String topProxyName;

    @ApiModelProperty("商户id")
    @TableField("merchant_id")
    private Long merchantId;

    @ApiModelProperty("商户名")
    private String merchantName;

    @ApiModelProperty("主商户名")
    private String topMerchantName;
}
