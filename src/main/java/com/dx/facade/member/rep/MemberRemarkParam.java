package com.dx.facade.member.rep;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotBlank;
import java.io.Serializable;

/**
 * @author knox
 */
@Data
@ApiModel("备注信息入参")
public class MemberRemarkParam implements Serializable {
    private static final long serialVersionUID = 2817562767709381444L;

    @ApiModelProperty(value="商户id")
    private Long merchantId ;

    @ApiModelProperty(value = "账号(20)",required = true,example = "abc132")
    @NotBlank(message = "账号不能为空")
    private String userName;

    @ApiModelProperty(value = "用户id(20)",required = true,example = "2817562767709381444")
    @NotBlank(message = "用户ID不能为空")
    private String userId;
    
    /** 用户类型 0：会员 1：代理*/
    @ApiModelProperty(value = "用户类型 0：会员 1：代理",required = true,example = "1")
    private Integer userType;

    @ApiModelProperty(value = "备注说明",required = true,example = "备注...")
    @NotBlank(message = "备注说明不能为空")
    private String remark;

}
