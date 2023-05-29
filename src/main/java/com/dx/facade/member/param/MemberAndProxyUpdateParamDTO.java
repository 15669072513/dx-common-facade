package com.dx.facade.member.param;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ApiModel(value = "会员,代理同步参数", description = "会员,代理同步参数")
public class MemberAndProxyUpdateParamDTO {

    @ApiModelProperty(value = "商户id")
    private Long merchantId;

    @ApiModelProperty(value="会员id")
    private Long userId;

    /**
     * 真实姓名
     */
    @ApiModelProperty(value = "真实姓名")
    private String realName;

    /**
     * 手机号码
     */
    @ApiModelProperty(value = "手机号码")
    private String mobile;

    /**
     * 注册手机号
     */
    @ApiModelProperty(value = "注册手机号")
    private String registerPhone;

}
