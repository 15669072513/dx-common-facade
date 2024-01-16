package com.dx.facade.member.param;


import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;

@Data
@ApiModel(value = "com-bw-pojo-req-member-MemberInfoEditParam", description = "批量修改会员信息编辑 BatchMemberInfoEditParam")
@AllArgsConstructor
@Builder
@NoArgsConstructor
public class BatchMemberInfoEditParam implements Serializable {

    @ApiModelProperty(value = "账号状态 修改后内容")
    private List<MemberInfoRpcEditAccountStatus> accountStatusAfter;

    @ApiModelProperty(value = "信用等级 修改后内容")
    private List<MemberInfoRpcEditCreditLevel> creditLevelAfter;

}
