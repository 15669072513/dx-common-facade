package com.dx.facade.member.rep;

import java.io.Serializable;

import javax.validation.constraints.NotBlank;

import org.hibernate.validator.constraints.Length;

import com.dx.facade.common.PageRequest;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author bicycle
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ApiModel("备注信息入参")
public class MemberRemarkPageReqDTO extends PageRequest implements Serializable {
    private static final long serialVersionUID = 2817562767709381444L;

    @ApiModelProperty(value = "用户Id(20)",required = true,example = "2817562767709381444")
    @NotBlank(message = "用户Id不能为空")
    @Length(max = 20,message = "长度不能超过18位")
    private String userId;
    
    /** 用户类型 0：会员 1：代理*/
    @ApiModelProperty(value = "用户类型 0：会员 1：代理",required = true,example = "1")
    private Integer userType;
    
}
