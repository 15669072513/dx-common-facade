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
    //@Pattern(regexp = BWManagerConstant.REG_4_11, message = "账号 4-11位，最少1个字母+数字组合，首位字母")
    private String userName;

    @ApiModelProperty(value = "用户id(20)",required = true,example = "2817562767709381444")
    @NotBlank(message = "用户ID不能为空")
    //@Pattern(regexp = BWManagerConstant.REG_NUM_6_20, message = "会员Id:请输入6-20位数字")
    private String userId;

    @ApiModelProperty(value = "备注说明",required = true,example = "备注...")
    @NotBlank(message = "备注说明不能为空")
    private String remark;

}
