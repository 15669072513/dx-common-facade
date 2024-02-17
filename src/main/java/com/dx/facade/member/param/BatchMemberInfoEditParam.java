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
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;
import java.io.Serializable;
import java.util.List;

@Data
@ApiModel(value = "批量修改会员/代理信息编辑", description = "批量修改会员/代理信息编辑")
@AllArgsConstructor
@Builder
@NoArgsConstructor
public class BatchMemberInfoEditParam implements Serializable {

    @ApiModelProperty(value = "商户id")
    private Long merchantId;

    @ApiModelProperty(value = "会员账号",required = true,example = "abc123")
    @NotEmpty(message = "账号不能为空")
    @Pattern(regexp = Constants.REG_4_11, message = Constants.USER_NAME_ERROR_MSG)
    private List<String> userNameList;


    @ApiModelProperty(value = "账号状态 修改后内容")
    private MemberInfoRpcEditAccountStatus accountStatusAfter;

    @ApiModelProperty(value = "信用等级 修改后内容")
    private MemberInfoRpcEditCreditLevel creditLevelAfter;


}
