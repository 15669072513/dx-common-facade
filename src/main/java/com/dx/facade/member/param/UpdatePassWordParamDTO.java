package com.dx.facade.member.param;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Description: 修改密码参数
 * @Author: grayson
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ApiModel(value = "修改密码参数", description = "修改密码参数")
public class UpdatePassWordParamDTO {

    @ApiModelProperty(value = "商户ID", hidden = true)
    private Long merchantId;

    @ApiModelProperty(value = "会员id")
    private Long userId;

    @ApiModelProperty(value = "旧密码")
    private String password;

    @ApiModelProperty(value = "新密码")
    private String newPassword;

    @ApiModelProperty(value = "操作人")
    private String operateBy;


}
