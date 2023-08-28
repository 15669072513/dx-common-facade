package com.dx.facade.member.param;

import java.io.Serializable;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@ApiModel(value = "用户快捷登录参数DTO", description = "用户快捷登录参数DTO")
public class FastLoginParamDTO implements Serializable {

	private static final long serialVersionUID = -6405247209046967545L;
	
    /** 商户id */
    @ApiModelProperty(value = "商户id (20)", required = true)
    //@NotNull(message = "商户id不能为空")
    private Long merchantId;

    @ApiModelProperty(value = "jwt joken",required = true)
    @NotNull(message = "token不能为空!")
    private String token;

    @ApiModelProperty(value = "登录网址 (128)")
    @Length(max = 128,message = "登录网址最大长度128")
    private String loginReference;

    /** 客户端类型 */
    @ApiModelProperty(value = "客户端类型")
    //@NotNull(message = "客户端类型不能为空")
    private Integer clientType;
    
    @ApiModelProperty("是否支持多端登录")
    private Integer isMultiple;
}
