package com.dx.facade.member.param;

import com.dx.facade.constant.Constants;
import com.fasterxml.jackson.annotation.JsonFormat;
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
@ApiModel(value = "com-bw-param-MemberToProxyParam", description = "会员信息编辑 MemberToProxyParam")
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class MemberToProxyParam implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "开启代理权限 1开启 ")
    private Integer entryAuthorityOpen;

    @ApiModelProperty(value = "会员账号",required = true,example = "abc123")
    @NotBlank(message = "账号不能为空")
    @Pattern(regexp = Constants.REG_4_11, message = Constants.USER_NAME_ERROR_MSG)
    private String userName;

    @ApiModelProperty(value = "商户id", example = "588326785867908888", required = true)
//    @NotNull(message = "商户id不能为空")
    private Long merchantId;

    @ApiModelProperty(value = "当前登录用户id", hidden = true)
    private Long currentUserId;
}
