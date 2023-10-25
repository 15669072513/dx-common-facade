package com.dx.facade.member.param;

import com.dx.facade.constant.Constants;
import com.dx.facade.constant.DXManagerConstant;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import java.io.Serializable;

@Data
@ApiModel(value = "com-bw-pojo-req-member-MemberInfoEditParam", description = "会员信息编辑 MemberInfoEditParam")
@AllArgsConstructor
@Builder
@NoArgsConstructor
public class MemberInfoEditParam implements Serializable {
    
    private static final long serialVersionUID = 1L;
    
    @ApiModelProperty(value = "账号状态 修改后内容")
    private MemberInfoRpcEditAccountStatus accountStatusAfter;

    @ApiModelProperty(value = "风控层级 修改后内容")
    private MemberInfoRpcEditWindControl windControlAfter;

    @ApiModelProperty(value = "会员标签 修改后内容")
    private MemberInfoRpcEditLabel labelAfter;

    @ApiModelProperty(value = "出生日期 修改后内容")
    private MemberInfoRpcEditBirth birthAfter;

    @ApiModelProperty(value = "手机 修改后内容")
    private MemberInfoRpcEditMobile mobileAfter;

    @ApiModelProperty(value = "姓名 修改后内容")
    private MemberInfoRpcEditRealName realNameAfter;

    @ApiModelProperty(value = "性别 修改后内容")
    private MemberInfoRpcEditGender genderAfter;

    @ApiModelProperty(value = "邮箱 修改后内容")
    private MemberInfoRpcEditEmail emailAfter;

    @ApiModelProperty(value = "信用等级 修改后内容")
    private MemberInfoRpcEditCreditLevel creditLevelAfter;

    @ApiModelProperty(value = "活动流水限制")
    private MemberInfoRpcEditActivityTaskLimit activityTaskLimitAfter;

    @ApiModelProperty(value = "重置密码以及备注")
    private MemberInfoRpcEditResetPwd resetPwdAfter;

    @ApiModelProperty(value = "会员账号",required = true,example = "abc123")
    @NotBlank(message = "账号不能为空")
    @Pattern(regexp = Constants.REG_4_11, message = Constants.USER_NAME_ERROR_MSG)
    private String userName;

    @ApiModelProperty(value = "商户id", example = "588326785867908888", required = true)
    @NotNull(message = "商户id不能为空")
    private Long merchantId;
}
