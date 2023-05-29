package com.dx.facade.member.param;

import com.dx.enums.ConstantEnums;
import com.dx.facade.enums.ActivityEnums;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Objects;

/**
 * 会员详情-会员信息编辑 邮箱 请求参数封装
 *
 * @author fitz
 * @version 1.0.0
 * @date 2021/04/29
 */
@Data
@ApiModel(value = "com-ob-param-MemberInfoRpcEditResetPwd", description = "会员信息编辑-重置密码")
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class MemberInfoRpcEditResetPwd implements Serializable {
	
    @ApiModelProperty(value = "重置的新密码")
    private String newPassword;
	
	@ApiModelProperty("提交备注")
	private String resetPwdRemark;
	
}
